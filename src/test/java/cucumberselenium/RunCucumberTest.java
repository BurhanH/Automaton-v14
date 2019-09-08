package cucumberselenium;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                  "html:target/SystemTestReport/html"}
)
public class RunCucumberTest {
}
