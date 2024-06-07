package co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.creardistribuidor;

import co.com.konex.cetificacion.login.backoffice.models.gestiondistribuidor.TblGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.util.RandomDireccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarDireccionCampoFormulario implements Task {

    private TblGestionDistribuidor tblGestionDistribuidor;

    public IngresarDireccionCampoFormulario(TblGestionDistribuidor tblGestionDistribuidor) {
        this.tblGestionDistribuidor = tblGestionDistribuidor;
    }

    public static IngresarDireccionCampoFormulario direccionFormulario(TblGestionDistribuidor tblGestionDistribuidor) {
        return Tasks.instrumented(IngresarDireccionCampoFormulario.class, tblGestionDistribuidor);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (tblGestionDistribuidor.getDireccion() != null) {
            if (tblGestionDistribuidor.getDireccion().equals("aleatorio")) {
                actor.attemptsTo(
                        Click.on(ContenedorDeObjetosGestionDistribuidor.INPUT_DIRECCION_FORMULARIO),
                        Enter.theValue(RandomDireccion.generateRandomAddress()).into(ContenedorDeObjetosGestionDistribuidor.INPUT_DIRECCION_FORMULARIO)
                );
            } else {
                actor.attemptsTo(
                        Click.on(ContenedorDeObjetosGestionDistribuidor.INPUT_DIRECCION_FORMULARIO),
                        Enter.theValue(tblGestionDistribuidor.getDireccion()).into(ContenedorDeObjetosGestionDistribuidor.INPUT_DIRECCION_FORMULARIO)
                );
            }
        }


    }
}
