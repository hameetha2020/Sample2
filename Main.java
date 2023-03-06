package mvcexample;

/**
 *
 * @author savi
 */
// Launcher for application

public class Main {
   
    public static void main(String args[]) {
     
        Model model = new Model();               // Create shared database
        Controller1 c1 = new Controller1(model,"Welcome Screen"); // Create first controller
        Controller2 c2 = new Controller2(model,"Screen2"); // Create second controller
        Controller2 c3 = new Controller2(model,"Screen3"); 
        Controller2 c4 = new Controller2(model,"Screen4"); 

    } // main
  
} // Main
