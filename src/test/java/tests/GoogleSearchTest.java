package tests;

import base.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.GoogleHomePage;
import utils.ReportListener;

public class GoogleSearchTest extends BaseTest {

    @Test
    public void searchGoogle() {
        // Create page object
        GoogleHomePage googleHome = new GoogleHomePage(driver);

        // Fluent method chaining
        googleHome
                .enterSearch("Selenium WebDriver")
                .clickSearchButton()
                .verifyPageTitle("Selenium");  // check search results page

    }
}
