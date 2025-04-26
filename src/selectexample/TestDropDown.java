package selectexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.Utility;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class TestDropDown extends Utility {

    String baseUrl = "http://way2automation.com/way2auto_jquery/index.php";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void dropDownExample() {
        WebElement dropDown = driver.findElement(By.name("country"));
        // Create the object of Select class
        Select select = new Select(dropDown);
        // Select by visible text
        select.selectByVisibleText("Australia");
        // Select by value
        select.selectByValue("Ghana");
        // Select by Index
        select.selectByIndex(9);

//        selectByValueFromDropDown(By.name("country"), "Ghana");

        // Get All the options
        List<WebElement> allOptions = select.getOptions();
        System.out.println("Total country : " + allOptions.size());
        for (WebElement options : allOptions) {
            System.out.println(options.getText());
        }
    }


    @After
    public void tearDown() {
//        closeBrowser();
    }
}
