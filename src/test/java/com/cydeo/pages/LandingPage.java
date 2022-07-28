package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BasePage {
    @FindBy(id = "user_count")
    public WebElement userCount;

    public LandingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
