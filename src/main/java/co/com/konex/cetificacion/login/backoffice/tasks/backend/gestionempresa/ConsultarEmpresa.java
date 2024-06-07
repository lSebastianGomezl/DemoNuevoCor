package co.com.konex.cetificacion.login.backoffice.tasks.backend.gestionempresa;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static co.com.konex.cetificacion.login.backoffice.util.backend.Constantes.PATH_MULTIEMPRESA;
import static co.com.konex.cetificacion.login.backoffice.util.backend.Constantes.SEPARADOR_BARRA;

public class ConsultarEmpresa implements Task {
    private String id;

    public ConsultarEmpresa(String id) {
        this.id = id;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (id.equals("guardado")) {
            String idGuardado = actor.recall("idPost");
            actor.attemptsTo(
                    Get.resource(PATH_MULTIEMPRESA + SEPARADOR_BARRA + idGuardado)
            );
        } else {
            actor.attemptsTo(
                    Get.resource(PATH_MULTIEMPRESA + SEPARADOR_BARRA + id)
            );
        }
    }

    public static ConsultarEmpresa conId(String id) {
        return Tasks.instrumented(ConsultarEmpresa.class, id);
    }
}
