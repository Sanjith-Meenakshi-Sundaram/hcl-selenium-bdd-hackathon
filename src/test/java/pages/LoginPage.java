package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;
import utils.DriverManager;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(){
        driver = DriverManager.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//input[contains(@placeholder,'Enter Mobile Number')]")
    WebElement phoneInput;

    @FindBy(xpath="//button[text()='Continue']")
    WebElement continueBtn;

    public void enterPhone(String phone){
        wait.until(ExpectedConditions.visibilityOf(phoneInput)).sendKeys(phone);
    }

    public void clickContinue(){
        continueBtn.click();
    }
}