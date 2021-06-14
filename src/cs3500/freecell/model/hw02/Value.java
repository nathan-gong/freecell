package cs3500.freecell.model.hw02;

import cs3500.freecell.Utils;

/**
 * Value of a playing card. In increasing order, values include: A, 2-10, J, Q, K.
 */
public enum Value {
  ACE(1, "A"),
  TWO(2, "2"),
  THREE(3, "3"),
  FOUR(4, "4"),
  FIVE(5, "5"),
  SIX(6, "6"),
  SEVEN(7, "7"),
  EIGHT(8, "8"),
  NINE(9, "9"),
  TEN(10, "10"),
  JACK(11, "J"),
  QUEEN(12, "Q"),
  KING(13, "K");

  private final int value;
  private final String rep;

  /**
   * Constructs a value of a playing card.
   *
   * @param value the value of a playing card
   * @param rep   the String representation of the value of a playing card
   * @throws IllegalArgumentException if the rep is null
   */
  Value(int value, String rep) throws IllegalArgumentException {
    this.value = value;
    this.rep = Utils.requireNonNull(rep);
  }

  @Override
  public String toString() {
    return this.rep;
  }

  /**
   * Returns the value of a playing card.
   *
   * @return the value of a playing card
   */
  public int getValue() {
    return this.value;
  }
}

