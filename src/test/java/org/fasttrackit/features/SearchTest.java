package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.SearchSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchTest {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private SearchSteps searchSteps;

    @Test
    public void searchItem(){
        searchSteps.navigateToPage();
        searchSteps.setSearchItem("Tee");
        searchSteps.clickSearch();
        searchSteps.checkSearchResult("SEARCH RESULTS FOR 'TEE'");
    }
}
