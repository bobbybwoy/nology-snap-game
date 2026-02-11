package uk.co.rdl.enums;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SymbolTest {

    @Test
    @DisplayName("Symbol contains the correct card symbol values")
    void testSymbolEnum() {
        assertAll("Symbol contains the correct symbol values",
                () -> assertEquals("TWO", Symbol.TWO.name()),
                () -> assertEquals("FIVE", Symbol.FIVE.name()),
                () -> assertEquals("TEN", Symbol.TEN.name()),
                () -> assertEquals("KING", Symbol.KING.name()),
                () -> assertEquals("ACE", Symbol.ACE.name()),
                () -> assertEquals(13, Symbol.values().length));
    }

    @Test
    @DisplayName("Symnbol can display the presentation value")
    void getDisplayValue_Symbol_CorrectValues() {

        assertAll("Calling getDisplayValue gets the presentation value",
                () -> assertEquals("2", Symbol.TWO.getDisplayValue()),
                () -> assertEquals("5", Symbol.FIVE.getDisplayValue()),
                () -> assertEquals("10", Symbol.TEN.getDisplayValue()),
                () -> assertEquals("K", Symbol.KING.getDisplayValue()),
                () -> assertEquals("A", Symbol.ACE.getDisplayValue()));
    }
}
