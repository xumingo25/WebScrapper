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


public class DATA_PKMONTCG_EDICION_SUN_MOON extends BaseTest {

    @Test
    public void SunMoon_DetectivePikachu() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sun & Moon", "Detective Pikachu");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SunMoon_CosmicEclipse() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sun & Moon", "Cosmic Eclipse");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SunMoon_HiddenFates() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sun & Moon", "Hidden Fates");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SunMoon_UnifiedMinds() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sun & Moon", "Unified Minds");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SunMoon_UnbrokenBonds() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sun & Moon", "Unbroken Bonds");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SunMoon_TeamUp() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sun & Moon", "Team Up");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SunMoon_LostThunder() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sun & Moon", "Lost Thunder");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SunMoon_DragonMajesty() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sun & Moon", "Dragon Majesty");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SunMoon_CelestialStorm() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sun & Moon", "Celestial Storm");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SunMoon_ForbiddenLight() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sun & Moon", "Forbidden Light");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SunMoon_UltraPrism() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sun & Moon", "Ultra Prism");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SunMoon_CrimsonInvasion() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sun & Moon", "Crimson Invasion");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SunMoon_ShiningLegends() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sun & Moon", "Shining Legends");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SunMoon_BurningShadows() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sun & Moon", "Burning Shadows");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SunMoon_GuardiansRising() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sun & Moon", "Guardians Rising");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SunMoon_SunMoon() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sun & Moon", "Sun & Moon");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SunMoon_YellowAAlternate() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sun & Moon", "Yellow A Alternate");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void SunMoon_SunMoonPromo() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Sun & Moon", "Sun & Moon Promo");
        tgcDBPage.seleccionarCartaPorEdicion();
    }




}
