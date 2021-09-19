import java.util.Scanner;
import java.util.Random;

public class Blackjack_Jr
{
    public static void main(String [] args)
    {
        Scanner userIn = new Scanner(System.in);
        System.out.print("Please pick your first card (Please enter a number between 1 and 10): ");
        
        int playerCard1 = userIn.nextInt();
        while (playerCard1<=0)
        {
            System.out.println("Please enter a number that is 1 or above");
            playerCard1 = userIn.nextInt();
        }
        while (playerCard1>=11)
        {
            System.out.println("Please enter a number that is 10 or lower");
            playerCard1 = userIn.nextInt();
        }

        System.out.print("Please pick your second card (Please enter a number between 1 and 10): ");
        int playerCard2 = userIn.nextInt();
        while (playerCard2<=0)
        {
            System.out.println("Please enter a number that is 1 or above");
            playerCard2 = userIn.nextInt();
        }
        while (playerCard2>=11)
        {
            System.out.println("Please enter a number that is 10 or lower");
            playerCard2 = userIn.nextInt();
        }

        int playerCardT = (playerCard1 + playerCard2);

        System.out.print("Please pick the dealer's first card (Please enter a number between 1 and 10): ");
        int dealerCard1 = userIn.nextInt();
        while (dealerCard1<=0)
        {
            System.out.println("Please enter a number that is 1 or above");
            dealerCard1 = userIn.nextInt();
        }
        while (dealerCard1>=11)
        {
            System.out.println("Please enter a number that is 10 or lower");
            dealerCard1 = userIn.nextInt();
        }
        
        Random rand = new Random();
        int dealerCard2 = rand.nextInt(10);

        int dealerCardT = (dealerCard1 + dealerCard2);
        
        System.out.println("-------Blackjack Jr!-------");
        System.out.println("");
        System.out.println("You drew " + playerCard1 + " and " + playerCard2 + ".");
        System.out.println("Your total is " + playerCardT + ".");
        System.out.println("");
        System.out.println("The dealer has " + dealerCard1 + " and " + dealerCard2 + ".");
        System.out.println("The dealer's total is " + dealerCardT + ".");

        if(playerCardT>dealerCardT)
        {
            System.out.println("Congragulations! YOU WIN!");
        } else if(playerCardT<=dealerCardT) {
            System.out.println("You lose! Better luck next time!");
        }

        userIn.close();
    }
}