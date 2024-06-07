package co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.models.gestionarcomercializador.TblCrearComerci;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador.*;


public class ValidarElementosFormularioCrearComercializador implements Question<Boolean> {

    private TblCrearComerci tblCrearComerci;

    public ValidarElementosFormularioCrearComercializador(TblCrearComerci tblCrearComerci) {
        this.tblCrearComerci = tblCrearComerci;
    }

    public static ValidarElementosFormularioCrearComercializador formularioCrearComercializador(TblCrearComerci tblCrearComerci) {
        return new ValidarElementosFormularioCrearComercializador(tblCrearComerci);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean esElementoListaAsociaraEmpresa = tblCrearComerci.getAsociaraempresa().equals(COMBOBOX_ASOCIAR_EMPRESA.resolveFor(actor).getText());
        boolean esElementoInputNIT = tblCrearComerci.getNIT().equals(INPUT_NIT.resolveFor(actor).getText());
        boolean esElementoInputRazonSocial = tblCrearComerci.getRazonsocialoempresa().equals(INPUT_RAZON_SOCIAL.resolveFor(actor).getText());
        boolean esElementoListaPais = tblCrearComerci.getPais().equals(COMBOBOX_PAIS.resolveFor(actor).getText());
        boolean esElementoListaDepartamento = tblCrearComerci.getDepartamento().equals(COMBOBOX_DEPARTAMENTO.resolveFor(actor).getText());
        boolean esElementoListaCiudad = tblCrearComerci.getCiudad().equals(COMBOBOX_CIUDAD.resolveFor(actor).getText());
        boolean esElementoInputDireccion = tblCrearComerci.getDireccion().equals(INPUT_DIRECCION.resolveFor(actor).getText());
        boolean esElementoInputCorreo = tblCrearComerci.getCorreoelectronico().equals(INPUT_CORREO_ELECTRONICO.resolveFor(actor).getText());
        boolean esElementoInputTelefono = tblCrearComerci.getTelefono().equals(INPUT_TELEFONO.resolveFor(actor).getText());
        boolean esElementoInputDominio = tblCrearComerci.getDominio().equals(INPUT_DOMINIO.resolveFor(actor).getText());
        boolean esElementoSwitchEstado = tblCrearComerci.getEstado().equals(SWITCH_ESTADO.resolveFor(actor).getText());
        boolean esElementoBtnSalir = tblCrearComerci.getBtnsalir().equals(BTN_SALIR_CREAR_COMERCIALIZADORA.resolveFor(actor).getText());
        boolean esElementoBtnCrearComercializadora = tblCrearComerci.getBtncrearcomercializador().equals(BTN_CREAR_COMERCIALIZADORA.resolveFor(actor).getText());

        return esElementoListaAsociaraEmpresa && esElementoInputNIT && esElementoInputRazonSocial && esElementoListaPais && esElementoListaDepartamento && esElementoListaCiudad && esElementoInputDireccion && esElementoInputCorreo && esElementoInputTelefono && esElementoInputDominio && esElementoBtnSalir && esElementoBtnCrearComercializadora;
    }
}
