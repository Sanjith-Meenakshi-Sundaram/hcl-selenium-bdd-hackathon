package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;
import utils.DriverManager;

import java.time.Duration;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    public HomePage() {
        driver = DriverManager.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="(//div[text()='Log in'])[1]")
    WebElement loginBtn;

    public void clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
    }
}