public class Extremes
{
    Integer min;
    Integer max;
    
    // Constructor
    public Extremes()
    {
        min = Integer.MIN_VALUE;
        max = Integer.MAX_VALUE;
        //Set min and max values 
    }
    
    // Returns the quotient
    // max / number
    public Integer maxQuotient(Integer number)
    {
        int value = max/number;
        return value;
    }

    // Returns the quotient
    // min / number
    public Integer minQuotient(Integer number1)
    {
        int value1 = min/number1;
        return value1;
    }
    
    // Returns a String representation
    // in the form
    // [min, max]
    public String toString()
    {
        return "[" + min + ", " + max + "]";   
    }
}
