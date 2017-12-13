/**
 * @author Karan
 * <p>
 * This is a class that defines an exception which is thrown when the deck of cards is empty.
 */
public class NoCardsLeftException extends Exception {

    /**
     * Default Constructor
     */
    public NoCardsLeftException() {
    }

    /**
     * A constructor that takes in message
     *
     * @param message : Exception message
     */
    public NoCardsLeftException(String message) {
        super(message);
    }
}