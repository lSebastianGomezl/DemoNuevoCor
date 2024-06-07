package co.com.konex.cetificacion.login.backoffice.util.backend;

import java.io.File;
import java.util.Scanner;

import static co.com.konex.cetificacion.login.backoffice.util.backend.Constantes.ASSERT_READ_FILE;


public class ReadFile {


    public ReadFile() {
        throw new IllegalStateException("Utility class");
    }

    public static String returnFile(String route){
        String line = "";
        try{
            Scanner input = new Scanner(new File(route));
            while (input.hasNextLine()){
                line = line + input.nextLine();
            }
        }catch (Exception e){
            System.out.println(ASSERT_READ_FILE +  e);
        }
        return line;
    }
}
