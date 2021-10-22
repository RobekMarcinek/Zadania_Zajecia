package pl.coderslab.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Zad1QloSigmIn {

/*    Zadanie 1
    Page Object Pattern 1
    Przygotuj skrypt testowy, który będzie testował funkcjonalność rejestracji użytkownika na stronie: https://qloapps.coderslab.pl/en/. Użyj do tego wzorca projektowego Page Object Pattern.

    Wykonana powinna być następująca sekwencja kroków:

    strona główna
    przycisk 'Sign in'
    przycisk Create an account
    wypełnienie formularza
    przycisk Register*/

    private static WebDriver driver;

    public Zad1QloSigmIn(WebDriver driver) {
        this.driver = driver;
    }

    public void SignIn(String email) {
        WebElement clickSignIn = driver.findElement(By.className("hide_xs"));
        clickSignIn.click();

        WebElement enterEmail = driver.findElement(By.id("email_create"));
        enterEmail.sendKeys(email);

        WebElement clickCreateAccount = driver.findElement(By.id("SubmitCreate"));
        clickCreateAccount.click();
    }

    public void EnterPersonalInfo(String firstName, String lastName, String password) {

        WebElement enterFirstName = driver.findElement(By.id("customer_firstname"));
        enterFirstName.sendKeys(firstName);

        WebElement enterLastName = driver.findElement(By.id("customer_lastname"));
        enterLastName.sendKeys(lastName);

        WebElement enterPass = driver.findElement(By.id("passwd"));
        enterPass.sendKeys(password);

        WebElement enterRegister = driver.findElement(By.id("submitAccount"));
        enterRegister.click();

    }

/*    public String checkRegistration() {
        WebElement allertCheck = driver.findElement(By.className("alert alert-success"));
        return allertCheck.getText();
    }*/
}
