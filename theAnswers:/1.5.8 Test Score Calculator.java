import java.util.Scanner;

public class Scores
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first test name: ");
        String firstTest = input.nextLine();
        System.out.print("Please enter the first test score: ");
        double firstScore = input.nextDouble();
        input.nextLine();
        System.out.print("Please enter the second test name: ");
        String secondTest = input.nextLine();
        System.out.print("Please enter the second test score: ");
        double secondScore = input.nextDouble();
        input.nextLine();
        System.out.print("Please enter the third test name: ");
        String thirdTest = input.nextLine();
        System.out.print("Please enter the third test score: ");
        double thirdScore = input.nextDouble();
        input.nextLine();
        double Average = (firstScore + secondScore + thirdScore) / 3;
        System.out.println("Your average score is: " + Average);
        
    }
}
