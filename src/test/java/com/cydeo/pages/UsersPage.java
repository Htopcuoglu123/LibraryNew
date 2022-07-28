package com.cydeo.pages;


import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

// page_url = https://library2.cydeo.com/#users
public class UsersPage extends BasePage {
    @FindBy(tagName = "th")
    public List<WebElement> usersTableHeader;


    public UsersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}