package co.com.konex.cetificacion.login.backoffice.tasks.backend.gestionempresa;

import co.com.konex.cetificacion.login.backoffice.models.backend.GestionEmpresaData;
import co.com.konex.cetificacion.login.backoffice.util.backend.ReadFile;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Put;

import static co.com.konex.cetificacion.login.backoffice.util.backend.Constantes.*;
import static co.com.konex.cetificacion.login.backoffice.util.backend.JsonRoutesGestionEmpresa.GESTION_EMPRESA_BODY;

public class PutActualizarEmpresa implements Task {
    private String id;
    private GestionEmpresaData gestionEmpresaData;

    public PutActualizarEmpresa(String id, GestionEmpresaData gestionEmpresaData) {
        this.id = id;
        this.gestionEmpresaData = gestionEmpresaData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String bodyCreate = String.format(ReadFile.returnFile(GESTION_EMPRESA_BODY),
                gestionEmpresaData.getId(),
                gestionEmpresaData.getIdGrupoEmpresarial(),
                gestionEmpresaData.getNit(),
                gestionEmpresaData.getRazonSocial(),
                gestionEmpresaData.getIdPais(),
                gestionEmpresaData.getIdMunicipio(),
                gestionEmpresaData.getDireccion(),
                gestionEmpresaData.getCorreo(),
                gestionEmpresaData.getTelefono(),
                gestionEmpresaData.getDominio(),
                gestionEmpresaData.getEstado(),
                gestionEmpresaData.getMoneda(),
                gestionEmpresaData.getTipoPago(),
                gestionEmpresaData.getAplicaComercializador(),
                gestionEmpresaData.getAplicaDistribuidor(),
                gestionEmpresaData.getResponsableIva(),
                gestionEmpresaData.getObligadoFacturar(),
                gestionEmpresaData.getRegimenSimple(),
                gestionEmpresaData.getEntidadEstado()
        );
        bodyCreate = bodyCreate.replaceAll("\"true\"", "true");
        bodyCreate = bodyCreate.replaceAll("\"false\"", "false");
        bodyCreate = bodyCreate.replaceAll("\"null\"", "null");
        String finalBodyCreate = bodyCreate;
        actor.attemptsTo(
                Put.to(
                        PATH_MULTIEMPRESA + SEPARADOR_BARRA + id).with(requestSpecification -> requestSpecification
                        .header(HEADER_NAME_CONTENT_TYPE,HEADER_VALUE_CONTENT_TYPE)
                        .body(finalBodyCreate)
                )
        );
        }

    public static PutActualizarEmpresa conIdYDatos(String id, GestionEmpresaData gestionEmpresaData){
        return Tasks.instrumented(PutActualizarEmpresa.class, id, gestionEmpresaData);
    }
}
