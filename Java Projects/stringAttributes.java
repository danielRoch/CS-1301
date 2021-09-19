import java.util.*;
public class stringAttributes 
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = in.nextLine().trim();

        int stringlen = word.length();
        char firstChar = word.charAt(0);
        String upperConvert = word.toUpperCase();
        String lowerConvert = word.toLowerCase();
        String firstPart;

        System.out.println("User input: " + word);
        System.out.println("String Length: " + stringlen);
        System.out.println("First Character: " + firstChar);
        System.out.println("String all uppercase: " + upperConvert);
        System.out.println("String all lowercase: " + lowerConvert);
        
        if(word.indexOf(" ") != -1)
        {
            firstPart = (word.substring(0, word.indexOf(" ")));
            System.out.println("The first part of the string is: " + firstPart);
        } else {
            firstPart = (word.substring(0, (word.length() / 2)));
            System.out.println("The first part of the string is: " + firstPart);
        }
        
        in.close();
    }
}