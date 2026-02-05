package uk.co.rdl.decks;

import uk.co.rdl.cards.Card;

import java.util.ArrayList;

public class CardGame {
    private String name;
    protected ArrayList<Card> deckOfCards;

    public CardGame(String name) {
        this.deckOfCards = new ArrayList<>();
        this.name = name;

        String selectedSuit = "";
        String selectedRank = "";

        for (int suitIndex = 0; suitIndex < 4; suitIndex++) {
            for (int rankIndex = 2; rankIndex < 15; rankIndex++) {
                switch (suitIndex) {
                    case 0: selectedSuit = "♥️"; break;
                    case 1: selectedSuit = "♣️"; break;
                    case 2: selectedSuit = "♦️"; break;
                    case 3: selectedSuit = "♠️"; break;
                }

                switch (rankIndex) {
                    case 11: selectedRank = "J"; break;
                    case 12: selectedRank = "Q"; break;
                    case 13: selectedRank = "K"; break;
                    case 14: selectedRank = "A"; break;
                    default: selectedRank = Integer.toString(rankIndex);
                }
                Card card = new Card(selectedRank, selectedSuit, rankIndex);
                this.deckOfCards.add(card);
            }
        }
    }

    public Card dealCard() {
        if (deckOfCards.isEmpty()) {
            System.out.println("There are no cards left to deal.");
            return null;
        }

        return deckOfCards.removeFirst();
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
}
