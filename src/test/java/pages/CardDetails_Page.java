package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.BasePage;
import utils.Querys;

public class CardDetails_Page extends BasePage {


    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//body/div[4]/section[1]/div[1]/div[1]/img[1]")
    WebElement LinkImagenCarta;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/section[1]/div[2]/div[1]/div[1]/div[1]/h1[1]")
    WebElement lblNombreCarta;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/h2[1]")
    WebElement lblClaseCarta;

    @FindBy(how = How.XPATH, using = "//span[@class='card-hp']")
    WebElement lblHPPokemon;

    @FindBy(how = How.XPATH, using = "//body/div[4]/section[1]/div[2]/div[1]/div[1]/div[2]/div[2]/a[1]/i[1]")
    WebElement lblEnergiaTipoPokemon;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Evolves')]")
    WebElement lblPreEvolucion;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Illustrator')]")
    WebElement lblIlustrador;

    @FindBy(how = How.XPATH, using = "//h3/a")
    WebElement lblCodigoExpansionEdicion;

    @FindBy(how = How.XPATH, using = "//body[1]/div[4]/section[1]/div[2]/div[1]/div[3]/div[1]/ul[1]/li[1]")
    WebElement lblInfoDebilidad;

    @FindBy(how = How.XPATH, using = "//body/div[4]/section[1]/div[2]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]/i[1]")
    WebElement IconoDebilidad;


    By locatorNroCartaTipoCarta = By.xpath("/html/body/div[4]/section[1]/div[2]/div/div[3]/div[4]/span");


    public CardDetails_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String obtenerTipoPokemon() {

        String tipoPokemon;

        try {
            String iconoTipoPokemon = lblEnergiaTipoPokemon.getAttribute("class");
            String[] datosTipoPokemon = iconoTipoPokemon.split("-");

            tipoPokemon = datosTipoPokemon[1];
        } catch (Exception ex) {
            System.out.println("No se encontro tipo de pokemon");
            tipoPokemon = "No identificado";
        }

        return tipoPokemon;
    }

    public String obtenerDebilidad() {
        String debilidad;

        esperarXSegundos(500);

        try {
            if (estaDesplegado(IconoDebilidad)) {
                String tipoDebilidad = IconoDebilidad.getAttribute("class");

                String[] datosDebilidad = tipoDebilidad.split("-");

                debilidad = datosDebilidad[1];

                debilidad = debilidad.concat(" ");

                debilidad = debilidad.concat(obtenerTexto(lblInfoDebilidad));

                return debilidad;
            } else {
                System.out.println("No se encontro debilidad");
                debilidad = "";
            }
            return debilidad;
        } catch (Exception ex) {
            debilidad = "";
            return debilidad;
        }

    }

    public String obtenerPreEvolucion() {
        String preEvo;
        try {
            preEvo = obtenerTexto(lblPreEvolucion);
            return preEvo;
        } catch (Exception ex) {
            System.out.println("No se encontro pre evolución");
            preEvo = "";
        }
        return preEvo;
    }

    public String obtenerCodigoExpansionEdicion() {
        String codigoExpansionEdicion;
        try {
            codigoExpansionEdicion = obtenerTexto(lblCodigoExpansionEdicion);
            return codigoExpansionEdicion;
        } catch (Exception ex) {
            System.out.println("No se encontro pre evolución");
            codigoExpansionEdicion = "";
        }
        return codigoExpansionEdicion;
    }


    public String obtenerNombreCarta() {
        String nombreCarta;
        try {
            nombreCarta = obtenerTexto(lblNombreCarta);
            return nombreCarta;
        } catch (Exception ex) {
            System.out.println("No se encontro nombre de carta");
            nombreCarta = "";
        }
        return nombreCarta;
    }


    public String obtenerHPPokemon() {
        String hpPokemon;
        try {
            hpPokemon = obtenerTexto(lblHPPokemon);
            return hpPokemon;
        } catch (Exception ex) {
            System.out.println("No se encontro nombre de carta");
            hpPokemon = "";
        }
        return hpPokemon;
    }


    public String obtenerURLImagenCarta() {
        String urlImagen;
        try {
            urlImagen = LinkImagenCarta.getAttribute("src");
            return urlImagen;
        } catch (Exception ex) {
            System.out.println("No se encontro url de imagen");
            urlImagen = "";
        }
        return urlImagen;
    }

    public String obtenerClaseCarta() {
        String claseCarta;
        try {
            claseCarta = obtenerTexto(lblClaseCarta);
            return claseCarta;
        } catch (Exception ex) {
            System.out.println("No se encontro clase de carta");
            claseCarta = "";
        }
        return claseCarta;
    }

    public String obtenerIlustrador() {

        String ilustrador;

        esperarXSegundos(500);

        try {
            if (estaDesplegado(lblIlustrador)) {
                String infoIlustrador = obtenerTexto(lblIlustrador);
                String[] datosIlustrador = infoIlustrador.split(": ");

                ilustrador = datosIlustrador[1];
            } else {
                ilustrador = "";
            }
            return ilustrador;
        } catch (Exception ex) {
        }
        System.out.println("No se encontro ilustrador");
        ilustrador = "";
        return ilustrador;
    }

