package com.cydeo.pages;


import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersModulePage extends BasePage{
    public UsersModulePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='btn btn-lg btn-outline btn-primary btn-sm']")
    public WebElement addNewUser;

    @FindBy(name="full_name")
    public  WebElement fullNameBox;

    @FindBy(name="password")
    public WebElement passwordBox;

    @FindBy(name ="email")
    public WebElement emailBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveChangesBtn;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement verificationMsg;



}
