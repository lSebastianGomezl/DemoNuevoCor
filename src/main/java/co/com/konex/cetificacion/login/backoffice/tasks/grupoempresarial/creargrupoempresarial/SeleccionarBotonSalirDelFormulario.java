package co.com.konex.cetificacion.login.backoffice.tasks.grupoempresarial.creargrupoempresarial;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarBotonSalirDelFormulario implements Task {
    public static SeleccionarBotonSalirDelFormulario SalirDePantallaCrearGrupoEmpresarial() {
        return Tasks.instrumented(SeleccionarBotonSalirDelFormulario.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ContenedorDeObjetosGrupoEmpresarial.BOTON_SALIR_PANT_CREAR_GRU_EMPRE));
    }


}
