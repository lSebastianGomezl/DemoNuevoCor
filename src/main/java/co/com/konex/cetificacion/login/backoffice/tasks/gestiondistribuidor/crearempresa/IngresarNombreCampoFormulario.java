package co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.crearempresa;

import co.com.konex.cetificacion.login.backoffice.models.gestiondistribuidor.TblGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarNombreCampoFormulario implements Task {
    private TblGestionDistribuidor tblGestionDistribuidor;
    public IngresarNombreCampoFormulario(TblGestionDistribuidor tblGestionDistribuidor){
        this.tblGestionDistribuidor = tblGestionDistribuidor;
    }
    public static IngresarNombreCampoFormulario nombreFormulario(TblGestionDistribuidor tblGestionDistribuidor) {
        return Tasks.instrumented(IngresarNombreCampoFormulario.class, tblGestionDistribuidor);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(tblGestionDistribuidor.getRazonSocialONombre()).into(ContenedorDeObjetosGestionDistribuidor.INPUT_NOMBRE_FORMULARIO));
    }


}
