import static org.junit.Assert.assertEquals;

import cs3500.freecell.model.FreecellModel;
import cs3500.freecell.model.PileType;
import cs3500.freecell.model.hw02.ICard;
import cs3500.freecell.model.hw02.SimpleFreecellModel;
import cs3500.freecell.model.hw04.ComplexFreecellModel;
import cs3500.freecell.view.FreecellTextView;
import cs3500.freecell.view.FreecellView;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for the FreecellTextView class.
 */
public class FreecellTextViewTest {

  FreecellView fv1;
  FreecellView fv2;
  FreecellView fv3;
  FreecellView fv4;
  FreecellView fv5;
  FreecellView fv6;
  FreecellView fv7;
  FreecellView fv8;
  FreecellModel<ICard> m1;
  FreecellModel<ICard> m2;
  List<ICard> l1;
  ByteArrayOutputStream b1;
  PrintStream p1;
  PrintStream p2;

  /**
   * Initialize variables for testing.
   */
  @Before
  public void init() {
    this.m1 = new SimpleFreecellModel();
    this.m2 = new ComplexFreecellModel();
    this.l1 = this.m1.getDeck();
    this.fv1 = new FreecellTextView(this.m1);
    this.fv5 = new FreecellTextView(this.m2);
    this.b1 = new ByteArrayOutputStream();
    this.p1 = System.out;
    this.p2 = new PrintStream(this.b1);
    this.fv2 = new FreecellTextView(this.m1, null);
    this.fv3 = new FreecellTextView(this.m1, this.p2);
    this.fv4 = new FreecellTextView(this.m1, new BadAppendable());
    this.fv6 = new FreecellTextView(this.m2, null);
    this.fv7 = new FreecellTextView(this.m2, this.p2);
    this.fv8 = new FreecellTextView(this.m2, new BadAppendable());
  }

  /**
   * Reset variables after testing.
   */
  @After
  public void reset() {
    System.setOut(this.p1);
  }

  // view is illegal if the model is null
  @Test(expected = IllegalArgumentException.class)
  public void testIllegalConstructor() {
    new FreecellTextView(null);
  }

  // test String representation of the view before the game has started
  @Test
  public void testToStringBeforeStart1() {
    assertEquals("", this.fv1.toString());
  }

  // test String representation of the view if the call to startGame throws an exception
  @Test(expected = IllegalArgumentException.class)
  public void testToStringBeforeStart2() {
    try {
      this.m1.startGame(this.l1, 0, 4, false);
    } catch (IllegalArgumentException e) {
      assertEquals("", this.fv1.toString());
      throw e;
    }
  }

  // test String representation of the view after the game has started
  @Test
  public void testToStringAfterStart() {
    this.m1.startGame(this.l1, 8, 4, false);
    this.m1.move(PileType.CASCADE, 7, 5, PileType.OPEN, 0);
    this.m1.move(PileType.CASCADE, 7, 4, PileType.FOUNDATION, 1);
    String s = "F1:\n"
        + "F2: A♠\n"
        + "F3:\n"
        + "F4:\n"
        + "O1: 9♠\n"
        + "O2:\n"
        + "O3:\n"
        + "O4:\n"
        + "C1: A♣, 9♣, 4♦, Q♦, 7♥, 2♠, 10♠\n"
        + "C2: 2♣, 10♣, 5♦, K♦, 8♥, 3♠, J♠\n"
        + "C3: 3♣, J♣, 6♦, A♥, 9♥, 4♠, Q♠\n"
        + "C4: 4♣, Q♣, 7♦, 2♥, 10♥, 5♠, K♠\n"
        + "C5: 5♣, K♣, 8♦, 3♥, J♥, 6♠\n"
        + "C6: 6♣, A♦, 9♦, 4♥, Q♥, 7♠\n"
        + "C7: 7♣, 2♦, 10♦, 5♥, K♥, 8♠\n"
        + "C8: 8♣, 3♦, J♦, 6♥";
    assertEquals(s, this.fv1.toString());
  }

  // test that the view transmits data to the console if no appendable is provided
  @Test
  public void testConstructor1() {
    System.setOut(this.p2);
    try {
      this.fv1.renderBoard();
      assertEquals("", this.b1.toString());
    } catch (Exception e) {
      assert false;
    }
  }

