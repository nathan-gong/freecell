import static org.junit.Assert.assertEquals;

import cs3500.freecell.model.hw02.Card;
import cs3500.freecell.model.hw02.FoundationPile;
import cs3500.freecell.model.hw02.ICard;
import cs3500.freecell.model.hw02.IPile;
import cs3500.freecell.model.hw02.Suit;
import cs3500.freecell.model.hw02.Value;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for the FoundationPile class.
 */
public class FoundationPileTest {

  IPile<ICard> fp1;
  IPile<ICard> fp2;
  ICard c1;
  ICard c2;
  ICard c3;
  ICard c4;
  List<ICard> l1;
  List<ICard> l2;

  /**
   * Initialize variables for testing.
   */
  @Before
  public void init() {
    this.fp1 = new FoundationPile(1);
    this.c1 = new Card(Value.ACE, Suit.HEART);
    this.c2 = new Card(Value.TWO, Suit.HEART);
    this.c3 = new Card(Value.THREE, Suit.HEART);
    this.c4 = new Card(Value.TWO, Suit.DIAMOND);
    this.l1 = new ArrayList<>();
    this.l2 = new ArrayList<>(Arrays.asList(this.c1, this.c2));
    this.fp2 = new FoundationPile(this.l1, 2);
  }

  // pile is illegal if the index is not between 1-4
  // test index < 1 with a default list of cards
  @Test(expected = IllegalArgumentException.class)
  public void testIllegalConstructor1() {
    new FoundationPile(0);
  }

  // pile is illegal if the index is not between 1-4
  // test index > 4 with a default list of cards
  @Test(expected = IllegalArgumentException.class)
  public void testIllegalConstructor2() {
    new FoundationPile(5);
  }

  // pile is illegal if the index is not between 1-4
  // test index < 1 with a specified list of cards
  @Test(expected = IllegalArgumentException.class)
  public void testIllegalConstructor3() {
    new FoundationPile(this.l1, 0);
  }

  // pile is illegal if the index is not between 1-4
  // test index > 4 with a specified list of cards
  @Test(expected = IllegalArgumentException.class)
  public void testIllegalConstructor4() {
    new FoundationPile(this.l1, 5);
  }

  // pile is illegal if the list of cards is null
  @Test(expected = IllegalArgumentException.class)
  public void testIllegalConstructor5() {
    new FoundationPile(null, 1);
  }

  // test adding valid cards to a pile
  @Test
  public void testAdd() {
    assertEquals(0, this.fp1.getPile().size());
    this.fp1.add(this.c1);
    assertEquals(1, this.fp1.getPile().size());
    this.fp1.add(this.c2);
    assertEquals(2, this.fp1.getPile().size());
  }

  // test adding an invalid card to a pile
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidAdd1() {
    this.fp1.add(null);
  }

  // test adding a non-Ace to an empty pile
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidAdd2() {
    this.fp1.add(this.c2);
  }

  // test adding a card with a value not one higher than the end card in the pile
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidAdd3() {
    this.fp1.add(this.c1);
    this.fp1.add(this.c3);
  }

  // test adding a card with a suit not matching the end card in the pile
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidAdd4() {
    this.fp1.add(this.c1);
    this.fp1.add(this.c4);
  }

  // test removing a card from an empty pile
  @Test(expected = IllegalStateException.class)
  public void testInvalidRemove1() {
    this.fp1.remove();
  }

  // test removing a card from a non-empty pile
  @Test(expected = IllegalStateException.class)
  public void testInvalidRemove2() {
    this.fp1.add(this.c1);
    this.fp1.remove();
  }

  // test the String representation of a pile
  @Test
  public void testToString() {
    assertEquals("F1:", this.fp1.toString());
    this.fp1.add(this.c1);
    assertEquals("F1: A♥", this.fp1.toString());
    this.fp1.add(this.c2);
    assertEquals("F1: A♥, 2♥", this.fp1.toString());
  }

  // test getting the list of cards from a pile
  @Test
  public void testGetPile() {
    assertEquals(new ArrayList<>(), this.fp2.getPile());
    this.fp2.add(this.c1);
    this.fp2.add(this.c2);
    assertEquals(this.l2, this.fp2.getPile());
  }
}
