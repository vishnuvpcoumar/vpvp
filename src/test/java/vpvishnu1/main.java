package vpvishnu1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class main {

@Given("I want to login")
public void i_want_to_login() {
	System.out.println("vp");
    
}

@Given("i give uname na dpswd")
public void i_give_uname_na_dpswd() {
	System.out.println("112");
  
}

@When("I complete action")
public void i_complete_action() {
	System.out.println("login");
   
}

@Then("homepage")
public void homepage() {
	System.out.println("Home");
    
}




}
