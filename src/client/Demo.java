package client;

import java.util.Scanner;

import game.Deck;
import game.PlayingCardDeck;
import game.UnoDeck;

public class Demo {
    public static void main(String[] args) {

        Deck d = null;

        Scanner kb = new Scanner(System.in);
        System.out.println("Which deck do you want?");
        System.out.println("1) Regular\n2) Uno");
        int choice = kb.nextInt();
        switch(choice) {
            case 1: 
                d = new PlayingCardDeck(); 
                break;
            case 2:
                d = new UnoDeck();
                break;
            default:
                System.out.println("Invalid selection");
                System.exit(0);
        }
        System.out.println(d);
        kb.close();
    }
}
