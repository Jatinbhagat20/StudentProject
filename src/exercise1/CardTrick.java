package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * Modifier Jatin Bhagat
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args) {
        Scanner g=new Scanner(System.in);
        Card[] hand = new Card[7];

        for (int x = 0; x < hand.length; x++) {
            Card card = new Card();
            card.setValue((int)(1+Math.random()*13));
            card.setSuit(Card.SUITS[((int)(Math.random()*3)+1)]);
            hand[x] = card;
        System.out.println(hand[x].getSuit() + " " + hand[x].getValue());
        }
        int a=0;
       
        {
        System.out.println("Please enter any Card: ");
            int value = g.nextInt();
        System.out.println("Now, Enter the Suit: ");
            String suit = g.next();
        
        if(value==hand[a].getValue())
        {
            if(suit==hand[a].getSuit())
            {
                System.out.println("Your Guess is Right!!");   
            }
            printInfo();
        }
        else
        {
            System.out.println();
            System.out.println("Your guess was Wrong.You wanna try again?");   
            System.out.println();
        }
        
        }
        
        }
        
       
    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     * Modifier Jatin Bhagat
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, It is Right Ans");
        System.out.println();
        
        System.out.println("My name is Jatin");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- To be a Billionaire");
        System.out.println("-- I want best of my Life!!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Listening Music");
        System.out.println("-- Cooking");
        System.out.println("-- Singing");
        System.out.println("-- To go on Camping");

        System.out.println();
        
    
        }

}
