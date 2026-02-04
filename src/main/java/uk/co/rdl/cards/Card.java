package uk.co.rdl.cards;

public class Card {
    private int cardValue;

    public Card(int cardValue) {
        this.cardValue = cardValue;
    }

    public int getCardValue() {
        return this.cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    @Override
    public String toString() {
        return "Card value is " + this.cardValue;
    }
}
