package co.com.konex.cetificacion.login.backoffice.questions.gestiondistribuidor.creardistribuidor;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static co.com.konex.cetificacion.login.backoffice.userinterfaces.login.ContenedorDeObjetosLogin.SELECT_OPCION_ROLE;

public class ValidarComercializadoresListados implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        List<String> datosComercializador = actor.recall("comercializadoresGuardadas");
        List<String> datosSelect = new ArrayList<>();
        int i = 1;
        while (SELECT_OPCION_ROLE.of(String.valueOf(i)).resolveFor(actor).isVisible()){
            System.out.println(Text.of(SELECT_OPCION_ROLE.of(String.valueOf(i))).answeredBy(actor));
            datosSelect.add(Text.of(SELECT_OPCION_ROLE.of(String.valueOf(i))).answeredBy(actor));
            i++;
        }
        return tienenMismosDatosSinOrden(datosComercializador,datosSelect);
    }

    private static boolean tienenMismosDatosSinOrden(List<String> lista1, List<String> lista2) {
        lista1.removeIf(String::isEmpty);
        lista2.removeIf(String::isEmpty);

        Set<String> set1 = lista1.stream().collect(Collectors.toSet());
        Set<String> set2 = lista2.stream().collect(Collectors.toSet());

        Set<String> diferencia1 = set1.stream().filter(element -> !set2.contains(element)).collect(Collectors.toSet());
        Set<String> diferencia2 = set2.stream().filter(element -> !set1.contains(element)).collect(Collectors.toSet());

        return set1.equals(set2) || (diferencia1.size() <= 3 && diferencia2.size() <= 3);
    }

    public static ValidarComercializadoresListados validar(){
        return new ValidarComercializadoresListados();
    }
}
