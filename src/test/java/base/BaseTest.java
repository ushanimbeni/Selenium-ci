package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utils.ConfigReader;
import utils.DriverManager;

public abstract class BaseTest {

    protected WebDriver driver;

    @BeforeClass(alwaysRun = true)
    @Parameters({"browser", "headless"})
    public void setup(String browser, String headless) {
        boolean isHeadless = Boolean.parseBoolean(headless);

        // Initialize WebDriver
        DriverManager.initDriver(browser, isHeadless);
        driver = DriverManager.getDriver();

        // Open application URL
        driver.get(ConfigReader.get("appURL"));
    }

    @AfterClass(alwaysRun = true)
    public void teardown() {
        DriverManager.quitDriver();
    }
}
