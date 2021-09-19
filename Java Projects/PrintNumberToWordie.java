//////////////////////////////////////////////////////////////
// Solution to Homework 5 Program 1                         //
// Name: Daniel Rocehfort                                   //
// Lab time: Thursday 9:00am-10:40am                        //
// Program description: Prints out the word form of a number//
//                      ranging from 1 to 10 and tells the  //
//                      user if the number is even using    //
//                      nested if statements.               //
//////////////////////////////////////////////////////////////

import java.util.Scanner;

public class PrintNumberToWordie
{
    public static void main(String [] args)
    {
        try{
            Scanner numIn = new Scanner(System.in);
            System.out.print("Please type a number equal to or between 1 and 10. ");

            int num = numIn.nextInt();
            System.out.println("You entered: " + num);

            if(num == 1) {
                System.out.println("ONE");
            
            } else if(num == 2) {
                System.out.println("TWO");
            
            } else if(num == 3) {
                System.out.println("THREE");
            
            } else if(num == 4) {
                System.out.println("FOUR");
            
            } else if(num == 5) {
                System.out.println("FIVE");
            
            } else if(num == 6) {
                System.out.println("SIX");
            
            } else if(num == 7) {
                System.out.println("SEVEN");
            
            } else if(num == 8) {
                System.out.println("EIGHT");
            
            } else if(num == 9) {
                System.out.println("NINE");
            
            } else if(num == 10) {
                System.out.println("TEN");
            
            } else {
                System.out.println("You did not enter a number equal to or between 1 and 10. Please type a number equal to or between 1 and 10.");
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