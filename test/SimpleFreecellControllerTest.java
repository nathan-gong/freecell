import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import cs3500.freecell.controller.FreecellController;
import cs3500.freecell.controller.SimpleFreecellController;
import cs3500.freecell.model.FreecellModel;
import cs3500.freecell.model.PileType;
import cs3500.freecell.model.hw02.Card;
import cs3500.freecell.model.hw02.ICard;
import cs3500.freecell.model.hw02.SimpleFreecellModel;
import cs3500.freecell.model.hw02.Suit;
import cs3500.freecell.model.hw02.Value;
import cs3500.freecell.model.hw04.ComplexFreecellModel;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for the SimpleFreecellController class.
 */
public class SimpleFreecellControllerTest {

  FreecellModel<ICard> m1;
  FreecellModel<ICard> m2;
  FreecellModel<ICard> m3;
  FreecellModel<ICard> m4;
  ICard c1;
  ICard c2;
  ICard c3;
  ICard c4;
  ICard c5;
  ICard c6;
  ICard c7;
  ICard c8;
  ICard c9;
  ICard c10;
  ICard c11;
  ICard c12;
  ICard c13;
  ICard c14;
  ICard c15;
  ICard c16;
  ICard c17;
  ICard c18;
  ICard c19;
  ICard c20;
  ICard c21;
  ICard c22;
  ICard c23;
  ICard c24;
  ICard c25;
  ICard c26;
  ICard c27;
  ICard c28;
  ICard c29;
  ICard c30;
  ICard c31;
  ICard c32;
  ICard c33;
  ICard c34;
  ICard c35;
  ICard c36;
  ICard c37;
  ICard c38;
  ICard c39;
  ICard c40;
  ICard c41;
  ICard c42;
  ICard c43;
  ICard c44;
  ICard c45;
  ICard c46;
  ICard c47;
  ICard c48;
  ICard c49;
  ICard c50;
  ICard c51;
  ICard c52;
  List<ICard> l1;
  Appendable a1;
  Readable r1;
  FreecellController<ICard> fc1;
  FreecellController<ICard> fc2;
  FreecellController<ICard> fc3;
  FreecellController<ICard> fc4;
  FreecellController<ICard> fc5;
  FreecellController<ICard> fc6;

  /**
   * Initialize variables for testing.
   */
  @Before
  public void init() {
    this.m1 = new SimpleFreecellModel();
    this.m2 = new SimpleFreecellModel();
    this.m3 = new ComplexFreecellModel();
    this.m4 = new ComplexFreecellModel();
    this.c1 = new Card(Value.KING, Suit.SPADE);
    this.c2 = new Card(Value.KING, Suit.DIAMOND);
    this.c3 = new Card(Value.KING, Suit.CLUB);
    this.c4 = new Card(Value.KING, Suit.HEART);
    this.c5 = new Card(Value.QUEEN, Suit.SPADE);
    this.c6 = new Card(Value.QUEEN, Suit.DIAMOND);
    this.c7 = new Card(Value.QUEEN, Suit.CLUB);
    this.c8 = new Card(Value.QUEEN, Suit.HEART);
    this.c9 = new Card(Value.JACK, Suit.SPADE);
    this.c10 = new Card(Value.JACK, Suit.DIAMOND);
    this.c11 = new Card(Value.JACK, Suit.CLUB);
    this.c12 = new Card(Value.JACK, Suit.HEART);
    this.c13 = new Card(Value.TEN, Suit.SPADE);
    this.c14 = new Card(Value.TEN, Suit.DIAMOND);
    this.c15 = new Card(Value.TEN, Suit.CLUB);
    this.c16 = new Card(Value.TEN, Suit.HEART);
    this.c17 = new Card(Value.NINE, Suit.SPADE);
    this.c18 = new Card(Value.NINE, Suit.DIAMOND);
    this.c19 = new Card(Value.NINE, Suit.CLUB);
    this.c20 = new Card(Value.NINE, Suit.HEART);
    this.c21 = new Card(Value.EIGHT, Suit.SPADE);
    this.c22 = new Card(Value.EIGHT, Suit.DIAMOND);
    this.c23 = new Card(Value.EIGHT, Suit.CLUB);
    this.c24 = new Card(Value.EIGHT, Suit.HEART);
    this.c25 = new Card(Value.SEVEN, Suit.SPADE);
    this.c26 = new Card(Value.SEVEN, Suit.DIAMOND);
    this.c27 = new Card(Value.SEVEN, Suit.CLUB);
    this.c28 = new Card(Value.SEVEN, Suit.HEART);
    this.c29 = new Card(Value.SIX, Suit.SPADE);
    this.c30 = new Card(Value.SIX, Suit.DIAMOND);
    this.c31 = new Card(Value.SIX, Suit.CLUB);
    this.c32 = new Card(Value.SIX, Suit.HEART);
    this.c33 = new Card(Value.FIVE, Suit.SPADE);
    this.c34 = new Card(Value.FIVE, Suit.DIAMOND);
    this.c35 = new Card(Value.FIVE, Suit.CLUB);
    this.c36 = new Card(Value.FIVE, Suit.HEART);
    this.c37 = new Card(Value.FOUR, Suit.SPADE);
    this.c38 = new Card(Value.FOUR, Suit.DIAMOND);
    this.c39 = new Card(Value.FOUR, Suit.CLUB);
    this.c40 = new Card(Value.FOUR, Suit.HEART);
    this.c41 = new Card(Value.THREE, Suit.SPADE);
    this.c42 = new Card(Value.THREE, Suit.DIAMOND);
    this.c43 = new Card(Value.THREE, Suit.CLUB);
    this.c44 = new Card(Value.THREE, Suit.HEART);
    this.c45 = new Card(Value.TWO, Suit.SPADE);
    this.c46 = new Card(Value.TWO, Suit.DIAMOND);
    this.c47 = new Card(Value.TWO, Suit.CLUB);
    this.c48 = new Card(Value.TWO, Suit.HEART);
    this.c49 = new Card(Value.ACE, Suit.SPADE);
    this.c50 = new Card(Value.ACE, Suit.DIAMOND);
    this.c51 = new Card(Value.ACE, Suit.CLUB);
    this.c52 = new Card(Value.ACE, Suit.HEART);
    this.l1 = new ArrayList<>(Arrays.asList(this.c1, this.c2, this.c3, this.c4, this.c5, this.c6,
        this.c7, this.c8, this.c9, this.c10, this.c11, this.c12, this.c13, this.c14, this.c15,
        this.c16, this.c17, this.c18, this.c19, this.c20, this.c21, this.c22, this.c23, this.c24,
        this.c25, this.c26, this.c27, this.c28, this.c29, this.c30, this.c31, this.c32, this.c33,
        this.c34, this.c35, this.c36, this.c37, this.c38, this.c39, this.c40, this.c41, this.c42,
        this.c43, this.c44, this.c45, this.c46, this.c47, this.c48, this.c49, this.c50, this.c51,
        this.c52));
    this.a1 = new StringBuilder();
    this.r1 = new StringReader("q");
    this.fc1 = new SimpleFreecellController(this.m1, this.r1, this.a1);
    this.fc2 = new SimpleFreecellController(this.m1, new BadReadable(), this.a1);
    this.fc3 = new SimpleFreecellController(this.m1, this.r1, new BadAppendable());
    this.fc4 = new SimpleFreecellController(this.m3, this.r1, this.a1);
    this.fc5 = new SimpleFreecellController(this.m3, new BadReadable(), this.a1);
    this.fc6 = new SimpleFreecellController(this.m3, this.r1, new BadAppendable());
  }

