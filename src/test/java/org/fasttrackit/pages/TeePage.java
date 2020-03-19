package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/chelsea-tee-703.html")
public class TeePage extends PageObject {

    @FindBy(id = "swatch20")
    private WebElementFacade color;

    @FindBy(id = "swatch80")
    private WebElementFacade size;

    @FindBy(id = "qty")
    private WebElementFacade quantity;

    @FindBy(css="#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button > span > span")
    private WebElementFacade btnCart;

    public void clickColor(){
        clickOn(color);
    }

    public void clickSize(){
        clickOn(size);
    }

    public void setQuantity(String qty){
        typeInto(quantity, qty);
    }
    public void clickAddtoCartBtn(){
        clickOn(btnCart);
    }
}
