package co.com.konex.cetificacion.login.backoffice.tasks.login;


import co.com.konex.cetificacion.login.backoffice.models.login.TablaUsuarios;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.login.ContenedorDeObjetosLogin;
import co.com.konex.cetificacion.login.backoffice.util.MetodosFuncionales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Seleccionarem implements Task {
    private MetodosFuncionales metodosFuncionales;
    private TablaUsuarios tablaUsuarios;

    public Seleccionarem(TablaUsuarios tablaUsuarios){
        this.tablaUsuarios = tablaUsuarios;
    }

    public static Seleccionarem empresa(TablaUsuarios tablaUsuarios) {
        return Tasks.instrumented(Seleccionarem.class, tablaUsuarios);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Click.on(metodosFuncionales.OPCION(tablaUsuarios.getEmpresa())),
                Click.on(ContenedorDeObjetosLogin.BTN_ACEPT));
    }
}
