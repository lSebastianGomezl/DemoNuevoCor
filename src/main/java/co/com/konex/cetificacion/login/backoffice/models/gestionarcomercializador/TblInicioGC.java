package co.com.konex.cetificacion.login.backoffice.models.gestionarcomercializador;

public class TblInicioGC {

    private String inputNit;
    private String inputNombreComercializador;
    private String btnCrearComercializador;
    private String btnLimpiar;
    private String btnFiltrar;
    private String msjFiltrar;


    public TblInicioGC(String inputNit, String inputNombreComercializador, String btnCrearComercializador, String btnLimpiar, String btnFiltrar, String msjFiltrar) {
        this.inputNit = inputNit;
        this.inputNombreComercializador = inputNombreComercializador;
        this.btnCrearComercializador = btnCrearComercializador;
        this.btnLimpiar = btnLimpiar;
        this.btnFiltrar = btnFiltrar;
        this.msjFiltrar = msjFiltrar;
    }

    public String getInputNit() {
        return inputNit;
    }

    public void setInputNit(String inputNit) {
        this.inputNit = inputNit;
    }

    public String getInputNombreComercializador() {
        return inputNombreComercializador;
    }

    public void setInputNombreComercializador(String inputNombreComercializador) {
        this.inputNombreComercializador = inputNombreComercializador;
    }

    public String getBtnCrearComercializador() {
        return btnCrearComercializador;
    }

    public void setBtnCrearComercializador(String btnCrearComercializador) {
        this.btnCrearComercializador = btnCrearComercializador;
    }

    public String getBtnLimpiar() {
        return btnLimpiar;
    }

    public void setBtnLimpiar(String btnLimpiar) {
        this.btnLimpiar = btnLimpiar;
    }

    public String getBtnFiltrar() {
        return btnFiltrar;
    }

    public void setBtnFiltrar(String btnFiltrar) {
        this.btnFiltrar = btnFiltrar;
    }

    public String getMsjFiltrar() {
        return msjFiltrar;
    }

    public void setMsjFiltrar(String msjFiltrar) {
        this.msjFiltrar = msjFiltrar;
    }
}
