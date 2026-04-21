package com.serenity.ui;

import net.serenitybdd.screenplay.targets.Target;

public class OrderUI {
    public static final Target SPN_NEW_ORDER=
            Target.the("Span new order")
                    .locatedBy("//span[@class='button-inner' and text()='Nuevo Pedido']");

    public static final Target LBL_CUSTOMER =
            Target.the("customer order link")
                    .locatedBy("//a[contains(@class,'s-Demo-Northwind-OrderLink') and contains(normalize-space(),'{0}')]");


}
