import java.util.*;
public class ScoreList
{
  private ArrayList<Player> scoreboard;
    // listed in decreasing order of highScore value
    // no two Player objects have the same playerName


  /** Moves the Player object at index pos upwards in scoreboard to the correct
   *  position in the list according to its highScore value
   *  @param pos a valid index for the scoreboard list
   */
  public void moveUp(int pos)
  {
    int i, value = scoreboard.get(pos).getHighScore();
    for(i = 0; i < pos && scoreboard.get(i).getHighScore() >= value; i++);
    scoreboard.add(i, scoreboard.remove(pos));
  }

  /* CLASS MEMBERS FOR TESTING */
  /* DO NOT MODIFY ANY OF THE CONSTRUCTORS OR METHODS BELOW*/

  public ScoreList(ArrayList<Player> sb)
  {  scoreboard = sb;  }

  public ArrayList<Player> getScoreBoard()
  {  return scoreboard;  }

}
