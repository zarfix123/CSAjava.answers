public class FallingBodies
{
    public static void main(String[] args)
    {
        // Start here!
        // grav = 9.8 m/s
        // h = 0.5 * grav * time^2
        // veloc = grav * time
        
        double grav = 9.8;
        double time = 23;
        
        double height = 0.5 * grav * (time * time);
        System.out.println("The height of the waterfall is: " + height + " meters");
        
        
        double velocity = grav * time;
        System.out.println("The velocity of the pebble when it hits the ground is: " + velocity + " m/s");
        
        
        
    }
}
