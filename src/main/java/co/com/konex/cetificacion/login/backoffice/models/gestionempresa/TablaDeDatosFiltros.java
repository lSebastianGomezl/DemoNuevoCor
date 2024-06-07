package co.com.konex.cetificacion.login.backoffice.models.gestionempresa;

public class TablaDeDatosFiltros {

    private String nit;
    private String nombreOCodigo;
    private String pais ;
    private String comercializador  ;
    private String distribuidor ;
    public TablaDeDatosFiltros(String nit, String nombreOCodigo, String pais, String comercializador, String distribuidor){
        this.nit = nit;
        this.nombreOCodigo = nombreOCodigo;
        this.pais= pais;
        this.comercializador = comercializador;
        this.distribuidor = distribuidor;
    }
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombreOCodigo() {
        return nombreOCodigo;
    }

    public void setNombreOCodigo(String nombreOCodigo) {
        this.nombreOCodigo = nombreOCodigo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getComercializador() {
        return comercializador;
    }

    public void setComercializador(String comercializador) {
        this.comercializador = comercializador;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }
}
