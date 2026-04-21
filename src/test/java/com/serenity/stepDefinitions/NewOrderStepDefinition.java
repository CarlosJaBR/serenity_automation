package com.serenity.stepDefinitions;

import com.serenity.tasks.CreateNewOrderTask;
import com.serenity.tasks.OpenCreateOrder;
import com.serenity.tasks.OpenModuleTask;
import com.serenity.tasks.OpenNewOrderDetailTask;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class NewOrderStepDefinition {
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
        theActorInTheSpotlight().attemptsTo(
                CreateNewOrderTask.createNewOrder(dataTable),
                OpenNewOrderDetailTask.openNewOrderDetail()
        );
    }
    @When("adds a product to the order detail:")
    public void addsAProductToTheOrderDetail(DataTable dataTable) {

    }
    @When("saves the record")
    public void savesTheRecord() {
    }
    @Then("the system should the order created successfully")
    public void theSystemShouldTheOrderCreatedSuccessfully() {
    }
}
