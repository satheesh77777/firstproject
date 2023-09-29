package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Users/Admin/IdeaProjects/potti/src/main/java/Features",glue = {"StepDefinitions"})
public class NewRunner {
}
