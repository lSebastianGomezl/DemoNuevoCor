package co.com.konex.cetificacion.login.backoffice.util;

import java.io.IOException;
import java.sql.*;

import static co.com.konex.cetificacion.login.backoffice.util.ConstantesConetionBaseDeDatos.*;

public class OracleDatabaseConnection {
    public static void consultaBaseDeDatosADM(String pathFileOrQuery) {
        try {
            // Cargar el controlador JDBC
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Establecer la conexión
            Connection connection = DriverManager.getConnection(QA_ADM_JDBCURL, QA_ADM_USER, QA_ADM_PASSWORD);
            String sqlQuery;
            if (FileReader.archivoExiste(FullPathResolver.getFullPath(ConstantesConetionBaseDeDatos.FILE_PATH_ACTUAL_QUERY+pathFileOrQuery))) {
                sqlQuery = FileReader.leerArchivo(FullPathResolver.getFullPath(ConstantesConetionBaseDeDatos.FILE_PATH_ACTUAL_QUERY+pathFileOrQuery)).replace("[", "").replace("]", "");
            } else {
                sqlQuery = pathFileOrQuery;
            }
            System.out.println("sqlQuery: " + sqlQuery);
            // Crear una declaración preparada
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            // Ejecutar la consulta
            ResultSet resultSet = preparedStatement.executeQuery();

            // Obtener información sobre las columnas
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Construir la cadena CSV de nombres de columnas
            StringBuilder columnNamesCSV = new StringBuilder();
            for (int i = 1; i <= columnCount; i++) {
                columnNamesCSV.append(metaData.getColumnName(i));
                if (i < columnCount) {
                    columnNamesCSV.append(",");
                }
            }
            String fullPathLastQuery= FullPathResolver.getFullPath(FILE_PATH_LAST_QUERY);

            FileReader.escribirArchivo(fullPathLastQuery, columnNamesCSV.toString());

            // Imprimir y almacenar los resultados
            while (resultSet.next()) {
                // Construir la cadena CSV de datos
                StringBuilder rowDataCSV = new StringBuilder();
                for (int i = 1; i <= columnCount; i++) {
                    rowDataCSV.append(resultSet.getString(i));
                    if (i < columnCount) {
                        rowDataCSV.append(",");
                    }
                }

                // Imprimir y almacenar los datos de la fila
                FileReader.escribirArchivo(fullPathLastQuery, rowDataCSV.toString());
            }

            // Cerrar recursos
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
