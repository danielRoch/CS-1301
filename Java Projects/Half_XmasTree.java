///////////////////////////////////////////////////////////////
// Solution to Homework 6 Question 1                         //
// Name: Daniel Rocehfort                                    //
// Lab time: Thursday 9:00am-10:40am                         //
// Program description: Asks the user how many rows they     //
//                      would like in there half Christmas   //
//                      tree and then prints it.             //
///////////////////////////////////////////////////////////////

import java.util.*;

public class Half_XmasTree 
{
    public static void main(String args [])
    {
        Scanner numIn = new Scanner(System.in);
        System.out.println("Enter the desired number of rows : ");
        int num = numIn.nextInt();

        for(int i = 0; i<num; i++)
        {
            for(int h = 0; h<i; h++)
            {
                System.out.print(" ");
            }
            
            for(int j = 0; j<(num-i); j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        numIn.close();
    }
}