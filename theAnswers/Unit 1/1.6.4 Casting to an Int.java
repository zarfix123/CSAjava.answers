import java.util.Scanner;

public class CastingToInt
{
    public static void main(String[] args)
    
    {
        // Start here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a double: ");
        double user = input.nextDouble();
        System.out.println(user);
        System.out.println((int)user);
        user += 0.5;
        System.out.println(user);
        System.out.println((int)user);
        
    }
}
