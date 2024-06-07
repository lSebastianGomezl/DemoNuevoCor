package co.com.konex.cetificacion.login.backoffice.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CsvFileHandler {
    private String filePath;
    private Map<String, Integer> headerMap;
    private String[][] data;

    public CsvFileHandler(String filePath) {
        this.filePath = filePath;
        this.headerMap = new HashMap<>();
        readCsvFile();
    }

    private void readCsvFile() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));

            // Lee la primera línea para obtener los encabezados
            String[] headers = reader.readLine().split(",");
            for (int i = 0; i < headers.length; i++) {
                headerMap.put(headers[i], i);
            }

            // Cuenta el número de columnas
            int numColumns = headers.length;

            // Lee el resto del archivo y almacena los datos en una matriz
            String line;
            int numRows = 0;
            while ((line = reader.readLine()) != null) {
                numRows++;
            }

            // Reinicia el lector para volver a leer desde el principio
            reader.close();
            reader = new BufferedReader(new FileReader(filePath));

            // Salta la primera línea (encabezados)
            reader.readLine();

            // Inicializa la matriz de datos
            data = new String[numRows][numColumns];

            // Llena la matriz de datos
            for (int row = 0; row < numRows; row++) {
                String[] values = reader.readLine().split(",");
                for (int col = 0; col < numColumns; col++) {
                    data[row][col] = values[col];
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String findDataByColumn(String columnName, String searchValue) {
        if (!headerMap.containsKey(columnName)) {
            return "Columna no encontrada";
        }

        int columnIndex = headerMap.get(columnName);

        for (int row = 0; row < data.length; row++) {
            if (data[row][columnIndex].equals(searchValue)) {
                // Devuelve la fila completa cuando se encuentra el valor buscado
                return String.join(",", data[row]);
            }
        }

        return "Dato no encontrado";
    }

    public List<String> getColumnData(String columnName) {
        List<String> columnData = new ArrayList<>();

        if (!headerMap.containsKey(columnName)) {
            System.out.println("Columna no encontrada");
            return columnData;
        }

        int columnIndex = headerMap.get(columnName);

        for (int row = 0; row < data.length; row++) {
            columnData.add(data[row][columnIndex]);
        }

        return columnData;
    }
}
