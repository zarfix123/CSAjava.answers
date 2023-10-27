import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter two doubles");
        double double1 = input.nextDouble();
        input.nextLine();
        double double2 = input.nextDouble();

        double sumlol = calc.sum(double1, double2);
        double multiply = calc.multiply(double1, double2);
        double divide = calc.divide(double1, double2); 
        double subtractlol = calc.subtract(double1, double2);
        
        System.out.println(double1 + " + " + double2 + " = " + sumlol);
        System.out.println(double1 + " - " + double2 + " = " + subtractlol);
        System.out.println(double1 + " * " + double2 + " = " + multiply);
        System.out.println(double1 + " / " + double2 + " = " + divide);
        // A good place to start is ton
        // create comments to remind yourself 
        // what you need to do
    }
}
