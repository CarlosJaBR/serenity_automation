package com.serenity.ui;

import net.serenitybdd.screenplay.targets.Target;

public class OrderUI {
    public static final Target SPN_NEW_ORDER=
            Target.the("Span new order")
                    .locatedBy("//span[@class='button-inner' and text()='Nuevo Pedido']");

}
