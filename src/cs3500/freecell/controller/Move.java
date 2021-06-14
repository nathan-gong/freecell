package cs3500.freecell.controller;

import cs3500.freecell.Utils;
import cs3500.freecell.model.FreecellModel;
import cs3500.freecell.model.PileType;
import cs3500.freecell.model.hw02.ICard;

/**
 * Represents a command object to perform a move in a Freecell game.
 */
public class Move {

  private PileType source;
  private Integer pileNumber;
  private Integer cardIndex;
  private PileType destination;
  private Integer destPileNumber;

  /**
   * Constructs a move object using default values.
   */
  public Move() {
    source = null;
    pileNumber = null;
    cardIndex = null;
    destination = null;
    destPileNumber = null;
  }

  /**
   * Sets the source pile type to the given value.
   *
   * @param source the pile type to be set
   * @return this move object
   * @throws IllegalArgumentException if the given pile type is null
   */
  public Move setSource(PileType source) throws IllegalArgumentException {
    this.source = Utils.requireNonNull(source);
    return this;
  }

  /**
   * Sets the pile number to the given value.
   *
   * @param pileNumber the pile number to be set
   * @return this move object
   */
  public Move setPileNumber(int pileNumber) {
    this.pileNumber = pileNumber;
    return this;
  }

  /**
   * Sets the card index to the given value.
   *
   * @param cardIndex the card index to be set
   * @return this move object
   */
  public Move setCardIndex(int cardIndex) {
    this.cardIndex = cardIndex;
    return this;
  }

  /**
   * Sets the destination pile type to the given value.
   *
   * @param destination the pile type to be set
   * @return this move object
   * @throws IllegalArgumentException if the given pile type is null
   */
  public Move setDestination(PileType destination) throws IllegalArgumentException {
    this.destination = Utils.requireNonNull(destination);
    return this;
  }

  /**
   * Sets the destination pile number to the given value.
   *
   * @param destPileNumber the pile number to be set
   * @return this move object
   */
  public Move setDestPileNumber(int destPileNumber) {
    this.destPileNumber = destPileNumber;
    return this;
  }

  /**
   * Returns the number of valid parameters of this move object.
   *
   * @return the number of valid parameters
   */
  public int getValidParams() {
    int numValidParams = 0;
    boolean[] validParams = {(this.source != null), (this.pileNumber != null),
        (this.cardIndex != null), (this.destination != null), (this.destPileNumber != null)};
    for (Boolean param : validParams) {
      if (param) {
        numValidParams++;
      }
    }
    return numValidParams;
  }

  /**
   * Performs a move using the given Freecell model object.
   *
   * @param model the Freecell object to perform a move with
   * @throws IllegalArgumentException if the move is not possible {@link PileType})
   * @throws IllegalStateException    if a move is attempted before the game has starts
   */
  public void move(FreecellModel<ICard> model)
      throws IllegalArgumentException, IllegalStateException {
    model.move(this.source, this.pileNumber, this.cardIndex, this.destination, this.destPileNumber);
  }
}
