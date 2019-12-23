package steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class StepDefinitions {

    @Given("^User is on NetBanking landing page$")
    public void userOnLandingPage() {
        System.out.println("navigated to login page");
    }

    @When("^User logs into the application with username and password$")
    public void userLogsIntoTheApplicationWithUsernameAndPassword() {
        System.out.println("user logs in");
    }


    @Then("^Homepage is populated$")
    public void homepageIsPoulated() {
        System.out.println("homepage is populated");
    }


    @And("^Cards are displayed$")
    public void cardsAreDisplayed() {
        System.out.println("cards are displayed");
    }

}
