import java.util.Scanner;

public class CastingToDouble
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int int1;
        int int2;
        
        System.out.println("First int: ");
        int1 = input.nextInt();
        input.nextLine();
        
        System.out.println("Second int: ");
        int2 = input.nextInt();
        
        
        double intDivide = (double)int1 / (double)int2;
        System.out.println(intDivide);
    }
}
