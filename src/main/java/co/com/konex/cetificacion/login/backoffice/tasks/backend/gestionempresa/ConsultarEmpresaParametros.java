package co.com.konex.cetificacion.login.backoffice.tasks.backend.gestionempresa;

import co.com.konex.cetificacion.login.backoffice.models.backend.GestionEmpresaData;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static co.com.konex.cetificacion.login.backoffice.util.backend.Constantes.*;

public class ConsultarEmpresaParametros implements Task {
    private GestionEmpresaData gestionEmpresaData;

    public ConsultarEmpresaParametros(GestionEmpresaData gestionEmpresaData) {
        this.gestionEmpresaData = gestionEmpresaData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (gestionEmpresaData.getId().equals("guardado")) {
            String idGuardado = actor.recall("idPost");
            actor.attemptsTo(
                    Get.resource(PATH_MULTIEMPRESA + SEPARADOR_BARRA + idGuardado)
            );
        } else {
            actor.attemptsTo(
                    Get.resource(PATH_MULTIEMPRESA).with(requestSpecification -> requestSpecification
                            .param(GE_PARAMETRO_ID,gestionEmpresaData.getId())
                            .param(GE_PARAMETRO_IDGRUPOEMPRESARIAL,gestionEmpresaData.getIdGrupoEmpresarial())
                            .param(GE_PARAMETRO_NIT,gestionEmpresaData.getNit())
                            .param(GE_PARAMETRO_RAZONSOCIAL,gestionEmpresaData.getRazonSocial())
                            .param(GE_PARAMETRO_IDPAIS,gestionEmpresaData.getIdPais())
                            .param(GE_PARAMETRO_IDMUNICIPIO,gestionEmpresaData.getIdMunicipio())
                            .param(GE_PARAMETRO_DIRECCION,gestionEmpresaData.getDireccion())
                            .param(GE_PARAMETRO_CORREO,gestionEmpresaData.getCorreo())
                            .param(GE_PARAMETRO_TELEFONO,gestionEmpresaData.getTelefono())
                            .param(GE_PARAMETRO_DOMINIO,gestionEmpresaData.getDominio())
                            .param(GE_PARAMETRO_ESTADO,gestionEmpresaData.getEstado())
                            .param(GE_PARAMETRO_MONEDA,gestionEmpresaData.getMoneda())
                            .param(GE_PARAMETRO_TIPOPAGO,gestionEmpresaData.getTipoPago())
                            .param(GE_PARAMETRO_APLICACOMERCIALIZADOR,gestionEmpresaData.getAplicaComercializador())
                            .param(GE_PARAMETRO_APLICADISTRIBUIDOR,gestionEmpresaData.getAplicaDistribuidor())
                            .param(GE_PARAMETRO_RESPONSABLEIVA,gestionEmpresaData.getResponsableIva())
                            .param(GE_PARAMETRO_OBLIGADOFACTURAR,gestionEmpresaData.getObligadoFacturar())
                            .param(GE_PARAMETRO_REGIMENSIMPLE,gestionEmpresaData.getRegimenSimple())
                    )
            );
            System.out.println(SerenityRest.lastResponse().getBody().prettyPrint());
        }
    }

    public static ConsultarEmpresaParametros conDatos(GestionEmpresaData gestionEmpresaData) {
        return Tasks.instrumented(ConsultarEmpresaParametros.class, gestionEmpresaData);
    }
}
