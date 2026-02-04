package uk.co.rdl.decks;

import uk.co.rdl.cards.Card;
import uk.co.rdl.cards.PlayingCard;

import java.util.ArrayList;

public class CardGame extends Deck {
    private String name;

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
                Card card = new PlayingCard(selectedRank, selectedSuit, rankIndex);
                this.deckOfCards.add(card);
            }
        }
    }
}
