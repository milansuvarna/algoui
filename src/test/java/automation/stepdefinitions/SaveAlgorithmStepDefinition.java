package automation.stepdefinitions;

import org.openqa.selenium.By;

import automation.PageObject.PageObj;
import io.cucumber.java.en.When;

public class SaveAlgorithmStepDefinition extends Base{
   @When("user click in Save simulation tab")
    public void user_click_in_Save_simulation_tab() {
    driver.findElement(By.xpath(PageObj.save_simulation)).click();
}

    @When("user enter simulation name and click save")
    public void user_enter_simulation_name_and_click_save() {
        driver.findElement(By.xpath(PageObj.simulation_name)).sendKeys("test");
        driver.findElement(By.xpath(PageObj.save_simulation_btn)).click();
    }
   


}