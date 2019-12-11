package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/ChangeLanguge.features",
        plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber.json},"},
        glue = {"classpath:steps","classpath:hooks"},
        tags = "@tag1",
        snippets = SnippetType.CAMELCASE
)

public class RunCucumberTest {
}
