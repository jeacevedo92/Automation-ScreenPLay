package co.com.proyectobase.screenplay.stepdefinitions;

import static org.hamcrest.Matchers.equalTo;
import org.openqa.selenium.WebDriver;

import co.com.proyectobase.screenplay.questions.TheAnswer;
import co.com.proyectobase.screenplay.tasks.OpenPage;
import co.com.proyectobase.screenplay.tasks.Translate;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class TraductorGoogleStepDefintions {

		
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor Cali = Actor.named("Rafa");
	
	@Before
	public void configuracionInicial() {
		Cali.can(BrowseTheWeb.with(hisBrowser));
	}	
	
	@Given("^that cali want to use Google traslate$")
	public void thatCaliWantToUseGoogleTraslate(){
		Cali.wasAbleTo(OpenPage.GooglePage());

	}
	
	@When("^he traslate the word (.*) from ingles to español$")
	public void heTraslateTheWordTableFromInglesToEspañol(String word){
		Cali.attemptsTo(Translate.FromEnglishToSpanish(word));
	}
	
	@Then("^he traslate see the word (.*) on the screen$")
	public void heTraslateSeeTheWordMesaOnTheScreen(String ExpectedWord){
		Cali.should(seeThat(TheAnswer.is(), equalTo(ExpectedWord)));
	}
	
	

}
