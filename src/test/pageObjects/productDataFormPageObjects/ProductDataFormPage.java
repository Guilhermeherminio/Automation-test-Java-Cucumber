package productDataFormPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import basePage.BasePage;

public class ProductDataFormPage extends BasePage{
	public ProductDataFormPage(WebDriver driver) {
		super(driver);
	}
	
	public WebElement startDate() {
	  WebElement options = driver.findElement(By.id("startdate"));

	  return options;
	}
	  
    public Select insuranceSum() {
	  Select options = new Select (driver.findElement(By.id("insurancesum")));

	  return options;
    }
  
    public Select meritRating() {
      Select options = new Select (driver.findElement(By.id("meritrating")));

	  return options;
	}

    public Select damageInsurance() {
      Select options = new Select (driver.findElement(By.id("damageinsurance")));

  	  return options;
  	}

    public WebElement optionalProductsFirstOption() {
	  WebElement radioOptions = driver.findElement(By.id("EuroProtection"));	  

      return radioOptions;
    }

    public WebElement optionalProductsLastOption() {
      WebElement radioOptions = driver.findElement(By.id("LegalDefenseInsurance"));

      return radioOptions;
    }
    
    public Select courtesyCar() {
      Select options = new Select (driver.findElement(By.id("courtesycar")));

	  return options;
	}
}
