package com.tutorials.organization;

import com.tutorials.organization.App;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;

public class GreetingStepDefs {

  private App app;
  private String appResponse;

  @Given("^my name is \"([^\"]*)\"$")
  public void my_name_is(String userName) throws Throwable {
    //create a new app instance
    //with the user name from the feature file
    app = new App(userName);
  }


  @When("^I ask my app to say hi$")
  public void I_ask_my_app_to_say_hi() throws Throwable {
    //call method sayHi() and save the response
    //in the appResponse variable
    appResponse = app.sayHi();  
  }

  @When("^I ask my app to say hi in French$")
  public void I_ask_my_app_to_say_hi_in_French() throws Throwable {
    //call the method to say hi in french
    appResponse = app.sayHiInFrench();
  }

  @When("^I ask my app to say hi in Russian$")
  public void I_ask_my_app_to_say_hi_in_Russian() throws Throwable {
    //call the method to say hi in russian
    appResponse = app.sayHiInRussian();
  }

  @Then("^it responds with \"([^\"]*)\"$")
  public void it_responds_with(String expectedResponse) throws Throwable {
    //verify the appResponse equals the expected Response
    //from the feature file
    assertEquals(appResponse, expectedResponse);
  }

  
}
