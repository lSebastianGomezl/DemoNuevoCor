package co.com.konex.cetificacion.login.backoffice.questions.gestionarcomercializador;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarDatosComboBox implements Question<Boolean> {

    private Target comboBox;

    public ValidarDatosComboBox(Target comboBox) {
        this.comboBox = comboBox;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String data = comboBox.resolveFor(actor).getText();
        System.out.println("El dato ingresado es: " + data);
        return true;
    }

    public static ValidarDatosComboBox delComboBox(Target comboBox) {
        return new ValidarDatosComboBox(comboBox);
    }
}
