package pkginterface;

import java.sql.*;

public class ConexionBD {

    Connection cn;
    Statement st;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema","root","");
            System.out.println("Conexión exitosa");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cn;
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("No soportado");
    }

}
