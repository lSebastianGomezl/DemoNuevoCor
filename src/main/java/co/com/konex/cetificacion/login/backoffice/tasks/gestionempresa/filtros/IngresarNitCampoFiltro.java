package co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.filtros;

import co.com.konex.cetificacion.login.backoffice.models.gestiondistribuidor.TablaDeDatosFiltro;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarNitCampoFiltro implements Task {
    private TablaDeDatosFiltro tablaDeDatosFiltro;
    public IngresarNitCampoFiltro(TablaDeDatosFiltro tablaDeDatosFiltro){
        this.tablaDeDatosFiltro = tablaDeDatosFiltro;
    }
    public static IngresarNitCampoFiltro nitFiltro(TablaDeDatosFiltro tablaDeDatosFiltro) {
        return Tasks.instrumented(IngresarNitCampoFiltro.class, tablaDeDatosFiltro );
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        if(tablaDeDatosFiltro.getNIT()!=null){
            if(tablaDeDatosFiltro.getNIT().equals("guardado")){
                String nitG = actor.recall("nitGeneradoCrearEmpresa");
                actor.attemptsTo(
                        Click.on(ContenedorDeObjetosGestionDistribuidor.INPUT_NIT_FILTRO),
                        Enter.theValue(nitG).into(ContenedorDeObjetosGestionDistribuidor.INPUT_NIT_FILTRO));
            }else{
                actor.attemptsTo(
                        Click.on(ContenedorDeObjetosGestionDistribuidor.INPUT_NIT_FILTRO),
                        Enter.theValue(tablaDeDatosFiltro.getNIT()).into(ContenedorDeObjetosGestionDistribuidor.INPUT_NIT_FILTRO));
            }
        }

    }
}
