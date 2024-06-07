package co.com.konex.cetificacion.login.backoffice.tasks.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.DoubleClick;

public class DobleClickBotonVerFiltros implements Task {
    public static DobleClickBotonVerFiltros expandirFiltros() {
        return Tasks.instrumented(DobleClickBotonVerFiltros.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(DoubleClick.on(ContenedorDeObjetosGestionarComercializador.BTN_VER_FILTROS));
    }
}
