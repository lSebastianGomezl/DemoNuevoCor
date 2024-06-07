package co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.creardistribuidor;

import co.com.konex.cetificacion.login.backoffice.models.gestiondistribuidor.TblGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.util.EmailGenerator;
import co.com.konex.cetificacion.login.backoffice.util.GeneradorNombres;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarCorreoElectronicoCampoFormulario implements Task {
    private TblGestionDistribuidor tblGestionDistribuidor;

    public IngresarCorreoElectronicoCampoFormulario(TblGestionDistribuidor tblGestionDistribuidor) {
        this.tblGestionDistribuidor = tblGestionDistribuidor;
    }

    public static IngresarCorreoElectronicoCampoFormulario correoFormulario(TblGestionDistribuidor tblGestionDistribuidor) {
        return Tasks.instrumented(IngresarCorreoElectronicoCampoFormulario.class, tblGestionDistribuidor);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(tblGestionDistribuidor.getCorreoElectronico()!=null){
            if (tblGestionDistribuidor.getCorreoElectronico().equals("aleatorio")) {
                actor.attemptsTo(
                        Click.on(ContenedorDeObjetosGestionDistribuidor.INPUT_CORREO_FORMULARIO),
                        Enter.theValue(EmailGenerator.generateRandomEmail()).into(ContenedorDeObjetosGestionDistribuidor.INPUT_CORREO_FORMULARIO));
            } else {
                actor.attemptsTo(
                        Click.on(ContenedorDeObjetosGestionDistribuidor.INPUT_CORREO_FORMULARIO),
                        Enter.theValue(tblGestionDistribuidor.getCorreoElectronico()).into(ContenedorDeObjetosGestionDistribuidor.INPUT_CORREO_FORMULARIO));

            }
        }
    }
}
