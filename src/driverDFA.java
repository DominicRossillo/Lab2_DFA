import java.util.Scanner;

/**
 * file: driverDFA.java
 * author: Dominic Rossillo
 * course: CMPT 440
 * assignment: Lab2
 * due date: Feb 15
 * version: 1
 * 
 * This file contains the front end for a DFA allowing a user
 * to input a string and find out weather it is a valid input 
 * for the given DFA.
 */


/**
 * driverDFA
 *
 * This class is used to act as a front end for the 
 * ManWolf.java class using a class call of man wolf when the user clicks on 
 * a button.
 * It also has text filed that 
 * 
 * 
 *   
 * 
 */


//this class hold the details for the Jframe which is used for the user to 
//interact with to enter the string to test with the dfa
public class driverDFA {
  private static String testString;
  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    System.out.println("Enter a sequence of W G C N:");
    testString = s.next();
    try{
    ManWolf.reset();
    ManWolf.process(testString);
    }
    catch(Exception e) {
      e.printStackTrace();
    }
    if(ManWolf.accepted() == true){
        System.out.println("This statement works for the problem");
        System.out.println();
       
        }
    else  {System.out.print("This Statement does not work for the problem");
        
    }
  }

}


