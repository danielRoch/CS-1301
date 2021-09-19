import java.util.*;
public class test
{
    public static void main(String [] args)
    {
        
        double num1 = 3;
        double num2 = 25;
        double num3 = 5;
        double max;
        double median;
        double min;

        if(num1 > num2 && num1 > num3){
            max = num1;
            System.out.println("The max number is " + max + " .");
        } else if(num1 < num2 && num1 < num3){
            min = num1;
            System.out.println("The min number is " + min + " .");
        } else if(num1 > num2 && num1 < num3 || num1 < num2 && num1 > num3){
            median = num1;
            System.out.println("The median number is " + median + " .");
        }

        if(num2 > num1 && num2 > num3){
            max = num2;
            System.out.println("The max number is " + max + " .");
        } else if(num2 < num1 && num2 < num3){
            min = num2;
            System.out.println("The min number is " + min + " .");
        } else if(num2 > num1 && num2 < num3 || num2 < num1 && num2 > num3){
            median = num2;
            System.out.println("The median number is " + median + " .");
        }
        
        if(num3 > num2 && num1 < num3){
            max = num3;
            System.out.println("The max number is " + max + " .");
        } else if(num3 < num2 && num1 > num3){
            min = num3;
            System.out.println("The min number is " + min + " .");
        } else if(num3 > num2 && num1 > num3 || num3 < num2 && num1 < num3){
            median = num3;
            System.out.println("The median number is " + median + " .");
        }

        /*
        if(num1>num2){
            if (num1>num3){
                max = num1;
                System.out.println("The max number is " + num1);
            } 
            else if(num2>num3)
            {
                max = num2;
                System.out.println("The max number is " + num2);
            }
            else
            {
                max = num3;
                System.out.println("The max number is " + num3);
            }
        } 
        else
        {
            max = num2;
            System.out.println("The max number is " + num2);
        }

        if(max>=num1)
        {
            if(num1>num2)
            {
                median = num1;
                System.out.println(median);
            }
        } 
        else if(max>=num2)
        {
            median = num2;
            System.out.println(median);
        }
        else
        {
            median = num3;
        }

        */

        /*
double a[] = {1, 2, 3, 4, 5};
double b[] = {6, 7, 8};
int local = 5;
double result[] = new double[a.length + b.length];

System.arraycopy(a, 0, result, 0, a.length);
System.arraycopy(b, 0, result, local, b.length);
System.out.println(Arrays.toString(result));
*/
    }



}