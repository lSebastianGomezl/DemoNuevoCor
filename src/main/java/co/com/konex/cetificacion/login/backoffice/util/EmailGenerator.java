package co.com.konex.cetificacion.login.backoffice.util;

import java.security.SecureRandom;

public class EmailGenerator {
    EmailGenerator() {
    }

    private static final String[] DOMAINS = {"gmail.com", "yahoo.com", "outlook.com", "example.com"};

    public static String generateRandomEmail() {
        SecureRandom random = new SecureRandom();
        String user = generateRandomUser(random);
        String domain = DOMAINS[random.nextInt(DOMAINS.length)];
        return user + "@" + domain;
    }

    public static String failEmailCaracteres() {
        SecureRandom random = new SecureRandom();
        String domain = DOMAINS[random.nextInt(DOMAINS.length)];
        return LetrasYNumerosAleatorios.generarLetrasYNumerosAleatorios(45,1)+"@" + domain;
    }

    public static String emailFail() {
        SecureRandom random = new SecureRandom();
        return generateRandomUser(random);
    }

    private static String generateRandomUser(SecureRandom random) {
        StringBuilder userBuilder = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            char randomChar = (char) (97 + random.nextInt(26));
            userBuilder.append(randomChar);
        }

        int randomNumber = random.nextInt(101);
        userBuilder.append(randomNumber);

        return userBuilder.toString();
    }
}
