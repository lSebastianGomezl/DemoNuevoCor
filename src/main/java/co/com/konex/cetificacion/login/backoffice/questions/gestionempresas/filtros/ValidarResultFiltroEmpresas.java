package co.com.konex.cetificacion.login.backoffice.questions.gestionempresas.filtros;

import co.com.konex.cetificacion.login.backoffice.models.gestionempresa.TablaDeDatosFiltros;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa.*;

public class ValidarResultFiltroEmpresas implements Question<Boolean> {
    private TablaDeDatosFiltros tablaDeDatosFiltros;

    public ValidarResultFiltroEmpresas(TablaDeDatosFiltros tablaDeDatosFiltros){
        this.tablaDeDatosFiltros = tablaDeDatosFiltros;
    }
    public static ValidarResultFiltroEmpresas verResultDeRegistro(TablaDeDatosFiltros tablaDeDatosFiltros){
        return new ValidarResultFiltroEmpresas(tablaDeDatosFiltros);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean isElementNit = tablaDeDatosFiltros.getNit().equals(RESULT_FILTRO_NIT.resolveFor(actor).getText());
        boolean isElementNombreOCodigo = tablaDeDatosFiltros.getNombreOCodigo().equals(RESULT_FILTRO_NOMBRE.resolveFor(actor).getText());
        boolean isElementPais = tablaDeDatosFiltros.getPais().equals(RESULT_FILTRO_PAIS.resolveFor(actor).getText());


        return isElementNit && isElementNombreOCodigo && isElementPais;
    }
}
