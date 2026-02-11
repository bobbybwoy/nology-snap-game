package uk.co.rdl.cards;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import uk.co.rdl.enums.Suit;
import uk.co.rdl.enums.Symbol;

import static org.junit.jupiter.api.Assertions.*;

public class CardTest {

    private Card card1;
    private Card card2;
    private Card card3;
    private Card card4;
    private Card card5;
    private Card card6;

    @BeforeEach
    void setUp() {
        card1 = new Card(Symbol.TWO.name(), Suit.HEARTS.name(), Symbol.TWO.ordinal() + 2);
        card2 = new Card(Symbol.FIVE.name(), Suit.CLUBS.name(), Symbol.FIVE.ordinal() + 2);
        card3 = new Card(Symbol.KING.name(), Suit.DIAMONDS.name(), Symbol.KING.ordinal() + 2);
        card4 = new Card(Symbol.ACE.name(), Suit.SPADES.name(), Symbol.ACE.ordinal() + 2);
        card5 = new Card(Symbol.TEN.name(), Suit.DIAMONDS.name(), Symbol.TEN.ordinal() + 2);
        card6 = new Card(Symbol.FIVE.name(), Suit.SPADES.name(), Symbol.FIVE.ordinal() + 2);
    }

    @Test
    @DisplayName("Cards have the correct suits")
    void getSuit_CardsCreated_CorrectSuits() {
        assertAll("All cards have the correct suit",
                () -> assertEquals(Suit.HEARTS.name(), card1.getSuit()),
                () -> assertEquals(Suit.CLUBS.name(), card2.getSuit()),
                () -> assertEquals(Suit.DIAMONDS.name(), card3.getSuit()),
                () -> assertEquals(Suit.SPADES.name(), card4.getSuit()),
                () -> assertEquals(Suit.DIAMONDS.name(), card5.getSuit()),
                () -> assertEquals(Suit.SPADES.name(), card6.getSuit()));
    }

    @Test
    @DisplayName("Cards have the correct symbols")
    void getSymbol_CardsCreated_CorrectSymbols() {
        assertAll("All cards have the correct symbols",
                () -> assertEquals(Symbol.TWO.name(), card1.getSymbol()),
                () -> assertEquals(Symbol.FIVE.name(), card2.getSymbol()),
                () -> assertEquals(Symbol.KING.name(), card3.getSymbol()),
                () -> assertEquals(Symbol.ACE.name(), card4.getSymbol()),
                () -> assertEquals(Symbol.TEN.name(), card5.getSymbol()),
                () -> assertEquals(Symbol.FIVE.name(), card6.getSymbol()));
    }

    @Test
    @DisplayName("Cards have the correct values")
    void getValue_CardsCreated_CorrectValues() {
        assertAll("All cards have the correct values",
                () -> assertEquals(2, card1.getValue()),
                () -> assertEquals(5, card2.getValue()),
                () -> assertEquals(13, card3.getValue()),
                () -> assertEquals(14, card4.getValue()),
                () -> assertEquals(10, card5.getValue()),
                () -> assertEquals(5, card6.getValue()));
    }

    @Test
    @DisplayName("Cards show the correct presentation")
    void displayCard_CardsCreated_CorrectlyDisplayed() {
        String twoOfHearts = "2♥️";
        String fiveOfClubs = "5♣️";
        String kingOfDiamonds = "K♦️";
        String aceOfSpades = "A♠️"; // I didn't think of this when I was creating the data
        String tenOfDiamonds = "10♦️";
        String fiveOfSpades = "5♠️";

        assertAll("Cards are displayed correctly",
                () -> assertEquals(twoOfHearts, card1.displayCard()),
                () -> assertEquals(fiveOfClubs, card2.displayCard()),
                () -> assertEquals(kingOfDiamonds, card3.displayCard()),
                () -> assertEquals(aceOfSpades, card4.displayCard()),
                () -> assertEquals(tenOfDiamonds, card5.displayCard()),
                () -> assertEquals(fiveOfSpades, card6.displayCard()));
    }

    @Test
    @DisplayName("Cards can be compared against each other")
    void compareTo_CardsCreated_CorrectlyCompared() {
        assertAll("Cards can be compared to each other",
                () -> assertTrue(card1.compareTo(card2) < 0),
                () -> assertTrue(card2.compareTo(card3) < 0),
                () -> assertTrue(card3.compareTo(card4) < 0),
                () -> assertFalse(card4.compareTo(card5) < 0),
                () -> assertFalse(card5.compareTo(card6) < 0),
                () -> assertTrue(card1.compareTo(card5) < 0),
                () -> assertTrue(card2.compareTo(card6) == 0));
    }

    @Test
    @DisplayName("Cards are described correctly")
    void toString_CardsCreated_OutputIsCorrect() {
        String card1Output="Card{suit=HEARTS, symbol=TWO, value=2}";
        String card2Output="Card{suit=CLUBS, symbol=FIVE, value=5}";
        String card3Output="Card{suit=DIAMONDS, symbol=KING, value=13}";
        String card4Output="Card{suit=SPADES, symbol=ACE, value=14}";
        String card5Output="Card{suit=DIAMONDS, symbol=TEN, value=10}";
        String card6Output="Card{suit=SPADES, symbol=FIVE, value=5}";

        assertAll("Cards are described correctly",
                () -> assertEquals(card1Output, card1.toString()),
                () -> assertEquals(card2Output, card2.toString()),
                () -> assertEquals(card3Output, card3.toString()),
                () -> assertEquals(card4Output, card4.toString()),
                () -> assertEquals(card5Output, card5.toString()),
                () -> assertEquals(card6Output, card6.toString()));
    }
}