  /**
   * Perform a move in the given Freecell model with the provided parameters.
   *
   * @param model          the model to perform a move with
   * @param source         the type of the source pile see @link{PileType}
   * @param pileNumber     the pile number of the given type, starting at 0
   * @param cardIndex      the index of the card to be moved from the source pile, starting at 0
   * @param destination    the type of the destination pile (see
   * @param destPileNumber the pile number of the given type, starting at 0
   * @throws IllegalArgumentException if the move is not possible {@link PileType})
   * @throws IllegalStateException    if a move is attempted before the game has starts
   */
  private String moveAndGetBoard(FreecellModel<ICard> model, PileType source, int pileNumber,
      int cardIndex, PileType destination,
      int destPileNumber) throws IllegalArgumentException, IllegalStateException {
    model.move(source, pileNumber, cardIndex, destination, destPileNumber);
    return model + "\n";
  }

  /**
   * Creates a test harness to mock user I/O for a Freecell game.
   *
   * @param model        the model to play the game with
   * @param deck         the deck to be used to play this game
   * @param numCascades  the number of cascade piles
   * @param numOpens     the number of open piles
   * @param shuffle      shuffle the deck if true, false otherwise
   * @param interactions the series of interactions with the controller
   * @return whether the actual controller output matches the expected mock output
   * @throws IllegalArgumentException if the deck provided to it is null
   * @throws IllegalStateException    if writing to the Appendable object used by it fails or
   *                                  reading from the provided Readable fails
   */
  private boolean testRun(FreecellModel<ICard> model, List<ICard> deck, int numCascades,
      int numOpens, boolean shuffle, Interaction... interactions)
      throws IllegalArgumentException, IllegalStateException {
    StringBuilder fakeUserInput = new StringBuilder();
    StringBuilder expectedOutput = new StringBuilder();

    for (Interaction interaction : interactions) {
      interaction.apply(fakeUserInput, expectedOutput);
    }

    StringReader input = new StringReader(fakeUserInput.toString());
    StringBuilder actualOutput = new StringBuilder();

    FreecellController<ICard> controller = new SimpleFreecellController(model, input, actualOutput);
    controller.playGame(deck, numCascades, numOpens, shuffle);

    assertEquals(expectedOutput.toString(), actualOutput.toString());
    return expectedOutput.toString().equals(actualOutput.toString());
  }

  /**
   * Creates an Interaction corresponding to program output.
   *
   * @param lines the text to be converted to an Interaction
   * @return the resulting Interaction object
   */
  private static Interaction outputs(String... lines) {
    return (input, output) -> {
      for (String line : lines) {
        output.append(line);
      }
    };
  }

  /**
   * Creates an Interaction corresponding to user input.
   *
   * @param in the text received from the user
   * @return the resulting Interaction object
   */
  private static Interaction inputs(String in) {
    return (input, output) -> input.append(in);
  }

  // test that the constructor cannot be given a null model
  @Test(expected = IllegalArgumentException.class)
  public void testConstructor1() {
    new SimpleFreecellController(null, new StringReader(""), new StringBuilder());
  }

  // test that the constructor cannot be given a null Readable
  @Test(expected = IllegalArgumentException.class)
  public void testConstructor2() {
    new SimpleFreecellController(this.m1, null, new StringBuilder());
  }

  // test that the constructor cannot be given a null Appendable
  @Test(expected = IllegalArgumentException.class)
  public void testConstructor3() {
    new SimpleFreecellController(this.m1, new StringReader(""), null);
  }

  // test that playGame throws an exception if it fails reading from the Readable
  @Test(expected = IllegalStateException.class)
  public void testFailTransmit1() {
    this.fc2.playGame(this.l1, 8, 4, false);
  }

  // test that playGame throws an exception if it fails writing to the Appendable
  @Test(expected = IllegalStateException.class)
  public void testFailTransmit2() {
    this.fc3.playGame(this.l1, 8, 4, false);
  }

  // test that playGame throws an exception if given a null deck
  @Test(expected = IllegalArgumentException.class)
  public void testPlayGame1() {
    this.testRun(this.m1, null, 8, 4, false);
  }

  // test that playGame must be given a valid number of cascade piles to start the game
  @Test
  public void testPlayGame2() {
    assertTrue(this.testRun(this.m1, this.l1, 3, 4, false, outputs("Could not start game.")));
  }

  // test that playGame must be given a valid number of open piles to start the game
  @Test
  public void testPlayGame3() {
    assertTrue(this.testRun(this.m1, this.l1, 8, 0, false, outputs("Could not start game.")));
  }

  // test that playGame transmits the board and throws an exception if it runs out of user input
  // before the game is over or quit
  @Test(expected = IllegalStateException.class)
  public void testPlayGame4() {
    this.testRun(this.m1, this.l1, 8, 4, true, outputs(this.m1.toString()));
  }

