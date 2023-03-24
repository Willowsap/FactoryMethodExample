package game;

import game.PlayingCard.Rank;
import game.PlayingCard.Suit;

/**
 * A deck of standard playing cards.
 * 
 * @author Willow Sapphire
 * @version 03/24/2023
 */
public class PlayingCardDeck extends Deck {
  
    /**
     * Create a an array of every playing card.
     * This includes every combination of suit and rank.
     * 
     * @return the array of cards for the deck.
     */
    @Override
    public Card[] getCards() {
        Card[] cards = new Card[52];
        int i = 0;
        for (Suit s: Suit.values())
            for (Rank r: Rank.values())
                cards[i++] = new PlayingCard(s,r);
        return cards;
    }
}
