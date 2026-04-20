package com.serenity.stepDefinitions;

import com.serenity.questions.ValidateLogin;
import com.serenity.tasks.LoginTask;
import com.serenity.tasks.OpenBrowserTask;
import com.serenity.ui.HomeUI;
import com.serenity.ui.LoginUI;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

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
    public void theUserCanSeeTheMessage(String expectedMessage) {
        if (isSuccessfulLogin(expectedMessage)) {
            theActorInTheSpotlight().attemptsTo(
                    WaitUntil.the(HomeUI.LBL_DASHBOARD, WebElementStateMatchers.isVisible())
                            .forNoMoreThan(10).seconds()
            );
            theActorInTheSpotlight().should(
                    seeThat(ValidateLogin.dashboardIsVisible(), is(true))
            );
            return;
        }

        if (isInvalidLogin(expectedMessage)) {
            theActorInTheSpotlight().attemptsTo(
                    WaitUntil.the(LoginUI.ALERT, WebElementStateMatchers.isVisible())
                            .forNoMoreThan(10).seconds()
            );
            theActorInTheSpotlight().should(
                    seeThat(ValidateLogin.loginAlertIsVisible(), is(true))
            );
            return;
        }

        throw new IllegalArgumentException("Valor esperado no soportado: " + expectedMessage);
    }

    private boolean isSuccessfulLogin(String expectedMessage) {
        return "Dashboard".equalsIgnoreCase(expectedMessage)
                || "Tablero".equalsIgnoreCase(expectedMessage);
    }

    private boolean isInvalidLogin(String expectedMessage) {
        return "Alert".equalsIgnoreCase(expectedMessage)
                || "Alerta".equalsIgnoreCase(expectedMessage);
    }
}
