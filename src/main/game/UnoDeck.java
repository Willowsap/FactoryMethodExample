package game;

import game.UnoCard.Color;
import game.UnoCard.Rank;

/**
 * Simulates a deck of Uno cards.
 * 
 * @author Willow Sapphire
 * @version 03/24/2023
 */
public class UnoDeck extends Deck {
 
    /**
     * Create a an array of every Uno card.
     * 
     * @return an array of every Uno card.
     */
    @Override
    public Card[] getCards() {
        Card[] cards = new Card[116];
        int i = 0;
        for (Rank s : Rank.values()) {
            for (Color c : Color.values()) {
                if (c.equals(Color.BLACK) && (s.equals(Rank.WILD) || s.equals(Rank.DRAW_FOUR))) {
                    cards[i++] = new UnoCard(s, c);
                    cards[i++] = new UnoCard(s, c);
                    cards[i++] = new UnoCard(s, c);
                    cards[i++] = new UnoCard(s, c);
                }
                else if (!c.equals(Color.BLACK) && s.equals(Rank.ZERO)) {
                    cards[i++] = new UnoCard(s, c);
                }
                else if (!c.equals(Color.BLACK) && !(s.equals(Rank.WILD) || s.equals(Rank.DRAW_FOUR))){
                    cards[i++] = new UnoCard(s, c);
                    cards[i++] = new UnoCard(s, c);
                }
            }
        }
        return cards;
    }
}