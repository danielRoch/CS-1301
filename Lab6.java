public class Lab6
{
    public static void printSquare(int min, int max)
    {
        int difference = max-min;
        for (int i = 0; i <= difference; i++)
        {
            for (int s = 0; s <= (difference); s++)
            {
                System.out.print((s+i)%(difference+1) + min);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args)
    {
        printSquare(3,6);
    }
}