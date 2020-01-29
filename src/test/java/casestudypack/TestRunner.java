package casestudypack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="featureFile",glue= {"casestudypack"},tags="@searchproduct", plugin = {"pretty","json:target/cucumber.json"}
)
public class TestRunner {

}
