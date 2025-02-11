package RetoAgendarCitas.tasks;


import RetoAgendarCitas.models.setdata.DataCita;
import RetoAgendarCitas.userinterface.AgendarCitaPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

import java.time.Duration;

import static RetoAgendarCitas.userinterface.AgendarCitaPage.BTN_LISTA_AÑOS;
import static RetoAgendarCitas.userinterface.AgendarCitaPage.COMENTARIO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class AgendarCita implements Task {
    DataCita dataCita;

    public AgendarCita(DataCita dataCita) {
        this.dataCita = dataCita;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AgendarCitaPage.BTN_LISTA),
                Click.on(AgendarCitaPage.SELECCIONAR_LISTA),
                Click.on(AgendarCitaPage.CHECK),
                Click.on(AgendarCitaPage.Healthcare_Program),
                Click.on(AgendarCitaPage.BTN_FECHA),
                DoubleClick.on(BTN_LISTA_AÑOS),
                Click.on(AgendarCitaPage.BTN_SELECCIONAR_AÑO),
                Click.on(AgendarCitaPage.BTN_SELECIONAR_MES),
                Click.on(AgendarCitaPage.BTN_SELECIONAR_DIA),
                Enter.theValue(dataCita.getComentario()).into(COMENTARIO),
                Click.on(AgendarCitaPage.BTN_REGISTRAR)
                // Wait.until(WebElementQuestion.the(BTN_LISTA_AÑOS), isVisible()).forNoMoreThan(Duration.ofSeconds(3))
        );

    }

    public static AgendarCita dePersona(DataCita dataCita) {
        return Instrumented.instanceOf(AgendarCita.class).withProperties(dataCita);
    }
}

