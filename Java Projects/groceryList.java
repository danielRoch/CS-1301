import java.util.*;

public class groceryList
{
    public static void main(String args [])
    {
        int total = 0;      
        
        System.out.println("Welcome to XYZ Grocery Store");     
        System.out.println("Items available to purchase : ");
        System.out.println("1 - Apple - 5 $");
        System.out.println("2 - Coca Cola - 7 $");
        System.out.println("3 - Maple Syrup - 4 $");
        System.out.println("4 - Breads - 3 $");
        System.out.println("5 - Cheese - 6 $");
        System.out.println("6 - Coffee - 8 $");
        System.out.println("7 - Chucken Nuggets - 15 $");
        System.out.println("8 - Hand Sanitizer - 4 $");

        Scanner numIn = new Scanner(System.in);
        System.out.println("Enter item number to purchase : ");
        int num = numIn.nextInt();

        while (num != 0){

        switch(num) {
            case 1: //Apple
                total = (total + 5);
                System.out.println("Total = " + total + " $");
                break;
            
            case 2: //Coca Cola
                total = (total + 7);
                System.out.println("Total = " + total + " $");
                break;
            
            case 3: //Maple Syrup
                total = (total + 4);
                System.out.println("Total = " + total + " $");
                break;
            
            case 4: //Breads
                total = (total + 3);
                System.out.println("Total = " + total + " $");
                break;
            
            case 5: //Cheese
                total = (total + 6);
                System.out.println("Total = " + total + " $");
                break;
            
            case 6: //Coffee
                total = (total + 8);
                System.out.println("Total = " + total + " $");
                break;
            
            case 7: //Chicken Nuggets
                total = (total + 15);
                System.out.println("Total = " + total + " $");
                break;
            
            case 8: //Hand Sanitizer
                total = (total + 4);
                System.out.println("Total = " + total + " $");
                break;
            
            default: //Error
                System.out.println("You did not enter a number corresponding to an available item. Please enter 1-8 for an item or 0 to finish shopping.");
                break;
            }
            num = numIn.nextInt();
        }

        numIn.close();

        System.out.println("Thank you for Shopping");
        System.out.println("Your Grand Total is : " + total + " $");
        
    }
}