package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection conn;
    String url = "jdbc:mysql://localhost:3306/tcgdb";
    String user = "root";
    String pass = "";

    public Connection getConnection(){
        try{
            conn = DriverManager.getConnection(url,user,pass);
            System.out.println("Conexion a mysql se realizo correctamente");
            return conn;
        }catch (SQLException throwables){
            throwables.printStackTrace();
            System.out.println("Conexion a mysql NO se realizo");
            return null;
        }

    }
}
