package com.serenity.stepDefinitions;

import com.serenity.questions.ValidateCreateOrder;
import com.serenity.tasks.*;
import com.serenity.ui.OrderUI;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.is;

public class NewOrderStepDefinition {

    private String customerName;

    @When("the user navigates to the {string} section in the {string} module")
    public void theUserNavigatesToTheSectionInTheModule(String string, String string2) {
        theActorInTheSpotlight().attemptsTo(
                OpenModuleTask.openModule(string,string2)
        );
    }
    @When("clicks on the {string} button")
    public void clicksOnTheButton(String string) {
        theActorInTheSpotlight().attemptsTo(
                OpenCreateOrder.openCreateOrder(string)
        );
    }
    @When("fills out the form with the following information:")
    public void fillsOutTheFormWithTheFollowingInformation(DataTable dataTable) {
        customerName = dataTable.asMap(String.class,String.class).get("Customer");
        theActorInTheSpotlight().attemptsTo(
                CreateNewOrderTask.createNewOrder(dataTable),
                OpenNewOrderDetailTask.openNewOrderDetail()
        );
    }
    @When("adds a product to the order detail:")
    public void addsAProductToTheOrderDetail(DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(
                CreateNewOrderDetailTask.createNewOrderDetail(dataTable)
        );
    }
    @When("saves the record")
    public void savesTheRecord() {
        theActorInTheSpotlight().attemptsTo(
                SaveNewOrderTask.saveNewOrder()
        );
    }
    @Then("the system should the order created successfully")
    public void theSystemShouldTheOrderCreatedSuccessfully() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(OrderUI.FIRST_ROW_CUSTOMER, isVisible())
                        .forNoMoreThan(10).seconds()
        );

        theActorInTheSpotlight().should(
                seeThat(
                        "El primer cliente de la tabla coincide con el cliente creado",
                        ValidateCreateOrder.customerIsVisible(customerName),
                        is(true)
                )
        );
    }
}
