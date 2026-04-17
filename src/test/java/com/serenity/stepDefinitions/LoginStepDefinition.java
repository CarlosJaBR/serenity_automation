package com.serenity.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
    @Given("user open the browser")
    public void userOpenTheBrowser() {
    }
    @When("the user send the credentials")
    public void theUserSendTheCredentials(DataTable dataTable) {

    }
    @Then("the user can see the message {string}")
    public void theUserCanSeeTheMessage(String string) {
    }
}
