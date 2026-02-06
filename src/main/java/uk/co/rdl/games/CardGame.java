package uk.co.rdl.games;

import uk.co.rdl.cards.Card;
import uk.co.rdl.enums.Suit;
import uk.co.rdl.enums.Symbol;

import java.util.ArrayList;

public class CardGame {
    private final String name;
    private ArrayList<Card> deckOfCards;

    public CardGame(String name) {
        this.name = name;
        this.deckOfCards = generateCards();
    }

    public Card dealCard() {
        if (deckOfCards.isEmpty()) {
            System.out.println("There are no cards left to deal.");
            return null;
        }

        return deckOfCards.removeFirst();
    }

    public void setDeck(ArrayList<Card> deck) {
        deckOfCards = deck;
    }

    public void getDeck() {
        System.out.printf("%s:\n\n", this.name);
        if (deckOfCards.isEmpty()) {
            System.out.println("There are no cards in the deck.");
            return;
        }

        for (Card card : deckOfCards) {
            System.out.printf("%s ", card);
        }
        System.out.println();
    }

    private ArrayList<Card> generateCards() {
        ArrayList<Card> deck = new ArrayList<>();

        for (Suit suit : Suit.values()) {
            for (Symbol symbol : Symbol.values()) {
                Card card = new Card(symbol.getDisplayValue(), suit.getDisplayValue(), symbol.getSymbolValue());
                deck.add(card);
            }
        }

        return deck;
    }
}
