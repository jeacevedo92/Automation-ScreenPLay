package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.GoogleHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPage implements Task{
	
	private GoogleHomePage googleHomePage;

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(googleHomePage));
		
	}

	public static OpenPage GooglePage() {
		// TODO Auto-generated method stub
		return Tasks.instrumented(OpenPage.class);
	}
	

}
