import java.util.Scanner;

public class fullName
{
    public static void main(String [] args)
    {
        WholeName(null, null);
    }

    public static void WholeName(String first, String last)
    {
        Scanner Name = new Scanner(System.in);
        System.out.print("Please enter your full name: ");
        
        first = Name.next();
        last = Name.next();

        System.out.println("Your name in reverse order: " + last + ", " + first);

        Name.close();
    }
}