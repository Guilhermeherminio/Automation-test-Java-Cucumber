package vehicleDataPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import basePage.BasePage;

public class VehicleDataPage extends BasePage{
  public VehicleDataPage(WebDriver driver) {
		super(driver);
	}
  
  public Select makeOptions() {
    Select options = new Select (driver.findElement(By.id("make")));

    return options;
  }
  
  public Select modelOptions() {
	Select options = new Select (driver.findElement(By.id("model")));
	
	return options;
  }
  
  public WebElement cylinderCapacityField() {
    WebElement field = driver.findElement(By.id("cylindercapacity"));

    return field;
  }
  
  public WebElement enginePerformanceField() {
    WebElement field = driver.findElement(By.id("engineperformance"));

    return field;
  }
  
  public WebElement dateOfManufactureDataField() {
    WebElement dateField = driver.findElement(By.id("dateofmanufacture"));

    return dateField;
  }
  
  public Select numberOfSeatsOptions() {
	Select options = new Select (driver.findElement(By.id("model")));

    return options;
  }
  
  public WebElement rightHandYesDriveRadio() {
    WebElement radioOptions = driver.findElement(By.id("righthanddriveyes"));

    return radioOptions;
  }
  
  public WebElement rightHandNoDriveRadio() {
    WebElement radioOptions = driver.findElement(By.id("righthanddriveno"));

    return radioOptions;
  }
  
  public Select numberOfSeatsMotocycleOptions() {
	Select options = new Select (driver.findElement(By.id("numberofseatsmotorcycle")));

    return options;
  }
  
  public Select fueltypeOptions() {
	Select options = new Select (driver.findElement(By.id("numberofseatsmotorcycle")));

    return options;
  }

  public WebElement payloadField() {
    WebElement field = driver.findElement(By.id("payload"));

    return field;
  }
  
  public WebElement totalWeightField() {
    WebElement field = driver.findElement(By.id("totalweight"));

    return field;
  }

  public WebElement listPrice() {
    WebElement field = driver.findElement(By.id("listprice"));

    return field;
  }
  
  public WebElement licensePlateNumber() {
    WebElement field = driver.findElement(By.id("licenseplatenumber"));

    return field;
  }
  	
  public WebElement annualMileage() {
    WebElement field = driver.findElement(By.id("annualmileage"));

    return field;
  }
}
