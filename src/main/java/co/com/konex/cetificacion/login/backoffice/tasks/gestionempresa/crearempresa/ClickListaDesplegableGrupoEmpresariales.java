package co.com.konex.cetificacion.login.backoffice.tasks.gestionempresa.crearempresa;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionEmpresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickListaDesplegableGrupoEmpresariales implements Task {
    public static ClickListaDesplegableGrupoEmpresariales listaDesplegableGrupoEmpre() {

        return Tasks.instrumented(ClickListaDesplegableGrupoEmpresariales.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ContenedorDeObjetosGestionEmpresa.LIST_DESPLEGABLE_GRUP_EMPRE)
        );
    }
}
