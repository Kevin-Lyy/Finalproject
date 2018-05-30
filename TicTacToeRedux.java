import java.util.*;

public class TicTacToeRedux{
  static boolean turn= true;
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
  static int[][] nextBoard= b5;

  public TicTacToeRedux(){
  }

  public static String toStringLarge(int[][] lrgboard){
    String sumString = "";
    sumString += toStringLine(b1,0)+ "  " + toStringLine(b2,0) + "  " + toStringLine(b3,0) + "\n";
    sumString += toStringLine(b1,1)+ "  " + toStringLine(b2,1) + "  " + toStringLine(b3,1) + "\n";
    sumString += toStringLine(b1,2)+ "  " + toStringLine(b2,2) + "  " + toStringLine(b3,2) + "\n";
    sumString += "\n";
    sumString += toStringLine(b4,0)+ "  " + toStringLine(b5,0) + "  " + toStringLine(b6,0) + "\n";
    sumString += toStringLine(b4,1)+ "  " + toStringLine(b5,1) + "  " + toStringLine(b6,1) + "\n";
    sumString += toStringLine(b4,2)+ "  " + toStringLine(b5,2) + "  " + toStringLine(b6,2) + "\n";
    sumString += "\n";
    sumString += toStringLine(b7,0)+ "  " + toStringLine(b8,0) + "  " + toStringLine(b9,0) + "\n";
    sumString += toStringLine(b7,1)+ "  " + toStringLine(b8,1) + "  " + toStringLine(b9,1) + "\n";
    sumString += toStringLine(b7,2)+ "  " + toStringLine(b8,2) + "  " + toStringLine(b9,2) + "\n";
    sumString += "\n" +"STATUS" + "\n" + toString(lrgboard);
    return sumString;
  }

  public static String toStringLine(int[][] b, int i){
    String reString = "";
    for(int c = 0; c < 3;c++){
      if(b[i][c] == 0) reString += " - ";
      if(b[i][c] == 1) reString += " O ";
      if(b[i][c] == 2) reString += " X ";
    }
    return reString;
  }

  public static String toString(int[][] smlboard){
    String reString = "";
    for(int c = 0; c < 3;c++){
      for(int i = 0; i < 3;i++){
        if(smlboard[c][i] == 0) reString += " - ";
        if(smlboard[c][i] == 1) reString += " O ";
        if(smlboard[c][i] == 2) reString += " X ";
      }
      if(c<2)reString += "\n";
    }
    return reString;
  }

