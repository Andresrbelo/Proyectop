package co.com.choucair.certification.ProyectoP.tasks;

import co.com.choucair.certification.ProyectoP.userinterface.ChoucairAcademyPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class OpenUp implements Task {


    public static OpenUp thePage;
    private ChoucairAcademyPage ChoucairAcademyPage;

    public static OpenUp thePage (){
        return Tasks.instrumented(OpenUp.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(ChoucairAcademyPage));

    }
}
