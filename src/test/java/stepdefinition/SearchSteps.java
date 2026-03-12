package stepdefinition;

import io.cucumber.java.en.*;
import pages.SearchPage;

public class SearchSteps {

    SearchPage search = new SearchPage();

    @Given("user opens the NoBroker website")
    public void openSite(){}

    @When("user selects city as Pune")
    public void selectCity(){
        search.selectCity();
    }

    @And("user selects BHK type as 2 BHK")
    public void selectBHK(){
        search.selectBHK();
    }

    @And("user searches property in Pune")
    public void searchLocation(){
        search.searchLocation("Pune");
    }

    @Then("search results should be displayed")
    public void verifyResults() {
        search.verifySaveSearchDisplayed();
    }
}