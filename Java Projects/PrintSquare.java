import java.util.Scanner;
public class PrintSquare
{
    public static void main(String [] args){
    
    try{
        Scanner square = new Scanner(System.in);
        System.out.println("Please type a number: ");

        int number = square.nextInt();
        int numSquared = (number * number);

        System.out.println("The square of that number is " + numSquared + ".");

        square.close();
    }
    catch(Exception e) 
        
        {
            System.out.println("That is not a number.");
        }
    }
}