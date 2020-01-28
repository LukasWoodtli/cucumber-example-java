package steps;


import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class StepDefinitions {

    @Given("^User is on NetBanking landing page$")
    public void userOnLandingPage() {
        System.out.println("navigated to login page");
    }

    @When("^User logs into the application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_logs_into_the_application_with_and_password(String arg1, String arg2) {
        System.out.println("User: " + arg1);
        System.out.println("Password: " + arg2);
        System.out.println("user logs in");
    }

    @When("^User signs in with following details$")
    public void user_signs_in_with_following_details(DataTable arg) {
        List<String> obj = arg.asList(String.class);
        System.out.println(obj.get(0));
        System.out.println(obj.get(1));
        System.out.println(obj.get(2));
        System.out.println(obj.get(3));
        System.out.println(obj.get(4));
    }

    @When("^User signs in with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_signs_in_with_username_and_password(String username, String password) {
        System.out.println(username);
        System.out.println(password);

    }

    @Then("^Homepage is populated$")
    public void homepageIsPopulated() {
        System.out.println("homepage is populated");
    }


    @Then("^Cards are displayed: \"([^\"]*)\"$")
    public void cardsAreDisplayed(String arg) {
        System.out.println("cards are displayed: " + arg);
    }


    /// Background

    @Given("^validate the browser$")
    public void validate_the_browser() {
        System.out.println("> Background: validate the browser");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() {
        System.out.println("> Background: Browser is triggered");
    }

    @Then("^Check if browser is started$")
    public void check_if_browser_is_started() {
        System.out.println("> Background: Check if browser is started");
    }
}
