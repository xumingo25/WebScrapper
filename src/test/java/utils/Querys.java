package utils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Querys extends Conexion {

    private Connection conn = getConnection();

    public void registraUsuario(String edicionCarta, String expansionCarta, String idiomaCarta, String nombreCarta, String nroCartaExpansionTipo, String subTipoCarta, String tipoCarta, String urlCarta) {
        try {
            Statement stm = conn.createStatement();
            if(stm == null){
                System.out.println("holi");
                System.out.println("holi");
            }
            stm.executeUpdate("INSERT INTO `carta_pokemon` (`edicion_carta`, `expansion_carta`,`idioma_carta`,`nombre_carta`,`nro_carta_expansion_tipo_carta`,`sub_tipo_carta`,`tipo_carta`,`url_carta`) VALUES ('" + edicionCarta + "','" + expansionCarta + "','" +idiomaCarta + "','" +nombreCarta + "','" +nroCartaExpansionTipo + "','" +subTipoCarta + "','" +tipoCarta + "','" +urlCarta + "')");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("No existen registros en la base de datos, favor ingresar registros");

        }
    }
}