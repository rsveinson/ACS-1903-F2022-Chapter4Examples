import java.util.Scanner;
/**
 * Letter grade translated to a numeric grade.
 */
public class LetterGradeToNumericGrade
{
    public static void main(String[] args)
    {
        String grade;
        double nGrade;
        System.out.println("Enter letter grade:");
        Scanner kb = new Scanner(System.in);
        grade = kb.next();
        nGrade = convert (grade);
        System.out.println(grade+" --> "+nGrade);
        
    }
    public static double convert(String s){
        double num;
        switch (s) {
            case "A": num = 4.0;
                    break;
            case "B": num = 3.0;
                    break;
            case "C": num = 2.0;
                    break;
            case "D": num = 1.0;
                    break;
            default: num = 0.0;
        }
        return num;
    }
}
