package RetoAgendarCitas.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Autenticarse {
    public static final Target BTN_MENU = Target.the("Ingresar usuario")
            .locatedBy("//a[@id='btn-make-appointment']");
    public static final Target TXT_USUARIO = Target.the("Ingresar usuario")
            .locatedBy("//input[@id='txt-username']");
    public static final Target TXT_CONTRASEÑA = Target.the("Ingresar contraseña")
            .locatedBy("//input[@id='txt-password']");
    public static final Target BTN_LOGIN = Target.the("Boton login")
            .locatedBy("//button[@id='btn-login']");
}
