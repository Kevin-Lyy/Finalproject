import java.util.*;

public class TicTacToeRedux{
  boolean turn;
  static int[][] lrgBoard = new int[3][3];
  static int[][] b1  = new int[3][3];
  static int[][] b2  = new int[3][3];
  static int[][] b3  = new int[3][3];
  static int[][] b4  = new int[3][3];
  static int[][] b5  = new int[3][3];
  static int[][] b6  = new int[3][3];
  static int[][] b7  = new int[3][3];
  static int[][] b8  = new int[3][3];
  static int[][] b9  = new int[3][3];
  int[][] nextBoard;
  int winner;

  public TicTacToeRedux(){
    turn = true;
    nextBoard = b5;
  }

  public static String toStringLarge(int[][] lrgboard){
    String sumString = "";
    sumString += toStringTop(b1)+ "  " + toStringTop(b2) + "  " + toStringTop(b3) + "\n";
    sumString += toStringMid(b1)+ "  " + toStringMid(b2) + "  " + toStringMid(b3) + "\n";
    sumString += toStringBot(b1)+ "  " + toStringBot(b2) + "  " + toStringBot(b3) + "\n";
    sumString += "\n";
    sumString += toStringTop(b4)+ "  " + toStringTop(b5) + "  " + toStringTop(b6) + "\n";
    sumString += toStringMid(b4)+ "  " + toStringMid(b5) + "  " + toStringMid(b6) + "\n";
    sumString += toStringBot(b4)+ "  " + toStringBot(b5) + "  " + toStringBot(b6) + "\n";
    sumString += "\n";
    sumString += toStringTop(b7)+ "  " + toStringTop(b8) + "  " + toStringTop(b9) + "\n";
    sumString += toStringMid(b7)+ "  " + toStringMid(b8) + "  " + toStringMid(b9) + "\n";
    sumString += toStringBot(b7)+ "  " + toStringBot(b8) + "  " + toStringBot(b9) + "\n";
    sumString += "\n" +"STATUS" + "\n" + toString(lrgboard);
    return sumString;
  }
  public static String toStringTop(int[][] b){
    String reString = "";
    for(int c = 0; c < 3;c++){
      if(b[0][c] == 0) reString += "-";
      if(b[0][c] == 1) reString += "O";
      if(b[0][c] == 2) reString += "X";
    }
    return reString;
  }
  public static String toStringMid(int[][] b){
    String reString = "";
    for(int c = 0; c < 3;c++){
      if(b[1][c] == 0) reString += "-";
      if(b[1][c] == 1) reString += "O";
      if(b[1][c] == 2) reString += "X";
    }
    return reString;
  }
  public static String toStringBot(int[][] b){
    String reString = "";
    for(int c = 0; c < 3;c++){
      if(b[2][c] == 0) reString += "-";
      if(b[2][c] == 1) reString += "O";
      if(b[2][c] == 2) reString += "X";
    }
    return reString;
  }

  public static String toString(int[][] smlboard){
    String reString = "";
    for(int c = 0; c < 3;c++){
      for(int i = 0; i < 3;i++){
        if(smlboard[c][i] == 0) reString += "-";
        if(smlboard[c][i] == 1) reString += "O";
        if(smlboard[c][i] == 2) reString += "X";
      }
      if(c<2)reString += "\n";
    }
    return reString;
  }

  public int checkBoard(int[][] board){
    if(board[0][0] == board[0][1] && board[0][1] == board[0][2]){
      if(board[0][0] == 1) return 1;
      else return 2;
    }
    if(board[0][0] == board[1][0] && board[1][0] == board[2][0]){
      if(board[0][0] == 1) return 1;
      else return 2;
    }
    if(board[0][0] == board[1][1] && board[1][1] == board[2][2]){
      if(board[0][0] == 1) return 1;
      else return 2;
    }
    if(board[0][2] == board[1][1] && board[1][1] == board[2][0]){
      if(board[0][2] == 1) return 1;
      else return 2;
    }
    if(board[0][2] == board[1][2] && board[1][2] == board[2][2]){
      if(board[0][2] == 1) return 1;
      else return 2;
    }
    if(board[1][0] == board[1][1] && board[1][1] == board[1][2]){
      if(board[1][0] == 1) return 1;
      else return 2;
    }
    if(board[2][0] == board[2][1] && board[2][1] == board[2][2]){
      if(board[2][0] == 1) return 1;
      else return 2;
    }
    if(board[0][1] == board[1][1] && board[1][1] == board[2][1]){
      if(board[0][0] == 1) return 1;
      else return 2;
    }
    return 0;
  }

