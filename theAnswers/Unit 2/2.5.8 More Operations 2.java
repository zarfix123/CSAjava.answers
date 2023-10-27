import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two doubles");
        double double1 = input.nextDouble();
        input.nextLine();
        double double2 = input.nextDouble();
        Calculator calc = new Calculator();
        
        calc.add(double1, double2);
        calc.subtract(double1, double2);
        calc.multiply(double1, double2);
        calc.divide(double1, double2);
        
        // Put your code here
        // A good place to start is to
        // create comments like the last exercise
        // to remind yourself what you need to do
        
        //To get started, create a new Calculator object
    }
}
