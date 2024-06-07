package co.com.konex.cetificacion.login.backoffice.tasks.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.models.gestionarcomercializador.TablaCrearComercializadorColombia;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import co.com.konex.cetificacion.login.backoffice.util.GeneradorNombres;
import co.com.konex.cetificacion.login.backoffice.util.NITAleatorio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LlenarFormularioCrearComercializador implements Task {

    private TablaCrearComercializadorColombia data;

    public LlenarFormularioCrearComercializador(TablaCrearComercializadorColombia data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (data.getAsociaraEmpresa() != null) {
            actor.attemptsTo(Click.on(ContenedorDeObjetosGestionarComercializador.COMBOBOX_ASOCIAR_EMPRESA));
            actor.attemptsTo(Click.on(ContenedorDeObjetosGestionarComercializador.SELECT_BUSQUEDA.of(data.getAsociaraEmpresa())));
        }
        if (data.getNit() != null) {
            if(data.getNit().equals("aleatorio")){
                actor.attemptsTo(
                        Click.on(ContenedorDeObjetosGestionarComercializador.INPUT_NIT),
                        Enter.theValue(NITAleatorio.generateRandomNit()).into(ContenedorDeObjetosGestionarComercializador.INPUT_NIT));
            }else {
                actor.attemptsTo(
                        Click.on(ContenedorDeObjetosGestionarComercializador.INPUT_NIT),
                        Enter.theValue(data.getNit()).into(ContenedorDeObjetosGestionarComercializador.INPUT_NIT));
            }

        }
        if (data.getRazonSocial() != null) {
            if(data.getRazonSocial().equals("aleatorio")){
                actor.attemptsTo(
                        Click.on(ContenedorDeObjetosGestionarComercializador.INPUT_RAZON_SOCIAL),
                        Enter.theValue(GeneradorNombres.razonSocial()).into(ContenedorDeObjetosGestionarComercializador.INPUT_RAZON_SOCIAL));
            }else{
                actor.attemptsTo(
                        Click.on(ContenedorDeObjetosGestionarComercializador.INPUT_RAZON_SOCIAL),
                        Enter.theValue(data.getRazonSocial()).into(ContenedorDeObjetosGestionarComercializador.INPUT_RAZON_SOCIAL));
            }

        }
        if (data.getPais() != null) {
            actor.attemptsTo(Click.on(ContenedorDeObjetosGestionarComercializador.COMBOBOX_PAIS));
            actor.attemptsTo(Click.on(ContenedorDeObjetosGestionarComercializador.SELECT_BUSQUEDA.of(data.getPais())));
        }
        if (data.getRegion() != null) {
            actor.attemptsTo(Click.on(ContenedorDeObjetosGestionarComercializador.COMBOBOX_REGION));
            actor.attemptsTo(Click.on(ContenedorDeObjetosGestionarComercializador.SELECT_BUSQUEDA.of(data.getRegion())));
        }
        if (data.getDepartamento() != null) {
            actor.attemptsTo(Click.on(ContenedorDeObjetosGestionarComercializador.COMBOBOX_DEPARTAMENTO));
            actor.attemptsTo(Click.on(ContenedorDeObjetosGestionarComercializador.SELECT_BUSQUEDA.of(data.getDepartamento())));
        }
        if (data.getMunicipio() != null) {
            actor.attemptsTo(Click.on(ContenedorDeObjetosGestionarComercializador.COMBOBOX_CIUDAD));
            actor.attemptsTo(Click.on(ContenedorDeObjetosGestionarComercializador.SELECT_BUSQUEDA.of(data.getMunicipio())));
        }
        if (data.getDireccion() != null) {
            actor.attemptsTo(
                    Click.on(ContenedorDeObjetosGestionarComercializador.INPUT_DIRECCION),
                    Enter.theValue(data.getDireccion()).into(ContenedorDeObjetosGestionarComercializador.INPUT_DIRECCION));
        }
        if (data.getCorreoElectronico() != null) {
            actor.attemptsTo(
                    Click.on(ContenedorDeObjetosGestionarComercializador.INPUT_CORREO_ELECTRONICO),
                    Enter.theValue(data.getCorreoElectronico()).into(ContenedorDeObjetosGestionarComercializador.INPUT_CORREO_ELECTRONICO));
        }
        if (data.getTelefono() != null) {
            actor.attemptsTo(
                    Click.on(ContenedorDeObjetosGestionarComercializador.INPUT_TELEFONO),
                    Enter.theValue(data.getTelefono()).into(ContenedorDeObjetosGestionarComercializador.INPUT_TELEFONO));
        }
        if (data.getDominio() != null) {
            actor.attemptsTo(
                    Click.on(ContenedorDeObjetosGestionarComercializador.INPUT_DOMINIO),
                    Enter.theValue(data.getDominio()).into(ContenedorDeObjetosGestionarComercializador.INPUT_DOMINIO));
        }


    }

    public static LlenarFormularioCrearComercializador comercializador(TablaCrearComercializadorColombia data) {
        return Tasks.instrumented(LlenarFormularioCrearComercializador.class, data);
    }
}
