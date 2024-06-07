package co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.models.gestionarcomercializador.TblFiltrosGC;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador.*;

public class ValidarElementosTablaFiltros implements Question<Boolean> {

    private TblFiltrosGC tblFiltrosGC;

    public ValidarElementosTablaFiltros(TblFiltrosGC tblFiltrosGC) {
        this.tblFiltrosGC = tblFiltrosGC;
    }
    public static ValidarElementosTablaFiltros tablaFiltro(TblFiltrosGC tablaFiltrosGestonComercializador) {
        return new ValidarElementosTablaFiltros(tablaFiltrosGestonComercializador);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean esElementoTdAsociadoA = tblFiltrosGC.getTdAsociadoA().equals(TD_ASOCIARA.resolveFor(actor).getText());
        boolean esElementoTdNIT = tblFiltrosGC.getTdNIT().equals(TD_NIT.resolveFor(actor).getText());
        boolean esElementoTdRazonSocial = tblFiltrosGC.getTdCodigo().equals(TD_CODIGO.resolveFor(actor).getText());
        boolean esElementoTdPais = tblFiltrosGC.getTdPais().equals(TD_PAIS.resolveFor(actor).getText());
        boolean esElementoTdDireccion = tblFiltrosGC.getTdDireccion().equals(TD_DIRECCION.resolveFor(actor).getText());
        boolean esElementoTdDominio = tblFiltrosGC.getTdDominio().equals(TD_DOMINIO.resolveFor(actor).getText());
        boolean esElementoTdEstado = tblFiltrosGC.getTdEstado().equals(TD_ESTADO.resolveFor(actor).getText());
        boolean esElementoTdAcciones = tblFiltrosGC.getTdAcciones().equals(TD_ACCIONES.resolveFor(actor).getText());

        return esElementoTdAsociadoA && esElementoTdNIT && esElementoTdRazonSocial && esElementoTdPais  && esElementoTdDireccion && esElementoTdDominio
                && esElementoTdEstado && esElementoTdAcciones;
    }
}
