package com.github.ehdez73.cucumberjvmexample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleResultPage  extends AbstractPage{

    private static final String RESULT_STATS = "resultStats";


    GoogleResultPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(RESULT_STATS)));
    }

    public boolean containsText(String text){
        return driver.getPageSource().contains(text);
    }

}
