package cs3500.freecell.model.hw04;

import cs3500.freecell.Utils;
import cs3500.freecell.model.FreecellModel;
import cs3500.freecell.model.PileType;
import cs3500.freecell.model.hw02.Card;
import cs3500.freecell.model.hw02.CascadePile;
import cs3500.freecell.model.hw02.FoundationPile;
import cs3500.freecell.model.hw02.ICard;
import cs3500.freecell.model.hw02.IPile;
import cs3500.freecell.model.hw02.OpenPile;
import cs3500.freecell.model.hw02.Suit;
import cs3500.freecell.model.hw02.Value;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Abstract base class for implementations of FreecellModels. This class promotes code reuse between
 * Freecell model implementations, and uses the specific ICard implementation as a card type.
 */
public abstract class AFreecellModel implements FreecellModel<ICard> {

  protected final List<IPile<ICard>> foundation;
  protected final List<IPile<ICard>> cascade;
  protected final List<IPile<ICard>> open;
  protected boolean gameState;
  protected final Map<PileType, List<IPile<ICard>>> pileLists;

  /**
   * Constructs a Freecell model with empty lists of piles and sets the game state as not started.
   */
  public AFreecellModel() {
    this.foundation = new ArrayList<>();
    this.cascade = new ArrayList<>();
    this.open = new ArrayList<>();
    this.gameState = false;
    this.pileLists = this.getPileLists();
  }

  @Override
  public List<ICard> getDeck() {
    List<ICard> deck = new ArrayList<>();
    for (Suit suit : Suit.values()) {
      for (Value value : Value.values()) {
        deck.add(new Card(value, suit));
      }
    }
    return deck;
  }

  @Override
  public void startGame(List<ICard> deck, int numCascadePiles, int numOpenPiles, boolean shuffle)
      throws IllegalArgumentException {
    this.isValidDeck(deck);
    this.isValidNumPiles(numCascadePiles, numOpenPiles);
    List<ICard> deckCopy = this.getDeckCopy(deck, shuffle);
    this.dealCards(deckCopy, numCascadePiles, numOpenPiles);
    this.gameState = true;
  }

  /**
   * Checks if the given deck is valid. The deck is invalid if it is null, does not have 52 cards,
   * or contains duplicate or invalid cards.
   *
   * @param deck the deck to be checked for validity
   * @throws IllegalArgumentException if the given deck is invalid
   */
  private void isValidDeck(List<ICard> deck) throws IllegalArgumentException {
    Utils.requireNonNull(deck);
    boolean badDeckSize = (deck.size() != 52);
    boolean invalidDeck = !new HashSet<>(this.getDeck()).equals(new HashSet<>(deck));
    if (badDeckSize || invalidDeck) {
      throw new IllegalArgumentException("Provided deck is invalid");
    }
  }

  /**
   * Checks if the given number of cascade piles and open piles are valid to start a game with.
   *
   * @param numCascadePiles the given number of cascade piles
   * @param numOpenPiles    the given number of open piles
   * @throws IllegalArgumentException if the number of cascade or open piles are invalid
   */
  private void isValidNumPiles(int numCascadePiles, int numOpenPiles)
      throws IllegalArgumentException {
    if (numCascadePiles < 4) {
      throw new IllegalArgumentException("Game must have at least four cascade piles");
    }
    if (numOpenPiles < 1) {
      throw new IllegalArgumentException("Game must have at least one open pile");
    }
  }

  /**
   * Creates a deep copy of the given deck and shuffles it if specified.
   *
   * @param deck    the deck to be copied
   * @param shuffle if true, shuffle the deck else deal the deck as-is
   * @return the copy of the deck
   */
  private List<ICard> getDeckCopy(List<ICard> deck, boolean shuffle) {
    List<ICard> deckCopy = new ArrayList<>();
    for (ICard card : deck) {
      deckCopy.add(new Card(card.getValue(), card.getSuit()));
    }
    if (shuffle) {
      Collections.shuffle(deckCopy);
    }
    return deckCopy;
  }

  /**
   * Deals the deck among the cascade piles in round robin fashion.
   *
   * @param deck            the deck to be dealt
   * @param numCascadePiles the number of cascade piles
   * @param numOpenPiles    the number of open piles
   */
  private void dealCards(List<ICard> deck, int numCascadePiles, int numOpenPiles) {
    this.initPiles(numCascadePiles, numOpenPiles);

    for (int i = 0; i < deck.size(); i++) {
      this.cascade.get(i % numCascadePiles).getPile().add(deck.get(i));
    }
  }

  /**
   * Initializes the card piles.
   *
   * @param numCascadePiles the number of cascade piles
   * @param numOpenPiles    the number of open piles
   */
  private void initPiles(int numCascadePiles, int numOpenPiles) {
    // ensure lists of piles are empty
    if (this.gameState) {
      this.foundation.clear();
      this.cascade.clear();
      this.open.clear();
    }

    // add piles to corresponding lists
    int numFoundationPiles = Suit.values().length;
    for (int i = 0; i < numFoundationPiles; i++) {
      this.foundation.add(new FoundationPile(i + 1));
    }
    for (int i = 0; i < numCascadePiles; i++) {
      this.cascade.add(new CascadePile(i + 1));
    }
    for (int i = 0; i < numOpenPiles; i++) {
      this.open.add(new OpenPile(i + 1));
    }
  }

