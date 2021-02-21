package formSteps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import sendQuoteFormPageObject.SendQuoteFormPage;

public class SendQuoteFormSteps {
	
	WebDriver driver = new ChromeDriver();
	SendQuoteFormPage quotesForm = new SendQuoteFormPage(driver);
	
	@And("the user fill the Send Quote form")
	public void the_user_fill_the_Send_Quote_form() {
		quotesForm.emailField().sendKeys("testQA@gmail.com");
		quotesForm.phoneField().sendKeys("123456789");
		quotesForm.usernameField().sendKeys("testQA");
		quotesForm.passwordField().sendKeys("@Test123");
		quotesForm.confirmPasswordField().sendKeys("@Test123");
		quotesForm.CommentsField().sendKeys("No comments");
	}
	
	@Then("the user validate the e-mail success in the screen")
	public void the_user_validate_the_e_mail_success_in_the_screen() {
	    assertEquals(quotesForm.successfulMessage().getText(), "Sending e-mail success!");
	}

}
