package com.serenity.stepDefinitions;

import com.serenity.tasks.OpenModuleTask;
import com.serenity.ui.OrderUI;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class NewOrderStepDefinition {
    @When("the user navigates to the {string} section in the {string} module")
    public void theUserNavigatesToTheSectionInTheModule(String section, String module) {
        theActorInTheSpotlight().attemptsTo(
                OpenModuleTask.openModule(section, module)
        );
    }

    @When("clicks on the {string} button")
    public void clicksOnTheButton(String buttonName) {
        switch (buttonName.trim().toLowerCase()) {
            case "new order":
            case "nuevo pedido":
                theActorInTheSpotlight().attemptsTo(
                        Click.on(OrderUI.SPN_NEW_ORDER)
                );
                break;
            default:
                throw new IllegalArgumentException("Button not supported in this step: " + buttonName);
        }
    }

    @When("fills out the form with the following information:")
    public void fillsOutTheFormWithTheFollowingInformation(DataTable dataTable) {
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
