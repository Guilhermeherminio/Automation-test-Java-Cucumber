package priceOptionFormPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basePage.BasePage;

public class PriceOptionFormPage extends BasePage{

	public PriceOptionFormPage(WebDriver driver) {
		super(driver);
	}

	
    public WebElement choosePricePlanOption(String string) {
    	WebElement options = null;
      switch (string) {
		  case "silver":
		    WebElement option1 = driver.findElement(By.id("selectsilver"));
		    options = option1;
			break;
		  case "gold":
		    WebElement option2 = driver.findElement(By.id("selectgold"));
		    options = option2;
		    break;
		  case "platinum":
		    WebElement option3 = driver.findElement(By.id("selectplatinum"));
		    options = option3;
		    break;
		  case "ultimate":
		    WebElement option4 = driver.findElement(By.id("selectultimate"));
		    options = option4;
		    break;
		  }

	 return options;
	}
}
