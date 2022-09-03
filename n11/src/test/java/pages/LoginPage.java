package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By eMail = By.id("email");
    private final By password = By.id("password");
    private final By loginBtn = By.id("loginButton");
    private final By acceptCookies = By.xpath("//*[@id=\"cookieUsagePopIn\"]/div/div/span[1]");

    public LoginPage sendEmail(String email) throws InterruptedException {

        driver.findElement(eMail).sendKeys(email);
        Thread.sleep(3000);//uygulama hemen giriş yapılmasına müsade etmiyor.

        return this;
    }

    public LoginPage sendPassword(String password1) throws InterruptedException {
        Thread.sleep(4000);//uygulama hemen giriş yapılmasına müsade etmiyor.
        driver.findElement(password).sendKeys(password1);
        return this;
    }
    public HomePageLogined loginBtnClick() throws InterruptedException {
        Thread.sleep(1000);//uygulama hemen giriş yapılmasına müsade etmiyor.
        driver.findElement(loginBtn).click();
        return new HomePageLogined(driver);
    }
    public LoginPage clickAcceptCookies(){
        driver.findElement(acceptCookies).click();
        return this;
    }


}
