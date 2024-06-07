package co.com.konex.cetificacion.login.backoffice.util;

import java.security.SecureRandom;

public class GeneradorNumerosTelefono {
    private GeneradorNumerosTelefono() {
    }

    public static String telefonoColombia() {
        String codigoPais = "+(57)";

        String numerosRestantes = generarNumerosAleatorios(10);

        return codigoPais + numerosRestantes;
    }

    public static String telefonoFail() {
        return generarNumerosAleatorios(10);
    }
    public static String telefonoFailCaracteres() {
        String codigoPais = "+(57)";
        return codigoPais+generarNumerosAleatorios(20);
    }
    private static String generarNumerosAleatorios(int longitud) {
        SecureRandom random = new SecureRandom();
        StringBuilder numerosAleatorios = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            numerosAleatorios.append(random.nextInt(10));
        }

        return numerosAleatorios.toString();
    }

}

