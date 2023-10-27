import java.util.Scanner;

public class BotTester
{
    public static void main(String[] args) {

        //Put your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String name = input.nextLine();
        
        Bot robot = new Bot(name);
        robot.greeting();
        System.out.println();
        robot.help();
        
        System.out.println();
        
        System.out.println("Tell me Bot, which countries use the imperial system?");
        robot.imperialCountries();
        System.out.println();
        System.out.println("Tell me Bot, what was the first computer bug?");
        robot.firstBug();
        System.out.println();
       
        robot.goodbye();
        System.out.println();
        
        
        
        
    }
}
