package cs3500.freecell.model.hw02;

import cs3500.freecell.Utils;

/**
 * Type of suit of a playing card: Clubs, Diamonds, Hearts, Spades.
 */
public enum Suit {
  CLUB("♣", "BLACK"), DIAMOND("♦", "RED"), HEART("♥", "RED"), SPADE("♠", "BLACK");

  private final String suit;
  private final String color;

  /**
   * Constructs a suit of a playing card.
   *
   * @param suit  the suit of a playing card
   * @param color the color of a playing card
   * @throws IllegalArgumentException if the suit or color are null
   */
  Suit(String suit, String color) throws IllegalArgumentException {
    this.suit = Utils.requireNonNull(suit);
    this.color = Utils.requireNonNull(color);
  }

  @Override
  public String toString() {
    return this.suit;
  }

  /**
   * Returns the color of a playing card.
   *
   * @return the color of a playing card
   */
  public String getColor() {
    return this.color;
  }
}
