import java.util.Scanner;

public class FractionTester
{
    public static void main(String[] args)
    {
        // Create objects
        Fraction frac1 = new Fraction(1, 2);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numerator:");
        int numerator = input.nextInt();
        System.out.println("Enter the denominator:");
        int denominator = input.nextInt();
        // Create a new Fraction with the user's input
        Fraction frac = new Fraction(numerator, denominator);
        // Add the fractions
        // Make use of the getDenominator and getNumerator methods
        int numerAnswer = (frac.getNumerator() * frac1.getDenominator()) + (frac.getDenominator() * frac1.getNumerator());
        int denomAnswer = (frac.getDenominator() * frac1.getDenominator());
        
        Fraction answer = new Fraction(numerAnswer, denomAnswer);
        
        String fraction = frac.toString();
        String fraction1 = frac1.toString();
        String answer1 = answer.toString();
        
        System.out.println(fraction1 + " + " + fraction + " = " + answer1);
        
        // Print out the fractions as an equation
        // Remember you don't have to call toString yourself!
        
        
    }
}
