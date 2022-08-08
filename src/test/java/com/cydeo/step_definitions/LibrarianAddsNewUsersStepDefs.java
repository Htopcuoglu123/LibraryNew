package com.cydeo.step_definitions;

import com.cydeo.pages.UsersModulePage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LibrarianAddsNewUsersStepDefs {
    UsersModulePage usersModulePage=new UsersModulePage();

    @When("I login as a librarian")
    public void i_login_as_a_librarian() {

    }
    @Then("I click on Users link")
    public void i_Click_On_Users_Link() {
        BrowserUtils.waitForClickablility(By.xpath("//span[text()='Users']"),15);
        usersModulePage.usersLink.click();
    }

    @And("I click on +AddUser link")
    public void i_Click_On_AddUser_Link() {
        BrowserUtils.waitForClickablility(By.xpath("//a[@class='btn btn-lg btn-outline btn-primary btn-sm']"),15);
        usersModulePage.addNewUser.click();
        BrowserUtils.waitFor(5);
    }
    @When("I enter {string}, {string}, {string}")
    public void i_enter(String fullName, String password, String emailAddress) {
        usersModulePage.fullNameBox.sendKeys(fullName);
        BrowserUtils.waitForClickablility(By.name("password"),5);
        usersModulePage.passwordBox.sendKeys(password);
        BrowserUtils.waitForClickablility(By.name("email"),5);
        usersModulePage.emailBox.sendKeys(emailAddress);

    }
    @When("I click save changes")
    public void i_click_save_changes() {
BrowserUtils.waitFor(5);
        usersModulePage.saveChangesBtn.click();
    }
//    @Then("verify a new {string} created")
//    public void verify_a_new_created(String string) {
//
//    }


    @Then("verify a new user created")
    public void verifyANewUserCreated() {
        BrowserUtils.waitFor(5);
        Assert.assertEquals("The user has been created.",usersModulePage.verificationMsg.getText());
    }
}
