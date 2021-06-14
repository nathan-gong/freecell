import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import cs3500.freecell.model.FreecellModel;
import cs3500.freecell.model.FreecellModelCreator;
import cs3500.freecell.model.FreecellModelCreator.GameType;
import cs3500.freecell.model.hw02.ICard;
import cs3500.freecell.model.hw02.SimpleFreecellModel;
import cs3500.freecell.model.hw04.ComplexFreecellModel;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for the FreecellModelCreator class.
 */
public class FreecellModelCreatorTest {

  FreecellModel<ICard> m1;

  /**
   * Initialize variables for testing.
   */
  @Before
  public void init() {
    this.m1 = null;
  }

  // test that create throws an exception if given an invalid game type
  @Test(expected = IllegalArgumentException.class)
  public void testCreateNull() {
    this.m1 = FreecellModelCreator.create(null);
  }

  // test that create returns a SimpleFreecellModel when given the specified enum
  @Test
  public void testCreateSingleMove() {
    assertNull(this.m1);
    this.m1 = FreecellModelCreator.create(GameType.SINGLEMOVE);
    assertNotNull(this.m1);
    assertTrue(this.m1 instanceof SimpleFreecellModel);
    assertEquals(SimpleFreecellModel.class, this.m1.getClass());
    this.m1.startGame(this.m1.getDeck(), 8, 4, true);
  }

  // test that create returns a ComplexFreecellModel when given the specified enum
  @Test
  public void testCreateMultiMove() {
    assertNull(this.m1);
    this.m1 = FreecellModelCreator.create(GameType.MULTIMOVE);
    assertNotNull(this.m1);
    assertTrue(this.m1 instanceof ComplexFreecellModel);
    assertEquals(ComplexFreecellModel.class, this.m1.getClass());
    this.m1.startGame(this.m1.getDeck(), 8, 4, true);
  }
}
