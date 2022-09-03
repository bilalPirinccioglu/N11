package testCases;

import base.BaseTest;
import factory.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.*;

import java.time.Duration;

public class TestCase extends BaseTest {
    @Test
    public void n11() throws InterruptedException {

        String eMail = "bilalpirinccioglu@outlook.com";
        String password = "bentego123";
        String fullName = "Bilal Pirinçcioğlu";
        String emtpyCart = "Sepetin Boş Görünüyor";


        driver.get("https://www.n11.com/");

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickLoginLink();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        loginPage.sendEmail(eMail).sendPassword(password).clickAcceptCookies();
        HomePageLogined homePageLogined = loginPage.loginBtnClick();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


        homePageLogined.clickAccount();
        UpdateInformation updateInformation = homePageLogined.clickUpdateInfo();

        String gettedFullName = updateInformation.getFullName();
        if (gettedFullName != fullName )
            org.testng.Assert.fail("Kullanici Adı Aynı değil");
        homePageLogined.sendSearchTab("telefon");

        SearchPage searchPage = homePageLogined.clickSearchIcon();
        searchPage.clickPage2();

        String currentUrl = driver.getCurrentUrl();
        if((currentUrl.substring(currentUrl.length()-1)) != "2" )
            org.testng.Assert.fail("İkinci arama sayfasında değil");

        ProductPage productPage = searchPage.clickProduct();
        String productName = productPage.getProductName();
        productPage.clickAddCart();

        CartPage cartPage = productPage.clickCart();
        if(productName !=cartPage.getProdName())
            org.testng.Assert.fail("Sepete eklenen ürün ile sepetteki ürün aynı değil");

        cartPage.clickProdDeleteBtn().clickProdDeleteApply();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        if(cartPage.getEmptyTitle() != emtpyCart)
            org.testng.Assert.fail("Sepet Boş değil");


    }
}


