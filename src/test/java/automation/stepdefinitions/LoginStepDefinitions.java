package automation.stepdefinitions;

import org.openqa.selenium.By;
import automation.PageObject.LoginPage;
import automation.TestData.TestData;
import automation.Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginStepDefinitions extends Base{

@Given("user is on login page")
public void user_is_on_login_page() throws InterruptedException {

    driver.get("https://www.saucedemo.com/");
    Thread.sleep(3000);
    System.out.println("user is on login page");
}
@When("user enters valid credentials")
public void user_enters_valid_credentials() {
    driver.findElement(By.id(LoginPage.usernameField)).sendKeys(TestData.USERNAME);
    driver.findElement(By.id(LoginPage.passwordField)).sendKeys(TestData.PASSWORD);
    driver.findElement(By.id(LoginPage.loginButton)).click();
    
}
@Then("user should be logged in successfully")
public void user_should_be_logged_in_successfully() {
    driver.findElement(By.xpath(LoginPage.logo)).isDisplayed();
}

@And("browser should be closed")
public void browser_should_be_closed() {
    DriverManager.quitDriver();
    
}
}