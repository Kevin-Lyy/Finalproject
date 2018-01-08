import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends JFrame implements ActionListener{
    private Container pane;
    private JButton c;
    private JButton[][] board = new JButton[9][9];

    //check winner 1-9,1-9
    // public void checkWinner(char[][] checkThis){
	

    //}

    //set up board
    public TicTacToe(){
	this.setTitle("Ultimate TicTacToe");
	this.setSize(700,700);
	this.setLocation(200,200);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());

	c = new JButton("Clear All");
	//for loop to add "-" in each button

	board.addActionListener(this);
	c.addActionListener(this);

	pane.add(board);
	pane.add(c);

    }
    

    //gui code 
    public void actionPerformed(ActionEvent e){
	String s = e.getActionCommand();
	System.out.println(s);

    }
    public static void main(String[] args){
	TicTacToe b = new TicTacToe();
	b.setVisible(true);
    }
	

}
