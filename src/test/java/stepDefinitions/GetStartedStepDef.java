package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GetStartedPage;
import utilities.ConfigFileReader;

import org.junit.Assert; 

public class GetStartedStepDef {
	
	WebDriver webdrv = new EdgeDriver();
	ConfigFileReader config = new ConfigFileReader();
	//GetStartedPage page = new GetStartedPage();
	
	@SuppressWarnings("static-access")
	@Given("^User is on the first landing page$")
	public void user_is_on_the_first_landing_page() {
	   config.getDriverPath();
	   webdrv.get(config.getUrl());
	}
	
	@When("^title is Numpy Ninja$")
	public void title_is_numpy_ninja() {
		String title = webdrv.getTitle();
		System.out.println(title);
		Assert.assertEquals("Numpy Ninja", title);
	}

	@Then("User clicks on Get Started button")
	public void user_clicks_on_get_started_button() {
		webdrv.findElement(By.xpath("/html/body/div[1]/div/div/a/button")).click(); 
	///	page.click_getStarted();
	}

	@Then("user is on Home page")
	public void user_is_on_home_page() {
		String title = webdrv.getTitle();
		System.out.println(title);
		Assert.assertEquals("NumpyNinja", title);
	}

}
