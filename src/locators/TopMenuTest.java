package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void topMenuTest(){
        List<WebElement> topMenu = driver.findElements(By.xpath("//ul[@class='top-menu notmobile']/li/a[]"));
        for (WebElement menu : topMenu){
            if (menu.getText().equals("Apparel")){
                menu.click();
                break;
            }
        }
    }

    @After
    public void tearDown(){
//        closeBrowser();
    }
}
