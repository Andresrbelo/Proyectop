package co.com.coucair.certification.ProyectoP.stepdefinitions;
import co.com.choucair.certification.ProyectoP.tasks.Login;
import co.com.choucair.certification.ProyectoP.tasks.OpenUp;
import co.com.choucair.certification.ProyectoP.tasks.Search;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;



public class ChoucairAcademyStepDefinitions {

    @Before
public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Andres wants to learn financial analysis$")
    public void thanAndresWantsToLearnFinancialAnalysis() {
        OnStage.theActorCalled("mike").wasAbleTo(OpenUp.thePage, Login.onThepage);

    }

    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseFinancialAnalysisOnTheChoucairAcademyPlatform(String Course) {

    OnStage.theActorInTheSpotlight().attemptsTo(Search.the(Course));
    }

    @Then("^ge find the course called technical guide - (.*)$")
    public void geFindTheCourseCalledTechnicalGuideFinancialAnalysis(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer));
    }


}
