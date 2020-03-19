package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.ResultPage;

public class ResultSteps {
    private ResultPage resultPage;

    @Step
    public void navigateToTeePage(){

        resultPage.open();
        resultPage.clickTee();
    }
}
