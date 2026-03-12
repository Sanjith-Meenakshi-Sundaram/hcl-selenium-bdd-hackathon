package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import utils.DriverManager;

import java.time.Duration;

public class SearchPage {

    WebDriver driver;
    WebDriverWait wait;

    public SearchPage(){
        driver = DriverManager.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="(//div[contains(@class,'css-16pqwjk-indicatorContainer')])[2]")
    WebElement roomType;

    @FindBy(xpath="//*[text()='2 BHK']")
    WebElement bhk;

    @FindBy(id="listPageSearchLocality")
    WebElement search;

    @FindBy(xpath="(//div[contains(@class,'suggestion')])[1]")
    WebElement list;

    @FindBy(xpath="//div[contains(@class,'nb-select__dropdown-indicator')]")
    WebElement cityDrop;

    @FindBy(xpath="//div[contains(@class,'nb-select__menu')]//*[text()='Pune']")
    WebElement pune;

    @FindBy(css=".prop-search-button")
    WebElement searchBtn;

    // Save Search button
    @FindBy(id="saveSearch")
    WebElement saveSearch;

    public void selectCity(){
        wait.until(ExpectedConditions.visibilityOf(cityDrop)).click();
        wait.until(ExpectedConditions.visibilityOf(pune)).click();
    }

    public void selectBHK(){
        wait.until(ExpectedConditions.visibilityOf(roomType)).click();
        wait.until(ExpectedConditions.visibilityOf(bhk)).click();
    }

    public void searchLocation(String city){
        search.sendKeys(city);
        wait.until(ExpectedConditions.visibilityOf(list)).click();
        searchBtn.click();
    }

    // Assertion method}

	public void verifySaveSearchDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(saveSearch));

        Assert.assertTrue(
                saveSearch.isDisplayed(),
                "Save Search button is NOT displayed after search results"
        );
		// TODO Auto-generated method stub
		
	}
}