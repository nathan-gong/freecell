import static org.junit.Assert.assertEquals;

import cs3500.freecell.Utils;
import cs3500.freecell.model.hw02.Card;
import cs3500.freecell.model.hw02.ICard;
import cs3500.freecell.model.hw02.Suit;
import cs3500.freecell.model.hw02.Value;
import org.junit.Test;

/**
 * Test class for the Utils class.
 */
public class UtilsTest {

  // test that requireNonNull throws an exception if the input is null
  @Test(expected = IllegalArgumentException.class)
  public void testRequireNonNull1() {
    Utils.requireNonNull(null);
  }

  // test that requireNonNull does not throw an exception if the input is non-null
  @Test
  public void testRequireNonNull2() {
    ICard c = new Card(Value.NINE, Suit.CLUB);
    assertEquals(c, Utils.requireNonNull(c));
  }
}
