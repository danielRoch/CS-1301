import java.util.Scanner;

public class Grade
{
    public static void main(String [] args)
    {
        Scanner numGrade = new Scanner(System.in);
        System.out.println
        ("Enter your numeric grade (0-100):");


        
        boolean userGrade = numGrade.nextBoolean();
        System.out.println("Your grade is: " + 
        userGrade);
        
        numGrade.close();

    }
}