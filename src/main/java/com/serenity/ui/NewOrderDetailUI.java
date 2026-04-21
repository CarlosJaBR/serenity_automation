package com.serenity.ui;

import net.serenitybdd.screenplay.targets.Target;

public class NewOrderDetailUI {
        public static final Target LIST_PRODUCTS=
                Target.the("list of products")
                        .locatedBy("//div[@data-itemname='ProductID']//span[@class='select2-chosen']");
        public static final Target LBL_PRODUCT=
                Target.the("label product")
                        .locatedBy("//div[contains(@class,'select2-result-label') and contains(normalize-space(),'{0}')]");
        public static final Target LBL_UNIT_PRICE=
                Target.the("label unit price")
                        .locatedBy("//input[@name='UnitPrice']");
        public static final Target LBL_QUANTITY=
                Target.the("label quantity")
                        .locatedBy("//input[@name='Quantity']");
        public static final Target BTTN_SAVE_ORDER_DETAIL=
                Target.the("button save order detail")
                        .locatedBy("//div[@class='modal-content']//span[@class='button-inner' and text()='Guardar']");


}
