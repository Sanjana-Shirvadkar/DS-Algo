package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import utilities.ConfigFileReader;

public class RegistrationPage {

	ConfigFileReader config = new ConfigFileReader();
	WebDriver driver = new EdgeDriver();
	//config.getUrl();
	//config.getDriverPath();
	
	
	By new_user_registration_link = By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[2]");
	By txt_username = By.xpath("//*[@id=\"id_username\"]");
	By password1 = By.xpath("//*[@id=\"id_password1\"]");
	By confirm_password = By.id("id_password2");
	By register = By.xpath("/html/body/div[2]/div/div[2]/form/input[5]");
	
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@SuppressWarnings("static-access")
	public void clickRegisterOption() {
		config.getDriverPath();
		driver.findElement(new_user_registration_link).click();
	}
	
	public void getTitle() {
		driver.getTitle();
	}
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);;
	}
	
	public void enterPassword(String password) {
		driver.findElement(password1).sendKeys(password);;
	}
	
	public void confirmPassword(String password) {
		driver.findElement(confirm_password).sendKeys(password);;
	}
	
	public void registration() {
		driver.findElement(register).click();
	}
	
}
