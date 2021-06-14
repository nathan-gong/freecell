package cs3500.freecell.controller;

import cs3500.freecell.Utils;
import cs3500.freecell.model.FreecellModel;
import cs3500.freecell.model.PileType;
import cs3500.freecell.model.hw02.ICard;
import cs3500.freecell.view.FreecellTextView;
import cs3500.freecell.view.FreecellView;
import java.io.IOException;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Represents a simple controller to handle user I/O for a Freecell game, including taking and
 * parsing text-based move commands, and rendering the game board and game messages.
 */
public class SimpleFreecellController implements FreecellController<ICard> {

  private final Readable rd;
  private final FreecellModel<ICard> model;
  private final FreecellView view;
  private Move move;

  /**
   * Constructs a simple Freecell controller.
   *
   * @param model the model object to play the game
   * @param rd    the readable object to receive user input
   * @param ap    the appendable object to deliver output
   * @throws IllegalArgumentException if any of the given inputs are null
   */
  public SimpleFreecellController(FreecellModel<ICard> model, Readable rd, Appendable ap)
      throws IllegalArgumentException {
    this.model = Utils.requireNonNull(model);
    this.rd = Utils.requireNonNull(rd);
    this.view = new FreecellTextView(this.model, Utils.requireNonNull(ap));
    this.move = new Move();
  }

  @Override
  public void playGame(List<ICard> deck, int numCascades, int numOpens, boolean shuffle)
      throws IllegalStateException, IllegalArgumentException {
    Utils.requireNonNull(deck);

    // attempt to start the game
    try {
      this.model.startGame(deck, numCascades, numOpens, shuffle);
    } catch (IllegalArgumentException e) {
      this.renderMessage("Could not start game.");
      return;
    }

    this.transmitGameState();
    this.getUserInput();
  }

  /**
   * Send the board to the provided data destination to be rendered by the view.
   *
   * @throws IllegalStateException if transmission of the board to the provided destination fails
   */
  private void renderBoard() throws IllegalStateException {
    try {
      this.view.renderBoard();
    } catch (IOException e) {
      throw new IllegalStateException("Failed transmitting the board to the provided Appendable");
    }
  }

  /**
   * Send a message to the provided data destination to be rendered by the view.
   *
   * @param message the message to be transmitted
   * @throws IllegalStateException if transmission of the message to the provided destination fails
   */
  private void renderMessage(String message) throws IllegalStateException {
    try {
      this.view.renderMessage(message);
    } catch (IOException e) {
      throw new IllegalStateException("Failed transmitting the message to the provided Appendable");
    }
  }

  /**
   * Transmits the game state from the model to the view.
   *
   * @throws IllegalStateException if transmission to the provided destination fails
   */
  private void transmitGameState() throws IllegalStateException {
    this.renderBoard();
    this.renderMessage("\n");
  }

  /**
   * Parses through user input and delegates to running the respective commands.
   *
   * @throws IllegalStateException if there is no more user input and the game has not been either
   *                               quit or won
   */
  private void getUserInput() throws IllegalStateException {
    Scanner sc = new Scanner(this.rd);

    while (sc.hasNext()) {
      String s = sc.next();

      if (this.quitGame(s)) {
        return;
      }
      this.run(s);
      this.move();

      if (this.isGameOver()) {
        return;
      }
    }
    throw new IllegalStateException("Ran out of user input before game finished");
  }

  /**
   * Executes a method based on the number of valid parameters of the command object.
   *
   * @param s the user input to be sent to the correct method
   * @throws IllegalStateException if transmission to the provided destination fails
   */
  private void run(String s) throws IllegalStateException {
    switch (this.move.getValidParams()) {
      case 0:
      case 1:
        this.setSourcePile(s);
        break;
      case 2:
        this.setCardIndex(s);
        break;
      case 3:
      case 4:
        this.setDestinationPile(s);
        break;
      default:
        break;
    }
  }

