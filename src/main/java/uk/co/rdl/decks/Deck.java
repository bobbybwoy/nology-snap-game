package uk.co.rdl.decks;

import uk.co.rdl.cards.PlayingCard;

import java.util.ArrayList;

public class Deck {
    protected ArrayList<PlayingCard> deckOfCards;

    public void getDeck() {
        // You cannot display an empty desk
        if (deckOfCards.isEmpty()) {
            System.out.println("There are no cards in the deck.");
            return;
        }

        for (PlayingCard card : deckOfCards) {
            System.out.printf("%s ", card);
        }
        System.out.println();
    }
}
