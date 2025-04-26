package utilities;

import browsertesting.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Jay Vaghani
 */
public class Utility extends BaseTest {

    /**
     * This method will click on element
     */
    public void clickOnElement(By by){
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }

    /**
     * This method will get text from the element
     */
    public String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }

    /**
     * This method will send text to element
     */
    public void sendTextToElement(By by, String text){
        driver.findElement(by).sendKeys(text);
    }

 //***************************** Alert Methods ***********************************

    public void switchToAlert(){
        driver.switchTo().alert();
    }

    // acceptAlert()
    // dismissAlert()
    // getTextFromAlert()
    // sendTextToAlert(String text)

//****************************** Select Class Methods ******************************

    /**
     *  This method will select the option by value
     */
    public void selectByValueFromDropDown(By by, String value){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    //selectByIndexFromDropDown(By by, int index)
    //selectByVisibleTextFromDropDown(By by, String text)
    //selectByContainsTextFromDropDown(By by, String text)

// ********************************* Actions class Methods **************************

    // mouseHoverToElement(By by);
    // mouseHoverToElementAndClick(By by);

}