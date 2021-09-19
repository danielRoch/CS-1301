import java.util.*;

public class DiceRoll
{
    public static void main(String [] args)
    {
        Random rand = new Random();
        int a = rand.nextInt(6);
        int b = rand.nextInt(6);

        System.out.println("First die comes up " + a);
        System.out.println("Second die comes up " + b);
        System.out.println("Your total roll is " + (a+b));
    }
}