package automation.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import automation.PageObject.PageObj;
import automation.TestData.TestData;
import automation.Utils.DriverManager;
import automation.Utils.WaitUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions extends Base{

@Given("user is on login page")
public void user_is_on_login_page() throws InterruptedException {

    driver.get("https://algoui.com/");
    System.out.println("user is on login page");
 
}
  @When("user clicks on Login link")
    public void user_clicks_on_Login_link() throws InterruptedException {
          WebElement loginLink = WaitUtils.waitForElementToBeClickable(driver, By.xpath(PageObj.login_link));
        loginLink.click();
        
    }
@And("user enters valid credentials")
    public void user_enters_valid_credentials() throws InterruptedException {
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   
    driver.findElement(By.xpath(PageObj.emailField)).sendKeys(TestData.USERNAME);
    driver.findElement(By.xpath(PageObj.passwordField)).sendKeys(TestData.PASSWORD);
    driver.findElement(By.xpath(PageObj.loginButton)).click();
}
@Then("user should be logged in successfully")
public void user_should_be_logged_in_successfully() {
    driver.findElement(By.xpath(PageObj.headerBanner)).isDisplayed();
}

@And("browser should be closed")
public void browser_should_be_closed() {
    DriverManager.quitDriver();
    
}
}
  
