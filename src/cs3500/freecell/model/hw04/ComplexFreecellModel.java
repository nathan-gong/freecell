package cs3500.freecell.model.hw04;

import cs3500.freecell.model.PileType;
import cs3500.freecell.model.hw02.ICard;
import cs3500.freecell.model.hw02.IPile;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents the complex implementation of the Freecell game with multi-card moves.
 */
public class ComplexFreecellModel extends AFreecellModel {

  @Override
  public void move(PileType source, int pileNumber, int cardIndex, PileType destination,
      int destPileNumber) throws IllegalArgumentException, IllegalStateException {
    this.hasGameStarted();
    this.isValidPileLists(source, destination);
    // move the card from the source pile to the destination pile
    this.addToDestination(destination, this.pileLists.get(destination), destPileNumber,
        this.removeFromSource(this.pileLists.get(source), pileNumber, cardIndex));
  }

  /**
   * Removes the specified build from the source pile.
   *
   * @param sourcePileList the pile list to remove the card from
   * @param pileNumber     the pile number of the given type, starting at 0
   * @param cardIndex      the index of the build to be moved from the source pile, starting at 0
   * @return the build that was removed
   * @throws IllegalArgumentException if the pileNumber or the cardIndex are invalid
   * @throws IllegalStateException    if a card cannot be removed
   */
  private List<ICard> removeFromSource(List<IPile<ICard>> sourcePileList, int pileNumber,
      int cardIndex) throws IllegalArgumentException, IllegalStateException {
    // validate the given pile number and card index
    this.isValidPileIndex(sourcePileList, pileNumber);
    IPile<ICard> pile = sourcePileList.get(pileNumber);
    this.isValidCardIndex(pile, cardIndex);
    List<ICard> cards = pile.getPile();
    List<ICard> build = new ArrayList<>(cards.subList(cardIndex, cards.size()));
    this.isValidBuild(build);

    // remove the build from the source pile
    int size = cards.size();
    for (int i = cardIndex; i < size; i++) {
      pile.remove();
    }
    return build;
  }

  /**
   * Check that the selected build has a valid size. A build is valid if it contains at most (N + 1)
   * * 2^K cards, where N is the number of free open piles and K is the number of empty cascade
   * piles.
   *
   * @param build the build to be checked for validity
   */
  private void isValidBuild(List<ICard> build) {
    // count the number of free open piles
    int numFreeOpen = 0;
    for (IPile<ICard> pile : this.open) {
      if (pile.getPile().isEmpty()) {
        numFreeOpen++;
      }
    }
    // count the number of empty cascade piles
    int numFreeCascade = 0;
    for (IPile<ICard> pile : this.cascade) {
      if (pile.getPile().isEmpty()) {
        numFreeCascade++;
      }
    }
    // check that there are enough open intermediate slots
    if (build.size() > ((numFreeOpen + 1) * (int) Math.pow(2, numFreeCascade))) {
      throw new IllegalArgumentException("Build is invalid");
    }
  }

  /**
   * Adds the specified build to the destination pile.
   *
   * @param destination         the type of the destination pile
   * @param destinationPileList the pile list to add the build to
   * @param destPileNumber      the pile number of the given type, starting at 0
   * @param build               the build to be moved to the destination pile
   * @throws IllegalArgumentException if the destination pile type or number are invalid or the card
   *                                  cannot be added
   */
  private void addToDestination(PileType destination, List<IPile<ICard>> destinationPileList,
      int destPileNumber,
      List<ICard> build) throws IllegalArgumentException {
    this.isValidPileIndex(destinationPileList, destPileNumber);

    // check that multi-card moves can only be made between cascade piles
    if ((destination != PileType.CASCADE) && (build.size() > 1)) {
      throw new IllegalArgumentException("Multiple cards can only be moved between cascade piles");
    }

    // add the build to the destination pile
    for (ICard card : build) {
      destinationPileList.get(destPileNumber).add(card);
    }
  }
}
