//////////////////////////////////////////////////////////////
// Solution to Homework 5 Program 5                         //
// Name: Daniel Rocehfort                                   //
// Lab time: Thursday 9:00am-10:40am                        //
// Program description: The user enters a number from 1-100 //
//                      and if the number they enter is the //
//                      magic number then it congratulats   //
//                      the user, if lower than the magic   //
//                      then it tells the user, if higher   //
//                      then it tells the user.             //
//////////////////////////////////////////////////////////////

import java.lang.Math;
import java.util.Scanner;

public class MagicNumber
{
        public static void main(String [] args){
            try{ 
                int min = 1;
                int max = 100;
                int range = ((max - min) + 1);
                int randomnum = (int)(Math.random() * range) + min;
                                
                Scanner numIn = new Scanner(System.in);
                System.out.println("Secret number is " + randomnum);
                System.out.print("Enter a guess: \n");
                
                int guess = numIn.nextInt();
                
                System.out.println("Your guess is \n" + guess);

                if(guess == randomnum){
                    System.out.println("Your guess is correct. Congratulations!");
                } else if(guess > randomnum){
                    System.out.println("Your guess is greater than the secret number.");
                } else{
                    System.out.println("Your number is smaller than the secret number.");
                }

                numIn.close();
                
            }
            catch(Exception e)
            {
                System.out.println("Please enter a numeric value equal to or between 1 and 100.");
            }
        }
}