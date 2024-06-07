package co.com.konex.cetificacion.login.backoffice.util;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.SecureRandom;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

import static co.com.konex.cetificacion.login.backoffice.util.Constantes.*;

public class GeneradorNombres {
    private List<String> nombres;
    private static String[] complemento = {"Solutions", "Systems", "Enterprises", "Tech", "Innovations", "Industries", "Services"};
    private static SecureRandom random = new SecureRandom();

    public GeneradorNombres(String rutaArchivo) {
        this.nombres = new ArrayList<>();
        cargarNombresDesdeExcel(rutaArchivo);
    }

    private void cargarNombresDesdeExcel(String rutaArchivo) {
        try (FileInputStream fileInputStream = new FileInputStream(new File(rutaArchivo));
             Workbook workbook = new XSSFWorkbook(fileInputStream)) {

            Sheet sheet = workbook.getSheetAt(0);  // primera hoja del libro
            DataFormatter dataFormatter = new DataFormatter();

            for (Row row : sheet) {
                Cell cell = row.getCell(0);  // primera columna
                String nombre = dataFormatter.formatCellValue(cell).trim();
                if (!nombre.isEmpty()) {
                    nombres.add(nombre);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public class ListaDeNombresVaciaException extends RuntimeException {
        public ListaDeNombresVaciaException(String mensaje) {
            super(mensaje);
        }
    }

    public String nombreCorto(String nombre) {
        StringBuilder nombreCorto = new StringBuilder();

        // Normalizar el nombre para quitar tildes
        String nombreNormalizado = Normalizer.normalize(nombre, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "").replaceAll(" ","");

        // Tomar la primera letra del nombre normalizado
        nombreCorto.append(nombreNormalizado.charAt(0));

        // Tomar las siguientes 3 letras consecutivas aleatorias
        int longitudNombre = nombreNormalizado.length();
        if (longitudNombre > 3) {
            int indiceInicio = random.nextInt(longitudNombre - 3);
            nombreCorto.append(nombreNormalizado, indiceInicio + 1, indiceInicio + 4);
        } else {
            // Si el nombre es corto, simplemente tomar el resto de letras (máximo 3)
            nombreCorto.append(nombreNormalizado, 1, longitudNombre);
        }

        return nombreCorto.toString();
    }



    public String generarNombreAleatorio() {
        if (nombres.isEmpty()) {
            throw new ListaDeNombresVaciaException("La lista de nombres está vacía. Asegúrate de cargar nombres desde el archivo Excel.");
        }

        int indiceAleatorio = (int) SharedContext.getVariable("numeroRandom", random.nextInt(nombres.size()));
        SharedContext.setVariable("numeroRandom", indiceAleatorio);
        return nombres.get(indiceAleatorio);
    }

    public String nombreURLDeArchivo(String nombre) {
        // Normalizar el nombre para quitar tildes y convertir a minúsculas
        String nombreNormalizado = Normalizer.normalize(nombre, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "").replaceAll(" ","")
                .toLowerCase();

        // Reemplazar espacios con guiones bajos y construir la URL
        return "www." + nombreNormalizado.replaceAll("\\s", "-") + ".com";
    }
    public static String razonSocial(){
        GeneradorNombres generador = new GeneradorNombres(RUTA_RAZON_SOCIAL);
        return generador.generarNombreAleatorio() + " " + complemento[random.nextInt(complemento.length)] + LetrasYNumerosAleatorios.generarLetrasYNumerosAleatorios(2,1);
    }
    public static String razonSocialFail(){
        GeneradorNombres generador = new GeneradorNombres(RUTA_RAZON_SOCIAL);
        return generador.generarNombreAleatorio() + " " + complemento[random.nextInt(complemento.length)] + LetrasYNumerosAleatorios.generarLetrasYNumerosAleatorios(1,1);
    }
    public static String razonSocialFailCaracteres(){
        GeneradorNombres generador = new GeneradorNombres(RUTA_RAZON_SOCIAL);
        return generador.generarNombreAleatorio() + " " + complemento[random.nextInt(complemento.length)] + LetrasYNumerosAleatorios.generarLetrasYNumerosAleatorios(60,1);
    }

    public static String dominio(){
        GeneradorNombres generador = new GeneradorNombres(RUTA_RAZON_SOCIAL);
        return "https://www."+generador.generarNombreAleatorio().replaceAll(" ","") + ".com";
    }

    public static String dominioCaracteres(){
        return "https://www."+LetrasYNumerosAleatorios.generarLetrasYNumerosAleatorios(200,100)+ ".com";
    }

    public static String cargarNitExistente(){
        GeneradorNombres generador = new GeneradorNombres(RUTA_NITS_EXISTENTES);
        return generador.generarNombreAleatorio();
    }

    public static String cargarRazonSocialExistente(){
        GeneradorNombres generador = new GeneradorNombres(RUTA_RAZON_SOCIAL_EXISTENTE);
        return generador.generarNombreAleatorio();
    }

}
