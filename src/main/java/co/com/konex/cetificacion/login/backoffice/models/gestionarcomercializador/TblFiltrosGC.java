package co.com.konex.cetificacion.login.backoffice.models.gestionarcomercializador;

public class TblFiltrosGC {

    private String tdAsociadoA;
    private String tdNIT;
    private String tdCodigo;
    private String tdPais;
    private String tdDepartamento;
    private String tdCiudad;
    private String tdDireccion;
    private String tdDominio;
    private String tdEstado;
    private String tdAcciones;


    public TblFiltrosGC(String tdAsociadoA, String tdNIT, String tdCodigo, String tdPais, String tdDepartamento, String tdCiudad, String tdDireccion, String tdDominio, String tdEstado, String tdAcciones) {
        this.tdAsociadoA = tdAsociadoA;
        this.tdNIT = tdNIT;
        this.tdCodigo = tdCodigo;
        this.tdPais = tdPais;
        this.tdDepartamento = tdDepartamento;
        this.tdCiudad = tdCiudad;
        this.tdDireccion = tdDireccion;
        this.tdDominio = tdDominio;
        this.tdEstado = tdEstado;
        this.tdAcciones = tdAcciones;
    }
    public String getTdAsociadoA() {
        return tdAsociadoA;
    }

    public void setTdAsociadoA(String tdAsociadoA) {
        this.tdAsociadoA = tdAsociadoA;
    }

    public String getTdNIT() {
        return tdNIT;
    }

    public void setTdNIT(String tdNIT) {
        this.tdNIT = tdNIT;
    }

    public String getTdCodigo() {
        return tdCodigo;
    }

    public void setTdCodigo(String tdCodigo) {
        this.tdCodigo = tdCodigo;
    }

    public String getTdPais() {
        return tdPais;
    }

    public void setTdPais(String tdPais) {
        this.tdPais = tdPais;
    }

    public String getTdDepartamento() {
        return tdDepartamento;
    }

    public void setTdDepartamento(String tdDepartamento) {
        this.tdDepartamento = tdDepartamento;
    }

    public String getTdCiudad() {
        return tdCiudad;
    }

    public void setTdCiudad(String tdCiudad) {
        this.tdCiudad = tdCiudad;
    }

    public String getTdDireccion() {
        return tdDireccion;
    }

    public void setTdDireccion(String tdDireccion) {
        this.tdDireccion = tdDireccion;
    }

    public String getTdDominio() {
        return tdDominio;
    }

    public void setTdDominio(String tdDominio) {
        this.tdDominio = tdDominio;
    }

    public String getTdEstado() {
        return tdEstado;
    }

    public void setTdEstado(String tdEstado) {
        this.tdEstado = tdEstado;
    }

    public String getTdAcciones() {
        return tdAcciones;
    }

    public void setTdAcciones(String tdAcciones) {
        this.tdAcciones = tdAcciones;
    }

}
