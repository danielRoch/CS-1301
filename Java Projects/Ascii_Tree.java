///////////////////////////////////////////////////////////////
// Solution to Homework 6 Question 2                         //
// Name: Daniel Rocehfort                                    //
// Lab time: Thursday 9:00am-10:40am                         //
// Program description: Prints out an ASCII Christmas Tree   //
//                      with a certain number of rows        //
//                      according to the number in rows.     //
///////////////////////////////////////////////////////////////


public class Ascii_Tree 
{
    public static void main(String args [])
    {
        int rows = 10;

        for(int i = 0; i<rows; i++)
        {
            for(int h = 0; h <(rows-(i+1)); h++)
            {
                System.out.print(" ");
            }

            for(int j = 0; j<i; j++)
            {
                System.out.print("/");
            }

            System.out.print("|");

            for(int j = 0; j<i; j++)
            {
                System.out.print("\\");
            }
            System.out.println("");
        }

    }
}