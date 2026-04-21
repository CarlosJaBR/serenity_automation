package com.serenity.tasks;

import com.serenity.ui.NewOrderUI;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateNewOrderTask implements Task {

    private static final DateTimeFormatter UI_DATE_FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private final DataTable data;

    public CreateNewOrderTask(DataTable data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Map<String, String> formData = data.asMap(String.class, String.class);
        String customer = formData.getOrDefault("Customer", "").trim();
        String orderDate = resolveOrderDate(formData.getOrDefault("Order Date", ""));

        actor.attemptsTo(
                Click.on(NewOrderUI.LIST_CUSTOMER),
                Click.on(NewOrderUI.LBL_CUSTOMER.of(customer)),
                Click.on(NewOrderUI.TXT_DATE),
                Clear.field(NewOrderUI.TXT_DATE),
                Enter.theValue(orderDate).into(NewOrderUI.TXT_DATE),
                Hit.the(Keys.TAB).into(NewOrderUI.TXT_DATE)

        );
    }

    private String resolveOrderDate(String value) {
        String normalized = value == null ? "" : value.trim();
        if (normalized.equalsIgnoreCase("actual")) {
            return LocalDate.now().format(UI_DATE_FORMAT);
        }
        return normalized;
    }

    public static CreateNewOrderTask createNewOrder(DataTable data) {
        return instrumented(CreateNewOrderTask.class,data);
    }
}
