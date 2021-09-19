import java.util.*;

public class FancyMyName 
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter your first name and last name, seperated by a space.");
        String name = in.nextLine().toLowerCase().trim(); //converts user input into all lower case with not extra space before and after
        
        String firstName = (name.toUpperCase().charAt(0) + name.substring(1, name.indexOf(" "))); //finds your first name and converts the first letter to capital

        String lastName = (name.toUpperCase().charAt((name.lastIndexOf(" ") + 1)) + name.substring((name.lastIndexOf(" ") + 2), name.length()).trim()); //finds your last name and converts the first letter to capital

        String fullName = (firstName + " " + lastName);

        System.out.println("Entered name: "+ fullName);
        System.out.println("Your first name is " + firstName + ": has " + firstName.length() + " characters");
        System.out.println("Your first name is " + lastName + ": has " + lastName.length() + " characters");
        System.out.println("Your initials are: " + firstName.charAt(0) + lastName.charAt(0));

        in.close();
    }
}