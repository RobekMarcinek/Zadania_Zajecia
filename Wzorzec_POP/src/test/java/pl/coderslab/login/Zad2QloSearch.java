package pl.coderslab.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Zad2QloSearch {

    /*Zadanie 2
Page Object Pattern
Rozbuduj testy dla aplikacji: https://qloapps.coderslab.pl/en/ z wykorzystaniem Page Object Pattern.
Tym razem Twój test powinien sprawdzać możliwość wyszukania hotelu po nazwie.

Sekwencja kroków:

logowanie użytkownika
wyszukiwarka na stronie głównej
wyszukaj dowolny hotel.*/

    private static WebDriver driver;

    public Zad2QloSearch(WebDriver driver) {
        this.driver = driver;
    }

    public void SignInAccount(String email, String password) {
        WebElement clickSignIn = driver.findElement(By.className("hide_xs"));
        clickSignIn.click();

        WebElement enterEmail = driver.findElement(By.id("email"));
        enterEmail.sendKeys(email);

        WebElement enterPass1 = driver.findElement(By.id("passwd"));
        enterPass1.sendKeys(password);

        WebElement clickCreateAccount = driver.findElement(By.id("SubmitLogin"));
        clickCreateAccount.click();

        WebElement clickBack = driver.findElement(By.xpath("//a[@title='Home']"));
        clickBack.click();
    }
    public void ChoseReservation(String arrDate, String departureDate) {

        WebElement clickHotel = driver.findElement(By.id("hotel_cat_name"));
        clickHotel.click();

        WebElement chooseHotel = driver.findElement(By.xpath("//*[@data-id-hotel='1']"));
        chooseHotel.click();

        WebElement clickInDate = driver.findElement(By.id("check_in_time"));
        clickInDate.sendKeys(arrDate);

        WebElement clickOutDate = driver.findElement(By.id("check_out_time"));
        clickOutDate.sendKeys(departureDate);

       WebElement clickSearch = driver.findElement(By.id("search_room_submit"));
        clickSearch.click();


    }
 /*  tekst General Rooms


*/


   public static String checkIt() {
        WebElement allertCheck = driver.findElement(By.className("rm_heading"));
        return allertCheck.getText();
    }
}