  @Override
  public void move(PileType source, int pileNumber, int cardIndex, PileType destination,
      int destPileNumber) throws IllegalArgumentException, IllegalStateException {
    throw new IllegalStateException("Unsupported move operation");
  }

  /**
   * Associates PileTypes with their corresponding lists of piles.
   *
   * @return a hashmap relating PileTypes to lists of piles
   */
  private Map<PileType, List<IPile<ICard>>> getPileLists() {
    Map<PileType, List<IPile<ICard>>> pileLists = new HashMap<>();
    pileLists.put(PileType.FOUNDATION, this.foundation);
    pileLists.put(PileType.CASCADE, this.cascade);
    pileLists.put(PileType.OPEN, this.open);
    return pileLists;
  }

  /**
   * Checks that the given source and destination PileTypes are valid for a move. PileTypes are
   * valid if they exist within the defined Map. The source PileType cannot be a foundation pile.
   *
   * @param source      the given source pile type
   * @param destination the given destination pile type
   * @throws IllegalArgumentException the source or destination pile types are invalid
   */
  protected void isValidPileLists(PileType source, PileType destination)
      throws IllegalArgumentException {
    if (!((source != PileType.FOUNDATION)
        && this.pileLists.containsKey(source)
        && this.pileLists.containsKey(destination))) {
      throw new IllegalArgumentException("Invalid source or destination pile type provided");
    }
  }

  @Override
  public boolean isGameOver() {
    return (this.foundation.size() == Suit.values().length)
        && this.foundation.stream().allMatch(pile -> pile.getPile().size() == 13);
  }

  /**
   * Checks if the pile number of the pile list exists.
   *
   * @param pileList the pile list to be checked
   * @param index    the pile number of the pile list
   * @throws IllegalArgumentException if the index is out of the allowable range
   */
  protected void isValidPileIndex(List<IPile<ICard>> pileList, int index)
      throws IllegalArgumentException {
    if (index >= pileList.size() || index < 0) {
      throw new IllegalArgumentException("Given pile number is out of range of the pile list");
    }
  }

  /**
   * Checks if the card index of the card pile exists.
   *
   * @param pile  the pile to be checked
   * @param index the index of the card in the above foundation pile, starting at 0
   * @throws IllegalArgumentException if the index is out of the allowable range
   */
  protected void isValidCardIndex(IPile<ICard> pile, int index) throws IllegalArgumentException {
    if (index >= pile.getPile().size() || index < 0) {
      throw new IllegalArgumentException("Given card index is out of range of the pile");
    }
  }

  /**
   * Checks if the game has started.
   *
   * @throws IllegalStateException if the game has not started
   */
  protected void hasGameStarted() throws IllegalStateException {
    if (!this.gameState) {
      throw new IllegalStateException("The game has not started");
    }
  }

  @Override
  public int getNumCardsInFoundationPile(int index)
      throws IllegalArgumentException, IllegalStateException {
    this.hasGameStarted();
    this.isValidPileIndex(this.foundation, index);
    return this.foundation.get(index).getPile().size();
  }

  @Override
  public int getNumCascadePiles() {
    return this.gameState ? this.cascade.size() : -1;
  }

  @Override
  public int getNumCardsInCascadePile(int index)
      throws IllegalArgumentException, IllegalStateException {
    this.hasGameStarted();
    this.isValidPileIndex(this.cascade, index);
    return this.cascade.get(index).getPile().size();
  }

  @Override
  public int getNumCardsInOpenPile(int index)
      throws IllegalArgumentException, IllegalStateException {
    this.hasGameStarted();
    this.isValidPileIndex(this.open, index);
    return this.open.get(index).getPile().size();
  }

  @Override
  public int getNumOpenPiles() {
    return this.gameState ? this.open.size() : -1;
  }

  @Override
  public ICard getFoundationCardAt(int pileIndex, int cardIndex)
      throws IllegalArgumentException, IllegalStateException {
    this.hasGameStarted();
    this.isValidPileIndex(this.foundation, pileIndex);
    IPile<ICard> pile = this.foundation.get(pileIndex);
    this.isValidCardIndex(pile, cardIndex);
    return pile.getPile().get(cardIndex);
  }

  @Override
  public ICard getCascadeCardAt(int pileIndex, int cardIndex)
      throws IllegalArgumentException, IllegalStateException {
    this.hasGameStarted();
    this.isValidPileIndex(this.cascade, pileIndex);
    IPile<ICard> pile = this.cascade.get(pileIndex);
    this.isValidCardIndex(pile, cardIndex);
    return pile.getPile().get(cardIndex);
  }

  @Override
  public ICard getOpenCardAt(int pileIndex) throws IllegalArgumentException, IllegalStateException {
    this.hasGameStarted();
    this.isValidPileIndex(this.open, pileIndex);
    IPile<ICard> pile = this.open.get(pileIndex);
    if (pile.getPile().size() > 0) {
      return pile.getPile().get(0);
    }
    return null;
  }

  @Override
  public String toString() {
    List<IPile<ICard>> pileList = new ArrayList<>(this.foundation);
    pileList.addAll(this.open);
    pileList.addAll(this.cascade);

    Iterator<IPile<ICard>> iter = pileList.iterator();
    StringBuilder board = new StringBuilder();

    if (iter.hasNext()) {
      IPile<ICard> pile = iter.next();
      board.append(pile.toString());
    } else {
      return "";
    }

    while (iter.hasNext()) {
      IPile<ICard> pile = iter.next();
      board.append("\n");
      board.append(pile.toString());
    }
    return board.toString();
  }
}
