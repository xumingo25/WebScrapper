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


public class DATA_PKMONTCG_EDICION_PLATINUM extends BaseTest {

    @Test
    public void Platinum_Arceus() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Platinum", "Arceus");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void Platinum_SupremeVictors() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Platinum", "Supreme Victors");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void Platinum_RisingRivals() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Platinum", "Rising Rivals");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void Platinum_Platinum() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Platinum", "Platinum");
        tgcDBPage.seleccionarCartaPorEdicion();
    }


}
