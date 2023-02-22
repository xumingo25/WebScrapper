package tests;

import org.testng.annotations.Test;
import utils.BaseTest;


public class DATA_PKMONTCG_EDICION_BLACK_WHITE extends BaseTest {

    @Test
    public void BlackWhite_LegendaryTreasures() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Black & White", "BW—Legendary Treasures");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void BlackWhite_PlasmaBlast() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Black & White", "BW—Plasma Blast");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void BlackWhite_PlasmaFreeze() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Black & White", "BW—Plasma Freeze");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void BlackWhite_PlasmaStorm() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Black & White", "BW—Plasma Storm");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void BlackWhite_BoundariesCrossed() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Black & White", "BW—Boundaries Crossed");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void BlackWhite_DragonVault() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Black & White", "Dragon Vault");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void BlackWhite_DragonsExalted() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Black & White", "BW—Dragons Exalted");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void BlackWhite_DarkExplorers() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Black & White", "BW—Dark Explorers");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void BlackWhite_NextDestinies() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Black & White", "BW—Next Destinies");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void BlackWhite_NobleVictories() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Black & White", "BW—Noble Victories");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void BlackWhite_BlackWhite() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Black & White", "Black & White");
        tgcDBPage.seleccionarCartaPorEdicion();
    }

    @Test
    public void BlackWhite_BWPromo() {
        tgcDBPage.realizarBusquedaAvanzadaEdicion("Black & White", "BW—Promo");
        tgcDBPage.seleccionarCartaPorEdicion();
    }
}
