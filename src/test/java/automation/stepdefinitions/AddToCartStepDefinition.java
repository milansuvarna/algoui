package automation.stepdefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartStepDefinition extends Base{

    @And("user click on add product")
    public void user_click_on_add_product() {
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
    }
    @When("user go in the cart")
    public void user_go_in_the_cart() {
        driver.findElement(By.xpath("//*[@class='shopping_cart_link']")).click();
        
    }
    @Then("product should be displayed in the cart")
    public void product_should_be_displayed_in_the_cart() {
        driver.findElement(By.xpath("//*[@class='cart_item']")).isDisplayed();
    }
    
    
}
