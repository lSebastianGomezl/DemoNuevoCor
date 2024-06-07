package co.com.konex.cetificacion.login.backoffice.models.gestionempresa;

public class AsignarUsuarioModel {

    private String fecha;
    private String tipoDocumento;
    private String numeroDocumento;

    public AsignarUsuarioModel(String fecha, String tipoDocumento, String numeroDocumento) {
        this.fecha = fecha;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
}
