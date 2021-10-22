package pl.coderslab.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Zad3QloReserv {
    private static WebDriver driver;
    /*Zadanie 3
Page Object Pattern
Zakończ rozbudowę testów dla aplikacji https://qloapps.coderslab.pl/en/
dodając test weryfikujący możliwość rezerwacji (dodanie do koszyka) dowolnego hotelu z listy.

Część dodatkowa (opcjonalna)
Dodaj do skryptu proces obsługi zamówienia w koszyku.*/

    public Zad3QloReserv(WebDriver driver) {
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

//        WebElement chooseOne = driver.findElement(By.className("col-sm-12 room_cont"));
//        chooseOne.click();

        WebElement chooseOne = driver.findElement(By.xpath("//*[@data-id-product='8']"));
        chooseOne.click();


    }

   public static Boolean checkItt() {
        WebElement allertCheck = driver.findElement(By.className("layer_cart_row"));
        return allertCheck.isEnabled();
    }
}
