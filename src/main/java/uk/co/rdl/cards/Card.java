package uk.co.rdl.cards;

public class Card {
    private final String suit;
    private final String rank;
    private final int cardValue;

    public Card(String rank, String suit, int cardValue) {
        this.cardValue = cardValue;
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format("%s%s", this.rank, this.suit);
    }
}
