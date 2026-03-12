package stepdefinition;

import io.cucumber.java.en.*;
import pages.PropertyPage;
import utils.DriverManager;

import org.openqa.selenium.*;

import java.io.File;
import org.apache.commons.io.FileUtils;

public class PropertySteps {

    PropertyPage property = new PropertyPage();

    @When("user navigates to property page")
    public void navigateProperty(){
        DriverManager.getDriver().navigate().to("https://www.nobroker.in/property/rent/pune/");
    }

    @And("user clicks owner details or schedule button")
    public void clickOwner(){
        property.clickOwnerOrSchedule();
    }

    @Then("screenshot should be captured")
    public void screenshot() throws Exception{

        TakesScreenshot ts = (TakesScreenshot) DriverManager.getDriver();
        File src = ts.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(src,new File("target/screenshot.png"));
    }
}