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
	this.setLocation(0,0);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setResizable(false);
      	this.setBackground(Color.white);

	pane = this.getContentPane();
       	pane.setLayout(new FlowLayout());

       	c = new JButton("Clear All");
	c.addActionListener(this);
	//     	pane.add(c);

    }
    public void paint(Graphics g){
	//large board
	g.setColor(Color.red);
	g.drawLine(0,700/3,900,700/3);
	g.drawLine(0,1400/3,900,1400/3);
	g.drawLine(300,0,300,900);
	g.drawLine(600,0,600,900);

	g.setColor(Color.black);
	//board 1-3
	g.drawLine(0,700/9,900,700/9);
	g.drawLine(0,1400/9,900,1400/9);
	g.drawLine(900/9,0,900/9,700);
	g.drawLine(1800/9,0,1800/9,700);
	//board 4-6
	g.drawLine(0,2800/9,900,2800/9);
	g.drawLine(0,3500/9,900,3500/9);
	g.drawLine(3600/9,0,3600/9,700);
	g.drawLine(4500/9,0,4500/9,700);
	//board 7-9
	g.drawLine(0,4900/9,900,4900/9);
	g.drawLine(0,5600/9,900,5600/9);
	g.drawLine(6300/9,0,6300/9,700);
	g.drawLine(7200/9,0,7200/9,700);	

	
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
