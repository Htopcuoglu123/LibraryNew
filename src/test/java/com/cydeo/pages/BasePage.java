package com.cydeo.pages;


import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://library2.cydeo.com/#dashboard
public class BasePage {

    @FindBy(xpath = "//a[@href='#dashboard']")
    public WebElement dashBoardLink;

    @FindBy(xpath = "//span[text()='Users']")
    public WebElement usersLink;

    @FindBy(xpath = "//span[text()='Books']")
    public WebElement booksLink;

    @FindBy(xpath = "//a[@id='navbarDropdown']/span")
    public WebElement userNameLink;

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}