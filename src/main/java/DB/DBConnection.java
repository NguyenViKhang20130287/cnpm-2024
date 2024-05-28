package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://roundhouse.proxy.rlwy.net:23329/cnpm_clothes_ecommerce_shop";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "chidTDcqrjQaIdnttLDYJfcgUTKOQgyZ";

    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Database connected");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) {
        System.out.println(new DBConnection().getConnection());
    }
}
