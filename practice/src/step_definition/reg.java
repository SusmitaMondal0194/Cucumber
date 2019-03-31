package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class reg{
	
	static WebDriver driver;
	
	@Given("^Application is launched$")
	public void application_is_launched() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUSMITAMONDAL\\Desktop\\Desktop_8ThFeb2019\\Manipal_Training Time documents\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
	    
	}

	@When("^First Name \"([^\"]*)\" and Last Name \"([^\"]*)\" and Phone \"([^\"]*)\"$")
	public void firstname_and_LastName_and_Phone(String arg1, String arg2, String arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys(arg1);
		driver.findElement(By.name("firstName")).sendKeys(arg1);
		driver.findElement(By.name("lastName")).sendKeys(arg2);
		driver.findElement(By.name("phone")).sendKeys(arg3);
	}

	@Then("^Registration successful$")
	public void registration_successful() throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Done!!!");
	}

}
	