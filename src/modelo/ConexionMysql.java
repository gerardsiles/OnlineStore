package modelo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionMysql {

    private static final String base = "FP_206_Java_con_MYSQL";
    private static final String user = "root";
    private static final String password = "password";
    private static final String url = "jdbc:mysql://localhost:3306/" + base;
    private static Connection con = null;

    public static Connection getConexion() {
        Connection con = null;
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);
        } catch(SQLException e) {
            System.err.println(e);
        } //catch (ClassNotFoundException ex) {
//            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
//        }
        return con;
    }
}
