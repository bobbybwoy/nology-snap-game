package uk.co.rdl;

import uk.co.rdl.games.CardGame;

public class Main {
    static void main() {
        CardGame cardGame = new CardGame("Snap!");
        System.out.println("Before Number Order sort:");
        cardGame.getDeck();
        cardGame.sortDeckInNumberOrder();
        System.out.println("After after Number Order sort, before Suit Order sort:");
        cardGame.getDeck();
        cardGame.sortDeckIntoSuits();
        System.out.println("After Suit order sort:");
        cardGame.getDeck();
    }
}
