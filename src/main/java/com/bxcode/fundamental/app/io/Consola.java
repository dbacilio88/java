package com.bxcode.fundamental.app.io;

import lombok.extern.log4j.Log4j2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Consola
 * <p>
 * Consola class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BXCODE APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author bxcode
 * @author bacsystem.sac@gmail.com
 * @since 13/02/2024
 */

@Log4j2
public class Consola {

    public String getString(String mensaje) {
        log.info(mensaje);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = null;
        try {
            data = br.readLine();
        } catch (IOException e) {
            log.error("IOException {}", e.getMessage());
        }
        return data;
    }

    public Integer getInteger(String mensaje) {
        log.info(mensaje);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer data = null;
        try {
            String m = br.readLine();
            data = Integer.valueOf(m);
        } catch (IOException | NumberFormatException e) {
            return null;
        }
        return data;
    }


    public String getMenu() {
        return "[1] listar personas" +
                "\n[2] registrar persona" +
                "\n[3] actualizar persona" +
                "\n[4] eliminar persona" +
                "\n[0] salir del programa" +
                "\n\t[*] elegir opción:";
    }

}


