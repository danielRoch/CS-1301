///////////////////////////////////////////////////////////////
// Solution to Homework 7 Question 1                         //
// Name: Daniel Rocehfort                                    //
// Lab time: Thursday 9:00am-10:40am                         //
// Program description: Asks the user for a date in month    //
//                      day, year format and converts it to  //
//                      day month year format.               //
///////////////////////////////////////////////////////////////

import java.util.*;

public class convertDate 
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter date to be converted: ");
        String date = in.nextLine().trim().toLowerCase();
        
        String month = ((date.toUpperCase().charAt(0)) + (date.substring(1, date.indexOf(" ")))); //takes the month's starting letter and capitalizes it and concatenates it with the rest of the month

        String day = (date.substring(((month.length() + 1)), (date.lastIndexOf(","))).trim()); //finds the day
        
        String year = (date.substring(date.lastIndexOf(" "), date.length()).trim()); //finds the year
        
        System.out.println("Converted date: " + day + " " + month + " " + year); //prints the converted date

        in.close();
    }
}