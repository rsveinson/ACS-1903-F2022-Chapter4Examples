import java.util.Scanner;

/* *******************************
 * name:    Sveinson
 * Class:   ACS-1903
 * 
 * Assignment:  Static Methods Re-factor example
 ************************************/
public class ACS1903Ch4RefactorExampleKey{
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
    
        prompt = "Enter one side length the triangle.";
        //System.out.println(prompt);
        
        // read in sides
        sideA = getSide(prompt, scanner);
        sideB = getSide(prompt, scanner);
    
    // **** pocessing ****

        // use pythagoras to find the length of the hypotenuse
        hypotenuse = getHypotenuse(sideA, sideB);
    
    // **** output ****
    
        printResult(sideA, sideB, hypotenuse);
    
    // **** closing message ****
    
        System.out.println("end of program.");
    
    }//end main
    
    // ** static methods **
    
    public static void printResult(int sideA, int sideB, double hypotenuse){
        System.out.println("\n*****************************");
        System.out.println("Results:\n");
        System.out.println("Triangle ABC");
        System.out.println("with sides: " + sideA + " and " + sideB);
        System.out.println("Has Hypotenuse: " + hypotenuse + "\n");
    }// end preint result
    
    public static double getHypotenuse(int sa, int sb){
        return Math.sqrt((sa * sa) + (sb * sb));
    }// end get Hypotenuse
    
    public static int getSide(String prompt, Scanner scanner){
        int side;
        
        System.out.println(prompt);
        side = scanner.nextInt();
        
        return side;
    }//end getSide

}// end class
