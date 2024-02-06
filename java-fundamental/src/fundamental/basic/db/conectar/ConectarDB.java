package fundamental.basic.db.conectar;

import java.sql.*;

public class ConectarDB {

    public ConectarDB() {

    }


    public static void main(String[] args) {

        ConectarDB db = new ConectarDB();
        Connection con = db.conectar();
        db.selectTable(con);

    }

    private void selectTable(Connection con) {
        try {
            String query = "SELECT * FROM TBL_PERSONA";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            //[nombre,apellido]
            //[CHRISTIAN,DE LA CRUZ]1
            //[DAVID,X]2

            //PE_ID,PE_NOMBRE,PE_APELLIDO,PE_EDAD
            while (rs.next()) {
                System.out.println(rs.getString("PE_NOMBRE") + "  " + rs.getString("PE_APELLIDO") + "  " + rs.getInt("PE_ID") + "  " + rs.getInt("PE_EDAD"));
            }
        } catch (SQLException e) {
            System.out.println("SQLException = " + e.getMessage());
        }
    }


    private Connection conectar() {

        Connection connection = null;

        try {
            Class.forName("org.postgresql.Driver");

            /**
             * Params:
             * url – a database url of the form jdbc:subprotocol:subname user – the database user on whose behalf the connection is being made password – the user's password
             * jdbc:postgresql://localhost:5432/postgres
             */
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");

        } catch (ClassNotFoundException e) {
            System.out.println("Error ClassNotFoundException 1 " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error SQLException 2 " + e.getMessage());
        }

        return connection;

    }
//No se encontró ningún controlador adecuado para la URL
//No suitable driver found for url


}


