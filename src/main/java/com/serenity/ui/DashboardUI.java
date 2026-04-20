package com.serenity.ui;

import net.serenitybdd.screenplay.targets.Target;

public class DashboardUI {
    public static final Target LBL_DASHBOARD=
            Target.the("Label dashboard")
                    .locatedBy("//section[@class='content-header' and .//h1[normalize-space()='Tablero']]");

    public static final Target SPN_MODULE=
            Target.the("span module Northwind")
                    .locatedBy("//span[text()='Northwind']");
    public static final Target SPN_ORDER=
            Target.the("span order")
                    .locatedBy("//span[text()='Pedidos']");
}
