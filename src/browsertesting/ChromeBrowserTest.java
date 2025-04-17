package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

/**
 * Created by Jay Vaghani
 */
public class ChromeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://demowebshop.tricentis.com/";
        //Launch the Chrome Browser
        WebDriver driver = new FirefoxDriver();
        // Open the URL into browser
        driver.get(baseUrl);
        //Maximise the browser window
        driver.manage().window().maximize();
        //We give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Get the title of the page
        String title = driver.getTitle();
        System.out.println("The title of the page : " + title);

        //Get Current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Get current url : " + currentUrl);

        //Get Page source
//        System.out.println(driver.getPageSource());

        String loginUrl = "https://demowebshop.tricentis.com/login";
        driver.navigate().to(loginUrl);

        System.out.println("Get current url : " + driver.getCurrentUrl());

        //Navigate to Back
        driver.navigate().back();
        System.out.println("Get current url : " + driver.getCurrentUrl());

        //Refresh the page
        driver.navigate().refresh();

        //Navigate to Forward
        driver.navigate().forward();
        System.out.println("Get current url : " + driver.getCurrentUrl());


        // Close the browser
        driver.quit();

    }
}
