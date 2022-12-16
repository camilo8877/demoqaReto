package com.demoqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class registerForm {

    public static final Target FIRSTNAME = Target.the("FIRSTNAME").
            locatedBy("//input[@id='firstName']");


    public static final Target LASTNAME = Target.the("LASTNAME").
            locatedBy("//input[@id='lastName']");


    public static final Target EMAIL = Target.the("AGE").
            locatedBy("//input[@id='userEmail']");

    public static final Target AGE = Target.the("SALARY").
            locatedBy("//input[@id='age']");


    public static final Target SALARY = Target.the("DEPARTMENT").
            locatedBy("//input[@id='salary']");


    public static final Target DEPARTMENT = Target.the("SUBMIT").
            locatedBy("//input[@id='department']");


    public static final Target SUBMIT = Target.the("FIRSTNAME").
            locatedBy("//button[@id='submit']");






}
