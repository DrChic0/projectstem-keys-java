/* COMPLETE WORKING CLASS PROVIDEDd */
/* DO NOT MODIFY THE IMPLEMENTATION OF THIS CLASS*/

public class Player
{
  private String playerName;
  private int highScore;


  public Player (String name, int score)
  {
    playerName = name;
    highScore = score;
  }


  /** @param score an int value representing the player's most recent score
   *  updates the value of highScore to score if this is higher than the current value
   */
  public void updateScore(int score)
  {
    if(score > highScore)
      highScore = score;
  }


  /** @return the player's name
   */
  public String getName()
  {  return playerName;  }


  /** @return the high score of the player
   */
  public int getHighScore()
  {  return highScore;  }
}
