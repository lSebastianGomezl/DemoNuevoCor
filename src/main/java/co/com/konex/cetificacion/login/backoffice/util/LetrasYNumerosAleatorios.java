package co.com.konex.cetificacion.login.backoffice.util;

import java.security.SecureRandom;

public class LetrasYNumerosAleatorios {
    LetrasYNumerosAleatorios() {
    }

    public static String generarLetrasYNumerosAleatorios(int cantidadLetras, int cantidadNumeros) {
        SecureRandom rand = new SecureRandom();
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < cantidadLetras; i++) {
            char letraAleatoria = (char) (rand.nextInt(26) + 'a');
            resultado.append(letraAleatoria);
        }

        for (int i = 0; i < cantidadNumeros; i++) {
            int numeroAleatorio = rand.nextInt(10);
            resultado.append(numeroAleatorio);
        }

        return " "+resultado;
    }

    public static int generarNumeroAleatorioEntre(int minimo, int maximo) {
        if (minimo >= maximo) {
            throw new IllegalArgumentException("El valor mínimo debe ser menor que el valor máximo.");
        }
        SecureRandom rand = new SecureRandom();
        return rand.nextInt((maximo - minimo) + 1) + minimo;
    }
}
