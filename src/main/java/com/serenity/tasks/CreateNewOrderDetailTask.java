package com.serenity.tasks;

import com.serenity.ui.NewOrderDetailUI;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateNewOrderDetailTask implements Task {

    private final DataTable data;

    public CreateNewOrderDetailTask(DataTable data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NewOrderDetailUI.LIST_PRODUCTS),
                Click.on(NewOrderDetailUI.LBL_PRODUCT.of(data.cell(0, 1).trim())),
                Enter.theValue(data.cell(1, 1).trim()).into(NewOrderDetailUI.LBL_UNIT_PRICE),
                Enter.theValue(data.cell(2, 1).trim()).into(NewOrderDetailUI.LBL_QUANTITY),
                Click.on(NewOrderDetailUI.BTTN_SAVE_ORDER_DETAIL)
        );
    }
    public static CreateNewOrderDetailTask createNewOrderDetail(DataTable data){
        return instrumented(CreateNewOrderDetailTask.class,data);
    }
}
