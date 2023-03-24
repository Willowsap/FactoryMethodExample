package game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * A general deck class to work with any type of Card.
 * 
 * @author Willow Sapphire
 * @version 03/24/2023
 */
public abstract class Deck {

    /**
     * The list of cards in the deck.
     */
    private ArrayList<Card> deck;

    /**
     * The list of cards in the discard pile.
     */
    private ArrayList<Card> discard;

    /**
     * Constructs a new deck.
     * Uses whatever type of card the subclass wants.
     */
    public Deck() {
        this.deck = new ArrayList<>(Arrays.asList(getCards()));
        this.discard = new ArrayList<>();
    }

    /**
     * Psuedo-randomly shuffles the deck of cards.
     */
    public void shuffle() {
        Random rnd = new Random();
        for (int i = deck.size() - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            Card a = deck.get(index);
            deck.set(index, deck.get(i));
            deck.set(i, a);
        }
    }

    /**
     * Draws and returns the top card of the deck.
     * The card is then removed from the deck.
     * 
     * @return the top card on the deck
     */
    public Card draw() {
        Card c = deck.get(deck.size()-1);
        deck.remove(deck.size()-1);
        return c;
    }

    /**
     * Adds a card to the discard pile.
     * 
     * @param c the card to add to the discard pile
     */
    public void discard(Card c) {
        this.discard.add(c);
    }

    /**
     * Adds all of the cards in the discard pile to the deck.
     * Clears the discard pile.
     * Shuffles the deck.
     */
    public void returnDiscardToDeck() {
        this.deck.addAll(discard);
        this.discard.clear();
        shuffle();
    }

    /**
     * Prints out every card in the deck, each on a new line.
     */
    @Override
    public String toString() {
        String s = "";
        for (Card c : deck) {
            System.out.println(c);
        }
        return s;
    }

    /**
     * Factory method to get the cards for the deck.
     * 
     * @return an array of cards to put in the deck
     */
    protected abstract Card[] getCards();
}
