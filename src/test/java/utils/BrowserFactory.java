package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

    static WebDriver driver;

    public static WebDriver conexionDriver(String browser, String rutaDriver, String propertyDriver) {
        switch (browser) {
            case "Chrome":
                System.setProperty(propertyDriver,rutaDriver);
                driver = new ChromeDriver();
                break;
            case "Firefox":
                System.setProperty(propertyDriver,rutaDriver);
                driver = new FirefoxDriver();
                break;

            case "IExplorer":
                System.setProperty(propertyDriver,rutaDriver);
                driver = new InternetExplorerDriver();
                break;

            default:
                driver = null;
        }
        return driver;
    }
}
