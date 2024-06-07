package co.com.konex.cetificacion.login.backoffice.util;

import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.logging.Logger;
import java.util.zip.*;

public class Conversor {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Conversor.class));

    /**
     *Metodo el cual recibe la ruta donde se encuentra la informacion que voy a comprimir y el destino donde quedara el archivo comprimido
     * @param sourceFolder ruta donde se encuentra la carpeta fuente
     * @param outputFile ruta donde se va a alojar el .zip
     * @throws IOException
     */
    public static void zipFolder(String sourceFolder, String outputFile) throws IOException {
        FileOutputStream fos = new FileOutputStream(outputFile);
        ZipOutputStream zos = new ZipOutputStream(fos);

        try {
            addFolderToZip("", sourceFolder, zos);
        } finally {
            zos.close();
            fos.close();
        }
    }

    /**
     * Metodo en el cual va a ir agregando uno a uno los archivos al directorio comprimido
     * @param path direccion de la ubicacion de los archivos a ser comprimidos
     * @param srcFile archivo fuente con la informacion a comprimir
     * @param zip nombre del archivo .zip
     * @throws IOException
     */
    private static void addFileToZip(String path, String srcFile, ZipOutputStream zip) throws IOException {
        File folder = new File(srcFile);
        if (folder.isDirectory()) {
            addFolderToZip(path, srcFile, zip);
        } else {
            byte[] buf = new byte[1024];
            int len;
            FileInputStream in = new FileInputStream(srcFile);
            zip.putNextEntry(new ZipEntry(path + "/" + folder.getName()));
            while ((len = in.read(buf)) > 0) {
                zip.write(buf, 0, len);
            }
            in.close();
        }
    }

    /**
     * Metodo en cual va recorriendo la carpeta que estamos comprimiendo
     * @param path direccion de la ubicacion de los archivos a ser comprimidos
     * @param srcFolder archivo fuente con la informacion a comprimir
     * @param zip nombre del archivo .zip
     * @throws IOException
     */
    private static void addFolderToZip(String path, String srcFolder, ZipOutputStream zip) throws IOException {
        File folder = new File(srcFolder);
        for (String fileName : Objects.requireNonNull(folder.list())) {
            if (path.equals("")) {
                addFileToZip(folder.getName(), srcFolder + "/" + fileName, zip);
            } else {
                addFileToZip(path + "/" + folder.getName(), srcFolder + "/" + fileName, zip);
            }
        }
    }

    /**
     * Metodo en el cual retorna un string que contine la información del fichero en Base64
     * @param filePath ruta donde se encuentra el archivo con su nombre y extencion
     * @return retorna archivo en Base64 como String
     * @throws RuntimeException
     */
    public static String codificarBase64(String filePath) throws RuntimeException {
        String base64String = null;
        try {
            base64String = fileToBase64(filePath);
        } catch (IOException e) {
            LOGGER.info(e.getMessage());
        }
        return base64String;
    }

    /**
     * Metodo en el cual convierte un archivo en codigo Base64
     * @param filePath ruta del archivo a convertir
     * @return retorna codigo en Base64 como String
     * @throws IOException
     */
    public static String fileToBase64(String filePath) throws IOException {
        File file = new File(filePath);
        byte[] fileContent = new byte[(int) file.length()];

        FileInputStream fileInputStream = new FileInputStream(file);
        fileInputStream.read(fileContent);
        fileInputStream.close();

        return Base64.getEncoder().encodeToString(fileContent);
    }

    /**
     * Metodo que convierte un archivo Json a String
     * @param path ruta del archivo
     * @return retorna archivo json como String
     * @throws IOException
     */
    public static String convertirfileJsonAStringUTF8(String path) throws IOException {
        FileInputStream flieinputStream = new FileInputStream(path);
        return IOUtils.toString(flieinputStream, StandardCharsets.UTF_8);
    }

    /**
     * Metodo que convierte una secuencia de caracteres a Base64 y lo retorna como String
     * @param strAConvertir variable a la cual quiero convertir a Base64
     * @return retorna contenido String en Base64
     */
    public static String convertirStringABase64(String strAConvertir){
        byte[] encodedBytes = Base64.getEncoder().encode(strAConvertir.getBytes(StandardCharsets.UTF_8));
        return new String(encodedBytes, StandardCharsets.UTF_8);
    }

}