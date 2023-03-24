package game;

/**
 * Simulates a card from the game Uno.
 * 
 * @author Willow Sapphire
 * @version 03/24/2023
 */
public class UnoCard extends Card {
    /**
     * Uno Card Ranks.
     */
    public enum Rank {ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, SKIP, REVERSE, DRAW_TWO,WILD, DRAW_FOUR}

    /**
     * Uno Card Colors.
     */
    public enum Color {RED,YELLOW,GREEN,BLUE,BLACK}

    /**
     * The rank of this card.
     */
    private Rank rank;

    /**
     * The color of this card.
     */
    private Color color;
    
    /**
     * Creates a new Uno Card.
     * 
     * @param rank the rank for the card
     * @param color the color for the card
     */
    public UnoCard(Rank rank, Color color) {
        this.rank = rank;
        this.color = color;
    }

    /**
     * Accessor method for the card's rank.
     * 
     * @return the card's rank.
     */
    public Rank getrank(){
        return rank;
    }

    /**
     * Accessor method for the card's color.
     * 
     * @return the card's color.
     */
    public Color getColor(){
        return color;
    }

    /**
     * Creates a string representation of the card in the form: <color> <rank>
     * 
     * @return the card as as a string
     */
    public String toString() {
        return color + " " + rank;
    }

    /**
     * Checks if two cards are equal.
     * Cards are considered equal if the
     */
    @Override
    public boolean equals(Object o) {
        return o instanceof UnoCard && rank.equals(((UnoCard)o).rank)
            && color.equals(((UnoCard)o).color);
    }

    /**
     * Clones this card.
     * @return a precise copy of this card
     */
    @Override
    public UnoCard clone() {
        return new UnoCard(this.rank, this.color);
    }

    /**
     * Compares two cards to see which is greater
     * Value is based on the card's rank
     * @return 
	 *	0 this equals c
	 *	less than 0 if this is less than c
	 *	greater than 0 this is greater than c
     *  0 if the provided card is not an UnoCard
     */
    @Override
    public int compareTo(Card c) {
        if (c instanceof UnoCard)
            return Integer.compare((rank.ordinal()),((UnoCard)c).rank.ordinal());
        else
            return 0;
        }
}
