package travisplanner;
/**
 *
 * @author tbowlby
 */
import java.util.Scanner;

public class TravisPlanner 
{
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] schoolData = {2890, 6, 12};
        //schoolData[0] = tuition, in dollars, per one term
        //schoolData[1] = months per term
        //schoolData[2] = minimum credits per term
        int creditUnits = 0;
        int classCredits;        
        int unitsPerTerm;
        int totalTerms;
        
        boolean valid = false;
        unitsPerTerm = 0;
        while (!valid)
        {
           System.out.print("How many units do you plan to complete "
                   + "per term (minimum of 12): ");
           unitsPerTerm = in.nextInt();
           if (unitsPerTerm >= 0) { valid = true; }
           else { System.out.println("Units in term must be positive. "
                   + "Try again."); }
        }
                
        do
        {
        System.out.print("If you have no remaining courses, enter 0. \n"
                + "Otherwise, enter the number of credits for your next "
                + "course: ");
        classCredits = in.nextInt();
        creditUnits = creditUnits + classCredits;
        
        } while(classCredits != 0 );
        
        if (creditUnits % unitsPerTerm == 0)
            {
            totalTerms = (creditUnits / (unitsPerTerm));
            }
        else
            {
            totalTerms = (creditUnits / unitsPerTerm) + 1;
            }
               
        String totalTuitionGreeting = "Your total estimated tuition is: ";
        int totalTuition = totalTerms * schoolData[0];
        int monthsToComplete = totalTerms * schoolData[1];
        //OUTPUT - Accurate number of terms to completion (rounded up)
        System.out.printf("It will take %d terms to complete"
                + " your program.\n", totalTerms);
        //OUTPUT - Accurate tuition cost based on number of terms to completion
        System.out.printf("Your total tuition is $ %d \n", totalTuition);
        //OUTPUT - Accurate number of months to completion
        System.out.printf("It will take %d months to complete"
                + " your program.\n", monthsToComplete);
           }
}
