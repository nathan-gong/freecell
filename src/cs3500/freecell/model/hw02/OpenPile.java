package cs3500.freecell.model.hw02;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an Open pile of cards.
 */
public class OpenPile extends APile<ICard> {

  /**
   * Constructs an open pile with the given list of cards.
   *
   * @param pile  the given list of cards
   * @param index the index of the pile (1-indexed)
   * @throws IllegalArgumentException if the index is not positive or the list of cards is null
   */
  public OpenPile(List<ICard> pile, int index) throws IllegalArgumentException {
    super(pile, index);

    if (index < 1) {
      throw new IllegalArgumentException("Index must be at least 1");
    }
  }

  /**
   * Constructs an empty open pile.
   *
   * @param index the index of the pile (1-indexed)
   * @throws IllegalArgumentException if the index is not positive or the list of cards is null
   */
  public OpenPile(int index) throws IllegalArgumentException {
    this(new ArrayList<>(), index);
  }

  @Override
  protected boolean isValidAdd(ICard card) throws IllegalArgumentException {
    // check if the given card is valid
    if (card == null) {
      throw new IllegalArgumentException("Given card was null");
    }
    // if the pile is empty, the card can be added
    return pile.size() == 0;
  }

  @Override
  public String toString() {
    return "O" + toStringHelp();
  }
}
