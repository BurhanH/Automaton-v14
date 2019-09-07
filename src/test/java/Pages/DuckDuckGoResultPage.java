package Pages;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
/**
 *
 * @author baur
 */
public final class DuckDuckGoResultPage extends Page {
    private @FindBy(css=".result__title")
    List<WebElement> results;
    
    public DuckDuckGoResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public List<WebElement> getResults() {
        return results;
    }
}
