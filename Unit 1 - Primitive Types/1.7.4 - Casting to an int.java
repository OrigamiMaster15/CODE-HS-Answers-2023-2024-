import java.util.Scanner;

public class CastingToInt
{
    public static void main(String[] args)
    {
        //Asks the user for a double variable called myDouble with a decimal value
        //Casts the double value to an int
        //Prints the int value to the screen
        //NOTE: Your job is to print the int casted version of the double.
        
        double myDouble;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a double with a decimal value: ");
        
        myDouble = input.nextDouble();
        int castingNum = (int)myDouble;
        System.out.println(castingNum);
    }
}
