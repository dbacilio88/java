package fundamental.basic.db.conectar;

import java.sql.*;

public class ConectarDB {

    public ConectarDB() {

    }


    public static void main(String[] args) {
        ConectarDB db = new ConectarDB();
        Connection con = db.conectar();
        db.selectTable(con);
        db.deleteTable(con);
        db.selectTable(con);
    }


    //executeUpdate : INSERT, UPDATE, DELETE
    //executeQuery : SELECT
    //LENGUAJE DE MANIPULACIÓN DE DATOS

    private void deleteTable(Connection con) {
        try {
            String query = "DELETE FROM TBL_PERSONA WHERE pe_id = 1"; //ELIMINANDO TODOS LOS REGISTROS
            Statement st = con.createStatement();
            int rs = st.executeUpdate(query);
            System.out.println("rs = " + rs);

        } catch (SQLException e) {
            System.out.println("SQLException = " + e.getMessage());
        }
    }

    private void updateTable(Connection con) {
        try {
            String query = "UPDATE TBL_PERSONA SET PE_EDAD = 21, PE_APELLIDO= 'DEL ROSARIO' WHERE PE_ID = 3";
            Statement st = con.createStatement();
            int rs = st.executeUpdate(query);
            System.out.println("rs = " + rs);

        } catch (SQLException e) {
            System.out.println("SQLException = " + e.getMessage());
        }
    }

    private void insertTable(Connection con, int id) {
        String query = "INSERT INTO TBL_PERSONA(PE_ID,PE_NOMBRE,PE_APELLIDO,PE_EDAD) VALUES (" + id + ",'DAVID','DE LA CRUZ',20);";
        try {
            Statement st = con.createStatement();
            int rs = st.executeUpdate(query);
            System.out.println("rs = " + rs);

        } catch (SQLException e) {
            System.out.println("SQLException = " + e.getMessage());
        }
    }

    private void selectTable(Connection con) {
        try {
            String query = "SELECT * FROM TBL_PERSONA";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString("PE_NOMBRE") + "  " + rs.getString("PE_APELLIDO") + "  " + rs.getInt("PE_ID") + "  " + rs.getInt("PE_EDAD"));
            }
        } catch (SQLException e) {
            System.out.println("SQLException = " + e.getMessage());
        }
    }

    private void selectTableWhere(Connection con) {
        try {
            String query = "SELECT P.PE_NOMBRE, P.PE_APELLIDO,P.PE_ID, P.PE_EDAD FROM TBL_PERSONA P  WHERE P.PE_NOMBRE='CHRISTIAN'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
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


