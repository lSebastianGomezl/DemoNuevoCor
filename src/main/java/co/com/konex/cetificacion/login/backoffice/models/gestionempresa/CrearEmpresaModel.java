package co.com.konex.cetificacion.login.backoffice.models.gestionempresa;

public class CrearEmpresaModel {

    private String grupoEmpresarial;
    private String nit;
    private String razonSocial;
    private String pais;
    private String departamento;
    private String municipio;
    private String direccion;
    private String correoElectronico;
    private String telefono;
    private String dominio;
    private String moneda;
    private String tipoDePago;

    public CrearEmpresaModel(String grupoEmpresarial, String nit, String razonSocial, String pais, String departamento, String municipio, String direccion, String correoElectronico, String telefono, String dominio, String moneda, String tipoDePago) {
        this.grupoEmpresarial = grupoEmpresarial;
        this.nit = nit;
        this.razonSocial = razonSocial;
        this.pais = pais;
        this.departamento = departamento;
        this.municipio = municipio;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.dominio = dominio;
        this.moneda = moneda;
        this.tipoDePago = tipoDePago;
    }

    public String getGrupoEmpresarial() {
        return grupoEmpresarial;
    }

    public void setGrupoEmpresarial(String grupoEmpresarial) {
        this.grupoEmpresarial = grupoEmpresarial;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
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

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getTipoDePago() {
        return tipoDePago;
    }

    public void setTipoDePago(String tipoDePago) {
        this.tipoDePago = tipoDePago;
    }
}
