package game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import build.Board;
import players.Player1;
import players.Player2;

public class TicTacToe {

  public static void main(String[] args) {
    try {
      // show welcome message and get who will go first
      boolean first = welcome();
      // generate the initial board
      Board board = new Board();
      Player1 player1;
      Player2 player2;
      board.generateBoard();
      start();
      
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
  
  public static boolean welcome() throws IOException {
    String first;
    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Welcome to Tic Tac Toe Game.");
    System.out.println("GO first? (y/n)");
    first = buffer.readLine();
    while (!(first.equals("y")) && !(first.equals("n"))) {
      System.out.println("Please enter y (yes) or n (no).");
      System.out.println("Go first? (y/n)");
      first = buffer.readLine();
    }
    if (first.equals("y"))
    {
      System.out.println("OK! you will start first.");
      return true;
    } else {
      System.out.println("Yes! I will be the first one.");
      return false;
    }
  }
  
  public static void start() throws IOException {
    // get the input from the first player
    String move;
    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    boolean valid = false;
    boolean end = false;
    int win = 0;
    Player1 player1 = new Player1();
    Player2 player2 = new Player2();
    while (!end) {
      if (win == 0) {
        System.out.println("player1 - input your move (row col): ");
        move = buffer.readLine();
        valid = player1.check_move(move);
        while (!valid) {
          System.out.println("player1 - please enter in range of 1-3 and the box should be empty, format: row col. ");
          move = buffer.readLine();
          valid = player1.check_move(move);  
        }
        // check if win
      }
      if (win == 0) {
        System.out.println("player2 - input your move (row col): ");
        move = buffer.readLine();
        valid = player2.check_move(move);
        while (!valid) {
          System.out.println("player2 - please enter in range of 1-3 and the box should be empty, format: row col. ");
          move = buffer.readLine();
          valid = player2.check_move(move);  
        }
        // check if win
      }
    }
  }
  
  
}
