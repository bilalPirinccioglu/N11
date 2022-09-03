package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends HomePage{
    public CartPage(WebDriver driver){
        super(driver);
    }
    private final By prodName = By.xpath("//*[@id=\"newCheckout\"]/div/div[1]/div[1]/div[3]/section/table[2]/tbody/tr/td[1]/div[3]/div[1]/a");
    private final By prodDeleteBtn = By.xpath("//*[@id=\"newCheckout\"]/div/div[1]/div[1]/div[3]/section/table[2]/tbody/tr/td[1]/div[3]/div[3]/span");
    private final By prodDeleteApply = By.xpath("//*[@id=\"deleteBtnDFLB\"]");
    private final By emptyTitle = By.xpath("//*[@id=\"wrapper\"]/div[3]/div/div[1]/div[1]/h2");

    public String getProdName(){
        String name =driver.findElement(prodName).getText();
        return name;
    }
    public CartPage clickProdDeleteBtn(){
        driver.findElement(prodDeleteBtn).click();
        return this;
    }
    public String getEmptyTitle (){
        String name =driver.findElement(emptyTitle).getText();
        return name;
    }
    public CartPage clickProdDeleteApply(){
        driver.findElement(prodDeleteApply).click();
        return this;
    }

}
