import java.util.Scanner;
/**     Consider the calculation of n factorial defined as:
 *         n! = 1 × 2 × 3 × ... × n where n > 0 
 *      Use a while to calculate n! 
 *      Prompt the user for the value of n
 */
public class Ch3Q10
{
    public static void main(String[] args){
        int n = askUserForN();
        int originalN = n;
        int nFactorial = 1;
        while (n > 0){
            nFactorial = nFactorial * n;
            n = n-1;
        }
        System.out.println("The value of "
            +n
            +"! is: "
            +nFactorial);
    }

    public static int askUserForN(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter a value for n");
        int n = kb.nextInt();
        return n;
    }
}
