package com.tutorials.organization;

import com.tutorials.organization.Greeter;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;

public class GreetingStepDefs {

  private Greeter Greeter;
  private String appResponse;

  @Given("^my name is \"([^\"]*)\"$")
  public void my_name_is(String userName) throws Throwable {
    //create a new Greeter instance
    //with the user name from the feature file
    Greeter = new Greeter(userName);
  }


  @When("^I ask my app to say hi$")
  public void I_ask_my_app_to_say_hi() throws Throwable {
    //call method sayHi() and save the response
    //in the appResponse variable
    appResponse = Greeter.sayHi();  
  }

  @When("^I ask my app to say hi in French$")
  public void I_ask_my_app_to_say_hi_in_French() throws Throwable {
    //call the method to say hi in french
    appResponse = Greeter.sayHiInFrench();
  }

  @When("^I ask my app to say hi in Russian$")
  public void I_ask_my_app_to_say_hi_in_Russian() throws Throwable {
    //call the method to say hi in russian
    appResponse = Greeter.sayHiInRussian();
  }

  @When("^I ask my app to say hi in Spanish$")
  public void I_ask_my_app_to_say_hi_in_Spanish() throws Throwable {
    appResponse = Greeter.sayHiInSpanish();
  }

  @Then("^it responds with \"([^\"]*)\"$")
  public void it_responds_with(String expectedResponse) throws Throwable {
    //verify the appResponse equals the expected Response
    //from the feature file
    assertEquals(expectedResponse, appResponse);
  }

  
}
