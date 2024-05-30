package com.bxcode.fundamental.app.db;


import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


@Log4j2
public class Conectar {

    public Connection getConnection() {
        return conectar();
    }


    private Connection conectar() {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "+++++", "sadgasfasfasdfasdfasdfasdfasdfasdfasdf");
        } catch (SQLException e) {
            log.error("Error SQLException 2 {}", e.getMessage());
        }

        return connection;

    }
}


