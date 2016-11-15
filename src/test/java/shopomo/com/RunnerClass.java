package shopomo.com;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features = ".",tags = "@live",plugin = {"pretty","html:target/report.html","json:target/report.json"},dryRun = false, strict = false)
public class RunnerClass
{

}
