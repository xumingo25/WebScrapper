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


public class DATA_PKMONTCG_EDICION_SWORD_SHIELD extends BaseTest {

    @Test
    public void SwordShield_CrownZenith() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sword & Shield", "Crown Zenith Galarian Gallery");
        tgcDBPage.maximizarBrowser();
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SwordShield_FusionStrike() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sword & Shield", "Fusion Strike");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SwordShield_CelebrationsCC() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sword & Shield", "Celebrations: Classic Collection");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SwordShield_Celebrations() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sword & Shield", "Celebrations");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SwordShield_EvolvingSkies() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sword & Shield", "Evolving Skies");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SwordShield_ChillingReign() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sword & Shield", "Chilling Reign");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SwordShield_BattleStyles() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sword & Shield", "Battle Styles");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SwordShield_ShiningFatesSV() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sword & Shield", "Shining Fates: Shiny Vault");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SwordShield_ShiningFates() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sword & Shield", "Shining Fates");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SwordShield_VividVoltage() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sword & Shield", "Vivid Voltage");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SwordShield_ChampionsPath() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sword & Shield", "Champion’s Path");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SwordShield_DarknessAblaze() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sword & Shield", "Darkness Ablaze");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SwordShield_RebelClash() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sword & Shield", "Rebel Clash");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SwordShield_SwordShield() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sword & Shield", "Sword & Shield");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SwordShield_SwordShieldPromo() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sword & Shield", "Sword & Shield Promo");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SwordShield_BrilliantStarsTrainerGallery() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sword & Shield", "Brilliant Stars Trainer Gallery");
        tgcDBPage.seleccionarCartaPorEdicion();
    }
    @Test
    public void SwordShield_BrilliantStars() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sword & Shield", "Brilliant Stars");
        tgcDBPage.seleccionarCartaPorEdicion();
    }



}
