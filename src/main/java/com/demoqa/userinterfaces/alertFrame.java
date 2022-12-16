package com.demoqa.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class alertFrame extends PageObject  {

    public static final Target ALERT_FRAME_WINDOWS=Target.the("alert, frame & windows").
            locatedBy("//h5[contains(text(),'Alerts, Frame & Windows')]");

    public static final Target ALERT=Target.the("alert").
            locatedBy("//span[contains(text(),'Alerts')]");

    public static final Target SEE_ALERT=Target.the("see alert").
            locatedBy("//button[@id='alertButton']");

    public static final Target ALERT5S=Target.the("Alert 5 seconds").
            locatedBy("//button[@id='timerAlertButton']");

    public static final Target CONFIRM=Target.the("confirm").
            locatedBy("//button[@id='confirmButton']");

    public static final Target PROMPT=Target.the("prompt").
            locatedBy("//button[@id='promtButton']");
}
