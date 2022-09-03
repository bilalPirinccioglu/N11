package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    private  final By loginLink = By.linkText("Giriş Yap");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public LoginPage clickLoginLink(){
        driver.findElement(loginLink).click();
        return new LoginPage(driver);
    }
}
