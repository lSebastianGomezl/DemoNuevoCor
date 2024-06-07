package co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.filtros;

import co.com.konex.cetificacion.login.backoffice.models.gestiondistribuidor.TablaDeDatosFiltro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor.*;

public class ValidarResultFiltroPorNomYNit implements Question {
    private TablaDeDatosFiltro tablaDeDatosFiltro;

    public ValidarResultFiltroPorNomYNit(TablaDeDatosFiltro tablaDeDatosFiltro){
        this.tablaDeDatosFiltro = tablaDeDatosFiltro;
    }
    public static ValidarResultFiltroPorNomYNit verResultDeRegistro(TablaDeDatosFiltro tablaDeDatosFiltro){
        return new ValidarResultFiltroPorNomYNit(tablaDeDatosFiltro);
    }

    @Override
    public Object answeredBy(Actor actor) {
        boolean isElementNit = tablaDeDatosFiltro.getNIT().equals(RESULT_FILTRO_NIT.resolveFor(actor).getText());

        boolean isElementNombre = tablaDeDatosFiltro.getNombre().equals(RESULT_FILTRO_NOMBRE.resolveFor(actor).getText());

        return isElementNit && isElementNombre;

    }
}
