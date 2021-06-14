package cs3500.freecell.model.hw02;

/**
 * Represents playing cards within a standard 52-card deck.
 *
 * <p>All cards have a Value: A, 2-10, J, Q, K.</p>
 *
 * <p>All cards have a Suit: Clubs, Diamonds, Hearts, Spades.</p>
 */
public interface ICard {

  /**
   * Returns the value of a playing card.
   *
   * @return the value of a playing card
   */
  Value getValue();

  /**
   * Returns the suit of a playing card.
   *
   * @return the suit of a playing card.
   */
  Suit getSuit();
}
