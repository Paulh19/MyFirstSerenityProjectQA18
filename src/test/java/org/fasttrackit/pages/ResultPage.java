package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/catalogsearch/result/?q=Tee")
public class ResultPage extends PageObject {

    @FindBy (css=".page-title")
    private WebElementFacade result;

    @FindBy (id="product-collection-image-410")
    private WebElementFacade tee;

    public String getResult(){
        return result.getText();
    }
    public void clickTee(){
        clickOn(tee);
    }
}
