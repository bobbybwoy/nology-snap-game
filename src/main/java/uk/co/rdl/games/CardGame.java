package uk.co.rdl.games;

import uk.co.rdl.cards.Card;
import uk.co.rdl.enums.Suit;
import uk.co.rdl.enums.Symbol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CardGame {
    private final int CARD_VALUE_UPLIFT = 2;
    private final String name;
    private ArrayList<Card> deckOfCards = new ArrayList<>();

    public CardGame(String name) {
        this.name = name;
        generateCards();
    }

    public String getName() {
        return this.name;
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
        Comparator<Card> bySuitAndSymbol = (card1, card2) -> {
            if (Suit.valueOf(card1.getSuit()).equals(Suit.valueOf(card2.getSuit()))) {
                return Symbol.valueOf(card1.getSymbol()).compareTo(Symbol.valueOf(card2.getSymbol()));
            }
            return Suit.valueOf(card1.getSuit()).compareTo(Suit.valueOf(card2.getSuit()));
        };
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

    private void generateCards() {
        if (!deckOfCards.isEmpty()) {
            deckOfCards.clear();
        }

        for (Suit suit : Suit.values()) {
            for (Symbol symbol : Symbol.values()) {
                Card card = new Card(symbol.name(), suit.name(), symbol.ordinal() + CARD_VALUE_UPLIFT);
                deckOfCards.add(card);
            }
        }
    }
}
