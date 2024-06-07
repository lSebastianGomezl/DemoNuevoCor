package co.com.konex.cetificacion.login.backoffice.tasks.login;


import co.com.konex.cetificacion.login.backoffice.userinterfaces.login.PaginaBackoffice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPag implements Task {

    private PaginaBackoffice paginaBackoffice;
    public static AbrirPag laPagina() {
        return Tasks.instrumented(AbrirPag.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(paginaBackoffice)
        );
    }
}
