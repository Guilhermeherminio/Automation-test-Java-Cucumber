package insuranceDataPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import basePage.BasePage;

public class InsuranceDataPage extends BasePage{
	
  public InsuranceDataPage(WebDriver driver) {
	super(driver);
  }
  
  public WebElement firstNameField() {
    WebElement field = driver.findElement(By.id("firstname"));

    return field;
  }
  
  public WebElement lastNameField() {
	WebElement field = driver.findElement(By.id("model"));
	
	return field;
  }
  
  public WebElement birthDateField() {
    WebElement field = driver.findElement(By.id("birthdate"));

    return field;
  }
  
  public WebElement genderMaleRadio() {
    WebElement radioOptions = driver.findElement(By.id("gendermale"));

    return radioOptions;
  }
  
  public WebElement genderFemaleRadio() {
    WebElement radioOptions = driver.findElement(By.id("genderfemale"));

    return radioOptions;
  }
  
  public WebElement streetAddressField() {
    WebElement field = driver.findElement(By.id("streetaddress"));

    return field;
  }
  
  public Select countryOptions() {
	Select options = new Select (driver.findElement(By.id("country")));

    return options;
  }
  
  public WebElement zipCodeField() {
    WebElement field = driver.findElement(By.id("zipcode"));

    return field;
  }
  
  public WebElement cityField() {
    WebElement field = driver.findElement(By.id("city"));

    return field;
  }

  
  public Select occupationOptions() {
	Select options = new Select (driver.findElement(By.id("occupation")));

    return options;
  }
  
  public WebElement hobbies(String option) {
	WebElement options = driver.findElement(By.id(option.toLowerCase()));

    return options;
  }
  
  public WebElement webSiteField() {
    WebElement field = driver.findElement(By.id("website"));

    return field;
  }

}
