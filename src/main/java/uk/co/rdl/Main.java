package uk.co.rdl;

import uk.co.rdl.games.CardGame;
import uk.co.rdl.games.Snap;

public class Main {
    static void main() {
        Snap snap = new Snap("Snap!");
        snap.shuffleDeck();
        snap.play();
    }
}
