package com.serenity.ui;

import net.serenitybdd.screenplay.targets.Target;

public class NewOrderUI {

    public static final Target LIST_CUSTOMER=
            Target.the("List customer")
                    .locatedBy("//span[@id='select2-chosen-8']");
    public static final Target LBL_CUSTOMER=
            Target.the("Label customer")
                    .locatedBy("//div[contains(@class,'select2-result-label') and contains(normalize-space(),'{0}')]");
    public static final Target TXT_DATE=
            Target.the("Input date")
                    .locatedBy("//input[@name='RequiredDate']");

}
