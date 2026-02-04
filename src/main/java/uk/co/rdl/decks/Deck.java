package uk.co.rdl.decks;

import uk.co.rdl.cards.Card;

import java.util.ArrayList;

public class Deck {
    protected ArrayList<Card> deckOfCards;

    public void getDeck() {
        // You cannot display an empty desk
        if (deckOfCards.isEmpty()) {
            System.out.println("There are no cards in the deck.");
            return;
        }

        for (Card card : deckOfCards) {
            System.out.printf("%s ", card);
        }
        System.out.println();
    }

    public Card dealCard() {
        if (deckOfCards.isEmpty()) {
            System.out.println("There are no cards left to deal.");
            return null;
        }

        return deckOfCards.removeFirst();
    }
}
