package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.BasePage;
import utils.BrowserFactory;

import java.util.ArrayList;
import java.util.List;

public class TradingCardDataBase_Page extends BasePage {

    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//b[contains(text(),'Show Advanced Search')]")
    WebElement btnBusquedaAvanzada;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Expansions')]")
    WebElement btnExpansiones;

    @FindBy(how = How.XPATH, using = "//fieldset[@class='expansions-category']")
    List<WebElement> fieldSetExpansiones;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Aceptar todas')]")
    WebElement btnAceptarPopUpCookies;

    By locatorTituloExpansion;
    By locatorTituloEdiciones;

    @FindBy(how = How.XPATH, using = "//button[@id='advancedSubmit']")
    WebElement btnFiltrarBusquedaAvanzada;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'1 of ')]")
    WebElement lblCantidadPaginas;
    //body/div[4]/form[1]/section[2]/div[1]/div[1]/div[1]/div[1]/a[2]
    @FindBy(how = How.XPATH, using = "//body/div[4]/form[1]/section[2]/div[1]/div[1]/div[1]/div[1]/a[2]")
    WebElement btnNextPage;


    @FindBy(how = How.XPATH, using = "//*[@id='cardResults']/li/a/div/img")
    List<WebElement> ContadorCartas;

    By locatorCarta;

    public TradingCardDataBase_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void realizarBusquedaAvanzadaEdicion(String nombreExpansion, String nombreEdicion) {
        System.out.println("-----------------------" + nombreExpansion + "----------------------");
        System.out.println("-----------------------" + nombreEdicion + "----------------------");


        for (int i = 0; i < fieldSetExpansiones.size(); i++) {
            locatorTituloExpansion = By.xpath("//*[@id=\"filterExpansions\"]/div/fieldset[" + (i + 1) + "]/div/div/div/h2");
            //bajarScroll(400);
            //esperarXSegundos(1000);
            if (obtenerTexto(locatorTituloExpansion).equals(nombreExpansion)) {

                locatorTituloEdiciones = By.xpath("//body/div[4]/form[1]/div[2]/div[1]/div[5]/div[1]/fieldset[" + (i + 1) + "]/div[1]/div[1]/ul[1]/li[*]");

                List<WebElement> Ediciones = buscarElementosWeb(locatorTituloEdiciones);

                //mensaje = mensaje + "\nExpansión nro: "+(1+i)+" - "+ obtenerTexto(Expansiones.get(i));
                //mensaje = mensaje + "\n ";

                for (int k = 0; k < Ediciones.size(); k++) {

                    WebElement edicion = Ediciones.get(k);

                    String Textoedicion = obtenerTexto(edicion);

                    if (Textoedicion.equals(nombreEdicion)) {
                        click(edicion);
                        //esperarXSegundos(1000);
                        click((btnFiltrarBusquedaAvanzada));
                        //System.out.println(obtenerTexto(esperaExplicita(locatorCantidadPaginas)));

                        break;
                    }
                }
            }
        }

    }

    public void prepararBusquedaData() {
        //esperarXSegundos(1000);
        if(estaDesplegado(btnAceptarPopUpCookies)) {
            click((btnAceptarPopUpCookies));
        }
        //bajarScroll(500);
        //esperarXSegundos(5000);
        click(btnBusquedaAvanzada);
        //bajarScroll(1000);
        //esperarXSegundos(5000);
        click((btnExpansiones));
    }

    public int obtenerNroPaginasPaginacion() {
        String paginacion = obtenerTexto(lblCantidadPaginas);
        String paginas = paginacion.substring(paginacion.length()-2);
        paginas = paginas.replaceAll(" ", "");
        int pag = Integer.parseInt(paginas);
        System.out.println("Cantidad de paginas: "+pag);
        return  pag;
    }

    public void avanzarPaginacion() {
        //esperarXSegundos(1000);
        click((btnNextPage));
    }

    public void seleccionarCartaPorEdicion(){
            int paginas = obtenerNroPaginasPaginacion();

            ArrayList<String> datosPokemon = new ArrayList<String>();
            int acumulador = 0;

            for (int j=0; j<paginas;j++) {

                int cantidad = ContadorCartas.size();
                System.out.println("La cantidad de cartas en la pagina "+ (j+1)+ " son: "+ cantidad);

                for(int i=0; i < cantidad; i++) {
                    acumulador++;
                    //ojo
                    //esperarXSegundos(1000);

                    locatorCarta = By.xpath("//*[@id='cardResults']/li["+(i+1)+"]/a/div/img");

                    WebElement carta = esperaExplicita(locatorCarta);

                    carta.click();

                    //esperarXSegundos(2500);

                    CardDetails_Page cartaPage = new CardDetails_Page(this.driver);

                    System.out.println("Carta nro    : "+acumulador);
                    //cartaPage.obtenerDatosCarta(acumulador);
                    cartaPage.InsertarCartaEnBBDD();
                    volver();

                    if((i+1)==cantidad) {
                        break;
                    }

                }
                avanzarPaginacion();
                if((j+1)==paginas) {
                    System.out.println("La cantidad de cartas de la expansión es: "+ acumulador);
                    break;
                }
            }
    }
}