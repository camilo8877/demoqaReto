package com.demoqa.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com/")

public class home extends PageObject {

    public static final Target Elements = Target.the("elements").
            locatedBy("//h5[contains(text(),'Elements')]");
}