  // test that the view transmits data to the console if an invalid appendable is provided
  @Test
  public void testConstructor2() {
    System.setOut(this.p2);
    try {
      this.fv2.renderBoard();
      assertEquals("", this.b1.toString());
    } catch (Exception e) {
      assert false;
    }
  }

  // test that the view transmits data to the valid provided appendable
  @Test
  public void testConstructor3() {
    try {
      this.fv3.renderBoard();
    } catch (IOException e) {
      assert false;
    }
    assertEquals("", this.b1.toString());
    this.p2.append("Hello, world!");
    assertEquals("Hello, world!", this.b1.toString());
  }

  // test that the board can be rendered correctly before the game starts
  @Test
  public void testRenderBoard1() {
    try {
      this.fv3.renderBoard();
    } catch (IOException e) {
      assert false;
    }
    assertEquals("", this.b1.toString());
  }

  // test that the board can be rendered correctly after the game starts
  @Test
  public void testRenderBoard2() {
    this.m1.startGame(this.l1, 8, 4, false);
    this.m1.move(PileType.CASCADE, 7, 5, PileType.OPEN, 0);
    this.m1.move(PileType.CASCADE, 7, 4, PileType.FOUNDATION, 1);
    String s = "F1:\n"
        + "F2: A♠\n"
        + "F3:\n"
        + "F4:\n"
        + "O1: 9♠\n"
        + "O2:\n"
        + "O3:\n"
        + "O4:\n"
        + "C1: A♣, 9♣, 4♦, Q♦, 7♥, 2♠, 10♠\n"
        + "C2: 2♣, 10♣, 5♦, K♦, 8♥, 3♠, J♠\n"
        + "C3: 3♣, J♣, 6♦, A♥, 9♥, 4♠, Q♠\n"
        + "C4: 4♣, Q♣, 7♦, 2♥, 10♥, 5♠, K♠\n"
        + "C5: 5♣, K♣, 8♦, 3♥, J♥, 6♠\n"
        + "C6: 6♣, A♦, 9♦, 4♥, Q♥, 7♠\n"
        + "C7: 7♣, 2♦, 10♦, 5♥, K♥, 8♠\n"
        + "C8: 8♣, 3♦, J♦, 6♥";
    try {
      this.fv3.renderBoard();
    } catch (IOException e) {
      assert false;
    }
    assertEquals(s, this.b1.toString());
  }

  // test that renderBoard throws an exception if the transmission fails
  @Test(expected = IOException.class)
  public void testRenderBoard3() throws IOException {
    this.fv4.renderBoard();
  }

  // test that a message can be rendered correctly
  @Test
  public void testRenderMessage1() {
    try {
      this.fv3.renderMessage("ABC");
    } catch (IOException e) {
      assert false;
    }
    assertEquals("ABC", this.b1.toString());
  }

  // test that renderMessage throws an exception if the message is null
  @Test(expected = IOException.class)
  public void testRenderMessage2() throws IOException {
    this.fv3.renderMessage(null);
  }

  // test that renderMessage throws an exception if the transmission fails
  @Test(expected = IOException.class)
  public void testRenderMessage3() throws IOException {
    this.fv4.renderMessage("M");
  }

  // test String representation of the view before the game has started
  @Test
  public void testToStringBeforeStartComplex1() {
    assertEquals("", this.fv5.toString());
  }

  // test String representation of the view if the call to startGame throws an exception
  @Test(expected = IllegalArgumentException.class)
  public void testToStringBeforeStartComplex2() {
    try {
      this.m2.startGame(this.l1, 0, 4, false);
    } catch (IllegalArgumentException e) {
      assertEquals("", this.fv5.toString());
      throw e;
    }
  }

