import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        // your code here.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the latitude of the starting location: ");
        double stLat = input.nextDouble();
        System.out.print("Enter the longitude of the starting location: ");
        double stLong = input.nextDouble();
        System.out.print("Enter the latitude of the ending location: ");
        double endLat = input.nextDouble();
        System.out.print("Enter the longitude of the ending location: ");
        double endLong = input.nextDouble();
        
        GeoLocation loc = new GeoLocation(stLat, stLong);
        GeoLocation loc1 = new GeoLocation(endLat, endLong);
        
        
        double distance = loc.distanceFrom(loc1);
        System.out.println("The distance is " + distance + " miles.");
        
    }
}
