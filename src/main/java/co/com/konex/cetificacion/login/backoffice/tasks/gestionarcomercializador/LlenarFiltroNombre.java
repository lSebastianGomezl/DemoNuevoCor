package co.com.konex.cetificacion.login.backoffice.tasks.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.models.gestionarcomercializador.TblInicioGC;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class LlenarFiltroNombre implements Task {

    private TblInicioGC tablaInicioGestionarComercializador;

    public LlenarFiltroNombre(TblInicioGC tablaInicioGestionarComercializador) {
        this.tablaInicioGestionarComercializador = tablaInicioGestionarComercializador;
    }

    public static LlenarFiltroNombre filtroNombre(TblInicioGC tablaInicioGestionarComercializador) {
        return Tasks.instrumented(LlenarFiltroNombre.class, tablaInicioGestionarComercializador);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(tablaInicioGestionarComercializador.getInputNombreComercializador()).into(ContenedorDeObjetosGestionarComercializador.FILTRO_NOMBRE_COMERCIALIZADOR));
    }
}
