import java.util.Random;

public class Blackjack_Jrv2
{
    public static void main(String [] args)
    {
        Random rand = new Random();
        int pCard1 = 5;
        int pCard2 = 9;
        int dCard1 = (rand.nextInt(10) + 1); //needs the "+1" because otherwise it would pick a random number from 0-9 instead of 1-10
        int dCard2 = (rand.nextInt(10) + 1); //needs the "+1" because otherwise it would pick a random number from 0-9 instead of 1-10

        int pTotal = (pCard1 + pCard2);
        int dTotal = (dCard1 + dCard2);

        System.out.println("Welcome to Blackjack Jr!");
        System.out.println("");
        
        System.out.println("You drew " + pCard1 + " and " + pCard2 + ".");
        System.out.println("Your total is " + pTotal + ".");
        System.out.println("");
        
        System.out.println("The dealer drew " + dCard1 + " and " + dCard2 + ".");
        System.out.println("Dealer's total is " + dTotal + ".");
        System.out.println("");

        if (pTotal > dTotal)
        {
            System.out.println("YOU WIN!");
        } else {
            System.out.println("YOU LOSE!");
        }

    }


}