  public static int checkBoard(int[][] board){
    if(board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0] == board[0][2] && board[0][0] == 1) return 1;
    if(board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0] == board[0][2] && board[0][0] == 2) return 2;

    if(board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[0][0] == board[2][0] && board[0][0] == 1) return 1;
    if(board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[0][0] == board[2][0] && board[0][0] == 2) return 2;

    if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] == board[2][2] && board[0][0] == 1) return 1;
    if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] == board[2][2] && board[0][0] == 2) return 2;

    if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] == board[2][0] && board[0][2] == 1) return 1;
    if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] == board[2][0] && board[0][2] == 2) return 2;

    if(board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[0][2] == board[1][2] && board[0][2] == 1) return 1;
    if(board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[0][2] == board[1][2] && board[0][2] == 2) return 2;

    if(board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][0] == board[1][2] && board[1][0] == 1) return 1;
    if(board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][0] == board[1][2] && board[1][0] == 2) return 2;

    if(board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][0] == board[2][2] && board[2][0] == 1) return 1;
    if(board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][0] == board[2][2] && board[2][0] == 2) return 2;

    if(board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[1][1] == board[2][1] && board[0][1] == 1) return 1;
    if(board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[1][1] == board[2][1] && board[0][1] == 2) return 2;

    return 0;
  }

  public static void getNextTurn(int x, int y){
    if(x == 0 && y == 0) nextBoard = b1;
    if(x == 1 && y == 0) nextBoard = b2;
    if(x == 2 && y == 0) nextBoard = b3;
    if(x == 0 && y == 1) nextBoard = b4;
    if(x == 1 && y == 1) nextBoard = b5;
    if(x == 2 && y == 1) nextBoard = b6;
    if(x == 0 && y == 2) nextBoard = b7;
    if(x == 1 && y == 2) nextBoard = b8;
    if(x == 2 && y == 2) nextBoard = b9;
  }
  public static String printNextTurn(int x, int y){
    if(x == 0 && y == 0) return "b1";
    if(x == 1 && y == 0) return "b2";
    if(x == 2 && y == 0) return "b3";
    if(x == 0 && y == 1) return "b4";
    if(x == 1 && y == 1) return "b5";
    if(x == 2 && y == 1) return "b6";
    if(x == 0 && y == 2) return "b7";
    if(x == 1 && y == 2) return "b8";
    if(x == 2 && y == 2) return "b9";
    return "how the fuck did this happen";
  }

  public static void setLargeBoard(){
    if(checkBoard(b1) == 1) lrgBoard[0][0] = 1;
    else if (checkBoard(b1) == 2) lrgBoard[0][0] = 2;
    if(checkBoard(b2) == 1) lrgBoard[0][1] = 1;
    else if (checkBoard(b2) == 2) lrgBoard[0][1] = 2;
    if(checkBoard(b3) == 1) lrgBoard[0][2] = 1;
    else if (checkBoard(b3) == 2) lrgBoard[0][2] = 2;
    if(checkBoard(b4) == 1) lrgBoard[1][0] = 1;
    else if (checkBoard(b4) == 2) lrgBoard[1][0] = 2;
    if(checkBoard(b5) == 1) lrgBoard[1][1] = 1;
    else if (checkBoard(b5) == 2) lrgBoard[1][1] = 2;
    if(checkBoard(b6) == 1) lrgBoard[1][2] = 1;
    else if (checkBoard(b6) == 2) lrgBoard[1][2] = 2;
    if(checkBoard(b7) == 1) lrgBoard[2][0] = 1;
    else if (checkBoard(b7) == 2) lrgBoard[2][0] = 2;
    if(checkBoard(b8) == 1) lrgBoard[2][1] = 1;
    else if (checkBoard(b8) == 2) lrgBoard[2][1] = 2;
    if(checkBoard(b9) == 1) lrgBoard[2][2] = 1;
    else if (checkBoard(b9) == 2) lrgBoard[2][2] = 2;
  }

  public static void play(int a, int b){
    if(nextBoard[a][b] != 0) return ;
    if(checkBoard(nextBoard) != 0)getNextTurn((int)Math.random() *3,(int)Math.random() *3);
    if(turn) nextBoard[a][b] = 1;
    else nextBoard[a][b] = 2;
    setLargeBoard();
    turn = !turn;
    getNextTurn(b,a);
  }

  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    System.out.println("\n");
    System.out.println("WELCOME TO ULTIMATE TICTACTOE");
    System.out.println("\n");
    System.out.println(toStringLarge(lrgBoard));
    System.out.println("\n");
    System.out.println("O goes first, input your place");
    System.out.println("input the game number first, press enter and begin the first move");

    while(checkBoard(lrgBoard) == 0){
      System.out.println("input: ");
      int j;
      int k;
      String gameNum;

      try{
        gameNum = scanner.nextLine();

        j = scanner.nextInt();
        k = scanner.nextInt();
        if(j < 0 || k < 0 || j > 2 || k > 2){
          System.out.println("Try a number less than 2 but greater than 0");
          continue;
        }
      }catch (InputMismatchException e) {
				System.out.println("number please");
				continue;
      }
      play(k,j);
      System.out.println(toStringLarge(lrgBoard));
      System.out.println(printNextTurn(j,k));
      /*
      System.out.println("b1 " + checkBoard(b1));
      System.out.println("b2 " + checkBoard(b2));
      System.out.println("b3 " + checkBoard(b3));
      System.out.println("b4 " + checkBoard(b4));
      System.out.println("b5 " + checkBoard(b5));
      System.out.println("b6 " + checkBoard(b6));
      System.out.println("b7 " + checkBoard(b7));
      System.out.println("b8 " + checkBoard(b8));
      System.out.println("b9 " + checkBoard(b9));
      */
      if(checkBoard(lrgBoard) == 1) {
      System.out.println("the winner is player1" );
      System.out.println(gameNum);
    }
      else if(checkBoard(lrgBoard) == 2){
      System.out.println("the winner is player2" );
      System.out.println(gameNum);
    }

    }
  }
}
