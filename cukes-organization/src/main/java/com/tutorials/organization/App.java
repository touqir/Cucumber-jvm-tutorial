package com.tutorials.organization;

import java.lang.StringBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class is the main method and
 * uses the production classes to create
 * the app
 */
public class App {

  public static void main(String args[]) {

    String welcomeMessage = buildWelcomeMessage();
    System.out.println(welcomeMessage);

    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("To login Please enter your name:");
      String usn = reader.readLine();

      //use greeter class to say hi
      Greeter greeter = new Greeter(usn);
      String personalGreeting = greeter.sayHi();
      //add a little more formatting and print login response
      System.out.println();
      System.out.println("       " + personalGreeting + "!!");
      System.out.println();

    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("Goodbye.");
  }

  private static String buildWelcomeMessage() {
    StringBuilder builder = new StringBuilder();
    String tab = "        ";
    String starRow  = "************************************";
    String emptyRow = "*                                  *";
    builder.append("\n");
    builder.append(tab).append(starRow).append("\n");
    builder.append(tab).append(emptyRow).append("\n");
    builder.append(tab).append("*   Welcome to the Spirits Store   *").append("\n");
    builder.append(tab).append(emptyRow).append("\n");
    builder.append(tab).append(starRow).append("\n\n");

    return builder.toString();
  }
}
