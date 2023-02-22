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


public class DATA_PKMONTCG_EDICION_XY extends BaseTest {

    @Test
    public void Ex_Evolutions() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("XY", "XY—Evolutions");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void Ex_SteamSiege() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("XY", "XY—Steam Siege");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void Ex_FatesCollide() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("XY", "XY—Fates Collide");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void Ex_BREAKpoint() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("XY", "XY—BREAKpoint");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void XY_AncientOrigins() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("XY", "XY—Ancient Origins");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void XY_RoaringSkies() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("XY", "XY—Roaring Skies");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void XY_DoubleCrisis() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("XY", "Double Crisis");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void XY_PrimalClash() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("XY", "XY—Primal Clash");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void XY_PhantomForces() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("XY", "XY—Phantom Forces");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void XY_FuriousFists() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("XY", "XY—Furious Fists");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void XY_Flashfire() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("XY", "XY—Flashfire");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void XY_XY() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("XY", "XY");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void XY_KalosStarterSet() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("XY", "XY—Kalos Starter Set");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void XY_Promo() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("XY", "XY—Promo");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void XY_YellowAAlternate() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("XY", "Yellow A Alternate");
        tgcDBPage.seleccionarCartaPorEdicion();
    }





}
