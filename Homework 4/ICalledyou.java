//////////////////////////////////////////////////////////////
// Solution to Homework 4 Question 2                        //
// Name: Daniel Rocehfort                                   //
// Lab time: Thursday 9:00am-10:40am                        //
// Program description: Prints out my initials, then the    //
//                      product of 2 numbers, then that     //
//                      product in binary.                  //
//////////////////////////////////////////////////////////////

public class ICalledyou
{
    public static void initials3D(String [] args)
  {

    String initials ="  _________        ____________ \n |\\________\\      | \\__________\\ \n | |    _   \\     | |   ____   | \n | |   | |\\  |    | |  |___||  | \n | |   | | | |    | |  |___\\|  | \n | |   | | | |    | |      ____| \n | |   |/  | |    | |  |\\  \\ \n | |   |__/  |    | |  |\\\\  \\ \n | |         |    | |  | \\\\  \\ \n  \\|________/      \\|__|  \\\\__\\";
    System.out.println(initials);

  } 
  
  public static int twoNumbers(int num1, int num2)
  {
    int product = (num1*num2);
    return product;

  } 
  
    public static void main(String args[])
  {
    initials3D(args);
    //This println is to add a space to make the output easier to read.
    System.out.println("");

    int num1 = 5;
    int num2 = 10;
    int product = twoNumbers(num1, num2);
    System.out.println("The product of " + num1 + " and " + num2 + " is: " + product + ".");
    //This println is to add a space to make the output easier to read.
    System.out.println("");

    System.out.println(product + " is " + Integer.toBinaryString(product) + " in binary.");
    
    
  }

}