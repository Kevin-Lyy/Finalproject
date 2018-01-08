import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends JFrame implements ActionListener{
    private Container pane;
    private JButton c;

    //check winner 1-9,1-9
    public boolean checkWinner(char[][] checkThis){
	return false;

    }

    //set up board
    public TicTacToe(){
	this.setTitle("Ultimate TicTacToe");
	this.setSize(700,700);
	this.setLocation(200,200);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());

	c = new JButton("Clear All");
	c.addActionListener(this);
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
