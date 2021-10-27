import java.util.*;

/**
 * A Deck class represents a complete deck of Cards
 * @author: PLACE YOUR NAME
 * @version: 
 */
public class Deck 
{
    protected ArrayList<Card> deck;

    /** Constructor creates a group of 52 cards using the Card's
      * enumerated types of face and suits 
      */
    public Deck()
    {
        /* FIX ME */
    }

     /** Constructor creates a group of 13 cards 
       * that all belong to one suit
       */
     public Deck(Card.Suit s)
     {
        /* FIX ME */
     }

    /** 
     * toString method:
     * @overrides toString method to display all 52 cards
     * Print out the Deck of Cards 
     * 13 cards per line please.
     */
    public String toString()
    {
        /* FIX ME */
        return null;
    }

    /**
     * getCard method:
     * Get a card from the Deck at a specific location
     */
    public Card getCard(int index)
    {
        /* FIX ME */
		  return null;
    }

    /** 
    * shuffle method:
    * Randomizes the order of the stored cards
    * One easy way to shuffle is to loop through the 
    * cards and randomly swap each card with another one.
    */
    public void shuffle()
    {
       /* FIX ME */

    }

    /**   
     * deal method:
     * removes the top Card from the deck
     */ 
    public Card deal() 
    {
        /* FIX ME */
        return null;
    }

    /**
     * getCardCount
     * determines how many cards are left on the deck.
     */ 
    public int getCardCount()
    {
        /* FIX ME */
        return 0;
    }
}
