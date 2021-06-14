import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import cs3500.freecell.model.hw02.Card;
import cs3500.freecell.model.hw02.ICard;
import cs3500.freecell.model.hw02.Suit;
import cs3500.freecell.model.hw02.Value;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for the Card class.
 */
public class CardTest {

  ICard c1;
  ICard c2;
  ICard c3;
  ICard c4;
  ICard c5;

  /**
   * Initialize variables for testing.
   */
  @Before
  public void init() {
    this.c1 = new Card(Value.ACE, Suit.HEART);
    this.c2 = new Card(Value.SIX, Suit.CLUB);
    this.c3 = new Card(Value.NINE, Suit.DIAMOND);
    this.c4 = new Card(Value.KING, Suit.SPADE);
    this.c5 = new Card(Value.KING, Suit.SPADE);
  }

  // card is illegal if the value is null
  @Test(expected = IllegalArgumentException.class)
  public void testIllegalConstructor1() {
    new Card(null, Suit.HEART);
  }

  // card is illegal if the suit is null
  @Test(expected = IllegalArgumentException.class)
  public void testIllegalConstructor2() {
    new Card(Value.ACE, null);
  }

  // test getting the Value of a Card
  @Test
  public void testGetValue() {
    assertEquals(Value.NINE, this.c3.getValue());
  }

  // test getting the Suit of a Card
  @Test
  public void testGetSuit() {
    assertEquals(Suit.DIAMOND, this.c3.getSuit());
  }

  // test physical and logical equality of Cards
  @Test
  public void testEquals() {
    assertEquals(this.c4, this.c4);
    assertEquals(this.c4, this.c5);
    assertNotEquals(this.c4, this.c1);
  }

  // test hashCode equality for Cards
  @Test
  public void testHashCode() {
    assertEquals(this.c4.hashCode(), this.c4.hashCode());
    assertEquals(this.c4.hashCode(), this.c5.hashCode());
    assertNotEquals(this.c4.hashCode(), this.c1.hashCode());
  }

  // test the String representation of Cards
  @Test
  public void testToString() {
    assertEquals("A♥", this.c1.toString());
    assertEquals("6♣", this.c2.toString());
    assertEquals("9♦", this.c3.toString());
    assertEquals("K♠", this.c4.toString());
  }
}
