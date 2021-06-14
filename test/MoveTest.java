import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import cs3500.freecell.controller.Move;
import cs3500.freecell.model.FreecellModel;
import cs3500.freecell.model.PileType;
import cs3500.freecell.model.hw02.Card;
import cs3500.freecell.model.hw02.ICard;
import cs3500.freecell.model.hw02.SimpleFreecellModel;
import cs3500.freecell.model.hw02.Suit;
import cs3500.freecell.model.hw02.Value;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for the Move class.
 */
public class MoveTest {

  Move m;
  FreecellModel<ICard> m1;
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

  /**
   * Initialize variables for testing.
   */
  @Before
  public void init() {
    this.m = new Move();
    this.m1 = new SimpleFreecellModel();
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
  }

  // test that the source pile type can be set correctly
  @Test
  public void testSetSource1() {
    assertNotNull(this.m.setSource(PileType.FOUNDATION));
    assertNotNull(this.m.setSource(PileType.CASCADE));
    assertNotNull(this.m.setSource(PileType.OPEN));
  }

  // test that the source pile type cannot be set to null
  @Test(expected = IllegalArgumentException.class)
  public void testSetSource2() {
    this.m.setSource(null);
  }

  // test that the pile number can be set correctly
  @Test
  public void testSetPileNumber() {
    assertNotNull(this.m.setPileNumber(1));
    assertNotNull(this.m.setPileNumber(0));
    assertNotNull(this.m.setPileNumber(-1));
  }

  // test that the card index can be set correctly
  @Test
  public void testSetCardIndex() {
    assertNotNull(this.m.setCardIndex(1));
    assertNotNull(this.m.setCardIndex(0));
    assertNotNull(this.m.setCardIndex(-1));
  }

  // test that the destination pile type can be set correctly
  @Test
  public void testSetDestination1() {
    assertNotNull(this.m.setDestination(PileType.FOUNDATION));
    assertNotNull(this.m.setDestination(PileType.CASCADE));
    assertNotNull(this.m.setDestination(PileType.OPEN));
  }

  // test that the destination pile type cannot be set to null
  @Test(expected = IllegalArgumentException.class)
  public void testSetDestination2() {
    this.m.setDestination(null);
  }

  // test that the destination pile number can be set correctly
  @Test
  public void testSetDestPileNumber() {
    assertNotNull(this.m.setDestPileNumber(1));
    assertNotNull(this.m.setDestPileNumber(0));
    assertNotNull(this.m.setDestPileNumber(-1));
  }

  // test that Move methods to set parameters can be chained together
  // this also validates that the return types are correct
  @Test
  public void testSetParams1() {
    assertNotNull(this.m.setSource(PileType.FOUNDATION).setPileNumber(1).setCardIndex(0)
        .setDestination(PileType.CASCADE).setDestPileNumber(-1));
  }

  // test that Move methods may be called multiple times
  @Test
  public void testSetParams2() {
    assertNotNull(this.m.setSource(PileType.FOUNDATION).setPileNumber(1).setCardIndex(0)
        .setDestination(PileType.CASCADE).setDestPileNumber(-1).setSource(PileType.OPEN)
        .setPileNumber(6).setCardIndex(1).setDestination(PileType.FOUNDATION).setDestPileNumber(3));
  }

  // test that getValidParams returns the correct number of valid parameters
  @Test
  public void testGetValidParams() {
    assertEquals(0, this.m.getValidParams());
    this.m.setSource(PileType.CASCADE);
    assertEquals(1, this.m.getValidParams());
    this.m.setPileNumber(1);
    assertEquals(2, this.m.getValidParams());
    this.m.setCardIndex(1);
    assertEquals(3, this.m.getValidParams());
    this.m.setDestination(PileType.OPEN);
    assertEquals(4, this.m.getValidParams());
    this.m.setDestPileNumber(1);
    assertEquals(5, this.m.getValidParams());
  }

  // test that move throws an exception if the game hasn't started
  @Test(expected = IllegalStateException.class)
  public void testMove1() {
    this.m.setSource(PileType.CASCADE).setPileNumber(1).setCardIndex(1)
        .setDestination(PileType.OPEN).setDestPileNumber(1);
    this.m.move(this.m1);
  }

