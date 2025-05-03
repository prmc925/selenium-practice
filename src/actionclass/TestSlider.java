package actionclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestSlider extends Utility {

    String baseUrl = "https://jqueryui.com/resources/demos/slider/default.html";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void sliderExample() {
        Actions actions = new Actions(driver);
        WebElement mainSlider = driver.findElement(By.xpath("//div[@id='slider']"));

        int width = mainSlider.getSize().width;
        int halfWidth = width/2;
        System.out.println(halfWidth);

        WebElement slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));

        actions.dragAndDropBy(slider, halfWidth, 0).build().perform();

    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}
