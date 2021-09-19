////////////////////////////////////////////////////////////////
// Solution to Homework 7 Question 2                          //
// Name: Daniel Rocehfort                                     //
// Lab time: Thursday 9:00am-10:40am                          //
// Program description: Asks the user their name seperated by //
//                      a space then tells them their first   //
//                      name and how many characters it has.  //
//                      Then tells them their last name and   //
//                      how many characters it has, followed  //
//                      by their initials. Then it asks if    //
//                      the user would like to continue and   //
//                      if the user enters "y", capital or    //
//                      lowercase, then it continue and if    //
//                      they enter "n", capital or lowercase, //
//                      then it stops.                        //
////////////////////////////////////////////////////////////////

import java.util.*;

public class NameAttributes 
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        boolean cont = true;
        while(cont)
        {
        boolean valid = true;
        System.out.println("Please enter your first name and last name, seperated by a space.");
        String name = in.nextLine().toLowerCase().trim(); //converts user input into all lower case with not extra space before and after
        
        String firstName = (name.toUpperCase().charAt(0) + name.substring(1, name.indexOf(" "))); //finds your first name and converts the first letter to capital

        String lastName = (name.toUpperCase().charAt((name.lastIndexOf(" ") + 1)) + name.substring((name.lastIndexOf(" ") + 2), name.length()).trim()); //finds your last name and converts the first letter to capital

        System.out.println("Hello their " + firstName + " I have you first name as " + firstName + ", which has " + firstName.length() + " characters");
        System.out.println("Hello again " + firstName + " I have you last name as " + lastName + ", which has " + lastName.length() + " characters");
        System.out.println("Did you know that you initials are " + firstName.charAt(0) + lastName.charAt(0));

        while(valid) //loop to make sure you enter a "y" or a "n" of either upper or lower case
        {
        System.out.println("Do you wish to continue (Y)Yes or (N)No ?");
        String response = in.nextLine().trim();
        
        if (response.equalsIgnoreCase("n") == true)
        {
            valid = false;
            cont = false;
            System.out.println("You said you did not want to play again, goodbye");
        } else if(response.equalsIgnoreCase("y") == true) {
            System.out.println("You said you want to play again, hello");
            System.out.println("");
            valid = false;
        } else {
            System.out.println("That is an invalid response.");
        }

        }
        }
        in.close();
    }
}