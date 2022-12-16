package com.demoqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class widgets {

    public static final Target WIDGET=Target.the("widget").
            locatedBy("    //h5[contains(text(),'Widgets')]");

    public static final Target DATE_PICKER=Target.the("date picker").
            locatedBy("    //body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[3]");
}
