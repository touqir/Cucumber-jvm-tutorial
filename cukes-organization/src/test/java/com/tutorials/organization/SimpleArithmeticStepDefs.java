package com.tutorials.organization;

import com.tutorials.organization.NumberCruncher;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;

public class SimpleArithmeticStepDefs {

  private NumberCruncher cruncher;
  private int result;

  public SimpleArithmeticStepDefs() {
    cruncher = new NumberCruncher();
  }

  @Given("^the number (\\d+)$")
  public void the_number(int number) throws Throwable {
    cruncher.setInitialNumber(number);
  }

  @When("^I add (\\d+)$")
  public void I_add(int number) throws Throwable {
    result = cruncher.add(number);
  }

  @When("^I subtract (\\d+)$")
  public void I_subtract(int number) throws Throwable {
    result = cruncher.subtract(number);
  }

  @When("^I multiply by (\\d+)$")
  public void I_multiply_by(int number) throws Throwable {
    result = cruncher.multiply(number);
  }

  @Then("^the result should be (\\d+)$")
  public void the_result_should_be(int expectedNumber) throws Throwable {
    assertEquals(expectedNumber,result);
  }

}
