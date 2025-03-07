package org.example.pages;

import org.example.utilities.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.utilities.Locators.*;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);

    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts(){
        return findAll(menuFull);
    }
    public void acceptCookies(){
        if (isDisplayed(acceptCookiesLocator)){
            click(acceptCookiesLocator);
        }
    }

    public void menuClick(){
        waitClick(menuButtonLocator);
        click(menuButtonLocator);
    }

    public void menuViewAllClick(){
        waitClick(menuViewAllLocator);
        click(menuViewAllLocator);
    }

}