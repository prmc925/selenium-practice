package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

/**
 * Created by Jay Vaghani
 */
public class TestRelativeLocators extends BaseTest {

    String baseUrl = "http://way2automation.com/way2auto_jquery/index.php";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void relativeLocators() throws InterruptedException {
        // above
       WebElement emailField = driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.tagName("select")));
       emailField.sendKeys("Prime Testing");


        // below
        WebElement cityField = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.tagName("select")));
        cityField.sendKeys("London");


        // near
        /*WebElement enterToWebsite = driver.findElement(RelativeLocator.with(By.partialLinkText("THE")).near(By.linkText("Signin")));
        enterToWebsite.click();*/


        // toRightOf
        WebElement passwordField = driver.findElement(RelativeLocator.with(By.xpath("(//input[@name='password'])[2]")).toRightOf(By.tagName("label")));
        passwordField.sendKeys("Prime123");


        // toLeftOf
      /*  WebElement signInLink = driver.findElement(RelativeLocator.with(By.linkText("Signin")).toLeftOf(By.xpath("//div[@id='load_box']//input[@value='Submit']")));
        signInLink.click();*/


        // Chaining the Relative Locators
        // Example using above and below locator
        WebElement emailField1 = driver.findElement(RelativeLocator.with(By.xpath("//input[@name='email']")).above(By.tagName("select")).below(By.tagName("input")));
        emailField1.sendKeys("Prime@gmail.com");

    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}