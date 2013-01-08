package com.tutorials.organization;

import com.tutorials.organization.NumberCruncher;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;

import cucumber.api.DataTable;
import java.util.ArrayList;
import java.util.List;

public class StatsStepDefs {

  private NumberCruncher cruncher;
  private double result;

  public StatsStepDefs() {
    cruncher = new NumberCruncher();
  }

  @When("^I compute the mean of the numbers:$")
  public void I_compute_the_mean_of_the_numbers(DataTable values) throws Throwable {
    //cucumber passes in the values as strings so
    //lets convert the strings to ints so our app
    //can do the calculation
    List<Integer> intValues = convertToInts(values);

    result = cruncher.getMean(intValues);
  }


  @When("^I compute the standard deviation of the numbers:$")
  public void I_compute_the_standard_deviation_of_the_numbers(DataTable values) throws Throwable {

    List<Integer> intValues = convertToInts(values);

    result = cruncher.getStDev(intValues);
  }

  /*
   * converts List<List<String>> from cucumber.api.DataTable
   * to List<Integers>. We are assuming a 1-D table of numbers
   *
   *  @param DataTable to be parsed
   *
   *  @return list of integers for the app
   */
  private List<Integer> convertToInts(DataTable values) {
    //initialize empty list
    List<Integer> intValues = new ArrayList<Integer>();

    //iterate through the values in the cells
    for (List<String> val : values.cells(1)) {
      //catch the exception so we can tell the user what went wrong
      try {
        //get the string value and parse it to an Integer
        Integer intVal = Integer.parseInt(val.get(0));
        //add the Integer to the list
        intValues.add(intVal);
      } catch (Exception e) {
        System.out.println("Error: Problem parsing '" + val.get(0) + "' to an Integer");
        e.printStackTrace();
      }//end catch block
    }//end for loop

    //return the populated list of Integer values
    return intValues;
  }


  @Then("^the result should be \"([^\"]*)\"$")
  public void the_result_should_be_(String expectedResultAsString) throws Throwable {
    //cucumber does not know how to handle double values because it is international
    //and some countries write one thousand as 1,000 while others write it as 1.000
    //so doubles need to be passed in as a string then converted to a double
    double expectedResult = Double.parseDouble(expectedResultAsString);

    //make sure the response from the app and the expected response are equal
    assertEquals(expectedResult, result, 0.001);
  }


}
