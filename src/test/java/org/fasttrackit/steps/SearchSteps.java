package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ResultPage;
import org.junit.Assert;

public class SearchSteps {
    private HomePage homePage;
    private ResultPage resultPage;
    @Step
    public void navigateToPage(){
        homePage.open();
    }
    @Step
    public void setSearchItem(String item){
        homePage.searchItem(item);
    }
    @Step
    public void clickSearch(){
        homePage.clickSearch();
    }
    @Step
    public void checkSearchResult(String expected){
        String msg=resultPage.getResult();
        Assert.assertEquals(expected,msg);
    }

    @Step
    public void search(String item, String expected){
        navigateToPage();
        setSearchItem(item);
        clickSearch();
        checkSearchResult(expected);
    }
}
