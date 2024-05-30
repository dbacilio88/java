package com.bxcode.fundamental.db.conectar;

import lombok.extern.log4j.Log4j2;

import java.sql.*;


@Log4j2
public class ConectarDB {

    public static void main(String[] args) {
        ConectarDB db = new ConectarDB();
        Connection con = db.conectar();
        db.selectTable(con);
        db.deleteTable(con);
        db.selectTable(con);
        db.insertTable(con, 1);
        db.selectTableWhere(con);
        db.updateTable(con);
    }


    //executeUpdate : INSERT, UPDATE, DELETE
    //executeQuery : SELECT
    //LENGUAJE DE MANIPULACIÓN DE DATOS

    private void deleteTable(Connection con) {
        try {
            String query = "DELETE FROM TBL_PERSONA WHERE pe_id = 1"; //ELIMINANDO TODOS LOS REGISTROS
            Statement st = con.createStatement();
            int rs = st.executeUpdate(query);
            log.info("delete = {}", rs);

        } catch (SQLException e) {
            log.error("error delete = {}", e.getMessage());
        }
    }

    private void updateTable(Connection con) {
        try {
            String query = "UPDATE TBL_PERSONA SET PE_EDAD = 21, PE_APELLIDO= 'DEL ROSARIO' WHERE PE_ID = 3";
            Statement st = con.createStatement();
            int rs = st.executeUpdate(query);
            log.info("update = {}", rs);

        } catch (SQLException e) {
            log.error("error update = {}", e.getMessage());
        }
    }

    private void insertTable(Connection con, int id) {
        String query = "INSERT INTO TBL_PERSONA(PE_ID,PE_NOMBRE,PE_APELLIDO,PE_EDAD) VALUES (" + id + ",'DAVID','DE LA CRUZ',20);";
        try {
            Statement st = con.createStatement();
            int rs = st.executeUpdate(query);
            log.info("insert = {}", rs);

        } catch (SQLException e) {
            log.error("error insert = {}", e.getMessage());
        }
    }

    private void selectTable(Connection con) {
        try {
            String query = "SELECT PE_NOMBRE,PE_ID PE_APELLIDO  FROM TBL_PERSONA";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                log.info("select {},{},{},{}", rs.getString("PE_NOMBRE"), rs.getString("PE_APELLIDO"), rs.getInt("PE_ID"), rs.getInt("PE_EDAD"));
            }
        } catch (SQLException e) {
            log.error("error select = {}", e.getMessage());
        }
    }

    private void selectTableWhere(Connection con) {
        try {
            String query = "SELECT P.PE_NOMBRE, P.PE_APELLIDO,P.PE_ID, P.PE_EDAD FROM TBL_PERSONA P  WHERE P.PE_NOMBRE='CHRISTIAN'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                log.info("table: {},{},{},{}", rs.getString("PE_NOMBRE"), rs.getString("PE_APELLIDO"), rs.getInt("PE_ID"), rs.getInt("PE_EDAD"));
            }
        } catch (SQLException e) {
            log.error("error select table = {}", e.getMessage());
        }
    }


    private Connection conectar() {

        Connection connection = null;

        try {

            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "####");

        } catch (SQLException e) {
            log.error("Error SQLException {}", e.getMessage());
        }

        return connection;

    }
}


