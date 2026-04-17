package com.serenity.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
    @Given("user open the browser")
    public void userOpenTheBrowser() {
        throw new io.cucumber.java.PendingException();
    }
    @When("the user send the credentials")
    public void theUserSendTheCredentials(io.cucumber.datatable.DataTable dataTable) {
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user can see the message {string}")
    public void theUserCanSeeTheMessage(String string) {
        throw new io.cucumber.java.PendingException();
    }
}
