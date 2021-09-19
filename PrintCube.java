import java.util.Scanner;

public class PrintCube
{
    public static void main(String [] args)
    {

        try{

        Scanner printCube = new Scanner(System.in);
        System.out.println("Please enter a number:");

        double userNum = printCube.nextDouble();

        double userCubed = (userNum*userNum*userNum);


        System.out.println("The cube of that number is " + (userCubed) + ".");

        printCube.close();

    }
    catch(Exception e)
    {
        System.out.println("The input must be a number.");
    }

    }
}