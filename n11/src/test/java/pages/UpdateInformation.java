package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UpdateInformation extends BasePage {
    private final By fullName = By.xpath("//*[@id=\"myAccount\"]/div[1]/div[1]/div[1]/h1[1]");

    public String getFullName(){
        String name = driver.findElement(fullName).getText();
        return name;
    }
    public UpdateInformation (WebDriver driver){
        super(driver);
    }

}
