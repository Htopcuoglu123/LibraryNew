package com.cydeo.step_definitions;


import com.cydeo.pages.BasePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.pages.UsersModulePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class LibrarianCreatesNewUserStepDefs {
UsersModulePage usersModulePage=new UsersModulePage();
BasePage basePage=new BasePage();
LoginPage loginPage=new LoginPage();
    @Given("librarian is on the home page")
    public void librarian_is_on_the_home_page() {

    }
    @When("librarian clicks Users module")
    public void librarian_clicks_users_module() throws InterruptedException {
        //Thread.sleep(3000);
        BrowserUtils.waitForClickablility(By.xpath("//span[text()='Users']"),15);
        usersModulePage.usersLink.click();
    }
    @When("librarian clicks Add User button")
    public void librarian_clicks_add_user_button() {
        BrowserUtils.waitForClickablility(By.xpath("//a[@class='btn btn-lg btn-outline btn-primary btn-sm']"),15);
        usersModulePage.addNewUser.click();
        BrowserUtils.waitFor(15);
    }
    @When("librarian enters full name,password, email address")
    public void librarian_enters_full_name_password_email_address() {
    usersModulePage.fullNameBox.sendKeys("Melissa Rose");
    BrowserUtils.waitForClickablility(By.name("password"),15);
    usersModulePage.passwordBox.sendKeys("MR123");
    BrowserUtils.waitForClickablility(By.name("email"),15);
    usersModulePage.emailBox.sendKeys("MR123@gmail.com");


    }
    @When("librarian clicks save changes")
    public void librarian_clicks_save_changes() {
        BrowserUtils.waitForClickablility(By.xpath("//button[@type='submit']"),15);
        usersModulePage.saveChangesBtn.click();
    }
    @Then("verify a new user is created")
    public void verify_a_new_user_is_created() {
        BrowserUtils.waitFor(10);
        BrowserUtils.newUserVerify(Driver.getDriver(),"Melissa Rose","Melissa Rose");
        //System.out.println("usersModulePage.verificationMsg.getText() = " + usersModulePage.verificationMsg.getText());
        //Assert.assertEquals("Msg is not displayed correctly","The user has been created",usersModulePage.verificationMsg.getText());
    }

}
