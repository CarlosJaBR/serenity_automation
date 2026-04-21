package com.serenity.ui;

import net.serenitybdd.screenplay.targets.Target;

public class NewOrderUI {

    public final Target LBL_CUSTOMER=
            Target.the("Label customer")
                    .locatedBy("//div[contains(@class,'select2-result-label') and normalize-space()='Alfreds Futterkiste [ALFKI]']");

}
