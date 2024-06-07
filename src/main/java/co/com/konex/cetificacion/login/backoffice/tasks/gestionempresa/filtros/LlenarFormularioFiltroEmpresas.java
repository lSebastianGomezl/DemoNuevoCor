package co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.filtros;

import co.com.konex.cetificacion.login.backoffice.models.gestionempresa.TablaDeDatosFiltros;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LlenarFormularioFiltroEmpresas implements Task {

    private TablaDeDatosFiltros data;

    public LlenarFormularioFiltroEmpresas(TablaDeDatosFiltros data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (data.getNit() != null) {
            actor.attemptsTo(
                    Click.on(ContenedorDeObjetosGestionEmpresa.INPUT_NIT_FILTRO),
                    Enter.theValue(data.getNit()).into(ContenedorDeObjetosGestionEmpresa.INPUT_NIT_FILTRO));
        }
        if (data.getNombreOCodigo() != null) {
            actor.attemptsTo(
                    Click.on(ContenedorDeObjetosGestionEmpresa.INPUT_NOMBRE_FILTRO),
                    Enter.theValue(data.getNombreOCodigo()).into(ContenedorDeObjetosGestionEmpresa.INPUT_NOMBRE_FILTRO));
        }
        if (data.getPais() != null) {
            actor.attemptsTo(Click.on(ContenedorDeObjetosGestionEmpresa.SELECT_PAIS_FILTRO));
            actor.attemptsTo(Click.on(ContenedorDeObjetosGestionarComercializador.SELECT_BUSQUEDA.of(data.getPais())));
        }
        if (data.getComercializador() != null) {
            actor.attemptsTo(Click.on(ContenedorDeObjetosGestionEmpresa.LISTA_DESPLEGABLE_COMERCIALIZADORES));
            actor.attemptsTo(Click.on(ContenedorDeObjetosGestionarComercializador.SELECT_BUSQUEDA.of(data.getComercializador())));
        }
        if (data.getDistribuidor() != null) {
            actor.attemptsTo(Click.on(ContenedorDeObjetosGestionEmpresa.LISTA_DESPLEGABLE_DISTRIBUIDOR));
            actor.attemptsTo(Click.on(ContenedorDeObjetosGestionarComercializador.SELECT_BUSQUEDA.of(data.getDistribuidor())));
        }
    }

    public static LlenarFormularioFiltroEmpresas conLosDatos(TablaDeDatosFiltros data) {
        return new LlenarFormularioFiltroEmpresas(data);
    }
}
