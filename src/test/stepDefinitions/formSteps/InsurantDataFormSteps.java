package formSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

import insuranceDataPageObjects.InsuranceDataPage;
import io.cucumber.java.en.And;

public class InsurantDataFormSteps {
	
	WebDriver driver = new ChromeDriver();
	Faker faker = new Faker();
	InsuranceDataPage InsurancePage = new InsuranceDataPage(driver);
	
	@And("the user fill the Enter Insurant Data form")
	public void the_user_fill_the_Enter_Insurant_Data_form() {
		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();
		String address = faker.address().streetAddress();
		String zipCode = faker.address().zipCode();
		String city = faker.address().city();

		InsurancePage.firstNameField().sendKeys(firstName);

		InsurancePage.lastNameField().sendKeys(lastName);

		InsurancePage.birthDateField().sendKeys("12/21/1970");

		InsurancePage.streetAddressField().sendKeys(address);

		InsurancePage.countryOptions().selectByVisibleText("Brazil");

		InsurancePage.zipCodeField().sendKeys(zipCode);
		
		InsurancePage.cityField().sendKeys(city);

		InsurancePage.occupationOptions().selectByVisibleText("Farmer");
		
		InsurancePage.hobbies("speeding").click();
		
		InsurancePage.webSiteField().sendKeys("www.google.com");
	}
}
