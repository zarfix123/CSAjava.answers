public class WorkShift
{
    public static void main(String[] args)
    {
        // Start here
        int hrs = 20;
        int minutes = 42;
        double totalSeconds = (hrs *= 3600) + (minutes *= 60) + 16;
        System.out.print(totalSeconds);
    }
}
