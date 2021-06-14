package cs3500.freecell.view;

import cs3500.freecell.Utils;
import cs3500.freecell.model.FreecellModelState;
import java.io.IOException;

/**
 * Represents a text view of a Freecell model.
 */
public class FreecellTextView implements FreecellView {

  private final FreecellModelState<?> model;
  private final Appendable ap;

  /**
   * Generates a text view of the Freecell model at the specified destination.
   *
   * @param model the model object to display as text
   * @param ap    the destination to transmit the view output to
   * @throws IllegalArgumentException if the model is null
   */
  public FreecellTextView(FreecellModelState<?> model, Appendable ap)
      throws IllegalArgumentException {
    this.model = Utils.requireNonNull(model);
    this.ap = (ap == null) ? System.out : ap;
  }

  /**
   * Generates a text view of the Freecell model.
   *
   * @param model the model object to display as text
   * @throws IllegalArgumentException if the model is null
   */
  public FreecellTextView(FreecellModelState<?> model) throws IllegalArgumentException {
    this(model, System.out);
  }

  @Override
  public String toString() {
    return this.model.toString();
  }

  @Override
  public void renderBoard() throws IOException {
    this.renderMessage(this.toString());
  }

  @Override
  public void renderMessage(String message) throws IOException {
    if (message == null) {
      throw new IOException("Cannot render a null message");
    }
    this.ap.append(message);
  }
}
