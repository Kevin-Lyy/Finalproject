import java.util.*;

public class TicTacToeRedux{
  boolean turn;
  int[][] lrgBoard = new int[3][3];
  int[][] b1,b2,b3,b4,b5,b6,b7,b8,b9 = new int[3][3];
  int[][] nextBoard;
  int winner;

  public TicTacToeRedux(){
    turn = true;
    nextBoard = b5;
  }

  public String toStringLarge(int[][] lrgboard){
    String sumString = "";
    sumString += toString(b1) + toString(b2) + toString(b3) + "\n";
    sumString += toString(b4) + toString(b5) + toString(b6) + "\n";
    sumString += toString(b7) + toString(b8) + toString(b9) + "\n";
    sumString += toString(lrgboard) + "status";
    return sumString;
  }

  public String toString(int[][] smlboard){
    String reString = "";
    for(int c = 0; c < 3;c++){
      for(int i = 0; i < 3;i++){
        reString += smlboard[c][i] + "\n";
      }
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
    if(turn) nextBoard[a][b] = 1;
    else nextBoard[a][b] = 2;
    checkLargeBoard();
    if(checkBoard(lrgBoard) == 1) System.out.println("the winner is player 1");
    else if (checkBoard(lrgBoard) == 2)System.out.println("the winner is player 2");
    turn = !turn;
    getNextTurn(a,b);
  }
}
