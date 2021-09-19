///////////////////////////////////////////////////////////////
// Solution to Homework 6 Question 4                         //
// Name: Daniel Rocehfort                                    //
// Lab time: Thursday 9:00am-10:40am                         //
// Program description: Asks the user to enter a max number  //
//                      for a random number then asks the    //
//                      user to guess the number and if      //
//                      incorrect it will tell them whether  //
//                      they are too low or too high. Once   //
//                      they guess the correct number then it//
//                      will ask if they want to play again. //
///////////////////////////////////////////////////////////////

import java.util.*;

public class Guess_A_Number 
{
    public static void main(String [] args)
    {
        Scanner numIn = new Scanner(System.in);
        boolean pAgain = true;
        
        while(pAgain)
        {
        System.out.println("Guess the secret number.");
        System.out.print("Enter maximum value for secret number: ");
        int max = numIn.nextInt();

        Random rand = new Random();
        int mNum = (rand.nextInt(max)+1);

        System.out.print("Enter guess: ");
        int guess = numIn.nextInt();
        int nGuesses = 1;
        while(guess != mNum)
        {
            if(guess > mNum) {
                System.out.print("Too high; try again. Enter guess: ");
                nGuesses++;
            } else {
                System.out.print("Too low; try again. Enter guess: ");
                nGuesses++;
            }
            guess = numIn.nextInt();
        }
        
        System.out.print("You won in " + nGuesses + " guesses!");
        System.out.println(" ");
        System.out.println("Play again? (Y/N) ");
        String playing = numIn.nextLine().trim();//this input is not registered
        playing = numIn.nextLine().trim();
        
        if (playing.equalsIgnoreCase("y") == true)
        {
            pAgain = true;
        } else {
            pAgain = false;
        }

        }

        numIn.close();
    }
}