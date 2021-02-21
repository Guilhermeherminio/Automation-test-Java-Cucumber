package formSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import vehicleDataPageObjects.VehicleDataPage;

public class VehicleDataFormSteps {
	
	WebDriver driver = new ChromeDriver();
	VehicleDataPage vehicleData = new VehicleDataPage(driver);

	@And("the user fill the Enter Vehicle Data form")
	public void the_user_fill_the_Enter_Vehicle_Data_form() {
		vehicleData.makeOptions().selectByVisibleText("Audi");
		
		vehicleData.modelOptions().selectByVisibleText("Motocycle");
		
		vehicleData.cylinderCapacityField().sendKeys("123");
		
		vehicleData.enginePerformanceField().sendKeys("123");

		vehicleData.dateOfManufactureDataField().sendKeys("21022021");
		
		vehicleData.numberOfSeatsOptions().selectByVisibleText("7");
		
		vehicleData.rightHandYesDriveRadio().click();
		
		vehicleData.numberOfSeatsMotocycleOptions().selectByVisibleText("3");
		
		vehicleData.fueltypeOptions().selectByVisibleText("Gas");
		
		vehicleData.payloadField().sendKeys("123");
		
		vehicleData.totalWeightField().sendKeys("123");
		
		vehicleData.listPrice().sendKeys("500");
		
		vehicleData.licensePlateNumber().sendKeys("123");
		
		vehicleData.annualMileage().sendKeys("123");
		
	}

}
