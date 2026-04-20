package com.serenity.questions;

import com.serenity.ui.HomeUI;
import com.serenity.ui.LoginUI;
import net.serenitybdd.screenplay.Question;

public class ValidateLogin {

    public static Question<Boolean> dashboardIsVisible() {
        return actor -> HomeUI.LBL_DASHBOARD.resolveFor(actor).isVisible();
    }

    public static Question<Boolean> loginAlertIsVisible() {
        return actor -> LoginUI.ALERT.resolveFor(actor).isVisible();
    }
}
