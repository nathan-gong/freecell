import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import cs3500.freecell.model.FreecellModel;
import cs3500.freecell.model.PileType;
import cs3500.freecell.model.hw02.Card;
import cs3500.freecell.model.hw02.ICard;
import cs3500.freecell.model.hw02.SimpleFreecellModel;
import cs3500.freecell.model.hw02.Suit;
import cs3500.freecell.model.hw02.Value;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for the SimpleFreecellModel class.
 */
public class SimpleFreecellModelTest {

  FreecellModel<ICard> m1;
  FreecellModel<ICard> m2;
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
  List<ICard> l2;
  List<ICard> l3;

  /**
   * Initialize variables for testing.
   */
  @Before
  public void init() {
    this.m1 = new SimpleFreecellModel();
    this.m2 = new SimpleFreecellModel();
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
    this.l2 = new ArrayList<>(Arrays.asList(this.c1, this.c2, this.c3, this.c4, this.c5, this.c6,
        this.c7, this.c8, this.c9, this.c10, this.c11, this.c12, this.c13, this.c14, this.c15,
        this.c16, this.c17, this.c18, this.c19, this.c20, this.c21, this.c22, this.c23, this.c24,
        this.c25, this.c26, this.c27, this.c28, this.c29, this.c30, this.c31, this.c32, this.c33,
        this.c34, this.c35, this.c36, this.c37, this.c38, this.c39, this.c40, this.c41, this.c42,
        this.c43, this.c44, this.c45, this.c46, this.c47, this.c48, this.c49, this.c50, this.c51,
        this.c52));
    this.l3 = this.m2.getDeck();
  }

  // test that getDeck returns a valid list of cards
  @Test
  public void testGetDeck() {
    assertEquals(52, this.m1.getDeck().size());
    assertEquals(new HashSet<>(this.l1), new HashSet<>(this.m1.getDeck()));
  }

  // test startGame exception when the provided deck is invalid
  @Test(expected = IllegalArgumentException.class)
  public void testStartGame1() {
    this.l1.remove(0);
    this.m1.startGame(this.l1, 1, 1, true);
  }

  // test startGame exception when not enough cascade piles are given
  @Test(expected = IllegalArgumentException.class)
  public void testStartGame2() {
    this.m1.startGame(this.l1, 0, 1, true);
  }

  // test startGame exception when not enough open piles are given
  @Test(expected = IllegalArgumentException.class)
  public void testStartGame3() {
    this.m1.startGame(this.l1, 1, 0, true);
  }

  // test that startGame does not modify the input list
  @Test
  public void testStartGame4() {
    assertEquals(this.l2, this.l1);
    this.m1.startGame(this.l1, 8, 4, false);
    assertEquals(this.l2, this.l1);
    this.m1.startGame(this.l1, 8, 4, true);
    assertEquals(this.l2, this.l1);
  }

  // test that startGame shuffles the deck when shuffle=true
  // this test has a negligible chance to fail if Collections.shuffle leaves the deck in its
  // original order
  @Test
  public void testStartGame5() {
    this.m1.startGame(this.l1, 8, 4, false);
    String s1 = this.m1.toString();
    this.m2.startGame(this.l1, 8, 4, true);
    String s2 = this.m2.toString();
    assertNotEquals(s1, s2);
  }

  // test that startGame initializes the lists of piles
  @Test
  public void testStartGame6() {
    this.m1.startGame(this.l1, 4, 1, false);
    assertEquals(4, this.m1.getNumCascadePiles());
    assertEquals(1, this.m1.getNumOpenPiles());
  }

  // test that startGame deals the cards to the cascade piles
  @Test
  public void testStartGame7() {
    this.m1.startGame(this.l1, 4, 1, false);
    assertEquals(0, this.m1.getNumCardsInFoundationPile(0));
    assertEquals(0, this.m1.getNumCardsInFoundationPile(1));
    assertEquals(0, this.m1.getNumCardsInFoundationPile(2));
    assertEquals(0, this.m1.getNumCardsInFoundationPile(3));
    assertEquals(0, this.m1.getNumCardsInOpenPile(0));
    assertEquals(13, this.m1.getNumCardsInCascadePile(0));
    assertEquals(13, this.m1.getNumCardsInCascadePile(1));
    assertEquals(13, this.m1.getNumCardsInCascadePile(2));
    assertEquals(13, this.m1.getNumCardsInCascadePile(3));
  }

