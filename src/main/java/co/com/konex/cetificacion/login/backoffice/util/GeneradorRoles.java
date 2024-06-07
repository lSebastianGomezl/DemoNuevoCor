package co.com.konex.cetificacion.login.backoffice.util;

import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GeneradorRoles {
    private SecureRandom rnd = new SecureRandom();
    public String generarRol(){
        String[] roles = {"Administrador", "Cajero", "Programador", "Analista Financiero", "Administrador escrutinio", "Administrador Loterías","Asesor"};
        return roles[rnd.nextInt(roles.length)]+LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd_MM_yyyy_hh_mm_ss"));
    }
}
