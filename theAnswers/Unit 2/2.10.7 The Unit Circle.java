public class UnitCircle 
{
    public static void main(String[] args)
    {
        System.out.println("Radians: (cos, sin)");
        
        
        double angle1 = Math.PI/2;
        double cos1 = Math.cos(angle1);
        cos1 = Math.round(cos1*100)/100.0;
        double sin1 = Math.sin(angle1);
        cos1 = Math.round(cos1*100)/100.0;
        double angle2 = Math.PI;
        double cos2 = Math.cos(angle2);
        cos2 =  Math.round(cos2*100)/100.0;
        double sin2 = Math.sin(angle2);
        sin2 = Math.round(cos1*100)/100.0;
        
      
        double angle3 = 0;
        double cos3 = Math.cos(angle3);
        
        double sin3 = Math.sin(angle3);
        sin3 = Math.round(cos1*100)/100.0;
        
        System.out.println(angle3 + ": " + cos3 + ", " + sin3);
        
        
        System.out.println(angle1 + ": " + cos1 + ", " + sin1);
        System.out.println(angle2 + ": " + cos2 + ", " + sin2);

        
       

        // Put your code here!
    }
}
