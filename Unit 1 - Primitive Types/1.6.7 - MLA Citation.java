import java.util.Scanner;
public class Citation
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
String stringName;
int numYear;
String stringTitle;
String stringPublisher;


System.out.println("Enter the author's name as 'Last name, First name': ");
stringName = input.nextLine();

System.out.println("Enter the year the book was published: ");
numYear = input.nextInt();
input.nextLine();

System.out.println("Enter the title of the book: ");
stringTitle = input.nextLine();

System.out.println("Enter the publisher of the book: ");
stringPublisher = input.nextLine();


System.out.println(stringName + ". " + stringTitle + ".");
System.out.println(stringPublisher + ", " + numYear + ".");
}
}
