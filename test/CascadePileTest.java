import static org.junit.Assert.assertEquals;

import cs3500.freecell.model.hw02.Card;
import cs3500.freecell.model.hw02.CascadePile;
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
 * Test class for the CascadePile class.
 */
public class CascadePileTest {

  IPile<ICard> cp1;
  IPile<ICard> cp2;
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
    this.cp1 = new CascadePile(1);
    this.c1 = new Card(Value.KING, Suit.HEART);
    this.c2 = new Card(Value.QUEEN, Suit.SPADE);
    this.c3 = new Card(Value.JACK, Suit.CLUB);
    this.c4 = new Card(Value.QUEEN, Suit.DIAMOND);
    this.l1 = new ArrayList<>();
    this.l2 = new ArrayList<>(Arrays.asList(this.c1, this.c2));
    this.cp2 = new CascadePile(this.l1, 2);
  }

  // pile is illegal if the index is not at least 1
  // test index < 1 with a default list of cards
  @Test(expected = IllegalArgumentException.class)
  public void testIllegalConstructor1() {
    new CascadePile(0);
  }

  // pile is illegal if the index is not at least 1
  // test index < 1 with a specified list of cards
  @Test(expected = IllegalArgumentException.class)
  public void testIllegalConstructor2() {
    new CascadePile(this.l1, 0);
  }

  // pile is illegal if the list of cards is null
  @Test(expected = IllegalArgumentException.class)
  public void testIllegalConstructor3() {
    new CascadePile(null, 1);
  }

  // test adding valid cards to a pile
  @Test
  public void testAdd() {
    assertEquals(0, this.cp1.getPile().size());
    this.cp1.add(this.c1);
    assertEquals(1, this.cp1.getPile().size());
    this.cp1.add(this.c2);
    assertEquals(2, this.cp1.getPile().size());
  }

  // test adding an invalid card to a pile
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidAdd1() {
    this.cp1.add(null);
  }

  // test adding a card with a value not one lower than the end card in the pile
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidAdd2() {
    this.cp1.add(this.c1);
    this.cp1.add(this.c3);
  }

  // test adding a card with a suit color matching the end card in the pile
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidAdd3() {
    this.cp1.add(this.c1);
    this.cp1.add(this.c4);
  }

  // test removing cards from a pile
  @Test
  public void testRemove() {
    this.cp2.add(this.c1);
    this.cp2.add(this.c2);
    assertEquals(2, this.cp2.getPile().size());
    this.cp2.remove();
    assertEquals(1, this.cp2.getPile().size());
    this.cp2.remove();
    assertEquals(0, this.cp2.getPile().size());
  }

  // test removing a card from an empty pile
  @Test(expected = IllegalStateException.class)
  public void testInvalidRemove() {
    this.cp1.remove();
  }

  // test the String representation of a pile
  @Test
  public void testToString() {
    assertEquals("C1:", this.cp1.toString());
    this.cp1.add(this.c1);
    assertEquals("C1: K♥", this.cp1.toString());
    this.cp1.add(this.c2);
    assertEquals("C1: K♥, Q♠", this.cp1.toString());
  }

  // test getting the list of cards from a pile
  @Test
  public void testGetPile() {
    assertEquals(new ArrayList<>(), this.cp2.getPile());
    this.cp2.add(this.c1);
    this.cp2.add(this.c2);
    assertEquals(this.l2, this.cp2.getPile());
  }
}
