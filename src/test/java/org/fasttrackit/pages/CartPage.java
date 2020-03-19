package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://testfasttrackit.info/selenium-test/checkout/cart/")
public class CartPage extends PageObject {

    @FindBy(css = ".success-msg")
    private WebElementFacade messageCart;
    public String getAddedToCartMsg(){
        return messageCart.getText();
    }
}
