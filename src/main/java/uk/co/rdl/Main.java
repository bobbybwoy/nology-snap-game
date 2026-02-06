package uk.co.rdl;

import uk.co.rdl.games.CardGame;

public class Main {
    static void main() {
        CardGame cardGame = new CardGame("Snap!");
        cardGame.getDeck();
        System.out.printf("Card: %s\n", cardGame.dealCard());
        cardGame.getDeck();
    }
}
