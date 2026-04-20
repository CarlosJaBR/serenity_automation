package com.serenity.tasks;

import com.serenity.ui.LoginUI;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.serenity.ui.LoginUI.INPUT_PASSWORD;
import static com.serenity.ui.LoginUI.INPUT_USERNAME;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {

    private final DataTable data;

    public LoginTask(DataTable data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(String.valueOf(data.cell(0,0))).into(INPUT_USERNAME),
                Enter.theValue(String.valueOf(data.cell(1,0))).into(INPUT_PASSWORD),
                Click.on(LoginUI.BTTN_LOGIN)

        );
    }

    public static LoginTask login(DataTable data){
        return instrumented(LoginTask.class,data);
    }
}
