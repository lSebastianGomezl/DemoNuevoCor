package co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.creardistribuidor;

import co.com.konex.cetificacion.login.backoffice.models.gestiondistribuidor.TblGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.util.GeneradorNumerosTelefono;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarTelefonoCampoFormulario implements Task {
    private TblGestionDistribuidor tblGestionDistribuidor;

    public IngresarTelefonoCampoFormulario(TblGestionDistribuidor tblGestionDistribuidor) {
        this.tblGestionDistribuidor = tblGestionDistribuidor;
    }

    public static IngresarTelefonoCampoFormulario telefonoFormulario(TblGestionDistribuidor tblGestionDistribuidor) {
        return Tasks.instrumented(IngresarTelefonoCampoFormulario.class, tblGestionDistribuidor);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (tblGestionDistribuidor.getTelefono() != null) {
            if (tblGestionDistribuidor.getTelefono().equals("aleatorio")) {
                actor.attemptsTo(
                        Enter.theValue(GeneradorNumerosTelefono.telefonoColombia()).into(ContenedorDeObjetosGestionDistribuidor.INPUT_TELEFONO_FORMULARIO));
            } else {
                actor.attemptsTo(
                        Enter.theValue(tblGestionDistribuidor.getTelefono()).into(ContenedorDeObjetosGestionDistribuidor.INPUT_TELEFONO_FORMULARIO));

            }
        }

    }

}
