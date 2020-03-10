package steps;

import cucumber.api.DataTable;
import cucumber.api.Format;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class CookbookStepDefinitions {

    @Given("^user is on Application home page$")
    public void user_is_on_Application_home_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(new Throwable() {
        }.getStackTrace()[0].getMethodName());
    }

    @When("^user enters username$")
    public void user_enters_username() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(new Throwable() {
        }.getStackTrace()[0].getMethodName());
    }

    @When("^user enters password$")
    public void user_enters_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(new Throwable() {
        }.getStackTrace()[0].getMethodName());
    }

    @When("^user clicks on login button$")
    public void user_clicks_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(new Throwable() {
        }.getStackTrace()[0].getMethodName());
    }

    @Then("^user gets a GitHub bootcamp section$")
    public void user_gets_a_GitHub_bootcamp_section() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(new Throwable() {
        }.getStackTrace()[0].getMethodName());
    }

    @When("^user focuses on GitHub Bootcamp Section$")
    public void user_focuses_on_GitHub_Bootcamp_Section() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(new Throwable() {
        }.getStackTrace()[0].getMethodName());
    }

    @Then("^user gets an option to setup git$")
    public void user_gets_an_option_to_setup_git() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(new Throwable() {
        }.getStackTrace()[0].getMethodName());
    }

    @When("^user focuses on Top Banner$")
    public void user_focuses_on_Top_Banner() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(new Throwable() {
        }.getStackTrace()[0].getMethodName());
    }

    @Then("^user gets an option of home page$")
    public void user_gets_an_option_of_home_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(new Throwable() {
        }.getStackTrace()[0].getMethodName());
    }

    @Given("^user is on Application landing page$")
    public void user_is_on_Application_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(new Throwable() {
        }.getStackTrace()[0].getMethodName());
    }

    @When("^user enters \"([^\"]*)\" in username field$")
    public void user_enters_in_username_field(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(new Throwable() {
        }.getStackTrace()[0].getMethodName());
    }

    @When("^user enters \"([^\"]*)\" in password field$")
    public void user_enters_in_password_field(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(new Throwable() {
        }.getStackTrace()[0].getMethodName());
    }

    @When("^user clicks on Signup for GitHub button$")
    public void user_clicks_on_Signup_for_GitHub_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(new Throwable() {
        }.getStackTrace()[0].getMethodName());
    }

    @Then("^user is successfully registered$")
    public void user_is_successfully_registered() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(new Throwable() {
        }.getStackTrace()[0].getMethodName());
    }

    @Given("^Sign in button is present on screen$")
    public void sign_in_button_is_present_on_screen() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(new Throwable() {
        }.getStackTrace()[0].getMethodName());
    }

    @When("^user clicks on Sign in button$")
    public void user_clicks_on_Sign_in_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(new Throwable() {
        }.getStackTrace()[0].getMethodName());
    }

    @Then("^user is displayed login screen$")
    public void user_is_displayed_login_screen() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(new Throwable() {
        }.getStackTrace()[0].getMethodName());
    }

    @When("^user clicks Sign in button$")
    public void user_clicks_Sign_in_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(new Throwable() {
        }.getStackTrace()[0].getMethodName());
    }

    @Then("^user is on home page$")
    public void user_is_on_home_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(new Throwable() {
        }.getStackTrace()[0].getMethodName());
    }

    @Then("^title of home page is \"([^\"]*)\"$")
    public void title_of_home_page_is(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(new Throwable() {
        }.getStackTrace()[0].getMethodName());
    }

    /* Convert data table
    @Then("^we verify following user exists$")
    public void we_verify_following_user_exists(DataTable userDetails) {
        List<List<String>> details = userDetails.raw();

        for (int i=0; i<details.size(); ++i) {
            for(int j=0; j<details.get(i).size(); ++j) {
                System.out.println(details.get(i).get(j));
            }
        }
    }*/

    public class User {
        public String name;
        public String email;
        public int phone;
    }

    @Then("^we verify following user exists$")
    public void we_verify_following_user_exists(List<User> userList) {
        for (User u : userList) {
            System.out.println(u.name);
            System.out.println(u.email);
            System.out.println(u.phone);
        }
    }

    @Then("^user gets login failed error message$")
    public void user_gets_login_failed_error_message() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(new Throwable() {
        }.getStackTrace()[0].getMethodName());
    }

    @Given("^I am available on \"([^\"]+)\"$")
    public void i_am_available_on(List<String> days) {
        for (String day : days)
            System.out.println(day);
    }

    @Then("^I( do not see| see) following dollars in my account$")
    public void i_see_or_do_not_see_following_dollars_in_my_account(String seeOrDoNotSee) {
        System.out.println(seeOrDoNotSee);
    }

    @Given("^(?:I have|He has|User has) following dollars in my account$")
    public void have_following_dollars_in_my_account() {
        // non capture groups are not available in step definition
        System.out.println(new Throwable() {
        }.getStackTrace()[0].getMethodName());
    }


    @Given("^user send a get request to \"([^\"]*)\"$")
    public void user_send_a_get_request_to(String arg1) {
        System.out.println(new Throwable() {
        }.getStackTrace()[0].getMethodName());
    }

    @Then("^user gets following response$")
    public void user_gets_following_response(DataTable actualUsers) {
        List<List<String>> expectedUsers = new
                ArrayList<>();
        expectedUsers.add(Arrays.asList("username", "age"));
        expectedUsers.add(Arrays.asList("sham", "25"));
        expectedUsers.add(Arrays.asList("ram", "26"));

        /* Use the diff method to differentiate two data tables */
        actualUsers.diff(expectedUsers);
    }

    @Given("^a book named \"(.*?)\" with following body$")
    public void a_book_named_with_following_body(String arg1, String arg2) {
        Assert.assertEquals("cucumber cookbook", arg1);
        System.out.println(arg1);
        System.out.println(arg2);
    }

    @Given("^I have a user account with (.*?) rights$")
    public void
    i_have_a_user_account_with_Manager_rights(String role) {
        //prints the role
        System.out.println(role);
    }

    @Then("^I should receive an email with the body:$")
    public void i_should_receive_an_email_with_the_body(String docString) {
        /* prints the content of Doc String with Scenario outlineSubstitution */
        System.out.println(docString);
    }

    @Given("^My Birthday is on \"(.*)\"$")
    public void my_Birthday_is_on(@Format("DD.mm.yyy") Date bDay)  {
        System.out.println("My birthday: " + bDay);
    }
}