  // test String representation of the view after the game has started
  @Test
  public void testToStringAfterStartComplex() {
    this.m2.startGame(this.l1, 8, 4, false);
    this.m2.move(PileType.CASCADE, 7, 5, PileType.OPEN, 0);
    this.m2.move(PileType.CASCADE, 7, 4, PileType.FOUNDATION, 1);
    String s = "F1:\n"
        + "F2: A♠\n"
        + "F3:\n"
        + "F4:\n"
        + "O1: 9♠\n"
        + "O2:\n"
        + "O3:\n"
        + "O4:\n"
        + "C1: A♣, 9♣, 4♦, Q♦, 7♥, 2♠, 10♠\n"
        + "C2: 2♣, 10♣, 5♦, K♦, 8♥, 3♠, J♠\n"
        + "C3: 3♣, J♣, 6♦, A♥, 9♥, 4♠, Q♠\n"
        + "C4: 4♣, Q♣, 7♦, 2♥, 10♥, 5♠, K♠\n"
        + "C5: 5♣, K♣, 8♦, 3♥, J♥, 6♠\n"
        + "C6: 6♣, A♦, 9♦, 4♥, Q♥, 7♠\n"
        + "C7: 7♣, 2♦, 10♦, 5♥, K♥, 8♠\n"
        + "C8: 8♣, 3♦, J♦, 6♥";
    assertEquals(s, this.fv5.toString());
  }

  // test that the view transmits data to the console if no appendable is provided
  @Test
  public void testConstructorComplex() {
    System.setOut(this.p2);
    try {
      this.fv5.renderBoard();
      assertEquals("", this.b1.toString());
    } catch (Exception e) {
      assert false;
    }
  }

  // test that the view transmits data to the console if an invalid appendable is provided
  @Test
  public void testConstructorComplex2() {
    System.setOut(this.p2);
    try {
      this.fv6.renderBoard();
      assertEquals("", this.b1.toString());
    } catch (Exception e) {
      assert false;
    }
  }

  // test that the view transmits data to the valid provided appendable
  @Test
  public void testConstructorComplex3() {
    try {
      this.fv7.renderBoard();
    } catch (IOException e) {
      assert false;
    }
    assertEquals("", this.b1.toString());
    this.p2.append("Hello, world!");
    assertEquals("Hello, world!", this.b1.toString());
  }

  // test that the board can be rendered correctly before the game starts
  @Test
  public void testRenderBoardComplex1() {
    try {
      this.fv7.renderBoard();
    } catch (IOException e) {
      assert false;
    }
    assertEquals("", this.b1.toString());
  }

  // test that the board can be rendered correctly after the game starts
  @Test
  public void testRenderBoardComplex2() {
    this.m2.startGame(this.l1, 8, 4, false);
    this.m2.move(PileType.CASCADE, 7, 5, PileType.OPEN, 0);
    this.m2.move(PileType.CASCADE, 7, 4, PileType.FOUNDATION, 1);
    String s = "F1:\n"
        + "F2: A♠\n"
        + "F3:\n"
        + "F4:\n"
        + "O1: 9♠\n"
        + "O2:\n"
        + "O3:\n"
        + "O4:\n"
        + "C1: A♣, 9♣, 4♦, Q♦, 7♥, 2♠, 10♠\n"
        + "C2: 2♣, 10♣, 5♦, K♦, 8♥, 3♠, J♠\n"
        + "C3: 3♣, J♣, 6♦, A♥, 9♥, 4♠, Q♠\n"
        + "C4: 4♣, Q♣, 7♦, 2♥, 10♥, 5♠, K♠\n"
        + "C5: 5♣, K♣, 8♦, 3♥, J♥, 6♠\n"
        + "C6: 6♣, A♦, 9♦, 4♥, Q♥, 7♠\n"
        + "C7: 7♣, 2♦, 10♦, 5♥, K♥, 8♠\n"
        + "C8: 8♣, 3♦, J♦, 6♥";
    try {
      this.fv7.renderBoard();
    } catch (IOException e) {
      assert false;
    }
    assertEquals(s, this.b1.toString());
  }

  // test that renderBoard throws an exception if the transmission fails
  @Test(expected = IOException.class)
  public void testRenderBoardComplex3() throws IOException {
    this.fv8.renderBoard();
  }

  // test that a message can be rendered correctly
  @Test
  public void testRenderMessageComplex1() {
    try {
      this.fv7.renderMessage("ABC");
    } catch (IOException e) {
      assert false;
    }
    assertEquals("ABC", this.b1.toString());
  }

  // test that renderMessage throws an exception if the message is null
  @Test(expected = IOException.class)
  public void testRenderMessageComplex2() throws IOException {
    this.fv7.renderMessage(null);
  }

  // test that renderMessage throws an exception if the transmission fails
  @Test(expected = IOException.class)
  public void testRenderMessageComplex3() throws IOException {
    this.fv8.renderMessage("M");
  }
}
