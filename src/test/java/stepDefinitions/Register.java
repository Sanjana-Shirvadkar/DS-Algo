package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegistrationPage;

public class Register {

	WebDriver driver = null;
	RegistrationPage register = new RegistrationPage(driver);
	
	@Given("User is on the home page")
	public void user_is_on_the_home_page() {
	   	}

	@When("title is NumpyNinja")
	public void title_is_numpy_ninja() {
	   register.getTitle();
	}

	@Then("User clicks on Register Link")
	public void user_clicks_on_register_link() {
		register.clickRegisterOption();
	}

	@Then("user enters <Username> and <Password> and <Password confirmation>")
	public void user_enters_username_and_password_and_password_confirmation(String Username, String Password, String Password_Confirmation) {
	 
		register.enterUsername(Username);
		register.enterPassword(Password);
		register.confirmPassword(Password_Confirmation);
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user clicks {string}")
	public void user_clicks(String string) {
		register.registration();
	}	
}
