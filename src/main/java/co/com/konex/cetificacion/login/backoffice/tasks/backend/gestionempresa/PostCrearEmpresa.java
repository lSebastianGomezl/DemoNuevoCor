package co.com.konex.cetificacion.login.backoffice.tasks.backend.gestionempresa;

import co.com.konex.cetificacion.login.backoffice.models.backend.GestionEmpresaData;
import co.com.konex.cetificacion.login.backoffice.questions.backend.general.ContieneInfoRespuestaServicio;
import co.com.konex.cetificacion.login.backoffice.util.EmailGenerator;
import co.com.konex.cetificacion.login.backoffice.util.GeneradorNombres;
import co.com.konex.cetificacion.login.backoffice.util.GeneradorNumerosTelefono;
import co.com.konex.cetificacion.login.backoffice.util.backend.ReadFile;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

import java.util.HashMap;
import java.util.Map;

import static co.com.konex.cetificacion.login.backoffice.util.backend.Constantes.*;
import static co.com.konex.cetificacion.login.backoffice.util.backend.JsonRoutesGestionEmpresa.GESTION_EMPRESA_BODY;

public class PostCrearEmpresa implements Task {
    private GestionEmpresaData gestionEmpresaData;

    public PostCrearEmpresa(GestionEmpresaData gestionEmpresaData) {
        this.gestionEmpresaData = gestionEmpresaData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        Map<String, String> datosGestionEmpresa = new HashMap<>();

        if (gestionEmpresaData.getId().equals(ALEATORIO_CONSTANTE)) {
            actor.should(GivenWhenThen.seeThat(ContieneInfoRespuestaServicio.deLaLlave("id")));
            String valor = actor.recall("valorNoDuplicado");
            datosGestionEmpresa.put("id", valor);
        } else {
            datosGestionEmpresa.put("id", gestionEmpresaData.getId());
        }
        if (gestionEmpresaData.getNit().equals(ALEATORIO_CONSTANTE)) {
            actor.should(GivenWhenThen.seeThat(ContieneInfoRespuestaServicio.deLaLlave("nit")));
            String valor = actor.recall("valorNoDuplicado");
            datosGestionEmpresa.put("nit", valor);
        } else {
            datosGestionEmpresa.put("nit", gestionEmpresaData.getNit());
        }
        if (gestionEmpresaData.getRazonSocial().equals(ALEATORIO_CONSTANTE)) {
            actor.should(GivenWhenThen.seeThat(ContieneInfoRespuestaServicio.deLaLlave("razonSocial")));
            String valor = actor.recall("valorNoDuplicado");
            datosGestionEmpresa.put("razonSocial", valor);
        } else {
            datosGestionEmpresa.put("razonSocial", gestionEmpresaData.getRazonSocial());
        }
        if (gestionEmpresaData.getDireccion().equals(ALEATORIO_CONSTANTE)) {
            datosGestionEmpresa.put("direccion", EmailGenerator.generateRandomEmail());
        } else {
            datosGestionEmpresa.put("direccion", gestionEmpresaData.getDireccion());
        }
        if (gestionEmpresaData.getCorreo().equals(ALEATORIO_CONSTANTE)) {
            datosGestionEmpresa.put("correo", EmailGenerator.generateRandomEmail());
        } else {
            datosGestionEmpresa.put("correo", gestionEmpresaData.getCorreo());
        }
        if (gestionEmpresaData.getTelefono().equals(ALEATORIO_CONSTANTE)) {
            datosGestionEmpresa.put("telefono", GeneradorNumerosTelefono.telefonoColombia());
        } else {
            datosGestionEmpresa.put("telefono", gestionEmpresaData.getTelefono());
        }
        if (gestionEmpresaData.getDominio().equals(ALEATORIO_CONSTANTE)) {
            datosGestionEmpresa.put("dominio", GeneradorNombres.dominio());
        } else {
            datosGestionEmpresa.put("dominio", gestionEmpresaData.getDominio());
        }

        String bodyCreate = String.format(ReadFile.returnFile(GESTION_EMPRESA_BODY),
                datosGestionEmpresa.get("id"),
                gestionEmpresaData.getIdGrupoEmpresarial(),
                datosGestionEmpresa.get("nit"),
                datosGestionEmpresa.get("razonSocial"),
                gestionEmpresaData.getIdPais(),
                gestionEmpresaData.getIdMunicipio(),
                datosGestionEmpresa.get("direccion"),
                datosGestionEmpresa.get("correo"),
                datosGestionEmpresa.get("telefono"),
                datosGestionEmpresa.get("dominio"),
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
                Post.to(PATH_MULTIEMPRESA).with(requestSpecification -> requestSpecification
                        .header(HEADER_NAME_CONTENT_TYPE, HEADER_VALUE_CONTENT_TYPE)
                        .body(finalBodyCreate)
                )
        );
        System.out.println("finalBodyCreate: " + finalBodyCreate);
        String ultimoResponseBody = SerenityRest.lastResponse().getBody().print();
        actor.remember("ultimoResponseBody",ultimoResponseBody);
        if(!datosGestionEmpresa.get("id").equals("null")){
            actor.remember("idPost", SerenityRest.lastResponse().getBody().path("id").toString());
        }
    }

    public static PostCrearEmpresa conLosDatos(GestionEmpresaData gestionEmpresaData) {
        return Tasks.instrumented(PostCrearEmpresa.class, gestionEmpresaData);
    }
}
