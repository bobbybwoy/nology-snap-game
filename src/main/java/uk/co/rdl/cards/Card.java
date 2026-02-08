package uk.co.rdl.cards;

import uk.co.rdl.enums.Suit;
import uk.co.rdl.enums.Symbol;

public class Card implements Comparable<Card> {
    private final String suit;
    private final String symbol;
    private final int value;

    public Card(String symbol, String suit, int value) {
        this.value = value;
        this.symbol = symbol;
        this.suit = suit;
    }

    public String getSymbol() {
        return Symbol.valueOf(this.symbol).getDisplayValue();
    }

    public String displayCard() {
        return String.format("%s%s", Symbol.valueOf(this.symbol).getDisplayValue(), Suit.valueOf(this.suit).getDisplayValue());    }

    public int getOrdinalValues() {
        return Integer.parseInt(
                String.format(
                        "%d%02d",
                        Suit.valueOf(this.suit).ordinal(),
                        Symbol.valueOf(this.symbol).ordinal()
                )
        );
    }

    @Override
    public int compareTo(Card card) {
        return Integer.compare(this.value, card.value);
    }

    @Override
    public String toString() {
        return String.format("Card{suit=%s, symbol=%s, value=%d}", this.suit, this.symbol, this.value);
    }
}
