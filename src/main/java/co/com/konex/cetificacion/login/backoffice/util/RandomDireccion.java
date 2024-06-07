package co.com.konex.cetificacion.login.backoffice.util;

import java.security.SecureRandom;
import java.util.Random;

public class RandomDireccion {
    RandomDireccion() {
    }

    private static final String[] PREFIXES = {"Transversal", "Diagonal", "Carrera", "Avenida"};
    private static final String[] DIRECTIONS = {"Norte", "Sur", "Este", "Oeste"};
    private static final String LETTERS = "ABCDEF";
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 99;

    public static String generateRandomAddress() {
        SecureRandom random = new SecureRandom();
        String prefix = PREFIXES[random.nextInt(PREFIXES.length)];
        String direction = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
        String middlePart = generateRandomMiddlePart(random);
        String numberRange = generateRandomNumberRange(random);

        return prefix + " " + middlePart + " " + direction + " #" + numberRange;
    }

    public static String generateFailAddress() {
        SecureRandom random = new SecureRandom();
        String prefix = PREFIXES[random.nextInt(PREFIXES.length)];

        return prefix + " " + LetrasYNumerosAleatorios.generarLetrasYNumerosAleatorios(50,1);
    }

    private static String generateRandomMiddlePart(Random random) {
        StringBuilder middlePartBuilder = new StringBuilder();

        for (int i = 0; i < random.nextInt(10) + 1; i++) {
            char randomChar = LETTERS.charAt(random.nextInt(LETTERS.length()));
            middlePartBuilder.append(randomChar);
        }

        return middlePartBuilder.toString();
    }

    private static String generateRandomNumberRange(Random random) {
        int start = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
        int end = random.nextInt(MAX_NUMBER - start + 1) + start;
        return start + " a " + end;
    }
}
