package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.NoSuchElementException;

public class BasePage {
    //La clase base centraliza todo lo que hacemos
    //con las librerias de selenium (Wrapper)

    //Atributos
    protected WebDriver driver;
    protected WebDriverWait espera;
    protected WebDriverWait wait;

    //Métodos
    public BasePage(WebDriver driver) {
        // TODO Auto-generated constructor stub

        this.driver = driver;
        this.wait = new WebDriverWait(this.driver,20);
    }

    //Accesadores y Mutadores
    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriverWait getEspera() {
        return espera;
    }

    public void setEspera(WebDriverWait espera) {
        this.espera = espera;
    }


    //Centralizar las acciones en el browser

    //buscar elemento web por locator
    public WebElement buscarElementoWeb(By localizador) {
        return this.driver.findElement(localizador);
    }

    //buscar elementos web por locator
    public List<WebElement> buscarElementosWeb(By localizador) {
        return this.driver.findElements(localizador);
    }


    //ingresar datos en imput
    public void agregarTexto(By localizador,String texto) {
        this.driver.findElement(localizador).sendKeys(texto);
    }

    public void agregarTexto(WebElement elemento,String texto) {
        elemento.sendKeys(texto);
    }

    //click
    public void click(By localizador) {
        this.driver.findElement(localizador).click();
    }

    public void click(WebElement elemento) {
        wait.until(ExpectedConditions.visibilityOf(elemento)).click();
    }

    public void cargarURL(String url) {
        this.driver.get(url);
    }

    public void cerrarBrowser() {
        this.driver.close();
    }

    public boolean estaDesplegado(WebElement elemento) {
        try {
            return wait.until(ExpectedConditions.visibilityOf(elemento)).isDisplayed();
        }catch(NoSuchElementException e) {
            return false;
        }
    }

    public boolean estaDesplegado(By localizador) {

        try {
            return buscarElementoWeb(localizador).isDisplayed();
        }catch(NoSuchElementException e) {
            return false;
        }
    }


    public void maximizarBrowser() {
        this.driver.manage().window().maximize();
    }

    public void volver() {
        this.driver.navigate().back();
    }

    public String obtenerTexto(By localizador) {
        return this.driver.findElement(localizador).getText();
    }

    public String obtenerTexto(WebElement elemento) {
        return wait.until(ExpectedConditions.visibilityOf(elemento)).getText();
    }


    public void irAFramePorID(WebElement elemento) {
        this.driver.switchTo().frame(elemento);
    }

    public void esperarXSegundos(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public WebElement esperaExplicita(By localizador) {
        espera = new WebDriverWait(this.driver, 20);

        return espera.until(ExpectedConditions.elementToBeClickable(localizador));
    }

    public int contarFrames() {
        return this.driver.findElements(By.xpath("//iframe")).size();
    }

    public void irAframe(int nroFrame) {
        this.driver.switchTo().frame(nroFrame);
    }


    public void bajarScroll(int pixeles) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+pixeles+")");
    }

}
