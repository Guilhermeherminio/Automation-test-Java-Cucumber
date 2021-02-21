package formSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class BaseSteps {
	WebDriver driver = new ChromeDriver();
	
    @Before
    public void beforeScenario() {
        driver = new ChromeDriver();
    }

	@Given("the user go to the site")
	public void the_user_go_to_the_site() {
		driver.get("http://sampleapp.tricentis.com/101/app.php");
	}
	
	@After
	public void fechaBrowser() {
		driver.quit();
	}

}