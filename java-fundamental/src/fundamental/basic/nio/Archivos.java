package fundamental.basic.nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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

        String HOME = System.getProperty("user.home");
        System.out.println(HOME);
        Path p = Paths.get(HOME);
        System.out.println(p);
        boolean isFile = Files.isDirectory(p);
        System.out.println(isFile);
        Path path = Paths.get(HOME + "/inexistent_file.txt");
        System.out.println(path);
    }
}