  // test that move throws an exception if the source pile is a foundation pile
  @Test(expected = IllegalArgumentException.class)
  public void testMove2() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m.setSource(PileType.FOUNDATION).setPileNumber(1).setCardIndex(1)
        .setDestination(PileType.OPEN).setDestPileNumber(1);
    this.m.move(this.m1);
  }

  // test that move throws an exception if the source pile is invalid
  @Test(expected = IllegalArgumentException.class)
  public void testMove3() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m.setPileNumber(1).setCardIndex(1).setDestination(PileType.OPEN).setDestPileNumber(1);
    this.m.move(this.m1);
  }

  // test that move throws an exception if the destination pile is invalid
  @Test(expected = IllegalArgumentException.class)
  public void testMove4() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m.setSource(PileType.CASCADE).setPileNumber(1).setCardIndex(1).setDestPileNumber(1);
    this.m.move(this.m1);
  }

  // test that move throws an exception if the source pile number is invalid
  @Test(expected = IllegalArgumentException.class)
  public void testMove5() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m.setSource(PileType.CASCADE).setPileNumber(4).setCardIndex(1)
        .setDestination(PileType.OPEN).setDestPileNumber(1);
    this.m.move(this.m1);
  }

  // test that move throws an exception if the source pile number is invalid
  @Test(expected = IllegalArgumentException.class)
  public void testMove6() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m.setSource(PileType.CASCADE).setPileNumber(0).setCardIndex(1)
        .setDestination(PileType.OPEN).setDestPileNumber(1);
    this.m.move(this.m1);
  }

  // test that move throws an exception if the card index is invalid
  @Test(expected = IllegalArgumentException.class)
  public void testMove7() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m.setSource(PileType.CASCADE).setPileNumber(1).setCardIndex(14)
        .setDestination(PileType.OPEN).setDestPileNumber(1);
    this.m.move(this.m1);
  }

  // test that move throws an exception if the card index is invalid
  @Test(expected = IllegalArgumentException.class)
  public void testMove8() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m.setSource(PileType.CASCADE).setPileNumber(1).setCardIndex(0)
        .setDestination(PileType.OPEN).setDestPileNumber(1);
    this.m.move(this.m1);
  }

  // test that move throws an exception if the destination pile number is invalid
  @Test(expected = IllegalArgumentException.class)
  public void testMove9() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m.setSource(PileType.CASCADE).setPileNumber(1).setCardIndex(0)
        .setDestination(PileType.OPEN).setDestPileNumber(2);
    this.m.move(this.m1);
  }

  // test that move throws an exception if the destination pile number is invalid
  @Test(expected = IllegalArgumentException.class)
  public void testMove10() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m.setSource(PileType.CASCADE).setPileNumber(1).setCardIndex(0)
        .setDestination(PileType.OPEN).setDestPileNumber(0);
    this.m.move(this.m1);
  }

  // test that move throws an exception if the source pile is empty
  @Test(expected = IllegalArgumentException.class)
  public void testMove11() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m.setSource(PileType.OPEN).setPileNumber(1).setCardIndex(0).setDestination(PileType.OPEN)
        .setDestPileNumber(2);
    this.m.move(this.m1);
  }

  // test that move throws an exception if the destination open pile is full
  @Test(expected = IllegalArgumentException.class)
  public void testMove12() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m.setSource(PileType.CASCADE).setPileNumber(1).setCardIndex(0)
        .setDestination(PileType.OPEN).setDestPileNumber(2);
    this.m.move(this.m1);
    this.m.setSource(PileType.CASCADE).setPileNumber(1).setCardIndex(0)
        .setDestination(PileType.OPEN).setDestPileNumber(2);
    this.m.move(this.m1);
  }

  // test that move throws an exception if the card added to a cascade pile is the wrong color
  @Test(expected = IllegalArgumentException.class)
  public void testMove13() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m.setSource(PileType.CASCADE).setPileNumber(1).setCardIndex(0)
        .setDestination(PileType.OPEN).setDestPileNumber(2);
    this.m.move(this.m1);
    this.m.setSource(PileType.CASCADE).setPileNumber(3).setCardIndex(0)
        .setDestination(PileType.CASCADE).setDestPileNumber(1);
    this.m.move(this.m1);
  }

  // test that move throws an exception if the card added to a cascade pile is the wrong value
  @Test(expected = IllegalArgumentException.class)
  public void testMove14() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m.setSource(PileType.CASCADE).setPileNumber(1).setCardIndex(0)
        .setDestination(PileType.CASCADE).setDestPileNumber(2);
    this.m.move(this.m1);
  }

  // test that move throws an exception if the card added to a foundation pile is the wrong suit
  @Test(expected = IllegalArgumentException.class)
  public void testMove15() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m.setSource(PileType.CASCADE).setPileNumber(1).setCardIndex(0)
        .setDestination(PileType.FOUNDATION).setDestPileNumber(2);
    this.m.move(this.m1);
    this.m.setSource(PileType.CASCADE).setPileNumber(2).setCardIndex(0)
        .setDestination(PileType.OPEN).setDestPileNumber(1);
    this.m.move(this.m1);
    this.m.setSource(PileType.CASCADE).setPileNumber(2).setCardIndex(0)
        .setDestination(PileType.FOUNDATION).setDestPileNumber(2);
    this.m.move(this.m1);
  }

  // test that move throws an exception if the card added to a foundation pile is the wrong value
  @Test(expected = IllegalArgumentException.class)
  public void testMove16() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m.setSource(PileType.CASCADE).setPileNumber(1).setCardIndex(0)
        .setDestination(PileType.FOUNDATION).setDestPileNumber(2);
    this.m.move(this.m1);
    this.m.setSource(PileType.CASCADE).setPileNumber(2).setCardIndex(0)
        .setDestination(PileType.FOUNDATION).setDestPileNumber(2);
    this.m.move(this.m1);
  }

  // test that a card can be moved successfully from a cascade pile to another cascade pile
  @Test
  public void testMove17() {
    this.m1.startGame(this.l1, 4, 1, false);
    assertEquals(this.c49, this.m1.getCascadeCardAt(0, 12));
    this.m.setSource(PileType.CASCADE).setPileNumber(0).setCardIndex(12)
        .setDestination(PileType.FOUNDATION).setDestPileNumber(0);
    this.m.move(this.m1);
    this.m.setSource(PileType.CASCADE).setPileNumber(1).setCardIndex(12)
        .setDestination(PileType.FOUNDATION).setDestPileNumber(1);
    this.m.move(this.m1);
    this.m.setSource(PileType.CASCADE).setPileNumber(0).setCardIndex(11)
        .setDestination(PileType.FOUNDATION).setDestPileNumber(0);
    this.m.move(this.m1);
    this.m.setSource(PileType.CASCADE).setPileNumber(1).setCardIndex(11)
        .setDestination(PileType.CASCADE).setDestPileNumber(0);
    this.m.move(this.m1);
    assertEquals(this.c46, this.m1.getCascadeCardAt(0, 11));
  }

  // test that a card can be moved successfully from a cascade pile to itself if valid
  @Test
  public void testMove18() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m.setSource(PileType.CASCADE).setPileNumber(0).setCardIndex(12)
        .setDestination(PileType.OPEN).setDestPileNumber(0);
    this.m.move(this.m1);
    this.m.setSource(PileType.CASCADE).setPileNumber(1).setCardIndex(12)
        .setDestination(PileType.CASCADE).setDestPileNumber(0);
    this.m.move(this.m1);
    assertEquals(this.c50, this.m1.getCascadeCardAt(0, 12));
    this.m.setSource(PileType.CASCADE).setPileNumber(0).setCardIndex(12)
        .setDestination(PileType.CASCADE).setDestPileNumber(0);
    this.m.move(this.m1);
    assertEquals(this.c50, this.m1.getCascadeCardAt(0, 12));
  }

  // test that a card cannot be moved from a cascade pile to itself if invalid
  @Test(expected = IllegalArgumentException.class)
  public void testMove19() {
    this.m1.startGame(this.l1, 4, 1, false);
    this.m.setSource(PileType.CASCADE).setPileNumber(0).setCardIndex(12)
        .setDestination(PileType.CASCADE).setDestPileNumber(0);
    this.m.move(this.m1);
  }

  // test that a card can be moved successfully from a cascade pile to an open pile
  @Test
  public void testMove20() {
    this.m1.startGame(this.l1, 4, 1, false);
    assertEquals(this.c49, this.m1.getCascadeCardAt(0, 12));
    this.m.setSource(PileType.CASCADE).setPileNumber(0).setCardIndex(12)
        .setDestination(PileType.OPEN).setDestPileNumber(0);
    this.m.move(this.m1);
    assertEquals(this.c49, this.m1.getOpenCardAt(0));
  }

  // test that a card can be moved successfully from a cascade pile to a foundation pile
  @Test
  public void testMove21() {
    this.m1.startGame(this.l1, 4, 1, false);
    assertEquals(this.c49, this.m1.getCascadeCardAt(0, 12));
    this.m.setSource(PileType.CASCADE).setPileNumber(0).setCardIndex(12)
        .setDestination(PileType.FOUNDATION).setDestPileNumber(0);
    this.m.move(this.m1);
    assertEquals(this.c49, this.m1.getFoundationCardAt(0, 0));
  }

  // test that a card can be moved successfully from an open pile to another open pile
  @Test
  public void testMove22() {
    this.m1.startGame(this.l1, 4, 2, false);
    assertEquals(this.c49, this.m1.getCascadeCardAt(0, 12));
    this.m.setSource(PileType.CASCADE).setPileNumber(0).setCardIndex(12)
        .setDestination(PileType.OPEN).setDestPileNumber(0);
    this.m.move(this.m1);
    assertEquals(this.c49, this.m1.getOpenCardAt(0));
    this.m.setSource(PileType.OPEN).setPileNumber(0).setCardIndex(0).setDestination(PileType.OPEN)
        .setDestPileNumber(1);
    this.m.move(this.m1);
    assertEquals(this.c49, this.m1.getOpenCardAt(1));
  }

  // test that a card can be moved successfully from an open pile to itself
  @Test
  public void testMove23() {
    this.m1.startGame(this.l1, 4, 2, false);
    assertEquals(this.c49, this.m1.getCascadeCardAt(0, 12));
    this.m.setSource(PileType.CASCADE).setPileNumber(0).setCardIndex(12)
        .setDestination(PileType.OPEN).setDestPileNumber(0);
    this.m.move(this.m1);
    assertEquals(this.c49, this.m1.getOpenCardAt(0));
    this.m.setSource(PileType.OPEN).setPileNumber(0).setCardIndex(0).setDestination(PileType.OPEN)
        .setDestPileNumber(0);
    this.m.move(this.m1);
    assertEquals(this.c49, this.m1.getOpenCardAt(0));
  }

  // test that a card can be moved successfully from an open pile to a cascade pile
  // this also validates that the Move methods set the parameters to the correct values
  @Test
  public void testMove24() {
    this.m1.startGame(this.l1, 4, 2, false);
    assertEquals(this.c49, this.m1.getCascadeCardAt(0, 12));
    this.m.setSource(PileType.CASCADE).setPileNumber(0).setCardIndex(12)
        .setDestination(PileType.OPEN).setDestPileNumber(0);
    this.m.move(this.m1);
    assertEquals(this.c49, this.m1.getOpenCardAt(0));
    assertEquals(this.c50, this.m1.getCascadeCardAt(1, 12));
    this.m.setSource(PileType.CASCADE).setPileNumber(1).setCardIndex(12)
        .setDestination(PileType.OPEN).setDestPileNumber(1);
    this.m.move(this.m1);
    assertEquals(this.c50, this.m1.getOpenCardAt(1));
    this.m.setSource(PileType.OPEN).setPileNumber(1).setCardIndex(0)
        .setDestination(PileType.CASCADE).setDestPileNumber(0);
    this.m.move(this.m1);
    assertEquals(this.c50, this.m1.getCascadeCardAt(0, 12));
  }
}
