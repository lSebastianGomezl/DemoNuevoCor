package co.com.konex.cetificacion.login.backoffice.models.gestiondistribuidor;

public class TablaDeDatosFiltro {
    String nombre;
    String NIT;

    public TablaDeDatosFiltro(String nombre, String NIT) {
        this.nombre = nombre;
        this.NIT = NIT;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }
}
