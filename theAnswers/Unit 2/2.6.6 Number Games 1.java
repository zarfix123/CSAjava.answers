public class GamesTester
{
    public static void main(String[] args)
    {
        NumberGames game = new NumberGames(5);
        
        
        // Square the numbers
        // Print it out
        double square = game.squareNumber();
        System.out.println(square);
        // Double the number
        // Print it out
        double doublen = game.doubleNumber();
        System.out.println(doublen);
        
        // Square the number again
        // Print it out
        double square2 = game.squareNumber();
        System.out.println(square2);
        // Get the number and store the value
        // Print out your stored value 
        double currentnum = game.getNumber();
        System.out.println(currentnum);
        // Get the number again then store and print
        // the value
        double currentnum1 = game.getNumber();

        System.out.println(currentnum1);

        
    }
}
