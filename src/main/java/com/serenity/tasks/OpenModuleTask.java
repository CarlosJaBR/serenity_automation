package com.serenity.tasks;

import com.serenity.ui.DashboardUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenModuleTask implements Task {

    private final String module;
    private final String option;

    public OpenModuleTask(String module, String option) {
        this.module = module;
        this.option = option;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DashboardUI.SPN_MODULE.of(module)),
                Click.on(DashboardUI.SPN_ORDER.of(option))
        );
    }
    public static OpenModuleTask openModule(String module,String option){
        return instrumented(OpenModuleTask.class,module,option);
    }
}
