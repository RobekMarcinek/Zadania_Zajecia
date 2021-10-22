package pl.coderslab.login;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Zad2QloSearchTest {

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
    public void SignIn() {
        Zad2QloSearch myLogin= new Zad2QloSearch(driver);
        myLogin.SignInAccount("michal989@coderslab.pl", "popop");

        Zad2QloSearch hotelRes=new Zad2QloSearch(driver);
        hotelRes.ChoseReservation("18-10-2021","19-10-2021");

        Assert.assertEquals("General Rooms", Zad2QloSearch.checkIt());

    }

    @After
    public void tearDown() {
//        driver.quit();
    }
}
