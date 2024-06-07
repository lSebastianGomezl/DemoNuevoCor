package co.com.konex.cetificacion.login.backoffice.tasks.gestionarcomercializador;

import co.com.konex.cetificacion.login.backoffice.models.gestionarcomercializador.TblInicioGC;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGestionarComercializador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class LlenarFiltroNIT implements Task {

    private TblInicioGC tablaInicioGestionarComercializador;

    public LlenarFiltroNIT(TblInicioGC tablaInicioGestionarComercializador) {
        this.tablaInicioGestionarComercializador = tablaInicioGestionarComercializador;
    }

    public static LlenarFiltroNIT filtroNIT(TblInicioGC tablaInicioGestionarComercializador) {

        return Tasks.instrumented(LlenarFiltroNIT.class, tablaInicioGestionarComercializador);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(tablaInicioGestionarComercializador.getInputNit()!=null){
            if (tablaInicioGestionarComercializador.getInputNit().equals("guardado")) {
                String nitGuardao = actor.recall("nitGeneradoCrearEmpresa");
                actor.attemptsTo(Enter.theValue(nitGuardao).into(ContenedorDeObjetosGestionarComercializador.FILTRO_NIT));
            } else {
                actor.attemptsTo(Enter.theValue(tablaInicioGestionarComercializador.getInputNit()).into(ContenedorDeObjetosGestionarComercializador.FILTRO_NIT));

            }
        }
    }
}
