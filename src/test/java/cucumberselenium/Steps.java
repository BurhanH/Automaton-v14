/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cucumberselenium;

import pages.DuckDuckGoPage;
import pages.DuckDuckGoResultPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.concurrent.TimeUnit;
import junit.framework.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;

/**
 *
 * @author baur
 */
public class Steps {
    
    private WebDriver driver;
    
    @Before()
    public void createDriver() {
        driver = DriverFactoryUtil.createDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1366, 768));
    }
    

    @Given("home page of DuckDuckGo")
    public void homePageOfDuckDuckGo() {
        driver.get("https://duckduckgo.com/");
    }

    @When("user enters {string} word and clicks search button")
    public void userEntersTermWordAndClicksSearchButton(String term) {
        DuckDuckGoPage searchPage = new DuckDuckGoPage(driver);
        searchPage.setSearch(term);
        searchPage.search();
    }

    @Then("user gets results")
    public void userGetsResults() {
        DuckDuckGoResultPage resultPage = new DuckDuckGoResultPage(driver);
        Assert.assertFalse(resultPage.getResults().isEmpty());
    }
    
    @And("the page title should start with {string}")
    public void titleCheck(String title) {
        Assert.assertTrue(driver.getTitle().startsWith(title));
    }
    
    @After()
    public void closeDriver(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot screenshotObj = ((TakesScreenshot)driver);
            byte[] screenshot = screenshotObj.getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
        if (driver != null) driver.close();
    }
}
