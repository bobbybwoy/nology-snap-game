package uk.co.rdl;

import uk.co.rdl.games.CardGame;

public class Main {
    static void main() {
        CardGame cardGame = new CardGame("Snap!");
        System.out.println("Before shuffle:");
        cardGame.getDeck();;
        cardGame.shuffleDeck();
        System.out.println("After shuffle");
        cardGame.getDeck();
    }
}
