package co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.creardistribuidor;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.ArrayList;
import java.util.List;

import static co.com.konex.cetificacion.login.backoffice.userinterfaces.login.ContenedorDeObjetosLogin.SELECT_OPCION_ROLE;

public class ValidarEmpresasListadas implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        List<String> datosEmpresa = actor.recall("empresasGuardadas");
        List<String> datosSelect = new ArrayList<>();
        int i = 1;
        while (SELECT_OPCION_ROLE.of(String.valueOf(i)).resolveFor(actor).isVisible()){
            System.out.println(Text.of(SELECT_OPCION_ROLE.of(String.valueOf(i))).answeredBy(actor));
            datosSelect.add(Text.of(SELECT_OPCION_ROLE.of(String.valueOf(i))).answeredBy(actor));
            i++;
        }
        return tienenMismosDatosSinOrden(datosEmpresa,datosSelect);
    }

    private static boolean tienenMismosDatosSinOrden(List<String> lista1, List<String> lista2) {
        return lista1.size() == lista2.size() && lista1.containsAll(lista2) && lista2.containsAll(lista1);
    }

    public static ValidarEmpresasListadas validar(){
        return new ValidarEmpresasListadas();
    }
}
