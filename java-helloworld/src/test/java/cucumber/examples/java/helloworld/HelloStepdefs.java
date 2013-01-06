package cucumber.examples.java.helloworld;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

/*
 * this class is the glue code that
 * connects the regex from the feature 
 * file to the application source code
 * in the Hello.java class
 */
public class HelloStepdefs {

    /* 
     * this Hello object is the
     * object that will need to be
     * held in memory so that it can be 
     * passed between the below methods
     */
    private Hello hello;

    /* 
     * this string is the response from 
     * the application from method 'I_ask_it_to_say_hi()'
     * that needs to be held in memory
     * so that it can be verified against 
     * the 'expectedHi' string passed in
     * from the feature file in the last method
     */
    private String hi;


    /*
     * first 'glue code' method that instaites a new hello
     * object and sets its greeting variable to the greeting
     * in quotes from the given step in the feature file
     */
    @Given("^I have a hello app with \"([^\"]*)\"$")
    public void I_have_a_hello_app_with(String greeting) {
        hello = new Hello(greeting);
    }

    /*
     * the below method calls the method sayHi() from the 
     * Hello.java class. Recall from Hello.class
     * source file that this method will cancatenate
     * the greeting passed in from the constructor with
     * the string 'World'.  This new string is what gets
     * set to this class' private String hi in the below
     * method
     */
    @When("^I ask it to say hi$")
    public void I_ask_it_to_say_hi() {
        hi = hello.sayHi();
    }

    /*
     * this method verifies the expected response from
     * the 'then' step in the feature file with the 
     * response from the application using the JUnit
     * function assertEquals. Which will fail if the 
     * two strings are not equal
     */
    @Then("^it should answer with \"([^\"]*)\"$")
    public void it_should_answer_with(String expectedHi) {
        assertEquals(expectedHi, hi);
    }
}

