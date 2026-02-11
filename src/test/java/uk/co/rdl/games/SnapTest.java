package uk.co.rdl.games;

import org.junit.jupiter.api.*;
import uk.co.rdl.cards.Card;
import uk.co.rdl.enums.Suit;
import uk.co.rdl.enums.Symbol;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SnapTest {

    private final int CARD_VALUE_UPLIFT = 2;
    private final String snapGameName = "SNAP!";
    // Source
    private final InputStream originalSystemIn = System.in;
    private ByteArrayInputStream testIn;
    private Snap snapGame;
    private Card expectedCard1;
    private Card expectedCard2;
    private Card expectedCard3;

    @BeforeEach
    void setUp() {
        expectedCard1 = new Card(Symbol.TWO.name(), Suit.HEARTS.name(), Symbol.TWO.ordinal() + CARD_VALUE_UPLIFT);
        expectedCard2 = new Card(Symbol.THREE.name(), Suit.HEARTS.name(), Symbol.THREE.ordinal() + CARD_VALUE_UPLIFT);
        expectedCard3 = new Card(Symbol.FOUR.name(), Suit.HEARTS.name(), Symbol.FOUR.ordinal() + CARD_VALUE_UPLIFT);

        snapGame = new Snap(snapGameName);
    }

    @AfterEach
    void restoreSystemIn() {
        // Restore System.in after each test
        System.setIn(originalSystemIn);
    }

    @Test
    @DisplayName("Snap Game can deal cards")
    void dealCard_SnapGame_ReturnCard() {
        Card expectedCard = new Card(Symbol.TWO.name(), Suit.HEARTS.name(), Symbol.TWO.ordinal() + CARD_VALUE_UPLIFT);
        Card actualCard = snapGame.dealCard();

        assertAll("The cards are the same",
                () -> assertEquals(expectedCard.getSymbol(), actualCard.getSymbol()),
                () -> assertEquals(expectedCard.getSuit(), actualCard.getSuit()),
                () -> assertEquals(expectedCard.getValue(), actualCard.getValue()));
    }

    @Test
    @DisplayName("Snap Game can sort cards in number order")
    void sortDeckInNumberOrder_SnapGameCreated_SortOrderCorrect() {
        int expectedValueOfFirstFourCards = 2;
        int expectedValueOfMiddleFourCards = 8;
        int expectedValueOfLastFourCards = 14;

        List<Card> deckOfCards = snapGame.sortDeckInNumberOrder();

        assertAll("Cards are sorted by number",
                () -> assertEquals(expectedValueOfFirstFourCards, deckOfCards.get(0).getValue()),
                () -> assertEquals(expectedValueOfFirstFourCards, deckOfCards.get(1).getValue()),
                () -> assertEquals(expectedValueOfFirstFourCards, deckOfCards.get(2).getValue()),
                () -> assertEquals(expectedValueOfFirstFourCards, deckOfCards.get(3).getValue()),
                () -> assertEquals(expectedValueOfMiddleFourCards, deckOfCards.get(24).getValue()),
                () -> assertEquals(expectedValueOfMiddleFourCards, deckOfCards.get(25).getValue()),
                () -> assertEquals(expectedValueOfMiddleFourCards, deckOfCards.get(26).getValue()),
                () -> assertEquals(expectedValueOfMiddleFourCards, deckOfCards.get(27).getValue()),
                () -> assertEquals(expectedValueOfLastFourCards, deckOfCards.get(48).getValue()),
                () -> assertEquals(expectedValueOfLastFourCards, deckOfCards.get(49).getValue()),
                () -> assertEquals(expectedValueOfLastFourCards, deckOfCards.get(50).getValue()),
                () -> assertEquals(expectedValueOfLastFourCards, deckOfCards.get(51).getValue()));
    }

    @Test
    @DisplayName("Snap Game can sort card in suit order")
    void sortDeckIntoSuits_SnapGameCreated_SortOrderCorrect() {
        Card card1 = new Card(Symbol.TWO.name(), Suit.HEARTS.name(), Symbol.TWO.ordinal() + CARD_VALUE_UPLIFT);
        Card card2 = new Card(Symbol.THREE.name(), Suit.HEARTS.name(), Symbol.THREE.ordinal() + CARD_VALUE_UPLIFT);
        Card card3 = new Card(Symbol.FOUR.name(), Suit.HEARTS.name(), Symbol.FOUR.ordinal() + CARD_VALUE_UPLIFT);
        Card card4 = new Card(Symbol.FIVE.name(), Suit.HEARTS.name(), Symbol.FIVE.ordinal() + CARD_VALUE_UPLIFT);
        Card card5 = new Card(Symbol.TWO.name(), Suit.DIAMONDS.name(), Symbol.TWO.ordinal() + CARD_VALUE_UPLIFT);
        Card card6 = new Card(Symbol.THREE.name(), Suit.DIAMONDS.name(), Symbol.THREE.ordinal() + CARD_VALUE_UPLIFT);
        Card card7 = new Card(Symbol.FOUR.name(), Suit.DIAMONDS.name(), Symbol.FOUR.ordinal() + CARD_VALUE_UPLIFT);
        Card card8 = new Card(Symbol.FIVE.name(), Suit.DIAMONDS.name(), Symbol.FIVE.ordinal() + CARD_VALUE_UPLIFT);
        Card card9 = new Card(Symbol.TWO.name(), Suit.SPADES.name(), Symbol.TWO.ordinal() + CARD_VALUE_UPLIFT);
        Card card10 = new Card(Symbol.THREE.name(), Suit.SPADES.name(), Symbol.THREE.ordinal() + CARD_VALUE_UPLIFT);
        Card card11 = new Card(Symbol.FOUR.name(), Suit.SPADES.name(), Symbol.FOUR.ordinal() + CARD_VALUE_UPLIFT);
        Card card12= new Card(Symbol.FIVE.name(), Suit.SPADES.name(), Symbol.FIVE.ordinal() + CARD_VALUE_UPLIFT);

        List<Card> deckOfCards = snapGame.sortDeckIntoSuits();

        assertAll("Cards are ordered by suit",
                () -> assertEquals(card1.getSymbol(), deckOfCards.get(0).getSymbol()),
                () -> assertEquals(card1.getSuit(), deckOfCards.get(0).getSuit()),
                () -> assertEquals(card1.getValue(), deckOfCards.get(0).getValue()),
                () -> assertEquals(card2.getSymbol(), deckOfCards.get(1).getSymbol()),
                () -> assertEquals(card2.getSuit(), deckOfCards.get(1).getSuit()),
                () -> assertEquals(card2.getValue(), deckOfCards.get(1).getValue()),
                () -> assertEquals(card3.getSymbol(), deckOfCards.get(2).getSymbol()),
                () -> assertEquals(card3.getSuit(), deckOfCards.get(2).getSuit()),
                () -> assertEquals(card3.getValue(), deckOfCards.get(2).getValue()),
                () -> assertEquals(card4.getSymbol(), deckOfCards.get(3).getSymbol()),
                () -> assertEquals(card4.getSuit(), deckOfCards.get(3).getSuit()),
                () -> assertEquals(card4.getValue(), deckOfCards.get(3).getValue()),
                () -> assertEquals(card5.getSymbol(), deckOfCards.get(26).getSymbol()),
                () -> assertEquals(card5.getSuit(), deckOfCards.get(26).getSuit()),
                () -> assertEquals(card5.getValue(), deckOfCards.get(26).getValue()),
                () -> assertEquals(card6.getSymbol(), deckOfCards.get(27).getSymbol()),
                () -> assertEquals(card6.getSuit(), deckOfCards.get(27).getSuit()),
                () -> assertEquals(card6.getValue(), deckOfCards.get(27).getValue()),
                () -> assertEquals(card7.getSymbol(), deckOfCards.get(28).getSymbol()),
                () -> assertEquals(card7.getSuit(), deckOfCards.get(28).getSuit()),
                () -> assertEquals(card7.getValue(), deckOfCards.get(28).getValue()),
                () -> assertEquals(card8.getSymbol(), deckOfCards.get(29).getSymbol()),
                () -> assertEquals(card8.getSuit(), deckOfCards.get(29).getSuit()),
                () -> assertEquals(card8.getValue(), deckOfCards.get(29).getValue()),
                () -> assertEquals(card9.getSymbol(), deckOfCards.get(39).getSymbol()),
                () -> assertEquals(card9.getSuit(), deckOfCards.get(39).getSuit()),
                () -> assertEquals(card9.getValue(), deckOfCards.get(39).getValue()),
                () -> assertEquals(card10.getSymbol(), deckOfCards.get(40).getSymbol()),
                () -> assertEquals(card10.getSuit(), deckOfCards.get(40).getSuit()),
                () -> assertEquals(card10.getValue(), deckOfCards.get(40).getValue()),
                () -> assertEquals(card11.getSymbol(), deckOfCards.get(41).getSymbol()),
                () -> assertEquals(card11.getSuit(), deckOfCards.get(41).getSuit()),
                () -> assertEquals(card11.getValue(), deckOfCards.get(41).getValue()),
                () -> assertEquals(card12.getSymbol(), deckOfCards.get(42).getSymbol()),
                () -> assertEquals(card12.getSuit(), deckOfCards.get(42).getSuit()),
                () -> assertEquals(card12.getValue(), deckOfCards.get(42).getValue()));
    }

    @Test
    @DisplayName("Snap Game can shuffle deck of cards")
    void shuffleDeck_SnapGameCreated_RandomCardsSelected() {
        // This test is flaky because even if the deck is shuffled, some or all
        // the tests will fail.
        List <Card> shuffledDeck = snapGame.shuffleDeck();

        assertAll("The cards at the top of the deck are not same",
                () -> assertNotEquals(expectedCard1, shuffledDeck.get(0)),
                () -> assertNotEquals(expectedCard2, shuffledDeck.get(1)),
                () -> assertNotEquals(expectedCard3, shuffledDeck.get(2)));
    }

    @Test
    @DisplayName("Snap allows taking turns")
    void takeTurn_SnapGameCreated_ReturnsCard() {
        String enterPressed = "\r";
        testIn = new ByteArrayInputStream(enterPressed.getBytes());
        System.setIn(testIn);

        // Card card = snapGame.takeTurn();
        assertInstanceOf(Card.class, snapGame.takeTurn());
    }

    /*
        I have considered testing the `play()` method but as it relies
        on the Scanner.nextLine() method, once it has seen the enterPressed
        value, there is nothing left to read and, as a result, the application
        is left waiting for an interaction that will never come.
        So, this test is marked as disabled.
     */
    @Test
    @DisplayName("Snap game can play the game")
    @Disabled
    void play_SnapGameCreated_ReturnsTrue() {
        String enterPressed = "\r";
        testIn = new ByteArrayInputStream(enterPressed.getBytes());
        System.setIn(testIn);

        snapGame.shuffleDeck();
        assertTrue(snapGame.play());
    }
}
