package automation.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import automation.PageObject.PageObj;
import automation.Utils.WaitUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FundamentalStockStepDefinition extends Base{

    @When("user click on Submit button on fundamental page")
    public void user_click_on_Submit_button_on_fundamental_page() {
        driver.findElement(By.xpath(PageObj.fundamentals_tile)).click();
    }

    @When("click on Stocks tab")
    public void click_on_Stocks_tab() {
        WebElement stockElement= WaitUtils.waitForElementToBeClickable(driver, (By.xpath(PageObj.stocks_tab)));
        stockElement.click();
    }

    @When("select two stocks from the list")
    public void select_two_stocks_from_the_list() {
        driver.findElement(By.xpath(PageObj.first_stock)).click();
        driver.findElement(By.xpath(PageObj.first_stock)).click();
        driver.findElement(By.xpath(PageObj.first_add)).click();
        driver.findElement(By.xpath(PageObj.second_add)).click();        
    }


    @When("click on toggle button")
    public void click_on_toggle_button() {
        driver.findElement(By.xpath(PageObj.toggle)).click();
    }
    
    @When("click on Submit tab")
    public void click_on_Submit_tab() {
        driver.findElement(By.xpath(PageObj.submit_tab)).click();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 

    }

    @Then("report shoud be generated")
    public void report_shoud_be_generated() {
        driver.findElement(By.xpath(PageObj.table)).isDisplayed();
       
    }
}
