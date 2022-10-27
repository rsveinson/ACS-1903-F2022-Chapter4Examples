import java.util.Scanner;

/* *******************************
 * name:    Sveinson
 * Class:   ACS-1903
 * 
 * Assignment:  Static Methods Re-factor example
 ************************************/
public class ACS1903Ch5RefactorExample{
    public static void main(String[] args){
    // **** constants ****
    
    // **** variables ****
        String prompt;
        int sideA = 0;      // sides of the triangle
        int sideB = 0;
        
        double hypotenuse = 0.0;    // the hypotenuse
    
    // **** objects ****
    
        Scanner scanner = new Scanner(System.in);

    
    // **** input ****
    
        prompt = "Enter side a and side b of the triangle.";
        System.out.println(prompt);
        
        // read in sides
        sideA = scanner.nextInt();
        sideB = scanner.nextInt();
        
        // echo
        System.out.println("the sides are: " + sideA + " and " + sideB + "\n");
    
    // **** pocessing ****

        // use pythagoras to find the length of the hypotenuse
        hypotenuse = Math.sqrt((sideA * sideA) + (sideB * sideB));
        
        //System.out.println(hypotenuse);
    
    // **** output ****
    
        System.out.println("\n*****************************");
        System.out.println("Results:\n");
        System.out.println("Triangle ABC");
        System.out.println("with sides: " + sideA + " and " + sideB);
        System.out.println("Has Hypotenuse: " + hypotenuse + "\n");
    
    // **** closing message ****
    
        System.out.println("end of program.");
    
    }//end main

}// end class
