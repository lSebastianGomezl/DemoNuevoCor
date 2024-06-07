package co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.creardistribuidor;

import co.com.konex.cetificacion.login.backoffice.models.gestiondistribuidor.TblGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionDistribuidor;
import co.com.konex.cetificacion.login.backoffice.util.GeneradorNombres;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarDominioCampoFormulario implements Task {
    private TblGestionDistribuidor tblGestionDistribuidor;

    public IngresarDominioCampoFormulario(TblGestionDistribuidor tblGestionDistribuidor) {
        this.tblGestionDistribuidor = tblGestionDistribuidor;
    }

    public static IngresarDominioCampoFormulario dominioFormulario(TblGestionDistribuidor tblGestionDistribuidor) {
        return Tasks.instrumented(IngresarDominioCampoFormulario.class, tblGestionDistribuidor);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (tblGestionDistribuidor.getDominio() != null) {
            if (tblGestionDistribuidor.getDominio().equals("aleatorio")) {
                actor.attemptsTo(
                        Enter.theValue(GeneradorNombres.dominio()).into(ContenedorDeObjetosGestionDistribuidor.INPUT_DOMINIO_FORMULARIO));

            } else {
                actor.attemptsTo(
                        Enter.theValue(tblGestionDistribuidor.getDominio()).into(ContenedorDeObjetosGestionDistribuidor.INPUT_DOMINIO_FORMULARIO));

            }
        }

    }

}
