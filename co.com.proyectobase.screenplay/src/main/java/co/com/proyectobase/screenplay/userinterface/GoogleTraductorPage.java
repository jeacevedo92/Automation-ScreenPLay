package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class GoogleTraductorPage {
	
	public static Target BUTTON_LANGUAGE_ORIGIN = Target.the("Input search Google")
			.located(By.id("gt-sl-gms"));
	
	public static Target BUTTON_LANGUAGE_DESTINATION = Target.the("Button language destination")
			.located(By.id("gt-tl-gms"));
	
	public static Target SPANISH_OPTION = Target.the("spanish option")
			.located(By.xpath("//div[@id='gt-tl-gms-menu']/table/tbody//tr/td//div[contains(text(),'espa')]"));
	
	public static Target ENGLISH_OPTION = Target.the("englisj option")
			.located(By.xpath("//div[@id='gt-sl-gms-menu']/table/tbody//tr/td//div[contains(text(),'ingl')]"));
	
	public static Target TRANSLATION_AREA = Target.the("Area where the words to be translated are written")
			.located(By.id("source"));
	
	public static Target TANSLATION_BUTTON = Target.the("Button translation Google")
			.located(By.id("gt-lang-submit"));
	
	public static Target TRANSLATED_AREA = Target.the("Area where the translated word is presented")
			.located(By.id("gt-res-dir-ctr"));
	

	
	
	
}
