public class DogTester 
{
    public static void main(String[] args) 
    {
        Dog golden = new Dog("Golden Retriever", "Sammy");
        System.out.println(golden);
    }
}
_____________________________________________________________________________________________
public class Dog 
{
    private String breed;
    // Add an instance variable here for name.
    private String name;
    public Dog(String theBreed, String theName) { breed = theBreed; name = theName; }
    
    public Dog(String theBreed)
    {
        breed = theBreed;
    }
    
    // This method should work after you add the
    // new instance variable and update the constructor.
    // DO NOT modify this method.
    public String toString()
    {
        return name + " is a " + breed;
    }
}
