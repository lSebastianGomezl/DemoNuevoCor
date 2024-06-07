package co.com.konex.cetificacion.login.backoffice.models.gestiondistribuidor;

public class TblGestionDistribuidor {
    private String asociarAEmpresa;
    private String asociarAComercializador;
    private String NIT;
    private String razonSocialONombre;
    private String pais;
    private String region;
    private String departamento;
    private String municipio;
    private String direccion;
    private String correoElectronico;
    private String telefono;
    private String dominio;

    public TblGestionDistribuidor(String asociarAEmpresa, String asociarAComercializador, String NIT, String razonSocialONombre, String pais, String region, String departamento, String municipio, String direccion, String correoElectronico, String telefono, String dominio) {
        this.asociarAEmpresa = asociarAEmpresa;
        this.asociarAComercializador = asociarAComercializador;
        this.NIT = NIT;
        this.razonSocialONombre = razonSocialONombre;
        this.pais = pais;
        this.region = region;
        this.departamento = departamento;
        this.municipio = municipio;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.dominio = dominio;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAsociarAEmpresa() {
        return asociarAEmpresa;
    }

    public void setAsociarAEmpresa(String asociarAEmpresa) {
        this.asociarAEmpresa = asociarAEmpresa;
    }

    public String getAsociarAComercializador() {
        return asociarAComercializador;
    }

    public void setAsociarAComercializador(String asociarAComercializador) {
        this.asociarAComercializador = asociarAComercializador;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getRazonSocialONombre() {
        return razonSocialONombre;
    }

    public void setRazonSocialONombre(String razonSocialONombre) {
        this.razonSocialONombre = razonSocialONombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

}
