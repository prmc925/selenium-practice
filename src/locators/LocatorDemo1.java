package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo1 {
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

        // 2. Find the Element Using ID and Name Locator
//        WebElement searchBox = driver.findElement(By.id("small-searchterms"));
        WebElement searchBox = driver.findElement(By.name("q"));

        // 3. Action on Element
        searchBox.sendKeys("Mobile");

    }
}
