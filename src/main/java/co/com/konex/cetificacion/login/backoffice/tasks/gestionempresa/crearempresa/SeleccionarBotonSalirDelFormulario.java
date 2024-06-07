package co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.crearempresa;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarBotonSalirDelFormulario implements Task {
    public static SeleccionarBotonSalirDelFormulario salirDePantallaCrearEmpresa() {
        return Tasks.instrumented(SeleccionarBotonSalirDelFormulario.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ContenedorDeObjetosGestionEmpresa.BOTON_SALIR_FORMU_CREAR_EMPRESA));
    }
}
