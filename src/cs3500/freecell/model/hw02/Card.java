package cs3500.freecell.model.hw02;

import cs3500.freecell.Utils;

/**
 * Represents a playing card from a standard 52-card deck used to play Freecall.
 */
public class Card implements ICard {

  private final Value value;
  private final Suit suit;

  /**
   * Constructs a Card with a Value and Suit from a standard deck.
   *
   * @param value the value of a card
   * @param suit the suit of a card
   * @throws IllegalArgumentException if the value or suit are null
   */
  public Card(Value value, Suit suit) throws IllegalArgumentException {
    this.value = Utils.requireNonNull(value);
    this.suit = Utils.requireNonNull(suit);
  }

  @Override
  public Value getValue() {
    return this.value;
  }

  @Override
  public Suit getSuit() {
    return this.suit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (!(o instanceof Card)) {
      return false;
    }

    Card other = (Card) o;

    return this.suit.toString().equals(other.suit.toString())
        && this.value.getValue() == other.value.getValue();
  }

  @Override
  public int hashCode() {
    return this.suit.toString().hashCode() + Integer.hashCode(this.value.getValue());
  }

  @Override
  public String toString() {
    return this.value.toString() + this.suit.toString();
  }
}
