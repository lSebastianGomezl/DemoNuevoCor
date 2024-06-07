package co.com.konex.cetificacion.login.backoffice.util;

import java.io.File;

public class FullPathResolver {

    public static String getFullPath(String relativePath) {
        // Obtener el directorio actual del proyecto
        String projectDir = System.getProperty("user.dir");

        // Crear un objeto File para la ruta relativa
        File relativeFile = new File(projectDir, relativePath);

        // Obtener la ruta completa
        String fullPath = relativeFile.getAbsolutePath();

        return fullPath;
    }
}

