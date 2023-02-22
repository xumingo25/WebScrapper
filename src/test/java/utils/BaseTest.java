package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.TradingCardDataBase_Page;

public class BaseTest {

    protected ThreadLocal<ChromeDriver> driver= new ThreadLocal<>();
    protected String urlSitio = PropertiesDriven.obtenerProperty("url");
    protected TradingCardDataBase_Page tgcDBPage;

    @BeforeMethod
    public void preparacion() {
        String rutaDriver = PropertiesDriven.obtenerProperty("rutaDriver");
        String browser = PropertiesDriven.obtenerProperty("browser");
        String propertyDriver = PropertiesDriven.obtenerProperty("propertyDriver");
        driver.set((ChromeDriver) BrowserFactory.conexionDriver(browser, rutaDriver, propertyDriver));
        urlSitio = PropertiesDriven.obtenerProperty("url");
        tgcDBPage = PageFactory.initElements(getDriver(), TradingCardDataBase_Page.class);
        tgcDBPage.cargarURL(urlSitio);
        tgcDBPage.maximizarBrowser();
        tgcDBPage.prepararBusquedaData();
    }

    public WebDriver getDriver(){
       return driver.get();
    }

    @AfterMethod
    public void posTests() {
        this.getDriver().close();
    }
}
