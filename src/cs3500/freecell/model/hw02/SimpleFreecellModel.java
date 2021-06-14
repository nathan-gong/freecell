package cs3500.freecell.model.hw02;

import cs3500.freecell.model.PileType;
import cs3500.freecell.model.hw04.AFreecellModel;
import java.util.List;

/**
 * Represents the simple implementation of the Freecell game using Card objects that features
 * single card moves.
 */
public class SimpleFreecellModel extends AFreecellModel {

  @Override
  public void move(PileType source, int pileNumber, int cardIndex, PileType destination,
      int destPileNumber) throws IllegalArgumentException, IllegalStateException {
    this.hasGameStarted();
    this.isValidPileLists(source, destination);
    // move the card from the source pile to the destination pile
    this.addToDestination(this.pileLists.get(destination), destPileNumber,
        this.removeFromSource(this.pileLists.get(source), pileNumber, cardIndex));
  }

  /**
   * Removes the specified card index from the source pile.
   *
   * @param sourcePileList the pile list to remove the card from
   * @param pileNumber     the pile number of the given type, starting at 0
   * @param cardIndex      the index of the card to be moved from the source pile, starting at 0
   * @return the card that was removed
   * @throws IllegalArgumentException if the pileNumber or the cardIndex are invalid
   * @throws IllegalStateException    if a card cannot be removed
   */
  private ICard removeFromSource(List<IPile<ICard>> sourcePileList, int pileNumber, int cardIndex)
      throws IllegalArgumentException, IllegalStateException {
    // validate the given pile number and card index
    this.isValidPileIndex(sourcePileList, pileNumber);
    IPile<ICard> pile = sourcePileList.get(pileNumber);
    int lastCardIndex = pile.getPile().size() - 1;
    if (cardIndex != lastCardIndex) {
      throw new IllegalArgumentException("Only the last card in a pile may be moved");
    }

    // remove the card from the source pile
    ICard card = pile.getPile().get(lastCardIndex);
    pile.remove();
    return card;
  }

  /**
   * Adds the specified card to the destination pile.
   *
   * @param destinationPileList the pile list to add the card to
   * @param destPileNumber      the pile number of the given type, starting at 0
   * @param card                the card to be moved to the destination pile
   * @throws IllegalArgumentException if the destPileNumber is invalid or the card cannot be added
   */
  private void addToDestination(List<IPile<ICard>> destinationPileList, int destPileNumber,
      ICard card) throws IllegalArgumentException {
    this.isValidPileIndex(destinationPileList, destPileNumber);
    destinationPileList.get(destPileNumber).add(card);
  }
}
