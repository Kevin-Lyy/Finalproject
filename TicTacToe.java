import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends JFrame implements ActionListener{
    private Container pane;
    private JButton c;

    //check winner 1-9,1-9
    // public void checkWinner(char[][] checkThis){
	

    //}

    //GUI
    public TicTacToe(){
	this.setTitle("Ultimate TicTacToe");
	this.setSize(900,700);
	this.setLocation(600,600);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setResizable(false);
      	this.setBackground(Color.white);
	//	this.setForeground(Color.white);

	pane = this.getContentPane();
	//	pane.setLayout(new FlowLayout());

       	c = new JButton("Clear All");
	c.addActionListener(this);
	//   	pane.add(c);

    }
    public void paint(Graphics g){
	g.drawLine(0,700/3,900,700/3);
	g.drawLine(0,600,900,600);
    }
    
    
    // actions 
    public void actionPerformed(ActionEvent e){
	String s = e.getActionCommand();
	System.out.println(s);

    }
    public static void main(String[] args){
	TicTacToe b = new TicTacToe();
	b.setVisible(true);
    }
	

}
