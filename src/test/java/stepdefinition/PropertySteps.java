package stepdefinition;

import io.cucumber.java.en.*;
import pages.SearchPage;
import pages.LoginPopupPage;

import org.testng.Assert;
import org.openqa.selenium.*;
import utils.DriverManager;

import java.io.File;
import org.apache.commons.io.FileUtils;

public class PropertySteps {

    SearchPage searchPage = new SearchPage();
    LoginPopupPage popup = new LoginPopupPage();

    @When("user clicks contact owner button")
    public void clickContactOwner(){

        searchPage.clickContactOwner();
    }

    @Then("login popup should appear")
    public void verifyLoginPopup(){

        Assert.assertTrue(
                popup.isLoginPopupVisible(),
                "Login popup did not appear"
        );
    }

    @And("login popup screenshot should be captured")
    public void captureScreenshot() throws Exception {

        File src = popup.getPopup().getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(src,new File("target/loginPopup.png"));
    }
}