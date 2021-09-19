import java.util.*;

public class arrayTable 
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int num = in.nextInt();

        int[] array = new int[10];
        for(int i = 0; i < 10; i++)
        {
            array[i] = (num * (i+1));
        }

        System.out.print("Enter number to find Multiplicaiton Table at specific number : ");
        int num2 = in.nextInt();

        System.out.println("Table stored in array is");
        
        System.out.println(Arrays.toString(array));

        System.out.println("Result for " + num2 + " is : " + array[(num2-1)]);
        
        in.close();
    }
}