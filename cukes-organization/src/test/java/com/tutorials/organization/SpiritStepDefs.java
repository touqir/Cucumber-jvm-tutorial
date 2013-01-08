package com.tutorials.organization;

import com.tutorials.organization.Greeter;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.DataTable;
import cucumber.runtime.PendingException;
import static org.junit.Assert.assertEquals;

public class SpiritStepDefs {

  @Given("^the following spirits are in stock:$")
  public void the_following_spirits_are_in_stock(DataTable data) throws Throwable {
    // Express the Regexp above with the code you wish you had
    // For automatic conversion, change DataTable to List<YourType>
    throw new PendingException();
  }

  @When("^the user asks for the spirit\\(s\\):$")
  public void the_user_asks_for_the_spirit_s_(DataTable data) throws Throwable {
    // Express the Regexp above with the code you wish you had
    // For automatic conversion, change DataTable to List<YourType>
    throw new PendingException();
  }

  @Then("^the following should be displayed:$")
  public void the_following_should_be_displayed(DataTable data) throws Throwable {
    // Express the Regexp above with the code you wish you had
    // For automatic conversion, change DataTable to List<YourType>
    throw new PendingException();
  }

}
