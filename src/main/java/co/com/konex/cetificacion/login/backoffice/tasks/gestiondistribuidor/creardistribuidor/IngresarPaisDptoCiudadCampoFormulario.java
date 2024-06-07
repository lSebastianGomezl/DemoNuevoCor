package co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.creardistribuidor;

import co.com.konex.cetificacion.login.backoffice.models.gestiondistribuidor.TblGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.util.ConstruirXpathGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.konex.cetificacion.login.backoffice.userinterfaces.login.ContenedorDeObjetosLogin.TIPO_DOCUMENTO_OPTION;

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
        if(tblGestionDistribuidor.getPais()!=null){
            actor.attemptsTo(
                    Click.on(ContenedorDeObjetosGestionDistribuidor.LISTA_DESPLEGABLE_PAISES),
                    Click.on(construirXpathGestionDistribuidor.PAIS(tblGestionDistribuidor.getPais()))
            );
        }
        if(tblGestionDistribuidor.getRegion()!=null){
            actor.attemptsTo(
                    Click.on(ContenedorDeObjetosGestionDistribuidor.LISTA_DESPLEGABLE_REGION),
                    Click.on(TIPO_DOCUMENTO_OPTION.of(tblGestionDistribuidor.getRegion()))
            );
        }
        if(tblGestionDistribuidor.getDepartamento()!=null){
            actor.attemptsTo(
                    Click.on(ContenedorDeObjetosGestionDistribuidor.LISTA_DESPLEGABLE_DEPARATAMENTOS),
                    Click.on(construirXpathGestionDistribuidor.DEPARTAMENTO(tblGestionDistribuidor.getDepartamento()))
            );
        }
        if(tblGestionDistribuidor.getMunicipio()!=null){
            actor.attemptsTo(
                    Click.on(ContenedorDeObjetosGestionDistribuidor.LISTA_DESPLEGABLE_CIUDAD),
                    Click.on(TIPO_DOCUMENTO_OPTION.of(tblGestionDistribuidor.getMunicipio()))
            );
        }
    }
}
