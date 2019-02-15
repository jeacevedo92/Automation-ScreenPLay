package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;

@DefaultUrl("http://www.google.com")
public class GoogleHomePage extends PageObject{
	
	public static Target INPUT_SEARCH_GOOGLE = Target.the("Input search Google")
			.located(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
	
	public static Target BUTTON_GOOGLE_SEARCH = Target.the("Input search Google")
			.located(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]"));	
	
	//*[@id="tsf"]/div[2]/div/div[3]/center/input[1]
	public static Target LINK_GOOGLE_TRANSLATE = Target.the("Input search Google")
			.located(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div/div/div[1]/a"));
	
	public static Target WHITE_SPACE_GOOGLE_HOME_PAGE = Target.the("Input search Google")
			.located(By.id("lga"));
	
}

