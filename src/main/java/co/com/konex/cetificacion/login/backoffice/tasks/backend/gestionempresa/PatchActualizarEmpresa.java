package co.com.konex.cetificacion.login.backoffice.tasks.backend.gestionempresa;

import co.com.konex.cetificacion.login.backoffice.models.backend.GestionEmpresaData;
import co.com.konex.cetificacion.login.backoffice.util.backend.ReadFile;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Patch;

import static co.com.konex.cetificacion.login.backoffice.util.backend.Constantes.*;
import static co.com.konex.cetificacion.login.backoffice.util.backend.JsonRoutesGestionEmpresa.GESTION_EMPRESA_PATCH;

public class PatchActualizarEmpresa implements Task {
    private String id;
    private GestionEmpresaData gestionEmpresaData;

    public PatchActualizarEmpresa(String id, GestionEmpresaData gestionEmpresaData) {
        this.id = id;
        this.gestionEmpresaData = gestionEmpresaData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String bodyCreate = String.format(ReadFile.returnFile(GESTION_EMPRESA_PATCH),
                gestionEmpresaData.getDireccion(),
                gestionEmpresaData.getCorreo(),
                gestionEmpresaData.getTelefono(),
                gestionEmpresaData.getAplicaComercializador(),
                gestionEmpresaData.getAplicaDistribuidor());
        actor.attemptsTo(
                Patch.to(PATH_MULTIEMPRESA+SEPARADOR_BARRA+id).with(requestSpecification -> requestSpecification
                        .header(HEADER_NAME_CONTENT_TYPE,HEADER_VALUE_CONTENT_TYPE)
                        .body(bodyCreate))
        );
    }
    public static PatchActualizarEmpresa conDatos(String id, GestionEmpresaData gestionEmpresaData){
        return Tasks.instrumented(PatchActualizarEmpresa.class, id, gestionEmpresaData);
    }
}
