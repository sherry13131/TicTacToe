package players;

public class Player1 extends Player {
  
  public Player1() {
    setType(1);
  }

  public void setType(int type) {
    playerType = type;
  }
  
  @Override
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

  @Override
  public boolean setCircle(int pos) {
    // TODO Auto-generated method stub
    return false;
  }

}