    public String obtenerNroCartaYTIPO() {
        String NroYTipo;

        try {
            if (estaDesplegado(locatorNroCartaTipoCarta)) {
                NroYTipo = obtenerTexto(esperaExplicita(locatorNroCartaTipoCarta));
                return NroYTipo;
            } else {
                locatorNroCartaTipoCarta = By.xpath("/html/body/div[4]/section[1]/div[2]/div/div[3]/div[1]/span");
            }
        } catch (Exception ex) {
            locatorNroCartaTipoCarta = By.xpath("/html/body/div[4]/section[1]/div[2]/div/div[3]/div[1]/span");
        }

        try {
            if (estaDesplegado(locatorNroCartaTipoCarta)) {
                NroYTipo = obtenerTexto(esperaExplicita(locatorNroCartaTipoCarta));
                return NroYTipo;
            } else {
                locatorNroCartaTipoCarta = By.xpath("/html[1]/body[1]/div[4]/section[1]/div[2]/div[1]/div[3]/div[4]/span[1]");
                NroYTipo = obtenerTexto(esperaExplicita(locatorNroCartaTipoCarta));
                return NroYTipo;
            }
        } catch (Exception ex) {
            locatorNroCartaTipoCarta = By.xpath("/html[1]/body[1]/div[4]/section[1]/div[2]/div[1]/div[3]/div[4]/span[1]");
            try{
                NroYTipo = obtenerTexto(esperaExplicita(locatorNroCartaTipoCarta));
                return NroYTipo;
            }catch (Exception e) {
                locatorNroCartaTipoCarta = By.xpath("/html/body/div[4]/section[1]/div[2]/div/div[2]/div[4]/div[4]/span");
                NroYTipo = obtenerTexto(esperaExplicita(locatorNroCartaTipoCarta));
                return NroYTipo;
            }

        }

    }

    public void InsertarCartaEnBBDDCartaConComilla(){

        if(obtenerNombreCarta().contains("'")){
            String nombreCarta = obtenerNombreCarta().replace("'","''");
            Querys query = new Querys();
            query.registraUsuario(obtenerCodigoExpansionEdicion(),obtenerCodigoExpansionEdicion(),"Español/Ingles",nombreCarta,obtenerNroCartaYTIPO(),obtenerClaseCarta(),obtenerClaseCarta(),obtenerURLImagenCarta());
        }else{
            System.out.println("Carta ya ingresada");
        }

    }

    public void InsertarCartaEnBBDD(){

        if(obtenerNombreCarta().contains("'")){
            String nombreCarta = obtenerNombreCarta().replace("'","''");
            Querys query = new Querys();
            query.registraUsuario(obtenerCodigoExpansionEdicion(),obtenerCodigoExpansionEdicion(),"Español/Ingles",nombreCarta,obtenerNroCartaYTIPO(),obtenerClaseCarta(),obtenerClaseCarta(),obtenerURLImagenCarta());
        }else{
            Querys query = new Querys();
            query.registraUsuario(obtenerCodigoExpansionEdicion(),obtenerCodigoExpansionEdicion(),"Español/Ingles",obtenerNombreCarta(),obtenerNroCartaYTIPO(),obtenerClaseCarta(),obtenerClaseCarta(),obtenerURLImagenCarta());
        }
    }




    public void obtenerDatosCarta(){
        esperarXSegundos(1000);

        System.out.println("--------------------------------------------------------------------");
        System.out.println("Url Imagen Carta : "+ obtenerURLImagenCarta());
        System.out.println("Nombre Carta     : "+ obtenerNombreCarta());
        System.out.println("Ilustrador       : "+ obtenerIlustrador());
        System.out.println("Nro Carta y Tipo : "+ obtenerNroCartaYTIPO());
        System.out.println("Expansion/Edicion: "+ obtenerCodigoExpansionEdicion());

        String claseCarta = obtenerClaseCarta();

        if(claseCarta.contains ("Pokémon") && !claseCarta.contains ("Tool") && !claseCarta.contains ("LEGEND")) {


            if(claseCarta.contains("Stage")) {
                System.out.println("Pre evolucion    : " + obtenerPreEvolucion());
            }
            System.out.println("Tipo de Carta    : "+claseCarta);
            System.out.println("Tipo Pokemon     : "+obtenerTipoPokemon());
            System.out.println("HP Pokemon       : "+obtenerHPPokemon());
            System.out.println("Debilidad        : "+obtenerDebilidad());
        }

        if(claseCarta.contains("LEGEND")) {

        }

        if(claseCarta.contains("Trainer")) {
        }

        if(claseCarta.contains("Energy")) {
        }

        InsertarCartaEnBBDD();

        System.out.println("--------------------------------------------------------------------");

    }

    public void obtenerDatosCarta(int index){
        esperarXSegundos(1000);

        int nro = 64;  //dependiendo de donde quedo la inserción de la ultima carta insertada correctamente
        if(index>nro){
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Url Imagen Carta : "+ obtenerURLImagenCarta());
            System.out.println("Nombre Carta     : "+ obtenerNombreCarta());
            System.out.println("Ilustrador       : "+ obtenerIlustrador());
            System.out.println("Nro Carta y Tipo : "+ obtenerNroCartaYTIPO());
            System.out.println("Expansion/Edicion: "+ obtenerCodigoExpansionEdicion());

            String claseCarta = obtenerClaseCarta();

            if(claseCarta.contains ("Pokémon") && !claseCarta.contains ("Tool") && !claseCarta.contains ("LEGEND")) {


                if(claseCarta.contains("Stage")) {
                    System.out.println("Pre evolucion    : " + obtenerPreEvolucion());
                }
                System.out.println("Tipo de Carta    : "+claseCarta);
                System.out.println("Tipo Pokemon     : "+obtenerTipoPokemon());
                System.out.println("HP Pokemon       : "+obtenerHPPokemon());
                System.out.println("Debilidad        : "+obtenerDebilidad());
            }

            if(claseCarta.contains("LEGEND")) {

            }

            if(claseCarta.contains("Trainer")) {
            }

            if(claseCarta.contains("Energy")) {
            }

            InsertarCartaEnBBDD();


        }else{
            System.out.println("Ya se ingreso: id: "+ index);
        }

        System.out.println("--------------------------------------------------------------------");

    }
}
