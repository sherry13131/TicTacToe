package build;

public class Board {

  int height = 3;
  int length = 3;
  
  public void setLength(int len) {
    length = len;
  }
  
  public void setHeight(int heightIn) {
    height = heightIn;
  }
  
  public int getHeight() {
    return height;
  }
  
  public int getLength() {
    return length;
  }
  
  public void generateBoard() {
    System.out.println("TICTACTOE");
    System.out.println("____________");
    for (int i = 0; i < getHeight(); i++)
      {
        for (int j = 0; j < getLength(); j++)
        {
          System.out.print("|   |");
        }
        System.out.println();
        System.out.println("---------------");
      }
  }
}
