import java.util.*;

public class Pattern1
{
    public static void main(String args [])
    {
        Scanner numIn = new Scanner(System.in);
        System.out.println("Please enter a number to print pattern : ");
        int num = numIn.nextInt();

        System.out.println("Output : ");
        System.out.println("The pattern for " + num + " is : ");
     
        for(int i=0; i<num; i++)
        {
            int sNum=1;
            for(int j=0; j<=i; j++)
            {
                System.out.print(sNum + " ");
                sNum++;
            }
            System.out.println("");
        }
        
        numIn.close();
    }
}
