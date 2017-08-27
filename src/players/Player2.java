package players;

public class Player2 extends Player {
  
  public Player2() {
    setType(2);
  }

  public void setType(int type) {
    playerType = type;
  }

  @Override
  public boolean setCross(int pos) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
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
