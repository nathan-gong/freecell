package cs3500.freecell.model;

import cs3500.freecell.Utils;
import cs3500.freecell.model.hw02.ICard;
import cs3500.freecell.model.hw02.SimpleFreecellModel;
import cs3500.freecell.model.hw04.ComplexFreecellModel;

/**
 * Factory class that creates models of Freecell games.
 */
public class FreecellModelCreator {

  /**
   * Freecell game variations based on allowable moves.
   */
  public enum GameType {
    SINGLEMOVE, MULTIMOVE;
  }

  /**
   * Creates a new Freecell game model based on the specified parameter.
   *
   * @param type the desired type of Freecell model
   * @return the specified Freecell model type
   * @throws IllegalArgumentException if the given game type is null
   */
  public static FreecellModel<ICard> create(GameType type) throws IllegalArgumentException {
    Utils.requireNonNull(type);
    switch (type) {
      case SINGLEMOVE:
        return new SimpleFreecellModel();
      case MULTIMOVE:
        return new ComplexFreecellModel();
      default:
        throw new IllegalArgumentException("Invalid game type provided");
    }
  }
}
