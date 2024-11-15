package automation.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
    
    public static WebDriver driver;
    

    public static WebDriver getDriver()
    {
        if (driver == null) {
            System.setProperty("webdriver.gecko.driver", "/Users/milansuvarna/Desktop/SeleniumFrameWork/demo/src/drivers/geckodriver");
            driver = new FirefoxDriver();  // Initialize the driver only if it's not already done
        }
        return driver;
        
    }

    public static void quitDriver()
    {
        if (driver != null) {
            driver.quit();  // Ensure the driver quits after the test
            driver = null;  // Reset the driver to null after quitting
        }
    }


}
