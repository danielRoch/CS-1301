import java.util.*;
public class allUppercase 
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String");
        String word = in.nextLine().trim();
        
        System.out.println(word.toUpperCase());

        int start = 0;
        int end = (word.length() - 1);
        boolean palindrome = true;

        while (start < end)
        {
            if(word.charAt(start) != word.charAt(end))
            {
                palindrome = false;
            } else {
                palindrome = true;
            }
            start++;
            end--;
        }

        if(palindrome)
        {
            System.out.println("This word is a palindrome.");
        } else {
            System.out.println("This word is not a palindrome.");
        }

        in.close();
    }
}