package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},

        features = "src/test/Resources/Features",
        glue = "StepDefinitions",

        dryRun = false,
        tags = "@plan"
)

public class CukesRunner {
}
