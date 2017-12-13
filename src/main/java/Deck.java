import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Karan
 * <p>
 * This class defines the deck of cards and provides the functionality
 * to shuffleCards the cards and deal a card from the deck.
 */
class Deck {

    /**
     * A list of cards
     */
    private ArrayList<Card> cards;

    /**
     * Initialize the deck of cards, with all original cards in the deck
     */
    Deck() {

        cards = new ArrayList<>();

        for (Card.Suit suit : Card.Suit.values())
            for (Card.FaceValue faceValue : Card.FaceValue.values())
                cards.add(new Card(faceValue, suit));
    }

    /**
     * Shuffle the remaining deck
     */
    void shuffleCards() {
        Collections.shuffle(cards);
    }

    /**
     * @return the dealt card from the top of the deck of cards
     * @throws NoCardsLeftException is thrown when the deck of cards is empty.
     */
    Card dealACard() throws NoCardsLeftException {
        if (cards.size() == 0) {
            throw new NoCardsLeftException("There are no cards left in the deck");
        }
        Card temp = cards.remove(0);
        temp.setAvailable(false);
        return temp;
    }

    /**
     * @return a list containing the cards remaining in the deck
     */
    ArrayList<Card> getCards() {
        return cards;
    }
}