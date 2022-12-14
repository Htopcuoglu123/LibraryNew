package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://library2.cydeo.com/login.html
public class LoginPage {
    @FindBy(id = "inputEmail")
    public WebElement emailInput;

    @FindBy(id = "inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//button")
    public WebElement signInButton;

    public void login(String username, String password) throws InterruptedException {
        emailInput.sendKeys(username);
        passwordInput.sendKeys(password);
        signInButton.click();
    }

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}