  /**
   * Sets the source pile type and number of the command object based on user input.
   *
   * @param s the user input to be parsed and checked for validity
   * @throws IllegalStateException if transmission to the provided destination fails
   */
  private void setSourcePile(String s) throws IllegalStateException {
    SimpleImmutableEntry<PileType, Integer> sourcePair = this.isValidPile(s);
    if (sourcePair != null) {
      this.move.setSource(sourcePair.getKey()).setPileNumber(sourcePair.getValue() - 1);
    } else {
      this.renderMessage("Re-enter the source pile:\n");
    }
  }

  /**
   * Sets the card index of the command object based on user input.
   *
   * @param s the user input to be parsed and checked for validity
   * @throws IllegalStateException if transmission to the provided destination fails
   */
  private void setCardIndex(String s) throws IllegalStateException {
    if (this.isValidNumber(s)) {
      int index = Integer.parseInt(s);
      this.move.setCardIndex(index - 1);
    } else {
      this.renderMessage("Re-enter the card index:\n");
    }
  }

  /**
   * Sets the destination pile type and number of the command object based on user input.
   *
   * @param s the user input to be parsed and checked for validity
   * @throws IllegalStateException if transmission to the provided destination fails
   */
  private void setDestinationPile(String s) throws IllegalStateException {
    SimpleImmutableEntry<PileType, Integer> destinationPair = this.isValidPile(s);
    if (destinationPair != null) {
      this.move.setDestination(destinationPair.getKey())
          .setDestPileNumber(destinationPair.getValue() - 1);
    } else {
      this.renderMessage("Re-enter the destination pile:\n");
    }
  }

  /**
   * Attempts to perform a move in a game of Freecell and resets the command object.
   *
   * @throws IllegalStateException if transmission to the provided destination fails
   */
  private void move() throws IllegalStateException {
    if (this.move.getValidParams() == 5) {
      try {
        this.move.move(this.model);
        this.transmitGameState();
      } catch (IllegalArgumentException | IllegalStateException e) {
        this.renderMessage(String.format("Invalid move. Try again. %s\n", e.getMessage()));
      }
      this.move = new Move();
    }
  }

  /**
   * Checks if the provided String is a valid pile input.
   *
   * @param pile the input to be checked for validity
   * @return a pair consisting of the pile type and number if valid else null
   */
  private SimpleImmutableEntry<PileType, Integer> isValidPile(String pile) {
    PileType pileType = this.getPileType(pile.substring(0, 1));
    return (pile.length() >= 2
        && (pileType != null)
        && (this.isValidNumber(pile.substring(1))))
        ? new SimpleImmutableEntry<>(pileType, Integer.parseInt(pile.substring(1))) : null;
  }

  /**
   * Checks that the given String can be converted to an int.
   *
   * @param str the String to be checked for valid conversion
   * @return if the given String can be converted to an int
   */
  private boolean isValidNumber(String str) {
    try {
      Integer.parseInt(str);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  /**
   * Returns the PileType corresponding to the given String.
   *
   * @param str the String whose PileType is to be retrieved
   * @return the corresponding PileType or null if it is not present
   */
  private PileType getPileType(String str) {
    Map<String, PileType> map = new HashMap<>();
    map.put("F", PileType.FOUNDATION);
    map.put("C", PileType.CASCADE);
    map.put("O", PileType.OPEN);
    return map.get(str);
  }

  /**
   * Checks if the user input indicates that the game was quit. If the game was quit, a message is
   * transmit to the view.
   *
   * @param str the user input to be checked for the game to quit
   * @return whether the user input indicates that the game was quit
   * @throws IllegalStateException if transmission to the provided destination fails
   */
  private boolean quitGame(String str) throws IllegalStateException {
    if (str.equalsIgnoreCase("q")) {
      this.renderMessage("Game quit prematurely.\n");
      return true;
    }
    return false;
  }

  /**
   * Checks if the game started by the model has finished.
   *
   * @return whether the game has finished.
   * @throws IllegalStateException if transmission to the provided destination fails
   */
  private boolean isGameOver() throws IllegalStateException {
    if (this.model.isGameOver()) {
      this.renderMessage("Game over.\n");
      return true;
    }
    return false;
  }
}
