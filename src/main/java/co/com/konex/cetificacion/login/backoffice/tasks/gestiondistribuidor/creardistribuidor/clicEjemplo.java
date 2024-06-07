package co.com.konex.cetificacion.login.backoffice.tasks.gestiondistribuidor.creardistribuidor;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class clicEjemplo implements Task {
    private String click;

    public clicEjemplo(String click) {
        this.click = click;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (click){
            case "Sorteo":
                actor.attemptsTo(Click.on("LOCALIDOR"));
                break;
            case "Multinivel":
                actor.attemptsTo(Click.on("LOCALIZADOR"));
                break;
        }
    }
}
