//////////////////////////////////////////////////////////////
// Solution to Homework 5 Program 2                         //
// Name: Daniel Rocehfort                                   //
// Lab time: Thursday 9:00am-10:40am                        //
// Program description: Prints out the word form of a number//
//                      ranging from 1 to 10 and tells the  //
//                      user if the number is even using    //
//                      switch cases.                       //
//////////////////////////////////////////////////////////////

import java.util.Scanner;

public class PrintNumberToWordie2
{
    public static void main(String [] args)
    {
        try{
            Scanner numIn = new Scanner(System.in);
            System.out.print("Please type a number equal to or between 1 and 10. ");

            int num = numIn.nextInt();
            System.out.println("You entered: " + num);

            switch(num) {
            case 1:
                System.out.println("ONE");
                break;
            
            case 2:
                System.out.println("TWO");
                break;
            
            case 3:
                System.out.println("THREE");
                break;
            
            case 4:
                System.out.println("FOUR");
                break;
            
            case 5:
                System.out.println("FIVE");
                break;
            
            case 6:
                System.out.println("SIX");
                break;
            
            case 7:
                System.out.println("SEVEN");
                break;
            
            case 8:
                System.out.println("EIGHT");
                break;
            
            case 9:
                System.out.println("NINE");
                break;
            
            case 10:
                System.out.println("TEN");
                break;
            
            default:
                System.out.println("You did not enter a number equal to or between 1 and 10. Please type a number equal to or between 1 and 10.");
                break;
            }

            if((num%2) == 0) {
                System.out.println(num + " is divisible by 2.");
            } else {
                System.out.println(num + " is not divisible by 2.");
            }
        
            numIn.close();
        }
        catch(Exception e)
        {
            System.out.println("Please type a number equal to or between 1 and 10.");
        }
    }
}