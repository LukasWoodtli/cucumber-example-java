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

    @Then("^Homepage is populated$")
    public void homepageIsPopulated() {
        System.out.println("homepage is populated");
    }


    @Then("^Cards are displayed: \"([^\"]*)\"$")
    public void cardsAreDisplayed(String arg) {
        System.out.println("cards are displayed: " + arg);
    }

}
