
public class XMarksDaSpot 
{

    public static void main(String [] args)
    {
        int rows = 3;

        for (int i = 0; i < (rows); i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print(". ");
            }
            System.out.print("* ");
            for(int h = 0; h < (((rows-i) * 2) - 1); h++)
            {
                System.out.print(". ");
            }
            System.out.print("* ");
            for(int j = 0; j < i; j++)
            {
                System.out.print(". ");
            }
            System.out.println("");
        }
        
        System.out.println("");

        for (int i = 0; i < (rows); i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print(". ");
            }
            System.out.print("* ");
            for(int h = 0; h < (((rows-i) * 2) - 1); h++)
            {
                System.out.print(". ");
            }
            System.out.print("* ");
            for(int j = 0; j < i; j++)
            {
                System.out.print(". ");
            }
            System.out.println("");
        }

    }

}