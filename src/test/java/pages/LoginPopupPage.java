package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;
import utils.DriverManager;

import java.time.Duration;

public class LoginPopupPage {

    WebDriver driver;
    WebDriverWait wait;

    public LoginPopupPage(){

        driver = DriverManager.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//div[contains(@class,'login-signup__modal-dialog')]")
    WebElement loginPopup;

    public boolean isLoginPopupVisible(){

        wait.until(ExpectedConditions.visibilityOf(loginPopup));

        return loginPopup.isDisplayed();
    }

    public WebElement getPopup(){
        return loginPopup;
    }
}