package co.com.choucair.certification.ProyectoP.tasks;

import co.com.choucair.certification.ProyectoP.userinterface.ChoucairLoginPage;
import cucumber.api.java.af.En;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    public static Login onThepage;


    public static Login onThePage(){
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
        Enter.theValue("usuario").into(ChoucairLoginPage.INPUT_USER),
        Enter.theValue("contaseña").into(ChoucairLoginPage.INPUT_PASSWORD),
        Click.on(ChoucairLoginPage.ACCES_BUTTON)
);
    }
}
