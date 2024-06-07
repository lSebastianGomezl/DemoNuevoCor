package co.com.konex.cetificacion.login.backoffice.tasks.grupoempresarial.creargrupoempresarial;

import co.com.konex.cetificacion.login.backoffice.interactions.*;
import co.com.konex.cetificacion.login.backoffice.models.grupoempresarial.TablaGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import co.com.konex.cetificacion.login.backoffice.util.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.apache.commons.net.nntp.NNTP;

public class LlenarCampos implements Task {
    private ConstruirXpathGrupoEmpresarial construirXpathGrupoEmpresarial;
    private TablaGrupoEmpresarial tablaGrupoEmpresarial;

    public LlenarCampos(TablaGrupoEmpresarial tablaGrupoEmpresarial) {
        this.tablaGrupoEmpresarial = tablaGrupoEmpresarial;
    }

    public static LlenarCampos llenarCamposConDatosRequeridos(TablaGrupoEmpresarial tablaGrupoEmpresarial) {
        return Tasks.instrumented(LlenarCampos.class, tablaGrupoEmpresarial);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                EnterNit.enterNit(tablaGrupoEmpresarial),
                EnterRazonSocial.enterRazonSocial(tablaGrupoEmpresarial));
        if(tablaGrupoEmpresarial.getPais()!=null){
            actor.attemptsTo(
                    Click.on(ContenedorDeObjetosGrupoEmpresarial.LIST_DESPLEGABLE_PAIS),
                    Click.on(ContenedorDeObjetosGrupoEmpresarial.SELECT_PAIS.of(tablaGrupoEmpresarial.getPais()))
            );
        }
        if(tablaGrupoEmpresarial.getDepartamento()!=null){
            actor.attemptsTo(
                    Click.on(ContenedorDeObjetosGrupoEmpresarial.LIST_DESPLEGABLE_DEPART),
                    Click.on(construirXpathGrupoEmpresarial.DEPARTAMENTO(tablaGrupoEmpresarial.getDepartamento()))
            );
        }
        if(tablaGrupoEmpresarial.getCiudad()!=null){
            actor.attemptsTo(
                    Click.on(ContenedorDeObjetosGrupoEmpresarial.LIST_DESPLEGABLE_CIUDAD),
                    Click.on(construirXpathGrupoEmpresarial.CIUDAD(tablaGrupoEmpresarial.getCiudad()))
            );
        }
        actor.attemptsTo(
                EnterDireccion.enterDireccion(tablaGrupoEmpresarial),
                EnterCorreoElectronico.enterCorreoElectronico(tablaGrupoEmpresarial),
                EnterTelefono.enterTelefono(tablaGrupoEmpresarial),
                EnterDominio.enterDominio(tablaGrupoEmpresarial)
        );

    }
}
