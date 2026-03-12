package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;
import utils.DriverManager;

import java.time.Duration;

public class PropertyPage {

    WebDriver driver;
    WebDriverWait wait;

    public PropertyPage(){
        driver = DriverManager.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="(//button[text()='Get Owner Details'])[1]")
    WebElement ownerBtn;

    @FindBy(xpath="(//div[text()='Schedule'])[1]")
    WebElement scheduleBtn;

    public void clickOwnerOrSchedule(){

        if(driver.findElements(By.xpath("(//button[text()='Get Owner Details'])[1]")).size()>0){
            ownerBtn.click();
        }
        else if(driver.findElements(By.xpath("(//div[text()='Schedule'])[1]")).size()>0){
            scheduleBtn.click();
        }
    }
}