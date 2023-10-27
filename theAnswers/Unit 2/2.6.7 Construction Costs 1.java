import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sales tax rate: ");
        double taxrate = input.nextDouble();
        input.nextLine();
        System.out.println("How many board do you need?");
        int boards = input.nextInt();
        input.nextLine();
        System.out.println("How many windows do you need?");
        int windows = input.nextInt();
        
        Construction work = new Construction(8, 11, taxrate);
        double lumbercost = work.lumberCost(boards);
        double windowcost = work.windowCost(windows);
        System.out.println("Total: " + (windowcost + lumbercost));
        double grandtotal = work.grandTotal(windowcost + lumbercost); 
        System.out.println("Grand Total: " + grandtotal);
        
        
    }
}
