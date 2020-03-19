package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.ResultPage;
import org.fasttrackit.pages.TeePage;
import org.junit.Assert;

public class TeeSteps {
    private TeePage teePage;
    private ResultPage resultPage;
    private CartPage cartPage;

    @Step
    public void setTeeAtributes(String qty){
        teePage.clickColor();
        teePage.clickSize();
        teePage.setQuantity(qty);
    }
    @Step
    public void clickAddToCartButton(){
        teePage.clickAddtoCartBtn();
    }
    @Step
    public void checkTeeAddedToCart(String expectedCart){
        String message = cartPage.getAddedToCartMsg();
        Assert.assertEquals(expectedCart, message);
    }
    @Step
    public void addToCart(String quantity, String expectedCartMsg){
        resultPage.clickTee();
        setTeeAtributes(quantity);
        clickAddToCartButton();
        checkTeeAddedToCart(expectedCartMsg);
    }
}