  public void getNextTurn(int x, int y){
    if(x == 0 && y == 0) nextBoard = b1;
    if(x == 1 && y == 0) nextBoard = b2;
    if(x == 2 && y == 0) nextBoard = b3;
    if(x == 0 && y == 1) nextBoard = b4;
    if(x == 1 && y == 1) nextBoard = b5;
    if(x == 2 && y == 1) nextBoard = b6;
    if(x == 0 && y == 2) nextBoard = b7;
    if(x == 1 && y == 2) nextBoard = b8;
    if(x == 2 && y == 2) nextBoard = b8;
  }

  public void checkLargeBoard(){
    if(checkBoard(b1) == 1) lrgBoard[0][0] = 1;
    else if (checkBoard(b1) == 2) lrgBoard[0][0] = 2;
    if(checkBoard(b2) == 1) lrgBoard[0][1] = 1;
    else if (checkBoard(b1) == 2) lrgBoard[0][1] = 2;
    if(checkBoard(b3) == 1) lrgBoard[0][2] = 1;
    else if (checkBoard(b1) == 2) lrgBoard[0][2] = 2;
    if(checkBoard(b4) == 1) lrgBoard[1][0] = 1;
    else if (checkBoard(b1) == 2) lrgBoard[1][0] = 2;
    if(checkBoard(b5) == 1) lrgBoard[1][1] = 1;
    else if (checkBoard(b1) == 2) lrgBoard[1][1] = 2;
    if(checkBoard(b6) == 1) lrgBoard[1][2] = 1;
    else if (checkBoard(b1) == 2) lrgBoard[1][2] = 2;
    if(checkBoard(b7) == 1) lrgBoard[2][0] = 1;
    else if (checkBoard(b1) == 2) lrgBoard[2][0] = 2;
    if(checkBoard(b8) == 1) lrgBoard[2][1] = 1;
    else if (checkBoard(b1) == 2) lrgBoard[2][1] = 2;
    if(checkBoard(b9) == 1) lrgBoard[2][2] = 1;
    else if (checkBoard(b1) == 2) lrgBoard[2][2] = 2;
  }

  public void play(int a, int b){
    if(turn && checkBoard(nextBoard) == 0) nextBoard[a][b] = 1;
    else if(checkBoard(nextBoard) == 0) nextBoard[a][b] = 2;
    if(checkBoard(nextBoard) != 0 && turn){
      getNextTurn((int) Math.random() *3,(int) Math.random() *3);
      nextBoard[a][b] = 1;
    }
    else if(checkBoard(nextBoard) != 0 && !turn){
      getNextTurn((int) Math.random() *3,(int) Math.random() *3);
      nextBoard[a][b] = 2;
    }
    checkLargeBoard();
    if(checkBoard(lrgBoard) == 1) System.out.println("the winner is player 1");
    else if (checkBoard(lrgBoard) == 2)System.out.println("the winner is player 2");
    turn = !turn;
    getNextTurn(a,b);
  }
  public static void main(String argsp[]){
    Scanner scanner = new Scanner(System.in);
    System.out.println("WELCOME TO ULTIMATE TICTACTOE");
    System.out.println(toStringLarge(lrgBoard));
    System.out.println("O goes first, input your place");
    //System.out.println("input: ");
  //  int x = scanner.nextInt();
  //  int y = scanner.nextInt();
  //  System.out.println(x + " " + y);
  }
}
