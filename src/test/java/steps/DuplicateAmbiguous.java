package steps;

public class DuplicateAmbiguous {
    /* This would throw a `cucumber.runtime.DuplicateStepDefinitionException`.
       When Cucumber encounters multiple Step Definitions that are
       exactly the same, it throws a Duplicate Step Definitions exception.

    @Given("^user is on Application landing page$")
    public void user_is_on_Application_landing_page_duplicate() {
        System.out.println("Duplicate");
    }*/

    /* This would throw a `cucumber.runtime.AmbiguousStepDefinitionsException`.
       When Cucumber encounters multiple Step Definitions that are a
       partial match, it throws an Ambiguous Step Definitions exception.

    @Given("^user is on (.*?) page$")
    public void user_is_on_Application_landing_page_ambiguous() {
        System.out.println("Duplicate");
    }*/
}