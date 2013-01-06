package cucumber.examples.java.helloworld;

public class Hello {
    /*
     * this variable will hold a greeting
     * string passed in from the user
     */
    private final String greeting;

    /*
     * this constructor sets the greeting
     * variable for this instiated Hello object
     */
    public Hello(String greeting) {
        this.greeting = greeting;
    }

    /*
     * this method returns the greeting
     * string cancatenated with the string 'World'
     */
    public String sayHi() {
        return greeting + " World";
    }
}
