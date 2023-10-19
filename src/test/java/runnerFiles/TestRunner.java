package runnerFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.ConfigFileReader;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue= {"stepDefinitions"},
		plugin = {"pretty"}
		)
		
public class TestRunner {
    public static String URL = ConfigFileReader.getUrl();
    public static String DRIVER = ConfigFileReader.getDriverPath();
}

