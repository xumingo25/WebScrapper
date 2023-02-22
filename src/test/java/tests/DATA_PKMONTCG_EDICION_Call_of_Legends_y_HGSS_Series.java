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


public class DATA_PKMONTCG_EDICION_Call_of_Legends_y_HGSS_Series extends BaseTest {


    @Test
    public void CallLegends_Unleashed() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Call of Legends & HGSS Series", "Unleashed");
        tgcDBPage.seleccionarCartaPorEdicion();
    }


    @Test
    public void CallLegends_Triumphant() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Call of Legends & HGSS Series", "Triumphant");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void CallLegends_HeartGoldSoulSilver() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Call of Legends & HGSS Series", "HeartGold SoulSilver");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void CallLegends_Undaunted() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Call of Legends & HGSS Series", "Undaunted");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void CallLegends_CallLegends() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Call of Legends & HGSS Series", "Call of Legends");
        tgcDBPage.seleccionarCartaPorEdicion();
    }






}
