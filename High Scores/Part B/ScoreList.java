import java.util.*;
public class ScoreList
{
  private ArrayList<Player> scoreboard;
    // listed in decreasing order of highScore value
    // no two Player objects have the same playerName


  /** Searches for a Player in scoreboard with a matching name and updates the high
   *  score if there is one. Otherwise a new player is created with the name and high score
   *  passed at the end of scoreboard. The new/updated Player object is moved up to
   *  the correct place on the list using the method moveUp.
   *  @param name the name of the player who recorded the score
   *  @param score the score recorded
   *  @return true if a new Player was created; false otherwise
   */
  public boolean newScore(String name, int score) {
    for (int i = 0; i < scoreboard.size(); i++) {
      Player currentPlayer = scoreboard.get(i);

      if (currentPlayer.getName().equals(name)) {
        currentPlayer.updateScore(score);
        moveUp(i);
      }
    }

    Player newPlayer = new Player(name, score);
    scoreboard.add(newPlayer);
    moveUp(scoreboard.size() - 1);
    return true;
  }

  /** Moves the Player object at index pos upwards in scoreboard to the correct
   *  position in the list according to its highScore value
   *  @param pos a valid index for the scoreboard list
   */
  public void moveUp(int pos)
  {
    /* COMPLETE WORKING METHOD PROVIDED */
    /* DO NOT MODIFY THE IMPLEMENTATION OF THIS METHOD*/
    testing.FRQFunctions.moveUp(pos, scoreboard, scoreboard.stream().mapToInt(s -> s.getHighScore()).toArray());
  }

  /* CLASS MEMBERS FOR TESTING */
  /* DO NOT MODIFY ANY OF THE CONSTRUCTORS OR METHODS BELOW*/

  public ScoreList(ArrayList<Player> sb)
  {  scoreboard = sb;  }

  public ArrayList<Player> getScoreBoard()
  {  return scoreboard;  }

}
