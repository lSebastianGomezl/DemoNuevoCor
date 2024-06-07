package co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.crearempresa;

import co.com.konex.cetificacion.login.backoffice.models.gestiondistribuidor.TblGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarTelefonoCampoFormulario implements Task {
    private TblGestionDistribuidor tblGestionDistribuidor;
    public IngresarTelefonoCampoFormulario(TblGestionDistribuidor tblGestionDistribuidor){
        this.tblGestionDistribuidor = tblGestionDistribuidor;
    }
    public static IngresarTelefonoCampoFormulario telefonoFormulario(TblGestionDistribuidor tblGestionDistribuidor) {
        return Tasks.instrumented(IngresarTelefonoCampoFormulario.class, tblGestionDistribuidor);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(tblGestionDistribuidor.getTelefono()).into(ContenedorDeObjetosGestionDistribuidor.INPUT_TELEFONO_FORMULARIO));
    }

}
