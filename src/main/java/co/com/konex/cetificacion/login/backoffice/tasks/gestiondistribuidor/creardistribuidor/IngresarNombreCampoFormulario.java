package co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.creardistribuidor;

import co.com.konex.cetificacion.login.backoffice.models.gestiondistribuidor.TblGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.util.GeneradorNombres;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarNombreCampoFormulario implements Task {
    private TblGestionDistribuidor tblGestionDistribuidor;

    public IngresarNombreCampoFormulario(TblGestionDistribuidor tblGestionDistribuidor) {
        this.tblGestionDistribuidor = tblGestionDistribuidor;
    }

    public static IngresarNombreCampoFormulario nombreFormulario(TblGestionDistribuidor tblGestionDistribuidor) {
        return Tasks.instrumented(IngresarNombreCampoFormulario.class, tblGestionDistribuidor);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(tblGestionDistribuidor.getRazonSocialONombre()!=null){
            if (tblGestionDistribuidor.getRazonSocialONombre().equals("aleatorio")) {
                actor.attemptsTo(
                        Click.on(ContenedorDeObjetosGestionDistribuidor.INPUT_NOMBRE_FORMULARIO),
                        Enter.theValue(GeneradorNombres.razonSocial()).into(ContenedorDeObjetosGestionDistribuidor.INPUT_NOMBRE_FORMULARIO));
            } else {
                actor.attemptsTo(
                        Click.on(ContenedorDeObjetosGestionDistribuidor.INPUT_NOMBRE_FORMULARIO),
                        Enter.theValue(tblGestionDistribuidor.getRazonSocialONombre()).into(ContenedorDeObjetosGestionDistribuidor.INPUT_NOMBRE_FORMULARIO));

            }
        }
    }


}
