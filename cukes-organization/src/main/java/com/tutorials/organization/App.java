package com.tutorials.organization;

/**
 * Hello world!
 *
 */
public class App 
{
    private String username;

    public App(String userName) {
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
}
