package com.serenity.ui;

import net.serenitybdd.screenplay.targets.Target;

public class OrderUI {
    public static final Target SPN_NEW_ORDER=
            Target.the("Span new order")
                    .locatedBy("//span[@class='button-inner' and text()='Nuevo Pedido']");

    public static final Target FIRST_ROW_CUSTOMER =
            Target.the("first row customer")
                    .locatedBy("//div[@data-row='0']//a[text()='Alfreds Futterkiste']");

}
