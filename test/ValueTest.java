import static org.junit.Assert.assertEquals;

import cs3500.freecell.model.hw02.Value;
import org.junit.Test;

/**
 * Test class for the Value enum.
 */
public class ValueTest {

  // test the String representation of Values
  @Test
  public void testToString() {
    assertEquals("A", Value.ACE.toString());
    assertEquals("2", Value.TWO.toString());
    assertEquals("3", Value.THREE.toString());
    assertEquals("4", Value.FOUR.toString());
    assertEquals("5", Value.FIVE.toString());
    assertEquals("6", Value.SIX.toString());
    assertEquals("7", Value.SEVEN.toString());
    assertEquals("8", Value.EIGHT.toString());
    assertEquals("9", Value.NINE.toString());
    assertEquals("10", Value.TEN.toString());
    assertEquals("J", Value.JACK.toString());
    assertEquals("Q", Value.QUEEN.toString());
    assertEquals("K", Value.KING.toString());
  }

  // test getting the numerical value of a Value
  @Test
  public void testGetValue() {
    assertEquals(1, Value.ACE.getValue());
    assertEquals(2, Value.TWO.getValue());
    assertEquals(3, Value.THREE.getValue());
    assertEquals(4, Value.FOUR.getValue());
    assertEquals(5, Value.FIVE.getValue());
    assertEquals(6, Value.SIX.getValue());
    assertEquals(7, Value.SEVEN.getValue());
    assertEquals(8, Value.EIGHT.getValue());
    assertEquals(9, Value.NINE.getValue());
    assertEquals(10, Value.TEN.getValue());
    assertEquals(11, Value.JACK.getValue());
    assertEquals(12, Value.QUEEN.getValue());
    assertEquals(13, Value.KING.getValue());
  }
}