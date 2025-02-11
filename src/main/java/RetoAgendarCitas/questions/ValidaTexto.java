package RetoAgendarCitas.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidaTexto implements Question<String> {

    private final Target element;

    public ValidaTexto(Target element) {
        this.element = element;
    }

    @Override
    public String answeredBy(Actor actor) {
        return element.resolveFor(actor).getText().trim(); // Se usa trim() para evitar espacios extra
    }

    public static Question<String> delElemento(Target element) {
        return new ValidaTexto(element);
    }
}
