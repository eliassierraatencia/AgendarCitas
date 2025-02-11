package RetoAgendarCitas.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class AgendarCitaPage {
    public static final Target BTN_LISTA = Target.the("Despliega la lista de opciones")
            .locatedBy("//select[@id='combo_facility']");
    public static final Target SELECCIONAR_LISTA = Target.the("Selecciona una opciones")
            .locatedBy("//select[@id='combo_facility']/option[@value='Seoul CURA Healthcare Center']");
    public static final Target CHECK = Target.the("Ingresar usuario")
            .locatedBy("//input[@id='chk_hospotal_readmission']");
    public static final Target Healthcare_Program = Target.the("Ingresar usuario")
            .locatedBy("//input[@id='radio_program_medicaid']");
    public static final Target BTN_FECHA = Target.the("Ingresar usuario")
            .locatedBy("//span[@class='glyphicon glyphicon-calendar']");
    public static final Target BTN_LISTA_AÑOS = Target.the("Lista los años")
            .locatedBy("//th[@colspan='5'][contains(.,'February 2025')]");
    public static final Target BTN_SELECCIONAR_AÑO = Target.the("Lista los años")
            .locatedBy("//span[@class='year'][contains(.,'2024')]");
    public static final Target BTN_SELECIONAR_MES = Target.the("Lista los años")
            .locatedBy("//span[@class='month'][contains(.,'Jul')]");
    public static final Target BTN_SELECIONAR_DIA = Target.the("Lista los años")
            .locatedBy("//td[@class='day'][contains(.,'20')]");
    public static final Target COMENTARIO = Target.the("Ingresar usuario")
            .locatedBy("//textarea[@id='txt_comment']");
    public static final Target BTN_REGISTRAR = Target.the("Ingresar usuario")
            .locatedBy("//button[@type='submit'][contains(.,'Book Appointment')]");
    public static final Target TXT_CONFIRMAR = Target.the("Ingresar usuario")
            .locatedBy("//h2[contains(.,'Appointment Confirmation')]");
}

