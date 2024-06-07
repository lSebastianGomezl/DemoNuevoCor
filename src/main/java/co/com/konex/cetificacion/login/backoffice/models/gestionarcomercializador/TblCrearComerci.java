package co.com.konex.cetificacion.login.backoffice.models.gestionarcomercializador;

public class TblCrearComerci {
    private String asociaraEmpresa;
    private String NIT;
    private String razonsocialoEmpresa;
    private String pais;
    private String departamento;
    private String ciudad;
    private String direccion;
    private String correoElectronico;
    private String telefono;
    private String dominio;
    private String estado;
    private String btnSalir;
    private String btnCrearComercializador;


    public TblCrearComerci(String asociaraEmpresa, String nit, String razonsocialoEmpresa, String pais, String departamento, String ciudad, String direccion, String correoElectronico, String telefono, String dominio, String estado, String btnSalir, String btnCrearComercializador) {
        this.asociaraEmpresa = asociaraEmpresa;
        this.NIT = nit;
        this.razonsocialoEmpresa = razonsocialoEmpresa;
        this.pais = pais;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.dominio = dominio;
        this.estado = estado;
        this.btnSalir = btnSalir;
        this.btnCrearComercializador = btnCrearComercializador;
    }
    public String getAsociaraempresa() {
        return asociaraEmpresa;
    }

    public void setAsociaraempresa(String asociaraempresa) {
        this.asociaraEmpresa = asociaraempresa;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getRazonsocialoempresa() {
        return razonsocialoEmpresa;
    }

    public void setRazonsocialoempresa(String razonsocialoempresa) {
        this.razonsocialoEmpresa = razonsocialoempresa;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoelectronico() {
        return correoElectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoElectronico = correoelectronico;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBtnsalir() {
        return btnSalir;
    }

    public void setBtnsalir(String btnsalir) {
        this.btnSalir = btnsalir;
    }

    public String getBtncrearcomercializador() {
        return btnCrearComercializador;
    }

    public void setBtncrearcomercializador(String btncrearcomercializador) {
        this.btnCrearComercializador = btncrearcomercializador;
    }
}
