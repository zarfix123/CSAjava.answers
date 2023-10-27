public class Pinata
{
    // Instance variables
    private String candy;    // what kind of candy is inside
    private String color;    
    private String shape;
    
    // Constructor without parameters
    public Pinata()
    {
        candy = "hard candy";
        color = "rainbow";
        shape = "donkey";
    }
    
    // Add an overloaded constructor that allows the user
    // to customize all of the instance variables
    public Pinata(String Candyinput, String colorinput, String shapeinput)
    {
        candy = Candyinput;
        color = colorinput;
        shape = shapeinput;
    }
    // Add an overloaded constructor that allows the user
    // to customize the color and shape
    
    public Pinata(String colorinput, String shapeinput)
    {
        candy = "hard candy";
        color = colorinput;
        shape = shapeinput;
    }
    
    
    // Add an overloaded constructor that allows the user
    // to customize the candy
    
    
    public Pinata(String candyinput)
    {
        candy = candyinput;
        color = "rainbow";
        shape = "donkey";
    }
    
    public String toString()
    {
        return color + " " + shape + " pinata filled with " + candy;
    }
}
