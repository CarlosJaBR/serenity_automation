package com.serenity.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewOrderStepDefinition {
    @When("the user navigates to the {string} section in the {string} module")
    public void theUserNavigatesToTheSectionInTheModule(String string, String string2) {
    }
    @When("clicks on the {string} button")
    public void clicksOnTheButton(String string) {
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
