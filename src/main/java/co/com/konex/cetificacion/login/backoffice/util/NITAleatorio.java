package co.com.konex.cetificacion.login.backoffice.util;

import java.security.SecureRandom;

public class NITAleatorio {
    NITAleatorio() {
    }

    public static String generateRandomNit() {
        SecureRandom random = new SecureRandom();

        int[] nitNumbers = new int[9];
        int[] factors = { 41, 37, 29, 23, 19, 17, 13, 7, 3 };

        for (int i = 0; i < 9; i++) {
            nitNumbers[i] = random.nextInt(10);
        }

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += nitNumbers[i] * factors[i];
        }

        int remainder = sum % 11;
        int verificationDigit = (remainder == 0 || remainder == 1) ? remainder : 11 - remainder;

        StringBuilder nitBuilder = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            nitBuilder.append(nitNumbers[i]);
        }
        nitBuilder.append("-"+verificationDigit);

        return nitBuilder.toString();
    }
    public static String failNit() {
        SecureRandom random = new SecureRandom();
        int numeroAleatorio = 10000000 + random.nextInt(90000000);
        return String.valueOf(numeroAleatorio);
    }
    public static String failNitCaracteres() {
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder numeroAleatorio = new StringBuilder();

        for (int i = 0; i < 50; i++) {
            int digitoAleatorio = secureRandom.nextInt(10);
            numeroAleatorio.append(digitoAleatorio);
        }

        return numeroAleatorio.toString();
    }
    public static String failNitConSigno() {
        SecureRandom random = new SecureRandom();
        int numeroAleatorio = 10000000 + random.nextInt(90000000);
        return numeroAleatorio+"-"+random.nextInt(9);
    }
}
