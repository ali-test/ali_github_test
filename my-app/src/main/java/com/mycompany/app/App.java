package com.mycompany.app;

/**
 * Hello world!
 * comment 1
 * comment 2
 * comment 3 
 * requirement 1
 * requirement 1    
 *
 */
public class App {

    public static final String HELLO = "Hello World!";
        
    public String sayHello() {
        String hello = HELLO;
        System.out.println(hello);
        return hello;  
    }
    
    public String sayGoAway() {
      return "Go away, jjj";
    }
}
