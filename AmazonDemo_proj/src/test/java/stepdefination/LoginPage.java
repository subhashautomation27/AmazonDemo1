package stepdefination;

import io.cucumber.java.en.*;

public class LoginPage {
	
	@Given("user is on amazon login page")
	public void user_is_on_amazon_login_page() {
	    System.out.println("user is on login page");
	}

	@When("user has to enter userName and password into fields")
	public void user_has_to_enter_user_name_and_password_into_fields() {
		System.out.println("user enters the username and password");
	    
	}

	@When("user clicks  on login button")
	public void user_clicks_on_login_button() {
		System.out.println("user clicks the login button");
	}

	@Then("user successfully logged .")
	public void user_successfully_logged() {
		System.out.println("user successfully login");
	   
	}


}
