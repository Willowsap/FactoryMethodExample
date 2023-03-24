package game;

/**
 * Card class which represents a single card in 
 * the game Hearts which has a Suit, Value, and Point value.
 * @author Willow Sapphire
 * @version 03/24/2023
 */
public class PlayingCard extends Card {
    /**
     * Suits of standard playing cards.
     */
    public enum Suit {
        CLUBS, DIAMONDS, HEARTS, SPADES
    }

    /**
     * Ranks for standard playing cards.
     */
    public enum Rank {
        TWO, THREE, FOUR, FIVE, SIX, 
        SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }

    /**
     * The Suit of the Card represented by an enumerated value.
     */
    private Suit suit;

    /**
     * The Value of the Card represented by an enumerated value.
     */
    private Rank rank;

    /**
     * Constructor for the Card object 
     * which initializes each field to the value passed in.
     * @param s the Suit of the new Card
     * @param r the Rank of the new Card
     */
    public PlayingCard(Suit s, Rank r) {
        suit = s;
        rank = r;
    }

    /**
     * Accessor which retrieves the Suit of the Card.
     * @return the Suit of the Card
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * Accessor which retrieves the Value of the Card.
     * @return the Value of the Card
     */
    public Rank getRank() {
        return rank;
    }

    /**
     * To String method which returns the Value and Suit of the Card.
     * Exp: "Queen of Hearts"
     */
    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    /**
     * Compares an object with this card to see if they
     * are the same.
     * @return true if the object is a card and 
     * its rank and suit are equal to this card's
     */
    @Override
    public boolean equals(Object o) {
        return o instanceof PlayingCard&&suit.equals(((PlayingCard)o).getSuit())&&rank.equals(((PlayingCard)o).getRank());
    }

    /**
     * Clones this card.
     * @return a precise copy of this card
     */
    @Override
    public PlayingCard clone() {
        return new PlayingCard(this.suit,this.rank);
    }

    /**
     * Compares two cards to see which is greater
     * Value is based on the standard deck order
     * Spades > Hearts > Diamonds > Clubs
     * Ace > King > Queen > Jack > 10...2
     * @return 
	 *	0 this equals c
	 *	less than 0 if this is less than c
	 *	greater than 0 this is greater than c
     *  0 if the provided card is not a PlayingCard
     */
    @Override
    public int compareTo(Card c) {
        if (c instanceof PlayingCard)
            return Integer.compare(((suit.ordinal()*100)+(rank.ordinal())),
                ((((PlayingCard)c).suit.ordinal()*100)+(((PlayingCard)c).rank.ordinal())));
        else
            return 0;
    }
}
