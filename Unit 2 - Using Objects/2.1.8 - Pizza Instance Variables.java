public class PizzaTester
{
    public static void main(String[] args)
    {
        System.out.println("You should be able to run this");
        System.out.println("if you added the instance variables correctly");
        
        Pizza myPizza = new Pizza (true, "pepperoni", "sausage", "bacon", 20);
    }
}
______________________________________________________________________________________________________
public class Pizza
{
    //add instance variables
    
    boolean pizzaglutenfree;
    String pizzatopping1;
    String pizzatopping2;
    String pizzatopping3;
    int pizzadiameter;
    
    public Pizza(boolean glutenfree, String topping1, String topping2, String topping3, int diameter){pizzaglutenfree = glutenfree; pizzatopping1 = topping1; pizzatopping2 = topping2; pizzatopping3 = topping3; pizzadiameter = diameter;}
}
