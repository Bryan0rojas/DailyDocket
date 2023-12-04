package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConectarBase {

    public static String url = "jdbc:mysql://localhost:3306/usuarios";
    public static String usuario = "root";
    public static String contrasena = "123456";
    public static String clase = "com.mysql.cj.jdbc.Driver";

    public static Connection conectar() {
        Connection conexion = null;

        try {
            Class.forName(clase);
            conexion = (Connection) DriverManager.getConnection(url, usuario, contrasena);
            System.out.println("conexion establecida");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return conexion;
    }
}
