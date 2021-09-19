import java.util.Scanner;

public class GradesAverage
{
    public static void main(String [] args)
    {
        try{

            Scanner nameAverage = new Scanner(System.in);
            System.out.print("Please enter your name: ");
            
            String name = nameAverage.nextLine();
            System.out.println("Name: \t" + name);

            System.out.print("Please your first mark: ");
            int mark1 = nameAverage.nextInt();
            System.out.println("Your first mark is: " + mark1);

            System.out.print("Please your second mark: ");
            int mark2 = nameAverage.nextInt();
            System.out.println("Your second mark is: " + mark2);

            System.out.print("Please your third mark: ");
            int mark3 = nameAverage.nextInt();
            System.out.println("Your first mark is: " + mark3);

            double averageOfMarks = ((mark1+mark2+mark3)/3);
            
            //Used to make a space to see the final output clearly
            System.out.println("");

            System.out.println("Name: \t" + name);
            System.out.println("Average: \t" + averageOfMarks);

            nameAverage.close();

        }
        catch(Exception e)
        {
            System.out.println("Please follow the directions.");
        }

    }
}