package omnipro.automation.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features="src/test/resources/features/Login.feature",
        glue = "omnipro.automation.stepsdefinitions",
        snippets = CAMELCASE,
        tags = ""
)
public class RunnerLogin {
}