  // test that startGame changes the gameState to true to signify that the game has started
  // if the game had not started yet, this test would throw an IllegalStateException
  @Test
  public void testStartGame8() {
    this.m1.startGame(this.l1, 4, 1, false);
    assertEquals(this.c1, this.m1.getCascadeCardAt(0, 0));
    assertEquals(this.c50, this.m1.getCascadeCardAt(1, 12));
    assertEquals(this.c3, this.m1.getCascadeCardAt(2, 0));
    assertEquals(this.c52, this.m1.getCascadeCardAt(3, 12));
  }

  // test that startGame throws an exception if the given deck is null
  @Test(expected = IllegalArgumentException.class)
  public void testStartGame9() {
    this.m1.startGame(null, 4, 1, false);
  }

  // test that startGame resets the board if called before the game is over
  @Test
  public void testStartGame10() {
    this.m1.startGame(this.l1, 4, 1, false);
    assertEquals(4, this.m1.getNumCascadePiles());
    assertEquals(1, this.m1.getNumOpenPiles());
    assertFalse(this.m1.isGameOver());
    this.m1.startGame(this.l1, 5, 2, false);
    assertNotEquals(9, this.m1.getNumCascadePiles());
    assertNotEquals(3, this.m1.getNumOpenPiles());
    assertEquals(5, this.m1.getNumCascadePiles());
    assertEquals(2, this.m1.getNumOpenPiles());
    assertFalse(this.m1.isGameOver());
  }

  // test that move throws an exception if the game hasn't started
  @Test(expected = IllegalStateException.class)
  public void testMove1() {
    this.m1.move(PileType.CASCADE, 1, 1, PileType.OPEN, 1);
  }

