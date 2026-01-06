package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class GoogleHomePage extends BasePage {

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    // Google search box
    @FindBy(name = "q")
    private WebElement searchBox;

    // Google search results
    @FindBy(css = "h3")
    private List<WebElement> searchResults;

    // Enter text in search box
    public GoogleHomePage enterSearch(String text) {
        searchBox.clear();
        searchBox.sendKeys(text);
        return this;  // method chaining
    }

    // Press Enter to search
    public GoogleHomePage clickSearchButton() {
        searchBox.submit();
        return this;
    }
    // Verify page title contains expected text
    public GoogleHomePage verifyPageTitle(String expected) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(d -> d.getTitle().toLowerCase().contains(expected.toLowerCase()));

        String actualTitle = driver.getTitle();
        Assert.assertTrue(
                actualTitle.toLowerCase().contains(expected.toLowerCase()),
                "Title does not contain expected text: " + expected + ". Actual: " + actualTitle
        );
        return this;
    }


}
