package uk.co.rdl.decks;

import uk.co.rdl.cards.Card;

import java.util.ArrayList;

public class Deck {
    protected ArrayList<Card> deckOfCards;

    // public Deck(ArrayList<Card> deckOfCards) {
    //     this.deckOfCards = deckOfCards;
    // }

    public void getDeck() {
        for (Card card : deckOfCards) {
            System.out.println(card);
        }
    }
}
