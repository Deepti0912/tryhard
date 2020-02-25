import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (format = { "json:target/tryhard.json", "pretty", "html:target/tryhard" },
                  features = {"src/main/resources/f1.feature"})

public class f1Runner {
}
