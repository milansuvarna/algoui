package automation.stepdefinitions;

import org.openqa.selenium.By;

import automation.PageObject.PageObj;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartStepDefinition extends Base{


    @Then("report shoud be generated")
    public void report_shoud_be_generated() {
       
    }

    @When("click on Submit tab")
    public void click_on_Submit_tab() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("click on toggle button")
    public void click_on_toggle_button() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("select two stocks from the list")
    public void select_two_stocks_from_the_list() {
        // Write code here that turns the phrase above into concrete actions
    }

  
    @When("user click on Submit button on fundamental page")
    public void user_click_on_Submit_button_on_fundamental_page() {
        driver.findElement(By.xpath(PageObj.fundamentals_tile)).click();

    }

      @When("click on Stocks tab")
    public void click_on_Stocks_tab() {
        // Write code here that turns the phrase above into concrete actions
    }

    
    
}
