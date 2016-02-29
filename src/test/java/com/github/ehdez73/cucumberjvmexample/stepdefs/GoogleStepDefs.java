package com.github.ehdez73.cucumberjvmexample.stepdefs;

import com.github.ehdez73.cucumberjvmexample.pages.GoogleMainPage;
import com.github.ehdez73.cucumberjvmexample.pages.GoogleResultPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleStepDefs {

    private GoogleMainPage googlePage;
    private GoogleResultPage googleResultPage;
    private WebDriver driver;

    @Before
    public void init(){
        driver = new FirefoxDriver();
    }

    @After
    public void tearDown(){
        driver.close();
    }

    @Given("^I'm at Google webpage$")
    public void i_m_at_Google_webpage() throws Throwable {
         googlePage = GoogleMainPage.navigateGoogleToHomePage(driver);
    }

    @When("^I search for (.*)$")
    public void i_search_for_some_text(String text) throws Throwable {
        googleResultPage = googlePage.search(text);
    }

    @Then("^(.*) should appear in results$")
    public void searchedText_should_appear_in_the_results(String textToFind) throws Throwable {
        Assert.assertTrue(googleResultPage.containsText(textToFind));
    }

}
