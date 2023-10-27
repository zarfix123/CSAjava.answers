import java.util.Scanner;

public class HelloTester
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();
        Hello program = new Hello(userName);
        program.english();
        program.spanish();
        program.german();
        

    }
}
