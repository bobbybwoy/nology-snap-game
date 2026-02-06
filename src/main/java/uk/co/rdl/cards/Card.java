package uk.co.rdl.cards;

public class Card implements Comparable<Card> {
    private final String suit;
    private final String symbol;
    private final int value;

    public Card(String symbol, String suit, int value) {
        this.value = value;
        this.symbol = symbol;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format("%s%s", this.symbol, this.suit);
    }

    @Override
    public int compareTo(Card card) {
        return Integer.compare(this.value, card.value);
    }
}
