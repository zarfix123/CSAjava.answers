import java.util.Scanner;

public class SalutationsTester
{
    public static void main(String[] args)
    {
        // Test your class here
        System.out.println("Whats ur name");
        Scanner input = new Scanner(System.in);
        
        String yourName = input.nextLine();
        Salutations thing = new Salutations(yourName);
        thing.signMemo();
        thing.addressLetter();
        thing.signLetter();
        thing.addressMemo();
        
    }
}
