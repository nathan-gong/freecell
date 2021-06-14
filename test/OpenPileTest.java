import static org.junit.Assert.assertEquals;

import cs3500.freecell.model.hw02.Card;
import cs3500.freecell.model.hw02.ICard;
import cs3500.freecell.model.hw02.IPile;
import cs3500.freecell.model.hw02.OpenPile;
import cs3500.freecell.model.hw02.Suit;
import cs3500.freecell.model.hw02.Value;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for the OpenPile class.
 */
public class OpenPileTest {

  IPile<ICard> op1;
  IPile<ICard> op2;
  ICard c1;
  ICard c2;
  List<ICard> l1;
  List<ICard> l2;

  /**
   * Initialize variables for testing.
   */
  @Before
  public void init() {
    this.op1 = new OpenPile(1);
    this.c1 = new Card(Value.KING, Suit.HEART);
    this.c2 = new Card(Value.QUEEN, Suit.SPADE);
    this.l1 = new ArrayList<>();
    this.l2 = new ArrayList<>(Collections.singletonList(this.c1));
    this.op2 = new OpenPile(this.l1, 2);
  }

  // pile is illegal if the index is not at least 1
  // test index < 1 with a default list of cards
  @Test(expected = IllegalArgumentException.class)
  public void testIllegalConstructor1() {
    new OpenPile(0);
  }

  // pile is illegal if the index is not at least 1
  // test index < 1 with a specified list of cards
  @Test(expected = IllegalArgumentException.class)
  public void testIllegalConstructor2() {
    new OpenPile(this.l1, 0);
  }

  // pile is illegal if the list of cards is null
  @Test(expected = IllegalArgumentException.class)
  public void testIllegalConstructor3() {
    new OpenPile(null, 1);
  }

  // test adding valid cards to a pile
  @Test
  public void testAdd() {
    assertEquals(0, this.op1.getPile().size());
    this.op1.add(this.c1);
    assertEquals(1, this.op1.getPile().size());
  }

  // test adding an invalid card to a pile
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidAdd1() {
    this.op1.add(null);
  }

  // test adding a card to a non-empty pile
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidAdd2() {
    this.op2.add(this.c1);
    this.op2.add(this.c2);
  }

  // test removing a card from a non-empty pile
  @Test
  public void testRemove() {
    this.op2.add(this.c1);
    assertEquals(1, this.op2.getPile().size());
    this.op2.remove();
    assertEquals(0, this.op2.getPile().size());
  }

  // test removing a card from a empty pile
  @Test(expected = IllegalStateException.class)
  public void testInvalidRemove() {
    this.op2.remove();
  }

  // test the String representation of a pile
  @Test
  public void testToString() {
    assertEquals("O1:", this.op1.toString());
    this.op1.add(this.c1);
    assertEquals("O1: K♥", this.op1.toString());
  }

  // test getting the list of cards from a pile
  @Test
  public void testGetVPile() {
    assertEquals(new ArrayList<>(), this.op2.getPile());
    this.op2.add(this.c1);
    assertEquals(this.l2, this.op2.getPile());
  }
}
