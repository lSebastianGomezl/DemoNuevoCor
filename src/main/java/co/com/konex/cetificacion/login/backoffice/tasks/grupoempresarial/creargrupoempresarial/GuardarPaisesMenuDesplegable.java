package co.com.konex.cetificacion.login.backoffice.tasks.grupoempresarial.creargrupoempresarial;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;

import java.util.ArrayList;
import java.util.List;

public class GuardarPaisesMenuDesplegable implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        int i = 1;
        List<String> listaDePaises = new ArrayList<>();
        while (ContenedorDeObjetosGrupoEmpresarial.PAIS_TABLA.of(String.valueOf(i)).resolveFor(actor).isVisible()){
            if (ContenedorDeObjetosGrupoEmpresarial.BTN_ACTIVO_INACTIVO.of(String.valueOf(i)).resolveFor(actor).getAttribute("class").contains("color-verde")) {
                String pais = Text.of(ContenedorDeObjetosGrupoEmpresarial.PAIS_TABLA.of(String.valueOf(i))).answeredBy(actor);
                listaDePaises.add(pais);
            }
            i++;
        }
        actor.remember("listaDePaises", listaDePaises);
    }
    public static GuardarPaisesMenuDesplegable guardarPaises() {
        return Tasks.instrumented(GuardarPaisesMenuDesplegable.class);
    }
}
