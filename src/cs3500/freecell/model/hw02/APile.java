package cs3500.freecell.model.hw02;

import cs3500.freecell.Utils;
import java.util.Iterator;
import java.util.List;

/**
 * Abstract base class for implementations of IPiles.
 *
 * @param <K> a generic card type
 */
abstract class APile<K> implements IPile<K> {

  protected List<K> pile;
  protected int index;

  /**
   * Constructs a pile with a list of cards.
   *
   * @param pile  the list of cards
   * @param index the index of the pile (1-indexed)
   * @throws IllegalArgumentException if the index is invalid or the list of cards is null
   */
  APile(List<K> pile, int index) throws IllegalArgumentException {
    this.pile = Utils.requireNonNull(pile);
    this.index = index;
  }

  @Override
  public void add(K card) throws IllegalArgumentException {
    if (isValidAdd(card)) {
      this.pile.add(card);
    } else {
      throw new IllegalArgumentException("Card cannot be added to pile");
    }
  }

  @Override
  public void remove() throws IllegalStateException {
    if (isValidRemove()) {
      this.pile.remove(this.pile.size() - 1);
    } else {
      throw new IllegalStateException("Card cannot be removed from pile");
    }
  }

  @Override
  public List<K> getPile() {
    return this.pile;
  }

  /**
   * Checks if the given card can be added to the pile.
   *
   * @param card the card to be checked for validity to add to the pile
   * @return whether the card can be added to the pile
   * @throws IllegalArgumentException if the given card is invalid
   */
  protected abstract boolean isValidAdd(K card) throws IllegalArgumentException;

  /**
   * Checks if a card can be removed from the end of the pile.
   *
   * @return whether a card may be removed
   */
  protected boolean isValidRemove() {
    return this.pile.size() > 0;
  }

  /**
   * Returns a string representation of the cards within the pile.
   *
   * @return a string representation of the cards in the pile
   */
  protected String toStringHelp() {
    Iterator<K> iter = this.pile.iterator();
    String label = this.index + ":";
    StringBuilder cards = new StringBuilder(label + " ");

    if (iter.hasNext()) {
      K card = iter.next();
      cards.append(card.toString());
    } else {
      return label;
    }

    while (iter.hasNext()) {
      K card = iter.next();
      cards.append(", ");
      cards.append(card.toString());
    }
    return cards.toString();
  }
}
