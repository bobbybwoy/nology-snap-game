package uk.co.rdl;

import uk.co.rdl.decks.CardGame;
import uk.co.rdl.decks.Deck;

public class Main {
    static void main() {
        Deck cardGame = new CardGame("Snap!");
        cardGame.getDeck();
        System.out.printf("Card: %s\n", cardGame.dealCard());
        cardGame.getDeck();
    }
}
