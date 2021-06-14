package cs3500.freecell.model.hw02;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Foundation pile of cards.
 */
public class FoundationPile extends APile<ICard> {

  /**
   * Constructs a foundation pile with the given list of cards.
   *
   * @param pile  the given list of cards
   * @param index the index of the pile (1-indexed)
   * @throws IllegalArgumentException if the index is not between 1-4 or the list of cards is null
   */
  public FoundationPile(List<ICard> pile, int index) throws IllegalArgumentException {
    super(pile, index);

    if (index < 1 || index > 4) {
      throw new IllegalArgumentException("Index must be between 1 and 4");
    }
  }

  /**
   * Constructs an empty foundation pile.
   *
   * @param index the index of the pile (1-indexed)
   * @throws IllegalArgumentException if the index is not between 1-4 or the list of cards is null
   */
  public FoundationPile(int index) throws IllegalArgumentException {
    this(new ArrayList<>(), index);
  }

  @Override
  protected boolean isValidAdd(ICard card) throws IllegalArgumentException {
    // check if the given card is valid
    if (card == null) {
      throw new IllegalArgumentException("Given card was null");
    }
    // if the pile is empty, check if the given card is an Ace
    if (pile.size() == 0) {
      return card.getValue().getValue() == 1;
    }
    // if the pile is not empty, check that the given card matches the suit and has a value one
    // greater than the card at the end of the pile
    else {
      ICard top = pile.get(pile.size() - 1);
      return card.getSuit().toString().equals(top.getSuit().toString())
          && card.getValue().getValue() - 1 == top.getValue().getValue();
    }
  }

  @Override
  protected boolean isValidRemove() {
    return false;
  }

  @Override
  public String toString() {
    return "F" + toStringHelp();
  }
}
