package automation.stepdefinitions;

import org.openqa.selenium.WebDriver;

import automation.Utils.DriverManager;

public class Base {
    protected WebDriver driver;

    public Base() {
        driver = DriverManager.getDriver();  // Reuse the driver from DriverManager

    }

}
