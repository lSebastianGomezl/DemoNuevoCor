package co.com.konex.cetificacion.login.backoffice.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FechaManager {
    private static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private FechaManager() {
    }

    public static String obtenerFecha() {
        LocalDate fechaActual = LocalDate.now();
        return dateFormatter.format(fechaActual);
    }
    public static String obtenerFechaConFormato(DateTimeFormatter timeFormatter) {
        LocalDate fechaActual = LocalDate.now();
        return timeFormatter.format(fechaActual);
    }


    public static String obtenerFechaConDiasExtra(int diasExtra) {
        if (diasExtra < 0) {
            throw new IllegalArgumentException("El número de días extra no puede ser negativo.");
        }

        LocalDate fechaActual = LocalDate.now().plusDays(diasExtra);
        return dateFormatter.format(fechaActual);
    }

    public static String obtenerHoraActual(DateTimeFormatter timeFormatter) {
        LocalDateTime horaActual = LocalDateTime.now();
        return timeFormatter.format(horaActual);
    }

    public static String obtenerHoraActualConMasMinutos(DateTimeFormatter timeFormatter, int minutos) {
        LocalDateTime horaActual = LocalDateTime.now().plusMinutes(minutos);
        return timeFormatter.format(horaActual);
    }

    public static String obtenerHoraActualConMenosMinutos(DateTimeFormatter timeFormatter, int minutos) {
        LocalDateTime horaActual = LocalDateTime.now().minusMinutes(minutos);
        return timeFormatter.format(horaActual);
    }

    public static String restarMinutosAHora(DateTimeFormatter timeFormatter, LocalDateTime localDateTime, int minutos) {
        LocalDateTime horaRestada = localDateTime.minusMinutes(minutos);
        return timeFormatter.format(horaRestada);
    }
}
