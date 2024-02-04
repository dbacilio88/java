package fundamental.basic.nio;

import java.io.IOException;
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
        String prefix = "log_";
        String suffix = ".txt";

        String HOME = System.getProperty("user.home");
        System.out.println(HOME);
        Path p = Paths.get(HOME + "/java/data");
        System.out.println("path: " + p);
        System.out.println("parent: " + p.getParent());
        System.out.println("filesystem: " + p.getFileSystem());
        System.out.println("root: " + p.getRoot());
        System.out.println("name count: " + p.getNameCount());
        try {
            Files.createTempFile(p, null, null);
            if (Files.exists(p)) {
                System.out.println("Ya existe directorio");
            } else {
                Path create = Files.createDirectory(p);

                System.out.println("create = " + create);
            }


        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }

    }
}
