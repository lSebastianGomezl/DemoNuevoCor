package co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.crearempresa;

import co.com.konex.cetificacion.login.backoffice.models.gestionempresa.TablaDeDatosCrearEmpresa;
import co.com.konex.cetificacion.login.backoffice.util.ConstruirXpathGestionEmpresas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarUsuario implements Task {

    private TablaDeDatosCrearEmpresa tablaDeDatosCrearEmpresa;

    public SeleccionarUsuario(TablaDeDatosCrearEmpresa tablaDeDatosCrearEmpresa){
        this.tablaDeDatosCrearEmpresa = tablaDeDatosCrearEmpresa;
    }

    public static SeleccionarUsuario seleccionUsuarioDeLista(TablaDeDatosCrearEmpresa tablaDeDatosCrearEmpresa) {

        return Tasks.instrumented(SeleccionarUsuario.class, tablaDeDatosCrearEmpresa);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ConstruirXpathGestionEmpresas.USUARIO(tablaDeDatosCrearEmpresa.getUsuario()))
        );
    }
}
