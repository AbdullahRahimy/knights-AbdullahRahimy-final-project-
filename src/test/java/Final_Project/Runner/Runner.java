package Final_Project.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "Final_Project.Steps",
        tags = "@US_11",
        plugin = "html:target/html_report/report.html"
)
public class Runner {
}
