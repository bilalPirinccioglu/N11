package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends HomePage {
    public SearchPage(WebDriver driver){
        super(driver);
    }

    private final By page1 = By.xpath("//*[@id=\"contentListing\"]/div/div[2]/div[2]/div[2]/a[1]");
    private final By page2 = By.xpath("//*[@id=\"contentListing\"]/div/div[2]/div[2]/div[2]/a[2]");
    private final By page3 = By.xpath("//*[@id=\"contentListing\"]/div/div[2]/div[2]/div[2]/a[3]");
    private final By pageNext = By.xpath("//*[@id=\"contentListing\"]/div/div[2]/div[2]/div[2]/a[11]");
    private final By pageLast = By.xpath("//*[@id=\"contentListing\"]/div/div[2]/div[2]/div[2]/a[12]");
    private final By object1 = By.xpath("//*[@id=\"listingUl\"]/li[1]");
    private final By object2 = By.xpath("//*[@id=\"listingUl\"]/li[2]");
    private final By object3 = By.xpath("//*[@id=\"listingUl\"]/li[3]");
    private final By object4 = By.xpath("//*[@id=\"listingUl\"]/li[4]");
    private final By object5 = By.xpath("//*[@id=\"listingUl\"]/li[5]");
    private final By object6 = By.xpath("//*[@id=\"listingUl\"]/li[6]");
    private final By object7 = By.xpath("//*[@id=\"listingUl\"]/li[7]");
    private final By object8 = By.xpath("//*[@id=\"listingUl\"]/li[8]");
    private final By object9 = By.xpath("//*[@id=\"listingUl\"]/li[9]");
    private final By object10 = By.xpath("//*[@id=\"listingUl\"]/li[10]");
    private final By object11 = By.xpath("//*[@id=\"listingUl\"]/li[11]");
    private final By object12 = By.xpath("//*[@id=\"listingUl\"]/li[12]");
    private final By object13 = By.xpath("//*[@id=\"listingUl\"]/li[13]");
    private final By object14 = By.xpath("//*[@id=\"listingUl\"]/li[14]");
    private final By object15 = By.xpath("//*[@id=\"listingUl\"]/li[15]");
    private final By object16 = By.xpath("//*[@id=\"listingUl\"]/li[16]");
    private final By object17 = By.xpath("//*[@id=\"listingUl\"]/li[17]");
    private final By object18 = By.xpath("//*[@id=\"listingUl\"]/li[18]");
    private final By object19 = By.xpath("//*[@id=\"listingUl\"]/li[19]");
    private final By object20 = By.xpath("//*[@id=\"listingUl\"]/li[20]");
    private final By object21 = By.xpath("//*[@id=\"listingUl\"]/li[21]");
    private final By object22 = By.xpath("//*[@id=\"listingUl\"]/li[22]");
    private final By object23 = By.xpath("//*[@id=\"listingUl\"]/li[23]");
    private final By object24 = By.xpath("//*[@id=\"listingUl\"]/li[24]");
    private final By object25 = By.xpath("//*[@id=\"listingUl\"]/li[25]");

    public SearchPage clickPage2(){
        driver.findElement(page2).click();
        return this;
    }

    public ProductPage clickProduct(){
        driver.findElement(object5).click();
        return new ProductPage(driver);
    }


}
