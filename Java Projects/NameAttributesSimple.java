import java.util.*;

public class NameAttributesSimple 
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        boolean cont = true;
        while(cont)
        {
        System.out.println("Please enter your first name and last name, seperated by a space.");
        String name = in.nextLine().trim();
        
        String firstName = (name.substring(0, name.indexOf(" "))); //finds the first name

        String lastName = (name.substring((name.lastIndexOf(" ") + 1), name.length()).trim()); //finds the last name

        System.out.println("Hello their " + firstName + " I have you first name as " + firstName + ", which has " + firstName.length() + " characters");
        System.out.println("Hello again " + firstName + " I have you last name as " + lastName + ", which has " + lastName.length() + " characters");
        System.out.println("Did you know that you initials are " + firstName.charAt(0) + lastName.charAt(0));

        System.out.println("Do you wish to continue (Y)Yes or (N)No ?");
        String response = in.nextLine().trim();
        
        if (response.equalsIgnoreCase("n") == true) //tests if you would like to continue or not
        {
            cont = false;
            System.out.println("You said you did not want to play again, goodbye");
        } else {
            System.out.println("You said you want to play again, hello");
            System.out.println("");
        }

        }
        in.close();
    }
}