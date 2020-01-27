package steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

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


    @Then("^Homepage is populated$")
    public void homepageIsPoulated() {
        System.out.println("homepage is populated");
    }


    @Then("^Cards are displayed: \"([^\"]*)\"$")
    public void cardsAreDisplayed(String arg) {
        System.out.println("cards are displayed: " + arg);
    }

}
