package co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.models.gestionarcomercializador.TblInicioGC;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador.*;

public class ValidarDatosInicioGestionarComercializador implements Question <Boolean>{

    private TblInicioGC tablaInicioGestionarComercializador;


    public ValidarDatosInicioGestionarComercializador(TblInicioGC tablaInicioGestionarComercializador) {
        this.tablaInicioGestionarComercializador = tablaInicioGestionarComercializador;
    }

    public static ValidarDatosInicioGestionarComercializador verGestionComercializador(TblInicioGC tablaInicioGestionarComercializador) {
        return new ValidarDatosInicioGestionarComercializador(tablaInicioGestionarComercializador);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean esElementoFiltrar = tablaInicioGestionarComercializador.getBtnFiltrar().equals(TEXTO_BTN_FILTRAR.resolveFor(actor).getText());
        boolean esElementoCrearComercializador = tablaInicioGestionarComercializador.getBtnCrearComercializador().equals(TEXTO_BTN_CREAR_COMERCIALIZADOR.resolveFor(actor).getText());
        boolean esElementoLimpiar = tablaInicioGestionarComercializador.getBtnLimpiar().equals(TEXTO_BTN_LIMPIAR.resolveFor(actor).getText());

        return   esElementoFiltrar && esElementoCrearComercializador && esElementoLimpiar;
    }
}
