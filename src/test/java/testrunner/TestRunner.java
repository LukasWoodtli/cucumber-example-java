package testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/* Add something like `tags="@SmokeTest,@RegTest"` to `@CucumberOptions`
   to run only scenarios with the given tasks.

   Alternatively use Gradle (https://stackoverflow.com/a/56380822/1272072):
   `test {
        systemProperty "cucumber.options", System.getProperty("cucumber.options")
    }`


 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "steps")
public class TestRunner {
}
