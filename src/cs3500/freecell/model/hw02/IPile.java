package cs3500.freecell.model.hw02;

import java.util.List;

/**
 * Represents types of piles of playing cards in a Freecell game.
 */
public interface IPile<K> {

  /**
   * Adds a card to the end of a pile.
   *
   * @param card the card to be added
   * @throws IllegalArgumentException if the card cannot be added
   */
  void add(K card) throws IllegalArgumentException;

  /**
   * Removes the card at the of a pile.
   *
   * @throws IllegalStateException if a card cannot be removed
   */
  void remove() throws IllegalStateException;

  /**
   * Returns the pile as a List.
   *
   * @return the pile as a List
   */
  List<K> getPile();
}
