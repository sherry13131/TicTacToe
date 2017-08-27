package players;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Player {
  
  protected static List<String> gameStatus = new ArrayList<>(Collections.nCopies(9, "0"));
  int playerType = 0;

  public List<String> getGameStatus() {
    return gameStatus;
  }
  
  public String toString() {
    String string = null;
    for (String ele : gameStatus) {
      string += ele;
      string += " ";
    }
    return string;
  }
  
  public int getType() {
    return playerType;
  }
  
  public boolean check_move(String move) {
    // check if the input move is in valid format
    boolean validFormat = false;
    final String EXPRESSION = "\\A[1-3]\\s[1-3]\\z";
    Pattern pattern = Pattern.compile(EXPRESSION);
    Matcher matcher = pattern.matcher(move);
    // if yes, check if the box can be overwrite
    if (matcher.matches())
    {
      System.out.println("correct");
      validFormat = true;
    }
    else
    {
      System.out.println("wrong");
    }
    
    char[] chararr = new char[1];
    // get position
    // row
    move.getChars(0, 1, chararr, 0);
    String srow = String.valueOf(chararr[0]);
    System.out.println(srow);
    // column
    move.getChars(2, 3, chararr, 0);
    String scol = String.valueOf(chararr[0]);
    System.out.println(scol);
    // parse to integer
    int row = Integer.parseInt(srow);
    int col = Integer.parseInt(scol);
    // get the position
    int pos = 3*(row-1) + (col-1);
    System.out.println("pos" + pos);
    
    System.out.println("chararr" + chararr.toString());
    // if the format are correct, check if that box can be overwrite
    if (validFormat) {
      // get the current status in the gameStatus at the given position
      String curr = this.getGameStatus().get(pos);
      System.out.println(this);
      // if nothing is assign to that box, change the status
      if (curr.equals("0")) {
        if (this.getType() == 1) {
          this.setCross(pos);
        } else {
          this.setCircle(pos);
        }
        return true;
      }
    }
    return false;
  }

  
  public boolean setCross(int pos) {
    boolean changed = false;
    // if nothing is there, changed the status
    if (gameStatus.get(pos) == "0")
    {
      gameStatus.set(pos, "X");
      changed = true;
    }
    return changed;
  }
  public boolean setCircle(int pos) {
    boolean changed = false;
    // if nothing is there, changed the status
    if (gameStatus.get(pos) == "0")
    {
      gameStatus.set(pos, "O");
      changed = true;
    }
    return changed;
  }
}
