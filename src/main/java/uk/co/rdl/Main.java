package uk.co.rdl;

import uk.co.rdl.games.CardGame;

public class Main {
    static void main() {
        CardGame cardGame = new CardGame("Snap!");
        System.out.println("Deck before card removal");
        cardGame.getDeck();
        System.out.printf("Card: %s\n", cardGame.dealCard());
        System.out.println("Deck after card removal and before sort:");
        cardGame.getDeck();
        cardGame.sortDeckInNumberOrder();
        cardGame.getDeck();
    }
}
