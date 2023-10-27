import java.util.Scanner;

public class WordGameTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for a word
        WordGames word = new WordGames("turtle");
        
        // Scramble it
        String scrambled = word.scramble();
        
        // Print out scrambled word
        System.out.println(scrambled);
       
        System.out.println("Enter an integer: ");
        int idx = input.nextInt();
        input.nextLine();  // skip over the newline
        System.out.println("Enter another word: ");
        String word1 = input.nextLine();
        
        String concatword = word.bananaSplit(idx, word1);
        
        
        // Add random word at index
        
        // Print out the word
        System.out.println(concatword);
        
        // Ask for a character (store as a String)
        System.out.println("give me a random character: ");
        String chara = input.nextLine();
        // Ask for random word
        System.out.println("give me another word: ");
        String word2 = input.nextLine(); 
        // Add random word at character
        String charword = word.bananaSplit(chara, word2);
        // Print out the word
        System.out.println(charword);
        
        
        
        
    }
}
