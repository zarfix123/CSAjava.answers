import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {

       // Start Here!
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String name = input.nextLine();
        Bot2 bot = new Bot2(name);
        bot.greeting();
        System.out.println();
        
        System.out.println("What is your favorite animal?");
        String animal = input.nextLine();
        bot.favoriteAnimal(animal);
        System.out.println();
        
        System.out.println("If you could visit any place, where would you go?");
        String place = input.nextLine();
        bot.destination(place);
        System.out.println();
        
        System.out.println("What is your favorite number?");
        int number = input.nextInt();
        bot.favoriteNumber(number);
        System.out.println();
        
        bot.goodbye();


        
           

    }
}
