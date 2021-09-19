import java.util.Scanner;

public class Grade
{
    public static void main(String [] args)
    {
        
    try{

        Scanner numGrade = new Scanner(System.in);
        System.out.println
        ("Enter your numeric grade (0-100):");


        
        int userGrade = numGrade.nextInt();
        System.out.println("Your grade is: " + userGrade);
        int caseGrade = (userGrade/10);
        int case10 = 10;
        int case9 = 9;
        int case8 = 8;
        int case7 = 7;
        int case6 = 6;

        if (userGrade >= 0) 
        {
            if (userGrade <= 100)
                {
                    if (caseGrade == case10){
                        System.out.println("Perfect score! Job well done!");
                    } 
                    else if (caseGrade == case9)
                        System.out.println("Well above average. Excellent!");
                    else if (caseGrade == case8)
                        System.out.println("Above average Nice job!");
                    else if (caseGrade == case7)
                        System.out.println("Average.");
                    else if (caseGrade <= case6)
                        System.out.println("Below average, you should see the professor...to clarify the material presented in class...");
                
                }
                else 
                    {
                    System.out.println("The grade must be between 0 and 100!");
                    }
        }
        else
        { 
            System.out.println("The grade must be between 0 and 100!");
        }
        
    numGrade.close();
        } 

        catch(Exception e) 
        
        {
            System.out.println("The grade must be between 0 and 100!");
        }
    }
}
