import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.*;

import java.util.ArrayList;

/**
 * @author Karan
 * <p>
 * JUnit Test to validate the functionality of the application.
 */
public class DeckTest {

    private Deck deck;

    /**
     * This method is run before running any other methods
     */
    @Before
    public void setUp() {
        this.deck = new Deck();
    }

    /**
     * This method is run after running all other methods
     */
    @After
    public void tearDown() {
        this.deck = null;
    }

    /**
     * Test case to see the functionality of shuffleCards the cards
     */
    @Test
    public void testShuffle() {
        ArrayList<Card> origList = new ArrayList<>(deck.getCards());
        deck.shuffleCards();
        ArrayList<Card> shuffledList = new ArrayList<>(deck.getCards());
        assertNotEquals(origList, shuffledList);
    }

    /**
     * Test case to deal a card when the deck contains multiple cards
     */
    @Test
    public void testDealACardWithMultipleCards() {

        boolean result = false;

        int initialDeckSize = deck.getCards().size();
        Card card = null;
        try {
            card = deck.dealACard();
        } catch (NoCardsLeftException e) {
            System.out.println(e.getMessage());
        }
        int finalDeckSize = deck.getCards().size();

        if (card != null && (finalDeckSize + 1 == initialDeckSize))
            result = true;

        assertTrue(result);
    }

    /**
     * Test to deal when deck is empty
     */
    @Test
    public void testDealACardWithNoCards() {
        System.out.println(deck.getCards());
        deck.getCards().clear();
        try {
            deck.dealACard();
        } catch (NoCardsLeftException e) {
            assertThat(e.getMessage(), is("There are no cards left in the deck"));
        }

    }
}