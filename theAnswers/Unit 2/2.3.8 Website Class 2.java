public class WebsiteTester
{
    public static void main(String[] args)
    {
        // Start here!
        Website Website1 = new Website();
        System.out.println(Website1);
        Website Website2 = new Website("edu", "goodSchool");
        System.out.println(Website2);
        Website Website3 = new Website("com", "codehs", 1000000);
        System.out.println(Website3);
        
    }
}
