package RetoAgendarCitas.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScrollByCoordinates implements Interaction {
    private final int x;
    private final int y;

    public ScrollByCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        JavascriptExecutor js = (JavascriptExecutor) BrowseTheWeb.as(actor).getDriver();
        js.executeScript("window.scrollBy(arguments[0], arguments[1]);", x, y);
    }

    public static ScrollByCoordinates to(int x, int y) {
        return instrumented(ScrollByCoordinates.class, x, y);
    }
}

