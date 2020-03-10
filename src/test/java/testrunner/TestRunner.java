package testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/* Add something like `tags="@SmokeTest,~@RegTest"` to `@CucumberOptions`
   to run only scenarios with the given tasks.

   Alternatively use Gradle (https://stackoverflow.com/a/56380822/1272072):
   `test {
        systemProperty "cucumber.options", System.getProperty("cucumber.options")
    }`

    Add `dryRun=true` to scan for features withaout running them.

    Some more plug-ins: usage, progress, rerun
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        strict = true,
        glue = "steps",
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json", "junit:target/cukes.xml"},
        Snippets = SnippetType.CAMELCASE)
public class TestRunner {
}
