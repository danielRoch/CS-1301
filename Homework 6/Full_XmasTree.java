///////////////////////////////////////////////////////////////
// Solution to Homework 6 Question 3                         //
// Name: Daniel Rocehfort                                    //
// Lab time: Thursday 9:00am-10:40am                         //
// Program description: Asks the user how many rows they     //
//                      would like in there Christmas tree   //
//                      and then prints it with a bottom.    //
///////////////////////////////////////////////////////////////

import java.util.*;

public class Full_XmasTree 
{
    public static void main(String [] args)
    {
    Scanner numIn = new Scanner(System.in);
    System.out.println("Please enter the desired number of rows :");
    int rows = numIn.nextInt();

    for(int i = 0; i<rows; i++)
        {
            for(int h = 1; h <(rows-i); h++)
            {
                System.out.print(" ");
            }

            for(int j = 0; j<(i+1); j++)
            {
                System.out.print("* ");
            }

            System.out.println("");
        }

    int bottom = 1;
    for(int b = 0; b<bottom; b++)
    {
        for(int h = 1; h <(rows-b); h++)
            {
                System.out.print(" ");
            }

            for(int j = 0; j<(b+1); j++)
            {
                System.out.print("* ");
            }

            System.out.println("");
    }

    bottom = (bottom+(rows / 4));
    for(int b = 0; b<bottom; b++)
    {
        for(int h = 1; h <(rows-b); h++)
            {
                System.out.print(" ");
            }

            for(int j = 0; j<(b+1); j++)
            {
                System.out.print("* ");
            }

            System.out.println("");
    }



    numIn.close();
    }
}