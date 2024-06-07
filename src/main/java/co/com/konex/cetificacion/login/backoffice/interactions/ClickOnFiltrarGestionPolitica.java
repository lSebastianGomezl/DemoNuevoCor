package co.com.konex.cetificacion.login.backoffice.interactions;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickOnFiltrarGestionPolitica implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ContenedorDeObjetosGrupoEmpresarial.BTN_FILTRAR_GESTION_POLITICA));
    }
    public static ClickOnFiltrarGestionPolitica clickOn() {
        return Tasks.instrumented(ClickOnFiltrarGestionPolitica.class);
    }
}
