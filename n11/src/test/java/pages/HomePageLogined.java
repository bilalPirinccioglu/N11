package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageLogined extends BasePage {
    public HomePageLogined(WebDriver driver) {
        super(driver);
    }

    private final By account = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div[5]/div[1]/a");
    private final By updateInfo = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div[5]/div[2]/div/a[9]");
    private final By myBasket = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div[4]/a/i");
    private final By searchTab = By.xpath("//*[@id=\"searchData\"]");
    private final By searchIcon = By.xpath("//*[@id=\"header\"]/div/div/div/div[1]/div/div/a/span");

    public HomePageLogined clickAccount(){
        driver.findElement(account).click();
        return this;
    }
    public UpdateInformation clickUpdateInfo(){
        driver.findElement(updateInfo).click();
        return new UpdateInformation(driver);
    }
    public HomePageLogined clickMyBasket(){
        driver.findElement(myBasket).click();
        return this;
    }
    public SearchPage clickSearchIcon(){
        driver.findElement(searchIcon).click();
        return new SearchPage(driver);
    }
    public HomePageLogined sendSearchTab(String searchingWord){
        driver.findElement(searchTab).sendKeys(searchingWord);
        return this;
    }


}
