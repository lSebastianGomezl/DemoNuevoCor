package co.com.konex.cetificacion.login.backoffice.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class FileReader {

    public static String leerArchivo(String ruta) throws IOException {
        Path path = Paths.get(ruta);
        System.out.println(Files.readAllLines(path, StandardCharsets.UTF_8));
        return Files.readAllLines(path, StandardCharsets.UTF_8).toString();
    }

    public static boolean archivoExiste(String ruta) {
        Path path = Paths.get(ruta);
        return Files.exists(path) && Files.isRegularFile(path);
    }

    public static void escribirArchivo(String ruta, String nuevoDato) throws IOException {
        // Escribir el nuevo dato en el archivo con una nueva línea
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta, true))) {
            writer.write(nuevoDato);
            writer.newLine();  // Agregar una nueva línea después del nuevo dato
        }
    }

    public static String datos(String rutaArchivo) {
        String contenido = null;
        try {
            List<String> lineas = Collections.singletonList(leerArchivo(rutaArchivo));
            // Imprime el contenido del archivo línea por línea
            for (String linea : lineas) {
                contenido = contenido + linea;
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contenido;
    }
}
