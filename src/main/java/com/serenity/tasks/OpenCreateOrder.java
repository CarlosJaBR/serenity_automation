package com.serenity.tasks;

import com.serenity.ui.OrderUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenCreateOrder implements Task {

    private final String option;

    public OpenCreateOrder(String option) {
        this.option = option;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OrderUI.SPN_NEW_ORDER.of(option))
        );
    }
    public static OpenCreateOrder openCreateOrder(String option){
        return instrumented(OpenCreateOrder.class,option);
    }
}
