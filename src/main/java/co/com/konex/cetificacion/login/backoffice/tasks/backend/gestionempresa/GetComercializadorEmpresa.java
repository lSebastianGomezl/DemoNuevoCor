package co.com.konex.cetificacion.login.backoffice.tasks.backend.gestionempresa;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static co.com.konex.cetificacion.login.backoffice.util.backend.Constantes.*;

public class GetComercializadorEmpresa implements Task {
    private String id;

    public GetComercializadorEmpresa(String id) {
        this.id = id;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(PATH_MULTIEMPRESA+SEPARADOR_BARRA+id+SEPARADOR_BARRA+COMERCIALIZADORES)
        );
    }
    public static GetComercializadorEmpresa conId(String id){
        return Tasks.instrumented(GetComercializadorEmpresa.class,id);
    }
}
