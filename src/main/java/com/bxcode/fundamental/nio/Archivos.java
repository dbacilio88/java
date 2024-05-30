package com.bxcode.fundamental.nio;

import lombok.extern.log4j.Log4j2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Log4j2
public class Archivos {

    /**
     * API de E/S en la plataforma Java (NIO2) para realizar manipulación básica de archivos.
     * <p>
     * Las API de archivos en NIO2 constituyen una de las principales áreas funcionales nuevas de
     * la plataforma Java que se incluye con Java 7, específicamente un subconjunto de la nueva API
     * del sistema de archivos junto con las API de ruta.
     *
     * @param args
     */

    public static void main(String[] args) {
        String path = System.getProperty("user.home");
        Path p = Paths.get(path + "/java/data");

        try {
            Files.createTempFile(p, null, null);
            if (Files.exists(p)) {
                log.info("file {}", p);
            } else {
                Path create = Files.createDirectory(p);
                log.info("Path {}", create);
            }
        } catch (IOException e) {
            log.error("error {}", e.getMessage());
        }

    }
}
