package com.tutorials.organization;

/**
 * This class is responsible for greeting
 * and prompting the user
 */
public class Greeter {

    private String username;

    public Greeter(String userName) {
      this.username = userName;
    }

    public String sayHi() {
      return "Hi " + username;
    }

   public String sayHiInFrench() {
     return "Bonjour " + username;
   }

   public String sayHiInRussian() {
     return "привет " + username;
   }

  public String sayHiInSpanish() {
    return "Hola " + username;
  }
}
