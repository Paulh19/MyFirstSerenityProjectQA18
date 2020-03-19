package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.steps.ResultSteps;
import org.fasttrackit.steps.SearchSteps;
import org.fasttrackit.steps.TeeSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private LoginSteps loginSteps;
    @Steps
    private SearchSteps searchSteps;
    @Steps
    private ResultSteps resultSteps;
    @Steps
    private TeeSteps teeSteps;


    @Test
    public void addToCart() {
        loginSteps.login("cosmin@fasttrackit.org",
                "123456",
                "Hello, Hai C' Am Schimbat La Loc (Merry Christams)!");
        searchSteps.search("tee", "SEARCH RESULTS FOR 'TEE'");
        resultSteps.navigateToTeePage();
        teeSteps.setTeeAtributes("3");
        teeSteps.clickAddToCartButton();
        teeSteps.checkTeeAddedToCart("Chelsea Tee was added to your shopping cart.");
    }

}
