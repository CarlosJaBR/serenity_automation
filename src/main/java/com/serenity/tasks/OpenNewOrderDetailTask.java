package com.serenity.tasks;

import com.serenity.ui.NewOrderUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenNewOrderDetailTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NewOrderUI.BTTN_NEW_ORDER_DETAIL)
        );
    }
    public static OpenNewOrderDetailTask openNewOrderDetail(){
        return instrumented(OpenNewOrderDetailTask.class);
    }
}
