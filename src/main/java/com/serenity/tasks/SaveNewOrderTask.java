package com.serenity.tasks;

import com.serenity.ui.NewOrderUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SaveNewOrderTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NewOrderUI.BTTN_SAVE_ORDER)
        );
    }
    public static SaveNewOrderTask saveNewOrder(){
        return instrumented(SaveNewOrderTask.class);
    }
}
