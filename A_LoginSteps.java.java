package StepDeinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class A_LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside Step - User is on Login Page ");
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		System.out.println("Inside Step - User is on Login Page ");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Inside Step - User clicks on Login Button ");
	}

	@Then("user is navidated to the home page")
	public void user_is_navidated_to_the_home_page() {
		System.out.println("Inside Step - User is navigate to the home page ");
	}

	@When("user enters invalid username and password")
	public void user_enters_invalid_username_and_password() {
		System.out.println("Inside Step - User is navigate to the home page ");
	}

	@Then("error message is shown - Invalid Credentials")
	public void error_message_is_shown_invalid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
}
