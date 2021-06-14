import static org.junit.Assert.assertEquals;

import cs3500.freecell.model.hw02.Suit;
import org.junit.Test;

/**
 * Test class for the Suit enum.
 */
public class SuitTest {

  // test the String representation of Suits
  @Test
  public void testToString() {
    assertEquals("♥", Suit.HEART.toString());
    assertEquals("♣", Suit.CLUB.toString());
    assertEquals("♦", Suit.DIAMOND.toString());
    assertEquals("♠", Suit.SPADE.toString());
  }

  // test getting the color of Suits
  @Test
  public void testGetColor() {
    assertEquals("RED", Suit.HEART.getColor());
    assertEquals("BLACK", Suit.CLUB.getColor());
    assertEquals("RED", Suit.DIAMOND.getColor());
    assertEquals("BLACK", Suit.SPADE.getColor());
  }
}
