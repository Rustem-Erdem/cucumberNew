package Runners;
import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue ="StepDefinitions",
        monochrome = true,
        plugin = {"pretty","junit:target/JUnitReports/report.xml",
                "json:target/JSONReports/report.json",
                "html:target/HtmlReports"}
)

public class runner {
}
