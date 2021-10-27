/**
 * A Card class represents a playing card with a face 
 * value and a suit.
 * @author: PLACE YOUR NAME
 * @version: 
 */

public class Card extends Token
{

    /** These are the unicode characters to display the typical suits of a playing card */
    private static final char spades = '\u2660';
    private static final char hearts = '\u2661';
    private static final char diamonds = '\u2662';
    private static final char clubs = '\u2663';

    public static enum Suit {SPADES, HEARTS, DIAMONDS, CLUBS}
    public static enum Face {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}

    private Suit mySuit;
    private Face myFace;

    /** 
     * Constructor that creates an empty Card
     * Instance data should be initialized to null
     */
    public Card() 
    {
        /* FIX ME */
    }

    /** 
     * Constructor that inializes all 
     * all instance data to proper values.
     */
    public Card(Suit s, Face f)
    {
        /* FIX ME */
    }

    /* ADD OTHER METHODS YOU NEED */

}
