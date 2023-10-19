package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import utilities.ConfigFileReader;

public class GetStartedPage {
	
	ConfigFileReader config = new ConfigFileReader();
	WebDriver driver = new EdgeDriver();

	By get_started_link = By.xpath("/html/body/div[1]/div/div/a/button");
	
	@SuppressWarnings("static-access")
	public void click_getStarted() {
		config.getUrl();
		driver.findElement(get_started_link).click();
	}
	
}
