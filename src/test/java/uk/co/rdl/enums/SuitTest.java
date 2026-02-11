package uk.co.rdl.enums;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuitTest {

    @Test
    @DisplayName("Suit contains the correct card suit values")
    void testSuitEnum() {
        assertAll("Suit contain the correct values",
                () -> assertEquals("HEARTS", Suit.HEARTS.name()),
                () -> assertEquals("SPADES", Suit.SPADES.name()),
                () -> assertEquals(4, Suit.values().length));
    }

    @Test
    @DisplayName("Suit can display the presentation value")
    void getDisplayValue_Suit_CorrectValues() {
        String hearts = "♥️";
        String clubs = "♣️";
        String diamonds = "♦️";
        String spades = "♠️";

        assertAll("Calling getDisplayValue gets the presentation value",
                () -> assertEquals(hearts, Suit.HEARTS.getDisplayValue()),
                () -> assertEquals(clubs, Suit.CLUBS.getDisplayValue()),
                () -> assertEquals(diamonds, Suit.DIAMONDS.getDisplayValue()),
                () -> assertEquals(spades, Suit.SPADES.getDisplayValue()));
    }
}
