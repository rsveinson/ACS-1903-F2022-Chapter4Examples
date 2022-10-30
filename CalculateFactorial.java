import java.util.Scanner;
/**     Consider the calculation of n factorial defined as:
 *         n! = 1 × 2 × 3 × ... × n where n > 0 
 *      Use a while to calculate n! 
 *      Prompt the user for the value of n
 */
public class CalculateFactorial
{
    public static void main(String[] args){
        // *** variables
        int n = 0;          // this is the number used to calculate factotia
        int originalN = n;  // keep track of the original number
        int nFactorial = 1; // this is the factorials of n
        
        // *** get some intput
        n = askUserForN();      // call the method to get the input
        
        // Calculate the factorial
        while (n > 0){
            nFactorial = nFactorial * n;
            n = n-1;
        }// end while
        
        // print the result
        System.out.println("The value of "
            +n
            +"! is: "
            +nFactorial);
    }// end main

    public static int askUserForN(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter a value for n");
        int n = kb.nextInt();
        return n;
    }// end get input
}// end class
