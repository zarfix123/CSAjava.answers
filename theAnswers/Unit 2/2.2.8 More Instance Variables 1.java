public class Parakeet 
{
    private String name;
    private String color;
    // Add an instance variable here for color.
    
    public Parakeet(String birdsName, String birdcolor)
    {
        name = birdsName;
        color = birdcolor;
        
    }
    
    // This method should work after you add the
    // new instance variable and update the constructor.
    // DO NOT modify this method.
    public String toString()
    {
        return name + " is a " + color + " parakeet";
    }
}