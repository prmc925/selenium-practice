package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class LoginTest extends Utility {

    String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        //Find the login link element and click on login link
       /* WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();*/
        clickOnElement(By.linkText("Log in"));
        String expectedText = "Welcome, Please Sign In!";
        /*WebElement welcomeTextElement = driver.findElement(By.xpath("//h1"));
        String actualText = welcomeTextElement.getText();*/
        String actualText = getTextFromElement(By.xpath("//h1"));
        Assert.assertEquals("Not redirected to login page", expectedText, actualText);
    }



    @Test
    public void verifyErrorMessageWithInvalidCredentials() throws InterruptedException {
        //Find the login link element and click on login link
        /*WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();*/
        clickOnElement(By.linkText("Log in"));
        Thread.sleep(5000);
        //Find the email field and type mail address to email field
       /* WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("prime12345fdgfd@gmail.com");*/
        sendTextToElement(By.id("Email"), "prime12345fdgfd@gmail.com");
        //Find the password field and type the password to password field
//        driver.findElement(By.name("Password")).sendKeys("Prime123");
        sendTextToElement(By.name("Password"), "Prime123");
        //Find the login button element and click
//        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        clickOnElement(By.xpath("//input[@value='Log in']"));
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
//        String actualErrorMessage = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getText();
        String actualErrorMessage = getTextFromElement(By.xpath("//div[@class='validation-summary-errors']"));
        Assert.assertEquals("Error message not displayed", expectedErrorMessage, actualErrorMessage);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
