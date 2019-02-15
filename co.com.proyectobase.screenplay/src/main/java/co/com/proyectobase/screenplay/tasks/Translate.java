package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.GoogleHomePage;
import co.com.proyectobase.screenplay.userinterface.GoogleTraductorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Translate implements Task{
	
	private String palabra;
	
	public Translate(String palabra) {
		super();
		this.palabra = palabra;
	}

	public static Translate FromEnglishToSpanish(String palabra) {
		
		return Tasks.instrumented(Translate.class, palabra);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Enter.theValue("Traductor Google").into(GoogleHomePage.INPUT_SEARCH_GOOGLE));		
		actor.attemptsTo(Click.on(GoogleHomePage.WHITE_SPACE_GOOGLE_HOME_PAGE));	
		actor.attemptsTo(Click.on(GoogleHomePage.BUTTON_GOOGLE_SEARCH));		
		
		actor.attemptsTo(Click.on(GoogleHomePage.LINK_GOOGLE_TRANSLATE));		
		
		actor.attemptsTo(Click.on(GoogleTraductorPage.BUTTON_LANGUAGE_ORIGIN));
		actor.attemptsTo(Click.on(GoogleTraductorPage.ENGLISH_OPTION));
		actor.attemptsTo(Click.on(GoogleTraductorPage.BUTTON_LANGUAGE_DESTINATION));
		actor.attemptsTo(Click.on(GoogleTraductorPage.SPANISH_OPTION));
		actor.attemptsTo(Enter.theValue(palabra).into(GoogleTraductorPage.TRANSLATION_AREA));
		
		actor.attemptsTo(Click.on(GoogleTraductorPage.TANSLATION_BUTTON));
		
		
	}

	

}
