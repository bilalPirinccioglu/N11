package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends HomePage {

    public ProductPage(WebDriver driver){
        super(driver);
    }
    private final By productName = By.xpath("//*[@id=\"unf-p-id\"]/div/div[2]/div[2]/div[1]/div/div[2]/div[1]/div[1]/div/h1");
    private final By addCart = By.xpath("//*[@id=\"unfDetailForm\"]/div[2]/div[2]/div[1]/button");
    private final By cart = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div[4]/a/i");

    public CartPage clickCart(){
        driver.findElement(cart).click();
        return new CartPage(driver);
    };
    public String getProductName(){
        String name = driver.findElement(productName).getText();
        return name;
    }
    public ProductPage clickAddCart(){
        driver.findElement(addCart).click();
        return this;
    }
}
