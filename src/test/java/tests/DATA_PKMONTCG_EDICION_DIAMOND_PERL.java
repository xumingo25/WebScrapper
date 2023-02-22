package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TradingCardDataBase_Page;
import utils.BaseTest;
import utils.BrowserFactory;
import utils.PropertiesDriven;

public class DATA_PKMONTCG_EDICION_DIAMOND_PERL extends BaseTest {

    @Test
    public void DiamondPearl_Stormfront() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Diamond & Pearl", "Stormfront");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void DiamondPearl_LegendsAwakened() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Diamond & Pearl", "Legends Awakened");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void DiamondPearl_MajesticDawn() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Diamond & Pearl", "Majestic Dawn");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void DiamondPearl_GreatEncounters() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Diamond & Pearl", "Great Encounters");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void DiamondPearl_SecretWonders() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Diamond & Pearl", "Secret Wonders");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void DiamondPearl_MysteriousTreasures() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Diamond & Pearl", "Mysterious Treasures");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void DiamondPearl_DiamondPerl() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Diamond & Pearl", "Diamond & Pearl");
        tgcDBPage.seleccionarCartaPorEdicion();
    }


}
