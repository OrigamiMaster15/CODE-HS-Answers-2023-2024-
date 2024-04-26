public class WorkShift
{
    public static void main(String[] args)
    {
        // Start here
        int h = 20;
        int m = 42;
        int s = 16;
        
        m *= 60;
        h *= 60;
        h *= 60;
        
        int a = h + m + s;
        
        System.out.println("The doctor works a total of " + a + " seconds");
    }
}
