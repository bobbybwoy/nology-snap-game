package uk.co.rdl.cards;

public class PlayingCard extends Card {
    private String suit;
    private String rank;

    public PlayingCard(String rank, String suit, int cardValue) {
        super(cardValue);
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format("%s%s", this.rank, this.suit);
    }
}
