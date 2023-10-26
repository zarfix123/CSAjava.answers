import java.util.*;

public class NightOut
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Start here!
        System.out.println("How much does dinner usually cost?");
        double dinCost = input.nextDouble();
        System.out.println("How much is laser tag for one person?");
        double lsrtag = input.nextDouble();
        System.out.println("How much does a triple scoop cost?");
        double icecream = input.nextDouble();
        System.out.println("");
        double dinnertotal = (dinCost + (dinCost * 2));
        System.out.println("Dinner: $" + dinnertotal);
        double lasertotal = (lsrtag * 2);
        System.out.println("Laser Tag: $" + lasertotal);
        double icetotal = (icecream + (icecream / 3));
        System.out.println("Ice cream: $" + icetotal);
        System.out.print("Grand Total: $" + (lasertotal + dinnertotal + icetotal));
    }
}
