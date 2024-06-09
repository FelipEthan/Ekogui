package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "summary",
                "html:target/test-report-1.html",
                "json:target/test-report-1.json",
                "junit:target/test-report-1.xml",
                "timeline:target/cucumber-timeline",
        },
        features = {"src/test/resources/features"},
        glue = {"steps"},
        monochrome = true,
        tags = "@Test"
)

public class Runner {
    public Runner() {
    }

}

