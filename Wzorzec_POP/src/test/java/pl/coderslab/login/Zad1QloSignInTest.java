package pl.coderslab.login;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Zad1QloSignInTest {

    private static WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");


        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://qloapps.coderslab.pl/en/");
    }

    @Test
    public void testLoginWithProperCredentials() {
        Zad1QloSigmIn loginPage = new Zad1QloSigmIn(driver);
        loginPage.SignIn("michal989@coderslab.pl");
        loginPage.EnterPersonalInfo("Karol", "Karl", "popop");
//        Assert.assertEquals("Your account has been created.", loginPage.checkRegistration());

    }

    @After
    public void tearDown() {
       // driver.quit();
    }
}
