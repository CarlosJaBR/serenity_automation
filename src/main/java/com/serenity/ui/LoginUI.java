package com.serenity.ui;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {
    public static final Target INPUT_USERNAME=
            Target.the("input username")
                    .locatedBy("//input[@id='LoginPanel0_Username']");

    public static final Target INPUT_PASSWORD =
            Target.the("input password")
                    .locatedBy("//input[@id='LoginPanel0_Password']");

    public static final Target BTTN_LOGIN =
            Target.the("button login")
                    .locatedBy("//button[@id='LoginPanel0_LoginButton']");
    public static final Target ALERT =
            Target.the("Alert login")
                    .locatedBy("//div[@id='toast-container']");
}

