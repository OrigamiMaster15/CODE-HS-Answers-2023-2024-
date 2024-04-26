import java.util.*;

public class NightOut
{
    public static void main(String[] args)
    {
        double numDinner;
        double numGolf;
        double numDessert;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("How much did dinner cost?");
        numDinner = input.nextDouble();
        
        System.out.println("How much is mini-golf for one person?");
        numGolf = input.nextDouble();
        
        System.out.println("How much did dessert cost?");
        numDessert = input.nextDouble();
        
        System.out.println("Dinner: $" + numDinner);
        System.out.println("Mini-Golf: $" + numGolf);
        System.out.println("Dessert: $" + numDessert);
        
        double numTotal = numDinner + (numGolf * 2) + numDessert;
        System.out.println("Grand Total: $" + numTotal);
    }
}
