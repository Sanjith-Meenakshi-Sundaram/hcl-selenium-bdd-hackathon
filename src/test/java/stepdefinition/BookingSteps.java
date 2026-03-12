package stepdefinition;

import io.cucumber.java.en.*;
import pages.PropertyPage;
import utils.DriverManager;

import org.openqa.selenium.*;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class BookingSteps {

    PropertyPage property = new PropertyPage();

    @And("user navigates to property listing page")
    public void navigateProperty(){

        DriverManager.getDriver().navigate().to(
                "https://www.nobroker.in/property/rent/pune/Pune%20Cantonment"
        );
    }

    @And("user clicks owner details or schedule button")
    public void clickOwnerOrSchedule(){

        property.clickContactOwner();
    }

    @Then("booking screenshot should be captured")
    public void screenshot() throws Exception {

        TakesScreenshot ts =
                (TakesScreenshot) DriverManager.getDriver();

        File src = ts.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(src,new File("target/booking.png"));
    }
}