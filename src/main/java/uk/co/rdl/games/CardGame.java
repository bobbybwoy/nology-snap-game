package uk.co.rdl.games;

import uk.co.rdl.cards.Card;
import uk.co.rdl.enums.Suit;
import uk.co.rdl.enums.Symbol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

    public void getDeck() {
        if (deckOfCards.isEmpty()) {
            System.out.println("There are no cards in the deck.");
            return;
        }

        for (Card card : deckOfCards) {
            System.out.printf("%s\n", card);
        }
        System.out.println();
    }

    public ArrayList<Card> sortDeckInNumberOrder() {
        Collections.sort(deckOfCards);
        return deckOfCards;
    }

    public ArrayList<Card> sortDeckIntoSuits() {
        Comparator<Card> bySuitAndSymbol = Comparator.comparing(Card::getOrdinalValues);
        deckOfCards.sort(bySuitAndSymbol);
        return deckOfCards;
    }

    public ArrayList<Card> shuffleDeck() {
        ArrayList<Card> tempDeck = new ArrayList<>();

        while (!deckOfCards.isEmpty()) {
            tempDeck.add(deckOfCards.remove((int) (Math.random() * deckOfCards.size())));
        }

        deckOfCards = tempDeck;
        return deckOfCards;
    }

    private ArrayList<Card> generateCards() {
        ArrayList<Card> deck = new ArrayList<>();

        for (Suit suit : Suit.values()) {
            for (Symbol symbol : Symbol.values()) {
                Card card = new Card(symbol.name(), suit.name(), symbol.ordinal() + 2);
                deck.add(card);
            }
        }

        return deck;
    }
}
