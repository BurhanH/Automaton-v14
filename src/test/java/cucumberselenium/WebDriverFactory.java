/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cucumberselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriverException;
/**
 *
 * @author baur
 */
public final class WebDriverFactory {
    public static WebDriver createDriver() {
        String driver = System.getProperty("browser", "firefox");
        switch(driver) {
            case "firefox":
                return new FirefoxDriver();
            case "chrome":
                return new ChromeDriver();
            default:
                throw new WebDriverException("Unsupported webdriver: " + driver);
        }
    }    
}
