package com.serenity.ui;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {
    public static final Target INPUT_USERNAME=
            Target.the("input username")
                    .locatedBy("//input[@id='LoginPanel0_Username']");

    public static final Target INPUT_PASSWORD =
            Target.the("input password")
                    .locatedBy("//input[@id='LoginPanel0_Password']");
}
