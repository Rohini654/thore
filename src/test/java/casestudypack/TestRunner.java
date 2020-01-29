package casestudypack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="featureFile",glue= {"casestudypack"},tags="@loginpg")

public class TestRunner {

}
