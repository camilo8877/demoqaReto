package com.demoqa.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class datePicker {

    public static final Target SELECTDATE = Target.the("SELECTDATE").
            locatedBy(" #datePickerMonthYearInput");

    public static final Target FECHA= Target.the("FECHA").
            locatedBy("//div[contains(text(),'14')]");

    public static final Target DATE_TIME= Target.the("DATE_TIME").
            locatedBy("#dateAndTimePickerInput");

    public static final Target SECONDFECHA= Target.the("SECONFECHA").
            locatedBy(" //div[contains(text(),'14')]");

    public static final Target HOUR= Target.the("HOUR").
            locatedBy("//li[contains(text(),'17:00')]");
}
