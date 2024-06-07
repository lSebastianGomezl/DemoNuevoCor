package co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.crearempresa;

import co.com.konex.cetificacion.login.backoffice.models.gestiondistribuidor.TblGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.util.ConstruirXpathGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IngresarPaisDptoCiudadCampoFormulario implements Task {
    private ConstruirXpathGestionDistribuidor construirXpathGestionDistribuidor;
    private TblGestionDistribuidor tblGestionDistribuidor;

    public IngresarPaisDptoCiudadCampoFormulario(TblGestionDistribuidor tblGestionDistribuidor){
        this.tblGestionDistribuidor = tblGestionDistribuidor;
    }
    public static IngresarPaisDptoCiudadCampoFormulario paisDptoCiudadFormulario(TblGestionDistribuidor tblGestionDistribuidor) {
        return Tasks.instrumented(IngresarPaisDptoCiudadCampoFormulario.class, tblGestionDistribuidor);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ContenedorDeObjetosGestionDistribuidor.LISTA_DESPLEGABLE_PAISES),
                Click.on(construirXpathGestionDistribuidor.PAIS(tblGestionDistribuidor.getPais())),
                Click.on(ContenedorDeObjetosGestionDistribuidor.LISTA_DESPLEGABLE_DEPARATAMENTOS),
                Click.on(construirXpathGestionDistribuidor.DEPARTAMENTO(tblGestionDistribuidor.getDepartamento())),
                Click.on(ContenedorDeObjetosGestionDistribuidor.LISTA_DESPLEGABLE_CIUDAD),
                Click.on(construirXpathGestionDistribuidor.MUNICIPIO(tblGestionDistribuidor.getMunicipio())));

    }
}
