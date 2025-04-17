package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo2 {
    static String baseUrl = "https://demowebshop.tricentis.com/";

    public static void main(String[] args) {
        // 1. Setup Browser
        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        // Open the URL into browser
        driver.get(baseUrl);
        //Maximise the browser window
        driver.manage().window().maximize();
        //We give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Link Text / Partial Link Text Locator
//        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        WebElement loginLink = driver.findElement(By.partialLinkText("Log"));
        loginLink.click();

        //Find Email Field Using Id Locator
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("prime123@gmail.com");

        // Find Password Field element Using Name locator
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("Prime123");

    }
}
