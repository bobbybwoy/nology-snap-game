package uk.co.rdl.enums;

public enum Suit {
    HEARTS("♥️"),
    CLUBS("♣️"),
    DIAMONDS("♦️"),
    SPADES("♠️");

    private final String displayValue;

    Suit(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
