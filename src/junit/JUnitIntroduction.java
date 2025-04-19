package junit;

import org.junit.*;

/**
 * Created by Jay Vaghani
 */
public class JUnitIntroduction {
    @BeforeClass
    public static void connectWithDB() {
        System.out.println("DB connection");
    }

    @AfterClass
    public static void closedDBConnection() {
        System.out.println("Close DB connection");
    }

    @Before
    public void openBrowser() {
        System.out.println("Opening the Browser");
    }

    @After
    public void closeBrowser() {
        System.out.println("Closing the Browser");
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        String expectedText = "Welcome, Please Sign In!";
        String actualText = "Welcome, Please Sign In!";
        System.out.println("Navigate to login page");
        Assert.assertEquals("Not navigate successfully", expectedText, actualText);
    }

    @Test
    public void test() {
        System.out.println("This is test method");
    }
}
