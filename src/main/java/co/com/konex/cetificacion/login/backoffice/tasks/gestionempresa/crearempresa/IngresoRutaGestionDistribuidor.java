package co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.crearempresa;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IngresoRutaGestionDistribuidor implements Task{


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ContenedorDeObjetosGestionDistribuidor.OP_GESTION_DISTRIBUIDOR));
    }


    public static IngresoRutaGestionDistribuidor gestionEmpresa() {
        return new IngresoRutaGestionDistribuidor();
    }
}
