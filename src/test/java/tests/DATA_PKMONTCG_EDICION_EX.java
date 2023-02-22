package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.TradingCardDataBase_Page;
import utils.BaseTest;
import utils.PropertiesDriven;
import utils.BrowserFactory;


public class DATA_PKMONTCG_EDICION_EX extends BaseTest {

    @Test
    public void Ex_PowerKeepers() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("EX", "Power Keepers");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void Ex_HolonPhantoms() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("EX", "Holon Phantoms");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void Ex_UnseenForces() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("EX", "Unseen Forces");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void Ex_TeamRocketReturns() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("EX", "Team Rocket Returns");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void Ex_TeamMagmaVSTeamAqua() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("EX", "Team Magma vs. Team Aqua");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void Ex_RubySapphire() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("EX", "Ruby & Sapphire");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void Ex_DragonFrontiers() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("EX", "Dragon Frontiers");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void Ex_LegendMaker() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("EX", "Legend Maker");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void Ex_Emerald() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("EX", "Emerald");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void Ex_FireRedLeafGreen() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("EX", "Fire Red & Leaf Green");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void Ex_Dragon() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("EX", "Dragon");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void Ex_CrystalGuardians() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("EX", "Crystal Guardians");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void Ex_DeltaSpecies() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("EX", "Delta Species");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void Ex_Deoxys() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("EX", "Deoxys");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void Ex_HiddenLegends() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("EX", "Hidden Legends");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void Ex_Sandstorm() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("EX", "Sandstorm");
        tgcDBPage.seleccionarCartaPorEdicion();
    }




}
