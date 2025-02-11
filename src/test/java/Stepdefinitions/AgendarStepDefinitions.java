package Stepdefinitions;


import RetoAgendarCitas.models.Constantes;
import RetoAgendarCitas.models.setdata.AbrirCitas;
import RetoAgendarCitas.models.setdata.DataCita;
import RetoAgendarCitas.models.setdata.FinalizarAgendaData;
import RetoAgendarCitas.models.setdata.LoginCitas;
import RetoAgendarCitas.tasks.AgendarCita;
import RetoAgendarCitas.tasks.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;


import static RetoAgendarCitas.questions.ValidaTexto.delElemento;

import static RetoAgendarCitas.userinterface.AgendarCitaPage.TXT_CONFIRMAR;


public class AgendarStepDefinitions {
    @Given("el actor ingresa a la url del sitio CURA Healthcare Service")
    public void elActorIngresaALaUrlDelSitioCURAHealthcareService(io.cucumber.datatable.DataTable table) {
        OnStage.theActorCalled(Constantes.ACTOR).wasAbleTo(
                Open.url(AbrirCitas.setData(table).get(0).getUrl())
        );

    }

    @When("el actor se autentica con la siguiente informacion")
    public void elActorSeAutenticaConLaSiguienteInformacion(io.cucumber.datatable.DataTable table) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginPage.conCredenciales(LoginCitas.setData(table).get(0))
        );

    }

    @When("ingresa la información requerida para agendar la cita")
    public void ingresaLaInformaciónRequeridaParaAgendarLaCita(io.cucumber.datatable.DataTable table) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgendarCita.dePersona(DataCita.setData(table).get(0))
        );

    }

    @Then("valida que la cita se agendo de manera exitosa")
    public void validaQueLaCitaSeAgendoDeManeraExitosa(io.cucumber.datatable.DataTable table) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(delElemento(TXT_CONFIRMAR),
                Matchers.equalTo(FinalizarAgendaData.setData(table).get(0).getMensajeExitoso())));

    }

}



