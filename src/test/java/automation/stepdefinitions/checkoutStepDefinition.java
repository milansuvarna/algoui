package automation.stepdefinitions;

import org.openqa.selenium.By;

import automation.PageObject.PageObj;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class checkoutStepDefinition extends Base{
    @Given("user is on cart page")
    public void user_is_on_cart_page() {
        driver.findElement(By.xpath("//span[contains(text(),'Your Cart')]"));
        
    }

     @When("user clicks on checkout page")
    public void user_clicks_on_checkout_page() {
       driver.findElement(By.xpath("//button[@id='checkout']")).click();
       
    }
    @Then("user is reditected to checkout information page")
    public void user_is_reditected_to_checkout_information_page() {
         driver.findElement(By.xpath("//span[contains(text(),'Checkout: Your Information')]")).isDisplayed();
    }

     @Then("user enters checkout information")
    public void user_enters_checkout_information() {
        driver.findElement(By.xpath(PageObj.first_name)).sendKeys("Test");
        driver.findElement(By.xpath(PageObj.last_name)).sendKeys("Test");
        driver.findElement(By.xpath(PageObj.zip_code)).sendKeys("400092");
    }

    @Then("user clicks on continue")
    public void user_clicks_on_continue() {
        driver.findElement(By.xpath(PageObj.continue_checkout)).click();
    }

   

   
    

    
}
