package cs3500.freecell;

import cs3500.freecell.controller.FreecellController;
import cs3500.freecell.controller.SimpleFreecellController;
import cs3500.freecell.model.FreecellModel;
import cs3500.freecell.model.FreecellModelCreator;
import cs3500.freecell.model.FreecellModelCreator.GameType;
import cs3500.freecell.model.hw02.ICard;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Main class used to play a Freecell game.
 */
public class Main {

  /**
   * Main method used to start playing the game with a controller.
   *
   * @param args the command line arguments passed to the main method
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    GameType gt = null;
    char c;
    do {
      System.out.println("Enter (S)impleFreecellModel, (C)omplexFreecellModel or (Q)uit: ");
      c = sc.next().toLowerCase().charAt(0);
      switch (c) {
        case 's':
          gt = FreecellModelCreator.GameType.SINGLEMOVE;
          break;
        case 'c':
          gt = FreecellModelCreator.GameType.MULTIMOVE;
          break;
        case 'q':
          return;
        default:
          break;
      }
    }
    while (!(c == 's' || c == 'c'));

    FreecellModel<ICard> model = FreecellModelCreator.create(gt);
    FreecellController<ICard> controller = new SimpleFreecellController(model,
        new InputStreamReader(System.in), System.out);
    controller.playGame(model.getDeck(), 8, 4, true);
  }
}
