package sendQuoteFormPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basePage.BasePage;

public class SendQuoteFormPage extends BasePage{

	public SendQuoteFormPage(WebDriver driver) {
		super(driver);
	}

	public WebElement emailField() {
	  WebElement field = driver.findElement(By.id("email"));

	  return field;
    }

	public WebElement phoneField() {
	  WebElement field = driver.findElement(By.id("phone"));

	  return field;
    }

	public WebElement usernameField() {
	  WebElement field = driver.findElement(By.id("username"));

	  return field;
    }

	public WebElement passwordField() {
	  WebElement field = driver.findElement(By.id("password"));

	  return field;
    }

	public WebElement confirmPasswordField() {
	  WebElement field = driver.findElement(By.id("confirmpassword"));

	  return field;
    }

	public WebElement CommentsField() {
	  WebElement field = driver.findElement(By.id("Comments"));

	  return field;
    }
	
	public WebElement successfulMessage() {
	  WebElement Label = driver.findElement(By.tagName("h2"));

	  return Label;
	}
}
