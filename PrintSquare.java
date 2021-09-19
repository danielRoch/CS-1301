public class PrintSquare
{
    private static int printSquare(int x)
    {
        return x * x;
    }

    public static void main(String[] args)
    {
        for (int i = 3; i <=6; i++){

            int result = printSquare(i);

            System.out.println("Square of " + i + " is: "
             + result);
        }
    }
}