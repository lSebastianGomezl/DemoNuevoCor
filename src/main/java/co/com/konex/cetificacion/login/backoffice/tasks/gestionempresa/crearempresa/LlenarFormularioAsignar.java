package co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.crearempresa;

import co.com.konex.cetificacion.login.backoffice.models.gestionempresa.AsignarUsuarioModel;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import co.com.konex.cetificacion.login.backoffice.util.ConstruirXpathGestionEmpresas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LlenarFormularioAsignar implements Task {

    private AsignarUsuarioModel data;

    public LlenarFormularioAsignar(AsignarUsuarioModel data) {
        this.data = data;
    }

    public static LlenarFormularioAsignar asignarUsuario(AsignarUsuarioModel data) {
        return Tasks.instrumented(LlenarFormularioAsignar.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.getFecha()).into(ContenedorDeObjetosGestionEmpresa.INPUT_FECHA),
                Click.on(ContenedorDeObjetosGestionEmpresa.LIST_DESPLEGABLE_TIPO_DOCUMENTO),
                Click.on(ConstruirXpathGestionEmpresas.TIPODOCUMENTO(data.getTipoDocumento())),
                Enter.theValue(data.getNumeroDocumento()).into(ContenedorDeObjetosGestionEmpresa.INPUT_DOCUMENTO),
                Click.on(ContenedorDeObjetosGestionEmpresa.BUSCAR_DOCUMENTO)
        );

    }


}
