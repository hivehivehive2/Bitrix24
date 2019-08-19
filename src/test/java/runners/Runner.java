package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        plugin = {"html:target/default-cucumber-reports",
//                "json:target/cucumber.json"},
        plugin={"html:target/reports","rerun:target/Failed/rerun.txt",
                "json:target/cucumber.json"},
        features = "src/test/resources/Activity_Stream.feature",
        glue = "step_defs",
        tags = "@wip"
//        dryRun = false
)

public class Runner {
}
