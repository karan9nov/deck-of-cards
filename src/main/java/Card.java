/**
 * @author Karan
 * <p>
 * This is a class that defines the cards, using enums to create the face value and suits.
 * Face Value ranges from 1 to 13, and suit ranges from 0 to 3, and they are assigned with their corresponding values.
 */

class Card {

    /**
     * @see java.lang.Enum
     * Enum for the face values of each card.
     */
    enum FaceValue {

        // Enums with face values of each card
        Ace(1), Two(2), Three(3),
        Four(4), Five(5), Six(6),
        Seven(7), Eight(8), Nine(9),
        Ten(10), Jack(11), Queen(12), King(13);

        // The value on each card
        private int value;

        // Constructor with parameter as the value
        FaceValue(int value) {
            this.value = value;
        }

        // getter method
        int getValue() {
            return value;
        }

        // setter method
        void setValue(int value) {
            this.value = value;
        }
    }

    /**
     * @see java.lang.Enum
     * Enum for the four suits in the deck of cards.
     */
    enum Suit {

        // Enum with four suits and their corresponding values
        Spades(0), Hearts(1), Diamonds(2), Clubs(3);

        // the value representing the suit
        private int value;

        /**
         * Constructor
         *
         * @param value: value with which we want to initialize the object.
         */
        Suit(int value) {
            this.value = value;
        }

        // getter method
        int getValue() {
            return this.value;
        }

    }

    // this defines whether the card is available in the deck or not.
    private boolean available = true;

    // this defines the face value of the card
    private FaceValue faceValue;

    // this defines the suit of the card
    private Suit suit;

    /**
     * Constructor to create a new card with face value and suit
     *
     * @param faceValue: face value of the card
     * @param suit:      suit of the card
     */
    Card(FaceValue faceValue, Suit suit) {

        this.faceValue = faceValue;
        this.suit = suit;

    }

    /**
     * Method tells the availability of the card in the deck
     *
     * @return true of false, whether the card is available.
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Setter method for field available
     *
     * @param available: Making a card available or not in the deck
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * Getter method for field faceValue
     *
     * @return the face value of the card
     */
    public FaceValue getFaceValue() {
        return faceValue;
    }

    /**
     * Setter method for field faceValue
     *
     * @param faceValue: Set the face value of the card with this parameter
     */
    public void setFaceValue(FaceValue faceValue) {
        this.faceValue = faceValue;
    }

    /**
     * Getter method for field suit
     *
     * @return the face value of the card
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * Setter method for field suit
     *
     * @param suit: Set the suit of the card with this parameter
     */
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    /**
     * @return String with face value and suit of the card
     */
    @Override
    public String toString() {
        return getFaceValue() + " of " + getSuit();
    }
}
