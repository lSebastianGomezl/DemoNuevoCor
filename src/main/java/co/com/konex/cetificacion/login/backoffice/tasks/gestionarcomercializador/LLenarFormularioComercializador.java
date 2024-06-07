package co.com.konex.cetificacion.login.backoffice.tasks.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.models.gestionarcomercializador.TblCrearComerci;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import co.com.konex.cetificacion.login.backoffice.util.MetodosFuncionalesGestionComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LLenarFormularioComercializador implements Task {

    private MetodosFuncionalesGestionComercializador metodosFuncionalesGestionComercializador;
    private TblCrearComerci tblCrearComerci;

    public LLenarFormularioComercializador(TblCrearComerci tblCrearComerci) {
        this.tblCrearComerci = tblCrearComerci;
    }

    public static LLenarFormularioComercializador gestionComercializador(TblCrearComerci tblCrearComerci) {
        return Tasks.instrumented(LLenarFormularioComercializador.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ContenedorDeObjetosGestionarComercializador.COMBOBOX_ASOCIAR_EMPRESA),
                Click.on(metodosFuncionalesGestionComercializador.EMPRESA(tblCrearComerci.getAsociaraempresa())),
                Enter.theValue(tblCrearComerci.getNIT()).into(ContenedorDeObjetosGestionarComercializador.INPUT_NIT),
                Enter.theValue(tblCrearComerci.getRazonsocialoempresa()).into(ContenedorDeObjetosGestionarComercializador.INPUT_RAZON_SOCIAL),
                Click.on(ContenedorDeObjetosGestionarComercializador.COMBOBOX_PAIS),
                Click.on(metodosFuncionalesGestionComercializador.PAIS(tblCrearComerci.getPais())),
                Click.on(ContenedorDeObjetosGestionarComercializador.COMBOBOX_DEPARTAMENTO),
                Click.on(metodosFuncionalesGestionComercializador.DEPARTAMENTO(tblCrearComerci.getDepartamento())),
                Click.on(ContenedorDeObjetosGestionarComercializador.COMBOBOX_CIUDAD),
                Click.on(metodosFuncionalesGestionComercializador.CIUDAD(tblCrearComerci.getCiudad())),
                Enter.theValue(tblCrearComerci.getDireccion()).into(ContenedorDeObjetosGestionarComercializador.INPUT_DIRECCION),
                Enter.theValue(tblCrearComerci.getCorreoelectronico()).into(ContenedorDeObjetosGestionarComercializador.INPUT_CORREO_ELECTRONICO),
                Enter.theValue(tblCrearComerci.getDominio()).into(ContenedorDeObjetosGestionarComercializador.INPUT_DOMINIO));
    }
}
