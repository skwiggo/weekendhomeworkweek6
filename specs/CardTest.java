import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class CardTest {

  Card card;

  @Before
  public void before(){
    card = new Card(Rank.THREE, Suit.DIAMONDS);
  }

  @Test
  public void seeRank(){
    assertEquals(Rank.THREE, card.getRank());
  }

  @Test
  public void seeSuit(){
    assertEquals(Suit.DIAMONDS, card.getSuit());
  }

}