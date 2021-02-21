package formSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import productDataFormPageObjects.ProductDataFormPage;

public class ProductDataFormSteps {
	
	WebDriver driver = new ChromeDriver();
	ProductDataFormPage productForm = new ProductDataFormPage(driver);
	
	@And("the user fill the Enter Product Data form")
	public void the_user_fill_the_Enter_Product_Data_form() {
	    productForm.startDate().sendKeys("12/21/2021");
	    
	    productForm.insuranceSum().selectByVisibleText("3000000");
	    
	    productForm.meritRating().selectByVisibleText("Malus 10");
	    
	    productForm.damageInsurance().selectByVisibleText("No Coverage");
	    
	    productForm.optionalProductsFirstOption().click();
	    
	    productForm.optionalProductsLastOption().click();
	    
	    productForm.courtesyCar().selectByVisibleText("Yes");
	}

}