  // test that move throws an exception if the source pile is a foundation pile
  @Test(expected = IllegalArgumentException.class)
  public void testMove2() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m1.move(PileType.FOUNDATION, 1, 1, PileType.OPEN, 1);
  }

  // test that move throws an exception if the source pile is invalid
  @Test(expected = IllegalArgumentException.class)
  public void testMove3() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m1.move(null, 1, 1, PileType.OPEN, 1);
  }

  // test that move throws an exception if the destination pile is invalid
  @Test(expected = IllegalArgumentException.class)
  public void testMove4() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m1.move(PileType.CASCADE, 1, 1, null, 1);
  }

  // test that move throws an exception if the source pile number is invalid
  @Test(expected = IllegalArgumentException.class)
  public void testMove5() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m1.move(PileType.CASCADE, 4, 1, PileType.OPEN, 1);
  }

  // test that move throws an exception if the source pile number is invalid
  @Test(expected = IllegalArgumentException.class)
  public void testMove6() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m1.move(PileType.CASCADE, 0, 1, PileType.OPEN, 1);
  }

  // test that move throws an exception if the card index is invalid
  @Test(expected = IllegalArgumentException.class)
  public void testMove7() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m1.move(PileType.CASCADE, 1, 14, PileType.OPEN, 1);
  }

  // test that move throws an exception if the card index is invalid
  @Test(expected = IllegalArgumentException.class)
  public void testMove8() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m1.move(PileType.CASCADE, 1, 0, PileType.OPEN, 1);
  }

  // test that move throws an exception if the destination pile number is invalid
  @Test(expected = IllegalArgumentException.class)
  public void testMove9() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m1.move(PileType.CASCADE, 1, 0, PileType.OPEN, 2);
  }

  // test that move throws an exception if the destination pile number is invalid
  @Test(expected = IllegalArgumentException.class)
  public void testMove10() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m1.move(PileType.CASCADE, 1, 0, PileType.OPEN, 0);
  }

  // test that move throws an exception if the source pile is empty
  @Test(expected = IllegalArgumentException.class)
  public void testMove11() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m1.move(PileType.OPEN, 1, 0, PileType.OPEN, 2);
  }

  // test that move throws an exception if the destination open pile is full
  @Test(expected = IllegalArgumentException.class)
  public void testMove12() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m1.move(PileType.CASCADE, 1, 0, PileType.OPEN, 2);
    this.m1.move(PileType.CASCADE, 1, 0, PileType.OPEN, 2);
  }

  // test that move throws an exception if the card added to a cascade pile is the wrong color
  @Test(expected = IllegalArgumentException.class)
  public void testMove13() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m1.move(PileType.CASCADE, 1, 0, PileType.OPEN, 2);
    this.m1.move(PileType.CASCADE, 3, 0, PileType.CASCADE, 1);
  }

  // test that move throws an exception if the card added to a cascade pile is the wrong value
  @Test(expected = IllegalArgumentException.class)
  public void testMove14() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m1.move(PileType.CASCADE, 1, 0, PileType.CASCADE, 2);
  }

  // test that move throws an exception if the card added to a foundation pile is the wrong suit
  @Test(expected = IllegalArgumentException.class)
  public void testMove15() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m1.move(PileType.CASCADE, 1, 0, PileType.FOUNDATION, 2);
    this.m1.move(PileType.CASCADE, 2, 0, PileType.OPEN, 1);
    this.m1.move(PileType.CASCADE, 2, 0, PileType.FOUNDATION, 2);
  }

  // test that move throws an exception if the card added to a foundation pile is the wrong value
  @Test(expected = IllegalArgumentException.class)
  public void testMove16() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m1.move(PileType.CASCADE, 1, 0, PileType.FOUNDATION, 2);
    this.m1.move(PileType.CASCADE, 2, 0, PileType.FOUNDATION, 2);
  }

  // test that a card can be moved successfully from a cascade pile to another cascade pile
  @Test
  public void testMove17() {
    this.m1.startGame(this.l1, 4, 1, false);
    assertEquals(this.c49, this.m1.getCascadeCardAt(0, 12));
    this.m1.move(PileType.CASCADE, 0, 12, PileType.FOUNDATION, 0);
    this.m1.move(PileType.CASCADE, 1, 12, PileType.FOUNDATION, 1);
    this.m1.move(PileType.CASCADE, 0, 11, PileType.FOUNDATION, 0);
    this.m1.move(PileType.CASCADE, 1, 11, PileType.CASCADE, 0);
    assertEquals(this.c46, this.m1.getCascadeCardAt(0, 11));
  }

  // test that a card can be moved successfully from a cascade pile to itself if valid
  @Test
  public void testMove18() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m1.move(PileType.CASCADE, 0, 12, PileType.OPEN, 0);
    this.m1.move(PileType.CASCADE, 1, 12, PileType.CASCADE, 0);
    assertEquals(this.c50, this.m1.getCascadeCardAt(0, 12));
    this.m1.move(PileType.CASCADE, 0, 12, PileType.CASCADE, 0);
    assertEquals(this.c50, this.m1.getCascadeCardAt(0, 12));
  }

  // test that a card cannot be moved from a cascade pile to itself if invalid
  @Test(expected = IllegalArgumentException.class)
  public void testMove19() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m1.move(PileType.CASCADE, 0, 12, PileType.CASCADE, 0);
  }

  // test that a card can be moved successfully from a cascade pile to an open pile
  @Test
  public void testMove20() {
    this.m1.startGame(this.l1, 4, 1, false);
    assertEquals(this.c49, this.m1.getCascadeCardAt(0, 12));
    this.m1.move(PileType.CASCADE, 0, 12, PileType.OPEN, 0);
    assertEquals(this.c49, this.m1.getOpenCardAt(0));
  }

  // test that a card can be moved successfully from a cascade pile to a foundation pile
  @Test
  public void testMove21() {
    this.m1.startGame(this.l1, 4, 1, false);
    assertEquals(this.c49, this.m1.getCascadeCardAt(0, 12));
    this.m1.move(PileType.CASCADE, 0, 12, PileType.FOUNDATION, 0);
    assertEquals(this.c49, this.m1.getFoundationCardAt(0, 0));
  }

  // test that a card can be moved successfully from an open pile to another open pile
  @Test
  public void testMove22() {
    this.m1.startGame(this.l1, 4, 2, false);
    assertEquals(this.c49, this.m1.getCascadeCardAt(0, 12));
    this.m1.move(PileType.CASCADE, 0, 12, PileType.OPEN, 0);
    assertEquals(this.c49, this.m1.getOpenCardAt(0));
    this.m1.move(PileType.OPEN, 0, 0, PileType.OPEN, 1);
    assertEquals(this.c49, this.m1.getOpenCardAt(1));
  }

  // test that a card can be moved successfully from an open pile to itself
  @Test
  public void testMove23() {
    this.m1.startGame(this.l1, 4, 2, false);
    assertEquals(this.c49, this.m1.getCascadeCardAt(0, 12));
    this.m1.move(PileType.CASCADE, 0, 12, PileType.OPEN, 0);
    assertEquals(this.c49, this.m1.getOpenCardAt(0));
    this.m1.move(PileType.OPEN, 0, 0, PileType.OPEN, 0);
    assertEquals(this.c49, this.m1.getOpenCardAt(0));
  }

  // test that a card can be moved successfully from an open pile to a cascade pile
  @Test
  public void testMove24() {
    this.m1.startGame(this.l1, 4, 2, false);
    assertEquals(this.c49, this.m1.getCascadeCardAt(0, 12));
    this.m1.move(PileType.CASCADE, 0, 12, PileType.OPEN, 0);
    assertEquals(this.c49, this.m1.getOpenCardAt(0));
    assertEquals(this.c50, this.m1.getCascadeCardAt(1, 12));
    this.m1.move(PileType.CASCADE, 1, 12, PileType.OPEN, 1);
    assertEquals(this.c50, this.m1.getOpenCardAt(1));
    this.m1.move(PileType.OPEN, 1, 0, PileType.CASCADE, 0);
    assertEquals(this.c50, this.m1.getCascadeCardAt(0, 12));
  }

  // test that the game is not over after the game starts
  @Test
  public void testGameOver1() {
    assertFalse(this.m1.isGameOver());
    this.m1.startGame(this.l1, 4, 1, false);
    assertFalse(this.m1.isGameOver());
  }

  // test that the game is over once there are four foundation piles with 13 cards each
  @Test
  public void testGameOver2() {
    assertFalse(this.m1.isGameOver());
    this.m1.startGame(this.l1, 4, 1, false);
    assertFalse(this.m1.isGameOver());
    for (int i = 0; i < 4; i++) {
      for (int j = 12; j >= 0; j--) {
        this.m1.move(PileType.CASCADE, i, j, PileType.FOUNDATION, i);
      }
    }
    assertTrue(this.m1.isGameOver());
  }

  // test that the game is not over before the game starts
  @Test
  public void testGameOver3() {
    assertFalse(this.m1.isGameOver());
  }

  // test that the game is not over if the game is reset after being over
  @Test
  public void testGameOver4() {
    assertFalse(this.m1.isGameOver());
    this.m1.startGame(this.l1, 4, 1, false);
    assertFalse(this.m1.isGameOver());
    for (int i = 0; i < 4; i++) {
      for (int j = 12; j >= 0; j--) {
        this.m1.move(PileType.CASCADE, i, j, PileType.FOUNDATION, i);
      }
    }
    assertTrue(this.m1.isGameOver());
    this.m1.startGame(this.l1, 4, 1, false);
    assertFalse(this.m1.isGameOver());
  }

  // test that getNumCardsInFoundationPile runs successfully
  @Test
  public void testGetNumCardsInFoundationPile1() {
    this.m1.startGame(this.l1, 4, 2, false);
    assertEquals(0, this.m1.getNumCardsInFoundationPile(0));
    assertEquals(0, this.m1.getNumCardsInFoundationPile(1));
    assertEquals(0, this.m1.getNumCardsInFoundationPile(2));
    assertEquals(0, this.m1.getNumCardsInFoundationPile(3));
  }

  // test that getNumCardsInFoundationPile throws an exception if the game has not started
  @Test(expected = IllegalStateException.class)
  public void testGetNumCardsInFoundationPile2() {
    this.m1.getNumCardsInFoundationPile(0);
  }

  // test that getNumCardsInFoundationPile throws an exception if the index is invalid
  @Test(expected = IllegalArgumentException.class)
  public void testGetNumCardsInFoundationPile3() {
    this.m1.startGame(this.l1, 4, 2, false);
    this.m1.getNumCardsInFoundationPile(4);
  }

  // test that getNumCardsInFoundationPile throws an exception if the index is invalid
  @Test(expected = IllegalArgumentException.class)
  public void testGetNumCardsInFoundationPile4() {
    this.m1.startGame(this.l1, 4, 2, false);
    this.m1.getNumCardsInFoundationPile(-1);
  }

  // test that getNumCascadePiles returns the correct number if the game has started
  @Test
  public void testGetNumCascadePiles1() {
    this.m1.startGame(this.l1, 4, 2, false);
    assertEquals(4, this.m1.getNumCascadePiles());
  }

  // test that getNumCascadePiles returns -1 if the game has not started
  @Test
  public void testGetNumCascadePiles2() {
    assertEquals(-1, this.m1.getNumCascadePiles());
  }

  // test that getNumCardsInCascadePile runs successfully
  @Test
  public void testGetNumCardsInCascadePile1() {
    this.m1.startGame(this.l1, 4, 2, false);
    assertEquals(13, this.m1.getNumCardsInCascadePile(0));
    assertEquals(13, this.m1.getNumCardsInCascadePile(1));
    assertEquals(13, this.m1.getNumCardsInCascadePile(2));
    assertEquals(13, this.m1.getNumCardsInCascadePile(3));
  }

  // test that getNumCardsInCascadePile throws an exception if the game has not started
  @Test(expected = IllegalStateException.class)
  public void testGetNumCardsInCascadePile2() {
    this.m1.getNumCardsInCascadePile(0);
  }

  // test that getNumCardsInCascadePile throws an exception if the index is invalid
  @Test(expected = IllegalArgumentException.class)
  public void testGetNumCardsInCascadePile3() {
    this.m1.startGame(this.l1, 4, 2, false);
    this.m1.getNumCardsInCascadePile(4);
  }

  // test that getNumCardsInCascadePile throws an exception if the index is invalid
  @Test(expected = IllegalArgumentException.class)
  public void testGetNumCardsInCascadePile4() {
    this.m1.startGame(this.l1, 4, 2, false);
    this.m1.getNumCardsInCascadePile(-1);
  }

  // test that getNumCardsInOpenPile runs successfully
  @Test
  public void testGetNumCardsInOpenPile1() {
    this.m1.startGame(this.l1, 4, 2, false);
    assertEquals(0, this.m1.getNumCardsInOpenPile(0));
    assertEquals(0, this.m1.getNumCardsInOpenPile(1));
  }

  // test that getNumCardsInOpenPile throws an exception if the game has not started
  @Test(expected = IllegalStateException.class)
  public void testGetNumCardsInOpenPile2() {
    this.m1.getNumCardsInOpenPile(0);
  }

  // test that getNumCardsInOpenPile throws an exception if the index is invalid
  @Test(expected = IllegalArgumentException.class)
  public void testGetNumCardsInOpenPile3() {
    this.m1.startGame(this.l1, 4, 2, false);
    this.m1.getNumCardsInOpenPile(2);
  }

  // test that getNumCardsInOpenPile throws an exception if the index is invalid
  @Test(expected = IllegalArgumentException.class)
  public void testGetNumCardsInOpenPile4() {
    this.m1.startGame(this.l1, 4, 2, false);
    this.m1.getNumCardsInOpenPile(-1);
  }

  // test that getNumOpenPiles returns the correct number if the game has started
  @Test
  public void testGetNumOpenPiles1() {
    this.m1.startGame(this.l1, 4, 2, false);
    assertEquals(2, this.m1.getNumOpenPiles());
  }

  // test that getNumOpenPiles returns -1 if the game has not started
  @Test
  public void testGetNumOpenPiles2() {
    assertEquals(-1, this.m1.getNumOpenPiles());
  }

  // test that getFoundationCardAt runs successfully
  @Test
  public void testGetFoundationCardAt1() {
    this.m1.startGame(this.l1, 4, 2, false);
    this.m1.move(PileType.CASCADE, 0, 12, PileType.FOUNDATION, 0);
    assertEquals(this.c49, this.m1.getFoundationCardAt(0, 0));
  }

  // test that getFoundationCardAt throws an exception if the game has not started
  @Test(expected = IllegalStateException.class)
  public void testGetFoundationCardAt2() {
    this.m1.getFoundationCardAt(0, 0);
  }

  // test that getFoundationCardAt throws an exception if the pile index is invalid
  @Test(expected = IllegalArgumentException.class)
  public void testGetFoundationCardAt3() {
    this.m1.startGame(this.l1, 4, 2, false);
    this.m1.move(PileType.CASCADE, 0, 12, PileType.FOUNDATION, 0);
    this.m1.getFoundationCardAt(5, 0);
  }

  // test that getFoundationCardAt throws an exception if the card index is invalid
  @Test(expected = IllegalArgumentException.class)
  public void testGetFoundationCardAt4() {
    this.m1.startGame(this.l1, 4, 2, false);
    this.m1.move(PileType.CASCADE, 0, 12, PileType.FOUNDATION, 0);
    assertEquals(this.c49, this.m1.getFoundationCardAt(0, 5));
  }

  // test that getCascadeCardAt runs successfully
  @Test
  public void testGetCascadeCardAt1() {
    this.m1.startGame(this.l1, 4, 2, false);
    assertEquals(this.c49, this.m1.getCascadeCardAt(0, 12));
  }

  // test that getCascadeCardAt throws an exception if the game has not started
  @Test(expected = IllegalStateException.class)
  public void testGetCascadeCardAt2() {
    this.m1.getCascadeCardAt(0, 0);
  }

  // test that getCascadeCardAt throws an exception if the pile index is invalid
  @Test(expected = IllegalArgumentException.class)
  public void testGetCascadeCardAt3() {
    this.m1.startGame(this.l1, 4, 2, false);
    this.m1.getCascadeCardAt(5, 0);
  }

  // test that getCascadeCardAt throws an exception if the card index is invalid
  @Test(expected = IllegalArgumentException.class)
  public void testGetCascadeCardAt4() {
    this.m1.startGame(this.l1, 4, 2, false);
    this.m1.getCascadeCardAt(0, 15);
  }

  // test that getOpenCardAt runs successfully
  @Test
  public void testGetOpenCardAt1() {
    this.m1.startGame(this.l1, 4, 2, false);
    this.m1.move(PileType.CASCADE, 0, 12, PileType.OPEN, 0);
    assertEquals(this.c49, this.m1.getOpenCardAt(0));
  }

  // test that getOpenCardAt throws an exception if the game has not started
  @Test(expected = IllegalStateException.class)
  public void testGetOpenCardAt2() {
    this.m1.getOpenCardAt(0);
  }

  // test that getOpenCardAt throws an exception if the pile index is invalid
  @Test(expected = IllegalArgumentException.class)
  public void testGetOpenCardAt3() {
    this.m1.startGame(this.l1, 4, 2, false);
    this.m1.move(PileType.CASCADE, 0, 12, PileType.OPEN, 0);
    this.m1.getOpenCardAt(5);
  }

  // test the String representation of the model if the game has started
  @Test
  public void testToString1() {
    this.m2.startGame(this.l3, 8, 4, false);
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
    assertEquals(s, this.m2.toString());
  }

  // test the String representation of the model if the game has not started
  @Test
  public void testToString2() {
    assertEquals("", this.m2.toString());
  }

  // test the String representation of the model if startGame throws an exception
  @Test(expected = IllegalArgumentException.class)
  public void testToString3() {
    try {
      this.m1.startGame(this.l1, 0, 4, false);
    } catch (IllegalArgumentException e) {
      assertEquals("", this.m1.toString());
      throw e;
    }
  }
}
