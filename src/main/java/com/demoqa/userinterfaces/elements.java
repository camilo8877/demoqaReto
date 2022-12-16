package com.demoqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class elements {

    public static final Target Webtable = Target.the("Webtable").
            locatedBy("//span[contains(text(),'Web Tables')]");

    public static final Target add = Target.the("add").
            locatedBy("//button[@id='addNewRecordButton']");


    public static final Target eraseone=Target.the("eraseone").
            locatedBy("    div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.web-tables-wrapper:nth-child(2) div.ReactTable.-striped.-highlight div.rt-table div.rt-tbody div.rt-tr-group:nth-child(1) div.rt-tr.-odd div.rt-td:nth-child(7) div.action-buttons span:nth-child(2) svg:nth-child(1) > path:nth-child(1)");

    public static final Target erasetwo=Target.the("erasetwo").
            locatedBy("     div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.web-tables-wrapper:nth-child(2) div.ReactTable.-striped.-highlight div.rt-table div.rt-tbody div.rt-tr-group:nth-child(1) div.rt-tr.-odd div.rt-td:nth-child(7) div.action-buttons span:nth-child(2) svg:nth-child(1) > path:nth-child(1)");

    public static final Target erasethree=Target.the("erasethree").
            locatedBy("    div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.web-tables-wrapper:nth-child(2) div.ReactTable.-striped.-highlight div.rt-table div.rt-tbody div.rt-tr-group:nth-child(1) div.rt-tr.-odd div.rt-td:nth-child(7) div.action-buttons span:nth-child(2) svg:nth-child(1) > path:nth-child(1)");

    public static final Target erasefour=Target.the("erasefour").
            locatedBy("    div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.web-tables-wrapper:nth-child(2) div.ReactTable.-striped.-highlight div.rt-table div.rt-tbody div.rt-tr-group:nth-child(1) div.rt-tr.-odd div.rt-td:nth-child(7) div.action-buttons span:nth-child(2) svg:nth-child(1) > path:nth-child(1)");

}

