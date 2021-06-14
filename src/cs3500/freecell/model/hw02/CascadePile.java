package cs3500.freecell.model.hw02;


import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Cascade pile of cards.
 */
public class CascadePile extends APile<ICard> {

  /**
   * Constructs a cascade pile with the given list of cards.
   *
   * @param pile  the given list of cards
   * @param index the index of the pile (1-indexed)
   * @throws IllegalArgumentException if the index is not positive or the list of cards is null
   */
  public CascadePile(List<ICard> pile, int index) throws IllegalArgumentException {
    super(pile, index);

    if (index < 1) {
      throw new IllegalArgumentException("Index must be at least 1");
    }
  }

  /**
   * Constructs an empty cascade pile.
   *
   * @param index the index of the pile (1-indexed)
   * @throws IllegalArgumentException if the index is not positive or the list of cards is null
   */
  public CascadePile(int index) throws IllegalArgumentException {
    this(new ArrayList<>(), index);
  }

  @Override
  protected boolean isValidAdd(ICard card) throws IllegalArgumentException {
    // check if the given card is valid
    if (card == null) {
      throw new IllegalArgumentException("Given card was null");
    }
    // if the pile is empty, the card can be added
    if (pile.size() == 0) {
      return true;
    }
    // if the pile is not empty, check that the given card has a different color and a value one
    // less than the card at the end of the pile
    else {
      ICard top = pile.get(pile.size() - 1);
      return !(card.getSuit().getColor().equals(top.getSuit().getColor()))
          && (card.getValue().getValue() + 1 == top.getValue().getValue());
    }
  }

  @Override
  public String toString() {
    return "C" + toStringHelp();
  }
}
