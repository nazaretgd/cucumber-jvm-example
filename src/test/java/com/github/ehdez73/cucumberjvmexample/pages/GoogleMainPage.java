package com.github.ehdez73.cucumberjvmexample.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleMainPage extends AbstractPage {

    private static final String URL="http://www.google.com";


    private GoogleMainPage(WebDriver driver) {
        super(driver);
    }

    public static GoogleMainPage navigateGoogleToHomePage(WebDriver driver){
        GoogleMainPage googlePage = new GoogleMainPage(driver);
        driver.get(URL);
        PageFactory.initElements(driver, googlePage);
        return googlePage;
    }

    @FindBy(name = "q")
    @CacheLookup
    private WebElement search;

    public GoogleResultPage search(String text) {
        search.sendKeys(text + "\n");
        return new GoogleResultPage(driver);
    }

}
