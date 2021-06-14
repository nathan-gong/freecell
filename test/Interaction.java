/**
 * Represents an interaction with the user consisting of some input to send the program and some
 * output to expect. An interaction accepts two StringBuilders and applies the desired effects.
 */
public interface Interaction {

  /**
   * Applies an operation on the given input and and generates some output.
   *
   * @param in the user input
   * @param out the mocked output
   */
  void apply(StringBuilder in, StringBuilder out);
}
