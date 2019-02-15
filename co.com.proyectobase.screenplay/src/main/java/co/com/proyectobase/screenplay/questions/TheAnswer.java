package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.userinterface.GoogleTraductorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheAnswer implements Question<String> {

	public static TheAnswer is() {
		
		return new TheAnswer();
	}

	@Override
	public String answeredBy(Actor actor) {
		
		return Text.of(GoogleTraductorPage.TRANSLATED_AREA).viewedBy(actor).asString();
	}
	

}
