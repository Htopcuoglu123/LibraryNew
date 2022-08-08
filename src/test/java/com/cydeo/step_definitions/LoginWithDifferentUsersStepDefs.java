package com.cydeo.step_definitions;

import com.cydeo.pages.LandingPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginWithDifferentUsersStepDefs {
    LoginPage loginPage=new LoginPage();
    LandingPage landingPage=new LandingPage();
    @Given("I am on the login page")
    public void i_am_on_the_login_page() {

    }
    @When("I login using {string} and {string}")
    public void i_login_using_and(String email, String password) {
    loginPage.emailInput.sendKeys(email);
    loginPage.passwordInput.sendKeys(password);
    loginPage.signInButton.click();
    }
    @Then("account holder name should be {string}")
    public void account_holder_name_should_be(String expectedUserName) {
        BrowserUtils.waitForVisibility(landingPage.userNameLink,15);
        String actualUserName=landingPage.userNameLink.getText();
        Assert.assertEquals(expectedUserName,actualUserName);
    }
}
