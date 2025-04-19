package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

/**
 * Created by Jay Vaghani
 */
public class ChromeOptionsExample {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications"); // Disable browser notification
        options.addArguments("--incognito"); // Open browser in private/incognito window
        options.addArguments("--headless"); // Headless browser


        String baseUrl = "https://www.justdial.com/";
        // Launch the Chrome Browser
        WebDriver driver = new ChromeDriver(options);
        //Open the URL into Browser
        driver.get(baseUrl);
        //Maximise the Browser Window
        driver.manage().window().maximize();
        //We give Implicit wait to the Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Get the title of the page
        System.out.println("The title of the page: " +driver.getTitle());
    }
}
