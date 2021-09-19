import java.util.Scanner;


public class CalculateI_Know
{
    public static void main(String [] args)
    {
        Scanner userIn = new Scanner(System.in);
        System.out.print("Please enter your first number: ");

        double num1 = userIn.nextDouble();

        System.out.print("Please enter your second number: ");
        double num2 = userIn.nextDouble();
        while (num1 == num2){
            System.out.print("Please enter a different number than your first number: ");
            num2 = userIn.nextDouble();
        }

        System.out.print("Please enter your third number: ");
        double num3 = userIn.nextDouble();
        while (num1 == num3){
            System.out.print("Please enter a different number than your first number: ");
            num3 = userIn.nextDouble();
        }
        while (num2 == num3){
            System.out.print("Please enter a different number than your second number: ");
            num3 = userIn.nextDouble();
        }

        userIn.close();
    }

    public static void calcLargestSum(double num1, double num2, double num3)
    {
        if(num1>num2){
            if (num1>num3){
                System.out.println("The max number is " + num1);
            } 
            else if(num2>num3)
            {
                System.out.println("The max number is " + num2);
            }
        } 
        else
        {
            System.out.println("The max number is " + num3);
        }
    }

    public static void calcMiddleNumber(double midNum)
    {

    }
}