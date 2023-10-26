import java.util.Scanner;
import java.lang.Math;

public class MovieRatings
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);
        System.out.println("Enter movie rating (as a decimal)");
        double rating = input.nextDouble();
        int ratingRounded = (int) Math.round(rating);
        System.out.println("Rating rounded: " + ratingRounded);
        
       
    }
}
