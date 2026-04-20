package com.serenity.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {
    public static final Target LBL_DASHBOARD=
            Target.the("Label dashboard")
                    .locatedBy("//section[@class='content-header' and .//h1[normalize-space()='Tablero']]");
}
