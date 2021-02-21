package formSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import priceOptionFormPageObjects.PriceOptionFormPage;

public class PriceOptionFormSteps {
	
	WebDriver driver = new ChromeDriver();
	PriceOptionFormPage priceForm = new PriceOptionFormPage(driver);
	
	@And("the user fill the Select Price Option form")
	public void the_user_fill_the_Select_Price_Option_form() {
		priceForm.choosePricePlanOption("gold").click();
	}

}
