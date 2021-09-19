public class Repeat
{
    public static void main(String [] args)
    {
        printString("fun", 5);
    }

    public static void printString(String word, int amount)
    {
        for(int i = 0; i < amount; i++)
            System.out.print(word + " ");
        

    }
}