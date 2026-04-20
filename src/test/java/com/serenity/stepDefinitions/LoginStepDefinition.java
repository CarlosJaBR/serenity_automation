package com.serenity.stepDefinitions;

import com.serenity.tasks.LoginTask;
import com.serenity.tasks.OpenBrowserTask;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinition {
    @Given("user open the browser")
    public void userOpenTheBrowser() {
        theActorInTheSpotlight().wasAbleTo(
                OpenBrowserTask.openBrowser()
        );
    }
    @When("the user send the credentials")
    public void theUserSendTheCredentials(DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(
                LoginTask.login(dataTable)
        );
    }
    @Then("the user can see the message {string}")
    public void theUserCanSeeTheMessage(String string) {
    }
}
