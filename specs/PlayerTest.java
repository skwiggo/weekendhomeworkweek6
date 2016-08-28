import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class PlayerTest {

  Player player;

  @Before
  public void before(){
    player = new Player("James", null);
  }

  @Test
  public void canGetPlayerName(){
  assertEquals("James", player.getName());
  }

}