  // test that playGame quits the game if it encounters a q
  @Test
  public void testPlayGame5() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(
        this.testRun(this.m1, this.l1, 8, 4, false,
            outputs(this.m2.toString() + "\n"),
            inputs("q C1"),
            outputs("Game quit prematurely.\n")));
  }

  // test that playGame quits the game if it encounters a Q
  @Test
  public void testPlayGame6() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(
        this.testRun(this.m1, this.l1, 8, 4, false,
            outputs(this.m2.toString() + "\n"),
            inputs("Q C1"),
            outputs("Game quit prematurely.\n")));
  }

  // test that playGame quits the game if it encounters a q after receiving a valid source pile
  @Test
  public void testPlayGame7() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 q"), outputs("Game quit prematurely.\n")));
  }

  // test that playGame quits the game if it encounters a q after receiving an invalid source pile
  @Test
  public void testPlayGame8() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("c1 q"), outputs("Re-enter the source pile:\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame quits the game if it encounters a q after receiving a valid card index
  @Test
  public void testPlayGame9() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 1 q"), outputs("Game quit prematurely.\n")));
  }

  // test that playGame quits the game if it encounters a q after receiving an invalid card index
  @Test
  public void testPlayGame10() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 a q"), outputs("Re-enter the card index:\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame quits the game if it encounters a q after receiving a valid destination pile
  @Test
  public void testPlayGame11() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 1 O1 q"),
        outputs("Invalid move. Try again. Only the last card in a pile may be moved\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame quits the game if it encounters a q after receiving an invalid destination
  // pile
  @Test
  public void testPlayGame12() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 1 o1 q"), outputs("Re-enter the destination pile:\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame is able to parse valid foundation source piles
  @Test
  public void testPlayGame13() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("F1 q"), outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("F12 q"), outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("F-1 q"), outputs("Game quit prematurely.\n")));
  }

  // test that playGame is able to parse valid cascade source piles
  @Test
  public void testPlayGame14() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 q"), outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C12 q"), outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C-1 q"), outputs("Game quit prematurely.\n")));
  }

  // test that playGame is able to parse valid open source piles
  @Test
  public void testPlayGame15() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("O1 q"), outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("O12 q"), outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("O-1 q"), outputs("Game quit prematurely.\n")));
  }

  // test that playGame re-prompts for the source pile if it is invalid
  @Test
  public void testPlayGame16() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("f1 q"), outputs("Re-enter the source pile:\n"),
        outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("q1 q"), outputs("Re-enter the source pile:\n"),
        outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("F q"), outputs("Re-enter the source pile:\n"),
        outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("F F q"), outputs("Re-enter the source pile:\n"),
        outputs("Re-enter the source pile:\n"), outputs("Game quit prematurely.\n")));
  }

  // test that playGame is able to parse valid card indices
  @Test
  public void testPlayGame17() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 1 q"), outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 12 q"), outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 -1 q"), outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 1324 q"), outputs("Game quit prematurely.\n")));
  }

  // test that playGame re-prompts for the card index if it is invalid and does not re-prompt for
  // the source pile
  @Test
  public void testPlayGame18() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 C1 q"), outputs("Re-enter the card index:\n"),
        outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 a q"), outputs("Re-enter the card index:\n"),
        outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 q1 q"), outputs("Re-enter the card index:\n"),
        outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 q1 a q"), outputs("Re-enter the card index:\n"),
        outputs("Re-enter the card index:\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame is able to parse valid foundation destination piles
  @Test
  public void testPlayGame19() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 1 F1 q"),
        outputs("Invalid move. Try again. Only the last card in a pile may be moved\n"),
        outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 1 F12 q"),
        outputs("Invalid move. Try again. Only the last card in a pile may be moved\n"),
        outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 1 F-1 q"),
        outputs("Invalid move. Try again. Only the last card in a pile may be moved\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame is able to parse valid cascade destination piles
  @Test
  public void testPlayGame20() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 1 C1 q"),
        outputs("Invalid move. Try again. Only the last card in a pile may be moved\n"),
        outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 1 C12 q"),
        outputs("Invalid move. Try again. Only the last card in a pile may be moved\n"),
        outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 1 C-1 q"),
        outputs("Invalid move. Try again. Only the last card in a pile may be moved\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame is able to parse valid open destination piles
  @Test
  public void testPlayGame21() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 1 O1 q"),
        outputs("Invalid move. Try again. Only the last card in a pile may be moved\n"),
        outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 1 O12 q"),
        outputs("Invalid move. Try again. Only the last card in a pile may be moved\n"),
        outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 1 O-1 q"),
        outputs("Invalid move. Try again. Only the last card in a pile may be moved\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame re-prompts for the destination pile if it is invalid and does not re-prompt
  // for the source pile or the card index
  @Test
  public void testPlayGame22() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 1 f1 q"), outputs("Re-enter the destination pile:\n"),
        outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 1 q1 q"), outputs("Re-enter the destination pile:\n"),
        outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 1 F q"), outputs("Re-enter the destination pile:\n"),
        outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 1 F F q"), outputs("Re-enter the destination pile:\n"),
        outputs("Re-enter the destination pile:\n"), outputs("Game quit prematurely.\n")));
  }

  // test that playGame is able to parse through garbage inputs in between move parameters
  @Test
  public void testPlayGame23() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("a C1 b 1 c O1 q"), outputs("Re-enter the source pile:\n"),
        outputs("Re-enter the card index:\n", "Re-enter the destination pile:\n",
            "Invalid move. Try again. Only the last card in a pile may be moved\n",
            "Game quit prematurely.\n")));
  }

  // test that playGame is able to parse through inputs one at a time rather than in a batch
  @Test
  public void testPlayGame24() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("a "), outputs("Re-enter the source pile:\n"),
        inputs("C1 "),
        inputs("b "), outputs("Re-enter the card index:\n"),
        inputs("1 "),
        inputs("c "), outputs("Re-enter the destination pile:\n"),
        inputs("O1 "),
        outputs("Invalid move. Try again. Only the last card in a pile may be moved\n"),
        inputs("q"), outputs("Game quit prematurely.\n")));
  }

  // test that playGame correctly shuffles the deck if specified
  // this test has a negligible chance to fail if Collections.shuffle leaves the deck in its
  // original order
  @Test
  public void testPlayGame25() {
    this.m2.startGame(this.l1, 8, 4, false);
    this.fc1.playGame(this.l1, 8, 4, true);
    assertNotEquals(this.m2.toString(), this.a1.toString().substring(0, 267));
  }

  // test that playGame leaves the deck as is if shuffling is not specified
  @Test
  public void testPlayGame26() {
    this.m2.startGame(this.l1, 8, 4, false);
    this.fc1.playGame(this.l1, 8, 4, false);
    assertEquals(this.m2.toString(), this.a1.toString().substring(0, 267));
  }

  // test that playGame renders an error message if the source pile is a foundation pile
  @Test
  public void testPlayGame27() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("F1 1 O1 q"), outputs("Invalid move. Try again. "),
        outputs("Invalid source or destination pile type provided\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame renders an error message if the source pile number is invalid
  @Test
  public void testPlayGame28() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C0 1 O1 q"), outputs("Invalid move. Try again. "),
        outputs("Given pile number is out of range of the pile list\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame renders an error message if the source pile number is invalid
  @Test
  public void testPlayGame29() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C9 1 O1 q"), outputs("Invalid move. Try again. "),
        outputs("Given pile number is out of range of the pile list\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame renders an error message if the card index is invalid
  @Test
  public void testPlayGame30() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 0 O1 q"), outputs("Invalid move. Try again. "),
        outputs("Only the last card in a pile may be moved\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame renders an error message if the card index is invalid
  @Test
  public void testPlayGame31() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 10 O1 q"), outputs("Invalid move. Try again. "),
        outputs("Only the last card in a pile may be moved\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame renders an error message if the destination pile number is invalid
  @Test
  public void testPlayGame32() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 7 O0 q"), outputs("Invalid move. Try again. "),
        outputs("Given pile number is out of range of the pile list\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame renders an error message if the destination pile number is invalid
  @Test
  public void testPlayGame33() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("C1 7 O10 q"), outputs("Invalid move. Try again. "),
        outputs("Given pile number is out of range of the pile list\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame renders an error message if the source pile is empty
  @Test
  public void testPlayGame34() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs(this.m2.toString() + "\n"),
        inputs("O1 7 O2 q"), outputs("Invalid move. Try again. "),
        outputs("Only the last card in a pile may be moved\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame renders an error message if the destination open pile is full
  @Test
  public void testPlayGame35() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false,
        outputs(this.m2.toString() + "\n"),
        inputs("C1 7 O1 C1 6 O1 q"),
        outputs(moveAndGetBoard(this.m2, PileType.CASCADE, 0, 6, PileType.OPEN, 0)),
        outputs("Invalid move. Try again. "),
        outputs("Card cannot be added to pile\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame renders an error message if a wrong color card is added to a cascade pile
  @Test
  public void testPlayGame36() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false,
        outputs(this.m2.toString() + "\n"),
        inputs("C1 7 O1 C5 6 C1 q"),
        outputs(moveAndGetBoard(this.m2, PileType.CASCADE, 0, 6, PileType.OPEN, 0)),
        outputs("Invalid move. Try again. "),
        outputs("Card cannot be added to pile\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame renders an error message if a wrong value card is added to a cascade pile
  @Test
  public void testPlayGame37() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false,
        outputs(this.m2.toString() + "\n"),
        inputs("C1 7 O1 C2 7 C1 q"),
        outputs(moveAndGetBoard(this.m2, PileType.CASCADE, 0, 6, PileType.OPEN, 0)),
        outputs("Invalid move. Try again. "),
        outputs("Card cannot be added to pile\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame renders an error message if a wrong suit card is added to a foundation pile
  @Test
  public void testPlayGame38() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false,
        outputs(this.m2.toString() + "\n"),
        inputs("C1 7 F1 C6 6 F1 q"),
        outputs(moveAndGetBoard(this.m2, PileType.CASCADE, 0, 6, PileType.FOUNDATION, 0)),
        outputs("Invalid move. Try again. "),
        outputs("Card cannot be added to pile\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame renders an error message if a wrong value card is added to a foundation pile
  @Test
  public void testPlayGame39() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false,
        outputs(this.m2.toString() + "\n"),
        inputs("C5 6 F1 q"),
        outputs("Invalid move. Try again. "),
        outputs("Card cannot be added to pile\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame renders an error message if a wrong value card is added to a foundation pile
  @Test
  public void testPlayGame40() {
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false,
        outputs(this.m2.toString() + "\n"),
        inputs("C1 7 F1 C1 6 F1 q"),
        outputs(moveAndGetBoard(this.m2, PileType.CASCADE, 0, 6, PileType.FOUNDATION, 0)),
        outputs("Invalid move. Try again. "),
        outputs("Card cannot be added to pile\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that a card can be moved successfully from a cascade pile to another cascade pile
  @Test
  public void testPlayGame41() {
    this.m2.startGame(this.l1, 4, 1, false);
    assertTrue(this.testRun(this.m1, this.l1, 4, 1, false,
        outputs(this.m2.toString() + "\n"),
        inputs("C1 13 F1 C2 13 F2 C1 12 F1 C2 12 C1 q"),
        outputs(moveAndGetBoard(this.m2, PileType.CASCADE, 0, 12, PileType.FOUNDATION, 0)),
        outputs(moveAndGetBoard(this.m2, PileType.CASCADE, 1, 12, PileType.FOUNDATION, 1)),
        outputs(moveAndGetBoard(this.m2, PileType.CASCADE, 0, 11, PileType.FOUNDATION, 0)),
        outputs(moveAndGetBoard(this.m2, PileType.CASCADE, 1, 11, PileType.CASCADE, 0)),
        outputs("Game quit prematurely.\n")));
  }

  // test that a card can be moved successfully from a cascade pile to itself if valid
  @Test
  public void testPlayGame42() {
    this.m2.startGame(this.l1, 4, 1, false);
    assertTrue(this.testRun(this.m1, this.l1, 4, 1, false,
        outputs(this.m2.toString() + "\n"),
        inputs("C1 13 O1 C2 13 C1 C1 13 C1 q"),
        outputs(moveAndGetBoard(this.m2, PileType.CASCADE, 0, 12, PileType.OPEN, 0)),
        outputs(moveAndGetBoard(this.m2, PileType.CASCADE, 1, 12, PileType.CASCADE, 0)),
        outputs(moveAndGetBoard(this.m2, PileType.CASCADE, 0, 12, PileType.CASCADE, 0)),
        outputs("Game quit prematurely.\n")));
  }

  // test that a card cannot be moved from a cascade pile to itself if invalid
  @Test
  public void testPlayGame43() {
    this.m2.startGame(this.l1, 4, 1, false);
    assertTrue(this.testRun(this.m1, this.l1, 4, 1, false,
        outputs(this.m2.toString() + "\n"),
        inputs("C1 13 C1 q"),
        outputs("Invalid move. Try again. Card cannot be added to pile\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that a card can be moved successfully from a cascade pile to an open pile
  @Test
  public void testPlayGame44() {
    this.m2.startGame(this.l1, 4, 1, false);
    assertTrue(this.testRun(this.m1, this.l1, 4, 1, false,
        outputs(this.m2.toString() + "\n"),
        inputs("C1 13 O1 q"),
        outputs(moveAndGetBoard(this.m2, PileType.CASCADE, 0, 12, PileType.OPEN, 0)),
        outputs("Game quit prematurely.\n")));
  }

  // test that a card can be moved successfully from a cascade pile to a foundation pile
  @Test
  public void testPlayGame45() {
    this.m2.startGame(this.l1, 4, 1, false);
    assertTrue(this.testRun(this.m1, this.l1, 4, 1, false,
        outputs(this.m2.toString() + "\n"),
        inputs("C1 13 F1 q"),
        outputs(moveAndGetBoard(this.m2, PileType.CASCADE, 0, 12, PileType.FOUNDATION, 0)),
        outputs("Game quit prematurely.\n")));
  }

  // test that a card can be moved successfully from an open pile to another open pile
  @Test
  public void testPlayGame46() {
    this.m2.startGame(this.l1, 4, 2, false);
    assertTrue(this.testRun(this.m1, this.l1, 4, 2, false,
        outputs(this.m2.toString() + "\n"),
        inputs("C1 13 O1 O1 1 O2 q"),
        outputs(moveAndGetBoard(this.m2, PileType.CASCADE, 0, 12, PileType.OPEN, 0)),
        outputs(moveAndGetBoard(this.m2, PileType.OPEN, 0, 0, PileType.OPEN, 1)),
        outputs("Game quit prematurely.\n")));
  }

  // test that a card can be moved successfully from an open pile to a cascade pile
  @Test
  public void testPlayGame47() {
    this.m2.startGame(this.l1, 4, 2, false);
    assertTrue(this.testRun(this.m1, this.l1, 4, 2, false,
        outputs(this.m2.toString() + "\n"),
        inputs("C1 13 O1 C2 13 O2 O2 1 C1 q"),
        outputs(moveAndGetBoard(this.m2, PileType.CASCADE, 0, 12, PileType.OPEN, 0)),
        outputs(moveAndGetBoard(this.m2, PileType.CASCADE, 1, 12, PileType.OPEN, 1)),
        outputs(moveAndGetBoard(this.m2, PileType.OPEN, 1, 0, PileType.CASCADE, 0)),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame returns if given an invalid deck and prints the expected message
  @Test
  public void testPlayGame48() {
    this.l1.remove(1);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false, outputs("Could not start game.")));
  }

  // test that playGame resets and starts a new game if it is called multiple times
  @Test
  public void testPlayGame49() {
    this.m2.startGame(this.l1, 4, 2, false);
    assertTrue(this.testRun(this.m1, this.l1, 4, 2, false,
        outputs(this.m2.toString() + "\n"),
        inputs("q"),
        outputs("Game quit prematurely.\n")));
    this.m2.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m1, this.l1, 8, 4, false,
        outputs(this.m2.toString() + "\n"),
        inputs("q"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame returns if the game is over and prints the expected message
  @Test
  public void testPlayGameOver1() {
    StringBuilder sb = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    for (int i = 1; i < 5; i++) {
      for (int j = 13; j > 0; j--) {
        sb.append(String.format("C%d %d F%d ", i, j, i));
      }
    }
    sb.append("q");
    StringReader sr = new StringReader(sb.toString());
    this.fc1 = new SimpleFreecellController(this.m1, sr, sb2);
    this.fc1.playGame(this.l1, 4, 1, false);
    String s = sb2.toString();
    assertEquals("Game over.\n", s.substring(s.length() - 11));
  }

  // test that playGame returns if the game is over and prints the expected message
  @Test
  public void testPlayGameOver2() {
    StringBuilder sb = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    for (int i = 1; i < 5; i++) {
      for (int j = 13; j > 0; j--) {
        sb.append(String.format("a C%d b %d c F%d ", i, j, i));
      }
    }
    sb.append("q");
    StringReader sr = new StringReader(sb.toString());
    this.fc1 = new SimpleFreecellController(this.m1, sr, sb2);
    this.fc1.playGame(this.l1, 4, 1, false);
    String s = sb2.toString();
    assertEquals("Game over.\n", s.substring(s.length() - 11));
  }

  // test that the constructor cannot be given a null model
  @Test(expected = IllegalArgumentException.class)
  public void testConstructorComplex1() {
    new SimpleFreecellController(null, new StringReader(""), new StringBuilder());
  }

  // test that the constructor cannot be given a null Readable
  @Test(expected = IllegalArgumentException.class)
  public void testConstructorComplex2() {
    new SimpleFreecellController(this.m3, null, new StringBuilder());
  }

  // test that the constructor cannot be given a null Appendable
  @Test(expected = IllegalArgumentException.class)
  public void testConstructorComplex3() {
    new SimpleFreecellController(this.m3, new StringReader(""), null);
  }

  // test that playGame throws an exception if it fails reading from the Readable
  @Test(expected = IllegalStateException.class)
  public void testFailTransmitComplex1() {
    this.fc5.playGame(this.l1, 8, 4, false);
  }

  // test that playGame throws an exception if it fails writing to the Appendable
  @Test(expected = IllegalStateException.class)
  public void testFailTransmitComplex2() {
    this.fc6.playGame(this.l1, 8, 4, false);
  }

  // test that playGame throws an exception if given a null deck
  @Test(expected = IllegalArgumentException.class)
  public void testPlayGameComplex1() {
    this.testRun(this.m3, null, 8, 4, false);
  }

  // test that playGame must be given a valid number of cascade piles to start the game
  @Test
  public void testPlayGameComplex2() {
    assertTrue(this.testRun(this.m3, this.l1, 3, 4, false, outputs("Could not start game.")));
  }

  // test that playGame must be given a valid number of open piles to start the game
  @Test
  public void testPlayGameComplex3() {
    assertTrue(this.testRun(this.m3, this.l1, 8, 0, false, outputs("Could not start game.")));
  }

  // test that playGame transmits the board and throws an exception if it runs out of user input
  // before the game is over or quit
  @Test(expected = IllegalStateException.class)
  public void testPlayGameComplex4() {
    this.testRun(this.m3, this.l1, 8, 4, true, outputs(this.m3.toString()));
  }

  // test that playGame quits the game if it encounters a q
  @Test
  public void testPlayGameComplex5() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(
        this.testRun(this.m3, this.l1, 8, 4, false,
            outputs(this.m4.toString() + "\n"),
            inputs("q C1"),
            outputs("Game quit prematurely.\n")));
  }

  // test that playGame quits the game if it encounters a Q
  @Test
  public void testPlayGameComplex6() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(
        this.testRun(this.m3, this.l1, 8, 4, false,
            outputs(this.m4.toString() + "\n"),
            inputs("Q C1"),
            outputs("Game quit prematurely.\n")));
  }

  // test that playGame quits the game if it encounters a q after receiving a valid source pile
  @Test
  public void testPlayGameComplex7() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 q"), outputs("Game quit prematurely.\n")));
  }

  // test that playGame quits the game if it encounters a q after receiving an invalid source pile
  @Test
  public void testPlayGameComplex8() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("c1 q"), outputs("Re-enter the source pile:\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame quits the game if it encounters a q after receiving a valid card index
  @Test
  public void testPlayGameComplex9() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 1 q"), outputs("Game quit prematurely.\n")));
  }

  // test that playGame quits the game if it encounters a q after receiving an invalid card index
  @Test
  public void testPlayGameComplex10() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 a q"), outputs("Re-enter the card index:\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame quits the game if it encounters a q after receiving a valid destination pile
  @Test
  public void testPlayGameComplex11() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 1 O1 q"),
        outputs("Invalid move. Try again. Build is invalid\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame quits the game if it encounters a q after receiving an invalid destination
  // pile
  @Test
  public void testPlayGameComplex12() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 1 o1 q"), outputs("Re-enter the destination pile:\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame is able to parse valid foundation source piles
  @Test
  public void testPlayGameComplex13() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("F1 q"), outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("F12 q"), outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("F-1 q"), outputs("Game quit prematurely.\n")));
  }

  // test that playGame is able to parse valid cascade source piles
  @Test
  public void testPlayGameComplex14() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 q"), outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C12 q"), outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C-1 q"), outputs("Game quit prematurely.\n")));
  }

  // test that playGame is able to parse valid open source piles
  @Test
  public void testPlayGameComplex15() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("O1 q"), outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("O12 q"), outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("O-1 q"), outputs("Game quit prematurely.\n")));
  }

  // test that playGame re-prompts for the source pile if it is invalid
  @Test
  public void testPlayGameComplex16() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("f1 q"), outputs("Re-enter the source pile:\n"),
        outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("q1 q"), outputs("Re-enter the source pile:\n"),
        outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("F q"), outputs("Re-enter the source pile:\n"),
        outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("F F q"), outputs("Re-enter the source pile:\n"),
        outputs("Re-enter the source pile:\n"), outputs("Game quit prematurely.\n")));
  }

  // test that playGame is able to parse valid card indices
  @Test
  public void testPlayGameComplex17() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 1 q"), outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 12 q"), outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 -1 q"), outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 1324 q"), outputs("Game quit prematurely.\n")));
  }

  // test that playGame re-prompts for the card index if it is invalid and does not re-prompt for
  // the source pile
  @Test
  public void testPlayGameComplex18() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 C1 q"), outputs("Re-enter the card index:\n"),
        outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 a q"), outputs("Re-enter the card index:\n"),
        outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 q1 q"), outputs("Re-enter the card index:\n"),
        outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 q1 a q"), outputs("Re-enter the card index:\n"),
        outputs("Re-enter the card index:\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame is able to parse valid foundation destination piles
  @Test
  public void testPlayGameComplex19() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 1 F1 q"),
        outputs("Invalid move. Try again. Build is invalid\n"),
        outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 1 F12 q"),
        outputs("Invalid move. Try again. Build is invalid\n"),
        outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 1 F-1 q"),
        outputs("Invalid move. Try again. Build is invalid\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame is able to parse valid cascade destination piles
  @Test
  public void testPlayGameComplex20() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 1 C1 q"),
        outputs("Invalid move. Try again. Build is invalid\n"),
        outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 1 C12 q"),
        outputs("Invalid move. Try again. Build is invalid\n"),
        outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 1 C-1 q"),
        outputs("Invalid move. Try again. Build is invalid\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame is able to parse valid open destination piles
  @Test
  public void testPlayGameComplex21() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 1 O1 q"),
        outputs("Invalid move. Try again. Build is invalid\n"),
        outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 1 O12 q"),
        outputs("Invalid move. Try again. Build is invalid\n"),
        outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 1 O-1 q"),
        outputs("Invalid move. Try again. Build is invalid\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame re-prompts for the destination pile if it is invalid and does not re-prompt
  // for the source pile or the card index
  @Test
  public void testPlayGameComplex22() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 1 f1 q"), outputs("Re-enter the destination pile:\n"),
        outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 1 q1 q"), outputs("Re-enter the destination pile:\n"),
        outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 1 F q"), outputs("Re-enter the destination pile:\n"),
        outputs("Game quit prematurely.\n")));
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 1 F F q"), outputs("Re-enter the destination pile:\n"),
        outputs("Re-enter the destination pile:\n"), outputs("Game quit prematurely.\n")));
  }

  // test that playGame is able to parse through garbage inputs in between move parameters
  @Test
  public void testPlayGameComplex23() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("a C1 b 1 c O1 q"), outputs("Re-enter the source pile:\n"),
        outputs("Re-enter the card index:\n", "Re-enter the destination pile:\n",
            "Invalid move. Try again. Build is invalid\n",
            "Game quit prematurely.\n")));
  }

  // test that playGame is able to parse through inputs one at a time rather than in a batch
  @Test
  public void testPlayGameComplex24() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("a "), outputs("Re-enter the source pile:\n"),
        inputs("C1 "),
        inputs("b "), outputs("Re-enter the card index:\n"),
        inputs("1 "),
        inputs("c "), outputs("Re-enter the destination pile:\n"),
        inputs("O1 "),
        outputs("Invalid move. Try again. Build is invalid\n"),
        inputs("q"), outputs("Game quit prematurely.\n")));
  }

  // test that playGame correctly shuffles the deck if specified
  // this test has a negligible chance to fail if Collections.shuffle leaves the deck in its
  // original order
  @Test
  public void testPlayGameComplex25() {
    this.m4.startGame(this.l1, 8, 4, false);
    this.fc4.playGame(this.l1, 8, 4, true);
    assertNotEquals(this.m4.toString(), this.a1.toString().substring(0, 267));
  }

  // test that playGame leaves the deck as is if shuffling is not specified
  @Test
  public void testPlayGameComplex26() {
    this.m4.startGame(this.l1, 8, 4, false);
    this.fc4.playGame(this.l1, 8, 4, false);
    assertEquals(this.m4.toString(), this.a1.toString().substring(0, 267));
  }

  // test that playGame renders an error message if the source pile is a foundation pile
  @Test
  public void testPlayGameComplex27() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("F1 1 O1 q"), outputs("Invalid move. Try again. "),
        outputs("Invalid source or destination pile type provided\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame renders an error message if the source pile number is invalid
  @Test
  public void testPlayGameComplex28() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C0 1 O1 q"), outputs("Invalid move. Try again. "),
        outputs("Given pile number is out of range of the pile list\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame renders an error message if the source pile number is invalid
  @Test
  public void testPlayGameComplex29() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C9 1 O1 q"), outputs("Invalid move. Try again. "),
        outputs("Given pile number is out of range of the pile list\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame renders an error message if the card index is invalid
  @Test
  public void testPlayGameComplex30() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 0 O1 q"), outputs("Invalid move. Try again. "),
        outputs("Given card index is out of range of the pile\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame renders an error message if the card index is invalid
  @Test
  public void testPlayGameComplex31() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 10 O1 q"), outputs("Invalid move. Try again. "),
        outputs("Given card index is out of range of the pile\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame renders an error message if the destination pile number is invalid
  @Test
  public void testPlayGameComplex32() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 7 O0 q"), outputs("Invalid move. Try again. "),
        outputs("Given pile number is out of range of the pile list\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame renders an error message if the destination pile number is invalid
  @Test
  public void testPlayGameComplex33() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("C1 7 O10 q"), outputs("Invalid move. Try again. "),
        outputs("Given pile number is out of range of the pile list\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame renders an error message if the source pile is empty
  @Test
  public void testPlayGameComplex34() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs(this.m4.toString() + "\n"),
        inputs("O1 7 O2 q"), outputs("Invalid move. Try again. "),
        outputs("Given card index is out of range of the pile\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame renders an error message if the destination open pile is full
  @Test
  public void testPlayGameComplex35() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false,
        outputs(this.m4.toString() + "\n"),
        inputs("C1 7 O1 C1 6 O1 q"),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 6, PileType.OPEN, 0)),
        outputs("Invalid move. Try again. "),
        outputs("Card cannot be added to pile\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame renders an error message if a wrong color card is added to a cascade pile
  @Test
  public void testPlayGameComplex36() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false,
        outputs(this.m4.toString() + "\n"),
        inputs("C1 7 O1 C5 6 C1 q"),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 6, PileType.OPEN, 0)),
        outputs("Invalid move. Try again. "),
        outputs("Card cannot be added to pile\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame renders an error message if a wrong value card is added to a cascade pile
  @Test
  public void testPlayGameComplex37() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false,
        outputs(this.m4.toString() + "\n"),
        inputs("C1 7 O1 C2 7 C1 q"),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 6, PileType.OPEN, 0)),
        outputs("Invalid move. Try again. "),
        outputs("Card cannot be added to pile\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame renders an error message if a wrong suit card is added to a foundation pile
  @Test
  public void testPlayGameComplex38() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false,
        outputs(this.m4.toString() + "\n"),
        inputs("C1 7 F1 C6 6 F1 q"),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 6, PileType.FOUNDATION, 0)),
        outputs("Invalid move. Try again. "),
        outputs("Card cannot be added to pile\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame renders an error message if a wrong value card is added to a foundation pile
  @Test
  public void testPlayGameComplex39() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false,
        outputs(this.m4.toString() + "\n"),
        inputs("C5 6 F1 q"),
        outputs("Invalid move. Try again. "),
        outputs("Card cannot be added to pile\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame renders an error message if a wrong value card is added to a foundation pile
  @Test
  public void testPlayGameComplex40() {
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false,
        outputs(this.m4.toString() + "\n"),
        inputs("C1 7 F1 C1 6 F1 q"),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 6, PileType.FOUNDATION, 0)),
        outputs("Invalid move. Try again. "),
        outputs("Card cannot be added to pile\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that a card can be moved successfully from a cascade pile to another cascade pile
  @Test
  public void testPlayGameComplex41() {
    this.m4.startGame(this.l1, 4, 1, false);
    assertTrue(this.testRun(this.m3, this.l1, 4, 1, false,
        outputs(this.m4.toString() + "\n"),
        inputs("C1 13 F1 C2 13 F2 C1 12 F1 C2 12 C1 q"),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 12, PileType.FOUNDATION, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 1, 12, PileType.FOUNDATION, 1)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 11, PileType.FOUNDATION, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 1, 11, PileType.CASCADE, 0)),
        outputs("Game quit prematurely.\n")));
  }

  // test that a card can be moved successfully from a cascade pile to itself if valid
  @Test
  public void testPlayGameComplex42() {
    this.m4.startGame(this.l1, 4, 1, false);
    assertTrue(this.testRun(this.m3, this.l1, 4, 1, false,
        outputs(this.m4.toString() + "\n"),
        inputs("C1 13 O1 C2 13 C1 C1 13 C1 q"),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 12, PileType.OPEN, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 1, 12, PileType.CASCADE, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 12, PileType.CASCADE, 0)),
        outputs("Game quit prematurely.\n")));
  }

  // test that a card cannot be moved from a cascade pile to itself if invalid
  @Test
  public void testPlayGameComplex43() {
    this.m4.startGame(this.l1, 4, 1, false);
    assertTrue(this.testRun(this.m3, this.l1, 4, 1, false,
        outputs(this.m4.toString() + "\n"),
        inputs("C1 13 C1 q"),
        outputs("Invalid move. Try again. Card cannot be added to pile\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that a card can be moved successfully from a cascade pile to an open pile
  @Test
  public void testPlayGameComplex44() {
    this.m4.startGame(this.l1, 4, 1, false);
    assertTrue(this.testRun(this.m3, this.l1, 4, 1, false,
        outputs(this.m4.toString() + "\n"),
        inputs("C1 13 O1 q"),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 12, PileType.OPEN, 0)),
        outputs("Game quit prematurely.\n")));
  }

  // test that a card can be moved successfully from a cascade pile to a foundation pile
  @Test
  public void testPlayGameComplex45() {
    this.m4.startGame(this.l1, 4, 1, false);
    assertTrue(this.testRun(this.m3, this.l1, 4, 1, false,
        outputs(this.m4.toString() + "\n"),
        inputs("C1 13 F1 q"),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 12, PileType.FOUNDATION, 0)),
        outputs("Game quit prematurely.\n")));
  }

  // test that a card can be moved successfully from an open pile to another open pile
  @Test
  public void testPlayGameComplex46() {
    this.m4.startGame(this.l1, 4, 2, false);
    assertTrue(this.testRun(this.m3, this.l1, 4, 2, false,
        outputs(this.m4.toString() + "\n"),
        inputs("C1 13 O1 O1 1 O2 q"),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 12, PileType.OPEN, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.OPEN, 0, 0, PileType.OPEN, 1)),
        outputs("Game quit prematurely.\n")));
  }

  // test that a card can be moved successfully from an open pile to a cascade pile
  @Test
  public void testPlayGameComplex47() {
    this.m4.startGame(this.l1, 4, 2, false);
    assertTrue(this.testRun(this.m3, this.l1, 4, 2, false,
        outputs(this.m4.toString() + "\n"),
        inputs("C1 13 O1 C2 13 O2 O2 1 C1 q"),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 12, PileType.OPEN, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 1, 12, PileType.OPEN, 1)),
        outputs(moveAndGetBoard(this.m4, PileType.OPEN, 1, 0, PileType.CASCADE, 0)),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame returns if given an invalid deck and prints the expected message
  @Test
  public void testPlayGameComplex48() {
    this.l1.remove(1);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false, outputs("Could not start game.")));
  }

  // test that playGame resets and starts a new game if it is called multiple times
  @Test
  public void testPlayGameComplex49() {
    this.m4.startGame(this.l1, 4, 2, false);
    assertTrue(this.testRun(this.m3, this.l1, 4, 2, false,
        outputs(this.m4.toString() + "\n"),
        inputs("q"),
        outputs("Game quit prematurely.\n")));
    this.m4.startGame(this.l1, 8, 4, false);
    assertTrue(this.testRun(this.m3, this.l1, 8, 4, false,
        outputs(this.m4.toString() + "\n"),
        inputs("q"),
        outputs("Game quit prematurely.\n")));
  }

  // test that a build cannot be moved if it does not have alternating colors
  @Test
  public void testPlayGameComplex50() {
    this.m4.startGame(this.l1, 4, 2, false);
    assertTrue(this.testRun(this.m3, this.l1, 4, 2, false,
        outputs(this.m4.toString() + "\n"),
        inputs("C1 13 F1 C1 12 F1 C1 11 F1 C2 11 C1 q"),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 12, PileType.FOUNDATION, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 11, PileType.FOUNDATION, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 10, PileType.FOUNDATION, 0)),
        outputs("Invalid move. Try again. Card cannot be added to pile\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that a build cannot be moved if it does not have values decreasing by one
  @Test
  public void testPlayGameComplex51() {
    this.m4.startGame(this.l1, 4, 2, false);
    assertTrue(this.testRun(this.m3, this.l1, 4, 2, false,
        outputs(this.m4.toString() + "\n"),
        inputs("C4 12 C1 q"),
        outputs("Invalid move. Try again. Card cannot be added to pile\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that a build cannot be moved if it does not form a build with the destination cascade pile
  @Test
  public void testPlayGameComplex52() {
    this.m4.startGame(this.l1, 4, 2, false);
    assertTrue(this.testRun(this.m3, this.l1, 4, 2, false,
        outputs(this.m4.toString() + "\n"),
        inputs("C4 12 C2 q"),
        outputs("Invalid move. Try again. Card cannot be added to pile\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that a valid build cannot be moved to an empty open pile
  @Test
  public void testPlayGameComplex53() {
    this.m4.startGame(this.l1, 4, 2, false);
    assertTrue(this.testRun(this.m3, this.l1, 4, 2, false,
        outputs(this.m4.toString() + "\n"),
        inputs("C1 13 F1 C1 12 F1 C2 13 F2 C2 12 C1 C3 13 C1 C1 11 O1 q"),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 12, PileType.FOUNDATION, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 11, PileType.FOUNDATION, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 1, 12, PileType.FOUNDATION, 1)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 1, 11, PileType.CASCADE, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 2, 12, PileType.CASCADE, 0)),
        outputs(
            "Invalid move. Try again. Multiple cards can only be moved between cascade piles\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that an invalid build cannot be moved to an empty open pile
  @Test
  public void testPlayGameComplex54() {
    this.m4.startGame(this.l1, 4, 2, false);
    assertTrue(this.testRun(this.m3, this.l1, 4, 2, false,
        outputs(this.m4.toString() + "\n"),
        inputs("C4 12 O1 q"),
        outputs(
            "Invalid move. Try again. Multiple cards can only be moved between cascade piles\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that a valid build cannot be moved to a full open pile
  @Test
  public void testPlayGameComplex55() {
    this.m4.startGame(this.l1, 4, 2, false);
    assertTrue(this.testRun(this.m3, this.l1, 4, 2, false,
        outputs(this.m4.toString() + "\n"),
        inputs("C1 13 F1 C1 12 F1 C2 13 F2 C2 12 C1 C3 13 C1 C1 11 O1 q"),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 12, PileType.FOUNDATION, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 11, PileType.FOUNDATION, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 1, 12, PileType.FOUNDATION, 1)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 1, 11, PileType.CASCADE, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 2, 12, PileType.CASCADE, 0)),
        outputs(
            "Invalid move. Try again. Multiple cards can only be moved between cascade piles\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that an invalid build cannot be moved to a full open pile
  @Test
  public void testPlayGameComplex56() {
    this.m4.startGame(this.l1, 4, 2, false);
    assertTrue(this.testRun(this.m3, this.l1, 4, 2, false,
        outputs(this.m4.toString() + "\n"),
        inputs("C1 13 O1 C4 12 O1 q"),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 12, PileType.OPEN, 0)),
        outputs(
            "Invalid move. Try again. Multiple cards can only be moved between cascade piles\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that a valid build cannot be moved to an empty foundation pile
  @Test
  public void testPlayGameComplex57() {
    this.m4.startGame(this.l1, 4, 2, false);
    assertTrue(this.testRun(this.m3, this.l1, 4, 2, false,
        outputs(this.m4.toString() + "\n"),
        inputs("C1 13 F1 C1 12 F1 C2 13 F2 C2 12 C1 C3 13 C1 C1 11 F4 q"),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 12, PileType.FOUNDATION, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 11, PileType.FOUNDATION, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 1, 12, PileType.FOUNDATION, 1)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 1, 11, PileType.CASCADE, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 2, 12, PileType.CASCADE, 0)),
        outputs(
            "Invalid move. Try again. Multiple cards can only be moved between cascade piles\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that an invalid build cannot be moved to an empty foundation pile
  @Test
  public void testPlayGameComplex58() {
    this.m4.startGame(this.l1, 4, 2, false);
    assertTrue(this.testRun(this.m3, this.l1, 4, 2, false,
        outputs(this.m4.toString() + "\n"),
        inputs("C1 13 F1 C1 12 F1 C2 13 F2 C2 12 C1 C3 13 C1 C1 11 F4 q"),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 12, PileType.FOUNDATION, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 11, PileType.FOUNDATION, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 1, 12, PileType.FOUNDATION, 1)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 1, 11, PileType.CASCADE, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 2, 12, PileType.CASCADE, 0)),
        outputs(
            "Invalid move. Try again. Multiple cards can only be moved between cascade piles\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that a valid build cannot be moved to an occupied foundation pile
  @Test
  public void testPlayGameComplex59() {
    this.m4.startGame(this.l1, 4, 2, false);
    assertTrue(this.testRun(this.m3, this.l1, 4, 2, false,
        outputs(this.m4.toString() + "\n"),
        inputs("C1 13 F1 C1 12 F1 C2 13 F2 C2 12 C1 C3 13 C1 C4 13 F4 C1 11 F4 q"),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 12, PileType.FOUNDATION, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 11, PileType.FOUNDATION, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 1, 12, PileType.FOUNDATION, 1)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 1, 11, PileType.CASCADE, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 2, 12, PileType.CASCADE, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 12, PileType.FOUNDATION, 3)),
        outputs(
            "Invalid move. Try again. Multiple cards can only be moved between cascade piles\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that an invalid build cannot be moved to an occupied foundation pile
  @Test
  public void testPlayGameComplex60() {
    this.m4.startGame(this.l1, 4, 2, false);
    assertTrue(this.testRun(this.m3, this.l1, 4, 2, false,
        outputs(this.m4.toString() + "\n"),
        inputs("C1 13 F1 C4 12 F1 q"),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 12, PileType.FOUNDATION, 0)),
        outputs(
            "Invalid move. Try again. Multiple cards can only be moved between cascade piles\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that a valid build can be moved from a cascade pile to itself if valid
  @Test
  public void testPlayGameComplex61() {
    this.m4.startGame(this.l1, 4, 2, false);
    assertTrue(this.testRun(this.m3, this.l1, 4, 2, false,
        outputs(this.m4.toString() + "\n"),
        inputs(
            "C4 13 F4 C4 12 F4 C4 11 F4 C4 10 F4 C4 9 F4 C4 8 F4 C4 7 F4 C4 6 F4 C4 5 F4 C4 4 F4 "
                + "C4 3 F4 C4 2 F4 C4 1 F4 C1 13 F1 C1 12 F1 C2 13 F2 C2 12 C1 C3 13 C1 C1 "
                + "11 C4 C4 1 C4 q"),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 12, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 11, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 10, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 9, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 8, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 7, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 6, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 5, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 4, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 3, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 2, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 1, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 0, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 12, PileType.FOUNDATION, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 11, PileType.FOUNDATION, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 1, 12, PileType.FOUNDATION, 1)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 1, 11, PileType.CASCADE, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 2, 12, PileType.CASCADE, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 10, PileType.CASCADE, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 0, PileType.CASCADE, 3)),
        outputs("Game quit prematurely.\n")));
  }

  // test that a valid build cannot be moved from a cascade pile to itself if invalid
  @Test
  public void testPlayGameComplex62() {
    this.m4.startGame(this.l1, 4, 2, false);
    assertTrue(this.testRun(this.m3, this.l1, 4, 2, false,
        outputs(this.m4.toString() + "\n"),
        inputs("C1 13 F1 C1 12 F1 C2 13 F2 C2 12 C1 C3 13 C1 C1 11 C1 q"),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 12, PileType.FOUNDATION, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 11, PileType.FOUNDATION, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 1, 12, PileType.FOUNDATION, 1)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 1, 11, PileType.CASCADE, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 2, 12, PileType.CASCADE, 0)),
        outputs(
            "Invalid move. Try again. Card cannot be added to pile\n"),
        outputs("Game quit prematurely.\n")));
  }

  // test that a valid build can be moved from one cascade pile to a different empty cascade pile
  @Test
  public void testPlayGameComplex63() {
    this.m4.startGame(this.l1, 4, 2, false);
    assertTrue(this.testRun(this.m3, this.l1, 4, 2, false,
        outputs(this.m4.toString() + "\n"),
        inputs(
            "C4 13 F4 C4 12 F4 C4 11 F4 C4 10 F4 C4 9 F4 C4 8 F4 C4 7 F4 C4 6 F4 C4 5 F4 C4 4 F4 "
                + "C4 3 F4 C4 2 F4 C4 1 F4 C1 13 F1 C1 12 F1 C2 13 F2 C2 12 C1 C3 13 C1 C1 "
                + "11 C4 q"),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 12, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 11, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 10, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 9, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 8, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 7, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 6, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 5, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 4, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 3, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 2, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 1, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 0, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 12, PileType.FOUNDATION, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 11, PileType.FOUNDATION, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 1, 12, PileType.FOUNDATION, 1)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 1, 11, PileType.CASCADE, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 2, 12, PileType.CASCADE, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 10, PileType.CASCADE, 3)),
        outputs("Game quit prematurely.\n")));
  }

  // test that a valid build can be moved from one cascade pile to a different occupied cascade pile
  @Test
  public void testPlayGameComplex64() {
    this.m4.startGame(this.l1, 4, 2, false);
    assertTrue(this.testRun(this.m3, this.l1, 4, 2, false,
        outputs(this.m4.toString() + "\n"),
        inputs(
            "C4 13 F4 C4 12 F4 C4 11 F4 C4 10 F4 C4 9 F4 C4 8 F4 C4 7 F4 C4 6 F4 C4 5 F4 C4 4 F4 "
                + "C4 3 F4 C4 2 F4 C4 1 F4 C1 13 F1 C1 12 F1 C2 13 F2 C2 12 C1 C3 13 C1 C3 12 C2 "
                + "C3 11 O1 C2 11 C3 q"),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 12, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 11, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 10, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 9, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 8, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 7, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 6, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 5, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 4, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 3, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 2, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 1, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 0, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 12, PileType.FOUNDATION, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 11, PileType.FOUNDATION, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 1, 12, PileType.FOUNDATION, 1)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 1, 11, PileType.CASCADE, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 2, 12, PileType.CASCADE, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 2, 11, PileType.CASCADE, 1)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 2, 10, PileType.OPEN, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 1, 10, PileType.CASCADE, 2)),
        outputs("Game quit prematurely.\n")));
  }

  // test that a valid build can only be moved if there are enough open intermediate slots
  @Test
  public void testPlayGameComplex65() {
    this.m4.startGame(this.l1, 4, 2, false);
    assertTrue(this.testRun(this.m3, this.l1, 4, 2, false,
        outputs(this.m4.toString() + "\n"),
        inputs(
            "C4 13 F4 C4 12 F4 C4 11 F4 C4 10 F4 C4 9 F4 C4 8 F4 C4 7 F4 C4 6 F4 C4 5 F4 C4 4 F4 "
                + "C4 3 F4 C4 2 F4 C4 1 F4 C1 13 F1 C1 12 F1 C2 13 F2 C2 12 C1 C3 13 C1 C1 "
                + "11 C4 q"),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 12, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 11, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 10, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 9, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 8, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 7, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 6, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 5, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 4, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 3, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 2, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 1, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 0, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 12, PileType.FOUNDATION, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 11, PileType.FOUNDATION, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 1, 12, PileType.FOUNDATION, 1)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 1, 11, PileType.CASCADE, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 2, 12, PileType.CASCADE, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 10, PileType.CASCADE, 3)),
        outputs("Game quit prematurely.\n")));
  }

  // test that a valid build cannot be moved if there are not enough open intermediate slots
  @Test
  public void testPlayGameComplex66() {
    this.m4.startGame(this.l1, 4, 2, false);
    assertTrue(this.testRun(this.m3, this.l1, 4, 2, false,
        outputs(this.m4.toString() + "\n"),
        inputs(
            "C4 13 F4 C4 12 F4 C4 11 F4 C4 10 F4 C4 9 F4 C4 8 F4 C4 7 F4 C4 6 F4 C4 5 F4 C4 4 F4 "
                + "C4 3 F4 C4 2 F4 C4 1 F4 C1 13 F1 C1 12 F1 C2 13 F2 C2 12 C1 C3 13 C1 C3 12 O1 "
                + "C1 11 C4 q"),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 12, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 11, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 10, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 9, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 8, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 7, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 6, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 5, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 4, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 3, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 2, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 1, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 0, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 12, PileType.FOUNDATION, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 11, PileType.FOUNDATION, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 1, 12, PileType.FOUNDATION, 1)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 1, 11, PileType.CASCADE, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 2, 12, PileType.CASCADE, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 2, 11, PileType.OPEN, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 10, PileType.CASCADE, 3)),
        outputs("Game quit prematurely.\n")));
  }

  // test that any card can move to an empty cascade pile
  @Test
  public void testPlayGameComplex67() {
    this.m4.startGame(this.l1, 4, 2, false);
    assertTrue(this.testRun(this.m3, this.l1, 4, 2, false,
        outputs(this.m4.toString() + "\n"),
        inputs(
            "C4 13 F4 C4 12 F4 C4 11 F4 C4 10 F4 C4 9 F4 C4 8 F4 C4 7 F4 C4 6 F4 C4 5 F4 C4 4 F4 "
                + "C4 3 F4 C4 2 F4 C4 1 F4 C1 13 F1 C1 12 F1 C2 13 F2 C2 12 C1 C3 13 C1 C1 "
                + "11 C4 q"),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 12, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 11, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 10, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 9, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 8, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 7, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 6, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 5, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 4, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 3, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 2, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 1, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 3, 0, PileType.FOUNDATION, 3)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 12, PileType.FOUNDATION, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 11, PileType.FOUNDATION, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 1, 12, PileType.FOUNDATION, 1)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 1, 11, PileType.CASCADE, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 2, 12, PileType.CASCADE, 0)),
        outputs(moveAndGetBoard(this.m4, PileType.CASCADE, 0, 10, PileType.CASCADE, 3)),
        outputs("Game quit prematurely.\n")));
  }

  // test that playGame returns if the game is over and prints the expected message
  @Test
  public void testPlayGameOverComplex1() {
    StringBuilder sb = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    for (int i = 1; i < 5; i++) {
      for (int j = 13; j > 0; j--) {
        sb.append(String.format("C%d %d F%d ", i, j, i));
      }
    }
    sb.append("q");
    StringReader sr = new StringReader(sb.toString());
    this.fc4 = new SimpleFreecellController(this.m3, sr, sb2);
    this.fc4.playGame(this.l1, 4, 1, false);
    String s = sb2.toString();
    assertEquals("Game over.\n", s.substring(s.length() - 11));
  }

  // test that playGame returns if the game is over and prints the expected message
  @Test
  public void testPlayGameOverComplex2() {
    StringBuilder sb = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    for (int i = 1; i < 5; i++) {
      for (int j = 13; j > 0; j--) {
        sb.append(String.format("a C%d b %d c F%d ", i, j, i));
      }
    }
    sb.append("q");
    StringReader sr = new StringReader(sb.toString());
    this.fc4 = new SimpleFreecellController(this.m3, sr, sb2);
    this.fc4.playGame(this.l1, 4, 1, false);
    String s = sb2.toString();
    assertEquals("Game over.\n", s.substring(s.length() - 11));
  }
}
