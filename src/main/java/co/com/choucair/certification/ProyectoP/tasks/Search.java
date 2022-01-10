package co.com.choucair.certification.ProyectoP.tasks;


import co.com.choucair.certification.ProyectoP.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Search implements Task {
    private String Course;

    public Search(String course) {
        Course = course;
    }

    public static Search the(String Course) {
    return Tasks.instrumented(Search.class);
}


    @Override
    public <T extends Actor> void performAs(T actor) {
        Click.on((SearchCoursePage.BUTTON_S));
    }
}

