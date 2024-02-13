package fundamental.basic.app.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {

    public Connection getConnection() {
        return conectar();
    }


    private Connection conectar() {

        Connection connection = null;

        try {
            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        } catch (ClassNotFoundException e) {
            System.out.println("Error ClassNotFoundException 1 " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error SQLException 2 " + e.getMessage());
        }

        return connection;

    }
}


