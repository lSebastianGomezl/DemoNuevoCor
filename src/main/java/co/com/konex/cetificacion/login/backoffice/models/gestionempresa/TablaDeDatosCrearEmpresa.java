package co.com.konex.cetificacion.login.backoffice.models.gestionempresa;

public class TablaDeDatosCrearEmpresa {

    private String grupoEmpresarial;
    private String nit;
    private String razonSocialONombre ;
    private String pais ;
    private String departamento ;
    private String ciudad ;
    private String correoElectronico ;
    private String telefono;
    private String direccion  ;
    private String dominio  ;
    private String moneda  ;
    private String tipoDePago  ;
    private String usuario  ;
    private String rol  ;


       public TablaDeDatosCrearEmpresa(String grupoEmpresarial, String nit, String razonSocialONombre, String pais, String departamento, String ciudad, String direccion, String correoElectronico, String telefono, String dominio, String moneda, String tipoDePago, String usuario, String rol) {
        this.grupoEmpresarial = grupoEmpresarial;
        this.nit = nit;
        this.razonSocialONombre=razonSocialONombre;
        this.pais=pais;
        this.departamento=departamento;
        this.ciudad=ciudad;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.dominio=dominio;
        this.moneda=moneda;
        this.tipoDePago=tipoDePago;
        this.usuario = usuario;
        this.rol = rol;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }


}
