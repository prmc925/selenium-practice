package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo6 extends BaseTest {

    String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemo6() {
        driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("123455");

    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}
