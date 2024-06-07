package co.com.konex.cetificacion.login.backoffice.questions.grupoempresarial.creargrupoempresarial;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosGrupoEmpresarial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import java.util.ArrayList;
import java.util.List;

public class ValidarPaisesMenuDesplegable implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        int i = 1;
        List<String> listaDePaisesGrupoEmpresarial = new ArrayList<>();
        List<String> listaDePaisesGestionPolitica = actor.recall("listaDePaises");
        actor.attemptsTo(Click.on(ContenedorDeObjetosGrupoEmpresarial.LIST_DESPLEGABLE_PAIS));
        while (ContenedorDeObjetosGrupoEmpresarial.LISTA_PAISES_GRUPO_EMPRESARIAL.of(String.valueOf(i)).resolveFor(actor).isVisible()){
            String pais = Text.of(ContenedorDeObjetosGrupoEmpresarial.LISTA_PAISES_GRUPO_EMPRESARIAL.of(String.valueOf(i))).answeredBy(actor);
            listaDePaisesGrupoEmpresarial.add(pais);
            System.out.println(pais);
            i++;
        }
        if(listaDePaisesGestionPolitica.equals(listaDePaisesGrupoEmpresarial)){
            return true;
        }
        return false;
    }
    public static ValidarPaisesMenuDesplegable validar() {
        return new ValidarPaisesMenuDesplegable();
    }
}
