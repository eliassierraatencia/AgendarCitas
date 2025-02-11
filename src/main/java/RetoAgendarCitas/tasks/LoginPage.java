package RetoAgendarCitas.tasks;

import RetoAgendarCitas.models.setdata.AbrirCitas;
import RetoAgendarCitas.models.setdata.LoginCitas;
import RetoAgendarCitas.userinterface.Autenticarse;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginPage implements Task {
    private LoginCitas loginCitas;

    public LoginPage(LoginCitas loginCitas) {
        this.loginCitas = loginCitas;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Autenticarse.BTN_MENU),
                Enter.theValue(loginCitas.getUsuario()).into(Autenticarse.TXT_USUARIO),
                Enter.theValue(loginCitas.getContrasena()).into(Autenticarse.TXT_CONTRASEÑA),
                Click.on(Autenticarse.BTN_LOGIN)
        );
    }
    public static LoginPage conCredenciales(LoginCitas loginCitas){
        return Instrumented.instanceOf(LoginPage.class).withProperties(loginCitas);
    }
}
