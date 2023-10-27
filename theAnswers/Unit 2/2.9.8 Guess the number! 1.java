import java.util.Scanner;
import java.lang.*;

public class ExtremeMain
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Create an Extremes object
        
        Extremes lol = new Extremes();
        // Ask the user to guess the maximum value of an Integer
        System.out.println("What do you think the maximum integer value is? ");
        int number1 = input.nextInt();
        input.nextLine();
        
        // Compute and display what they'd need to multiply by
        // to reach the maximum number
        int multiply = lol.maxQuotient(number1);
        
        System.out.println("You'd need to multiply your number by " + multiply + " to reach the max value! ");
        
        // Ask the user to guess the minimum value of an Integer
        System.out.println("What do you think the minimum integer value is? ");
        
        int number2 = input.nextInt();
        // Compute and display what they'd need to multiply by
        int negative = lol.minQuotient(number2);
        
        System.out.println("You'd need to mulitply your number by " + negative + " to reach the min value!");
        // to reach the minimum number

    }
}
