package stepdefinition;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {

    HomePage home = new HomePage();
    LoginPage login = new LoginPage();

    @When("user clicks login button")
    public void clickLogin(){
        home.clickLogin();
    }

    @And("user enters mobile number")
    public void enterMobile(){
        login.enterPhone("7449032934");
    }

    @Then("user enters OTP manually")
    public void waitOTP() throws InterruptedException{
        Thread.sleep(25000);
    }

    @And("user clicks continue")
    public void clickContinue(){
        login.clickContinue();
    }
}