import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class TicTacToe extends JFrame implements ActionListener, MouseListener{
    private Container pane;
    private JButton c;
    char[][] fullboard;


    //check winner 1-9,1-9
    public String checkWinner(int w1,int w2){
	//check for player 1
	if(//diagonal
	   (fullboard[w1][w2] & fullboard[w1+1][w2+1]&
	    fullboard[w1+2][w2+2])== 1 ||
	   (fullboard[w1+2][w2]& fullboard[w1+1][w2+1]&
	    fullboard[w1][w2+2])== 1||
	   //vertical
	   (fullboard[w1][w2] & fullboard[w1][w2+1]&
	    fullboard[w1][w2+2])== 1 ||
	   (fullboard[w1+1][w2] & fullboard[w1+1][w2+1]&
	    fullboard[w1+1][w2+2])== 1 ||
	   (fullboard[w1+2][w2] & fullboard[w1+2][w2+1]&
	    fullboard[w1+2][w2+2])== 1 ||
	   //horizontal
	   (fullboard[w1][w2] & fullboard[w1+1][w2]&
	    fullboard[w1+2][w2])== 1 ||
	   (fullboard[w1][w2+1] & fullboard[w1+1][w2+1]&
	    fullboard[w1+2][w2+1])== 1 ||
	   (fullboard[w1][w2+2] & fullboard[w1+1][w2+2]&
	    fullboard[w1+2][w2+2])== 1 ){
	    return "p1";
	}
	//check for player 2
	else
	if(//diagonal
	   (fullboard[w1][w2] & fullboard[w1+1][w2+1]&
	    fullboard[w1+2][w2+2])== 2 ||
	   (fullboard[w1+2][w2]& fullboard[w1+1][w2+1]&
	    fullboard[w1][w2+2])== 2||
	   //vertical
	   (fullboard[w1][w2] & fullboard[w1][w2+1]&
	    fullboard[w1][w2+2])== 2 ||
	   (fullboard[w1+1][w2] & fullboard[w1+1][w2+1]&
	    fullboard[w1+1][w2+2])== 2 ||
	   (fullboard[w1+2][w2] & fullboard[w1+2][w2+1]&
	    fullboard[w1+2][w2+2])== 2 ||
	   //horizontal
	   (fullboard[w1][w2] & fullboard[w1+1][w2]&
	    fullboard[w1+2][w2])== 2 ||
	   (fullboard[w1][w2+1] & fullboard[w1+1][w2+1]&
	    fullboard[w1+2][w2+1])== 2 ||
	   (fullboard[w1][w2+2] & fullboard[w1+1][w2+2]&
	    fullboard[w1+2][w2+2])== 2 ){
	    return "p2";
	}
    }
	
	
  
    //clear
    public void clearBoard(){
	for (int c = 0; c < 9; c++){
	    for (int i = 0;i < 9; i++){
		fullboard[c][i] = 0;
	    }
	}
    }

    //GUI
    public TicTacToe(){
	this.setTitle("Ultimate TicTacToe");
	this.setSize(900,700);
	this.setLocation(0,0);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setResizable(false);
      	this.setBackground(Color.white);
	addMouseListener(this);

	pane = this.getContentPane();
       	pane.setLayout(new FlowLayout());

       	c = new JButton("Clear All");
	c.addActionListener(this);
	//   	pane.add(c);
	
	//create board
	fullboard = new char[9][9];
	for (int c = 0; c < 9; c++){
	    for (int i = 0;i < 9; i++){
		fullboard[c][i] = 0;
	    }
	}
    }
    public void paint(Graphics g){

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
	//large board
	Graphics2D g2 = (Graphics2D) g;
	g2.setStroke(new BasicStroke(3));
	g.drawLine(0,700/3,900,700/3);
	g.drawLine(0,1400/3,900,1400/3);
	g.drawLine(300,0,300,900);
	g.drawLine(600,0,600,900);
	
    }
    //clickable
    // return clicked mouse AND x/100 * 100 && y/100 * 100
    // draw the x or o on that and set x/100,y/100 coordinate of the array to 1 or 2 
    public void mousePressed(MouseEvent e, Graphics g){
	int x = getX();
	int y = getY();
	fullboard[x/100 * 100][x/100 * 100] = 1;
      	g.drawLine(x/100 * 100,y/100 * 100,x/100 * 100 + 900/9, y/100 * 100 + 700/9);
    }
	
    
    // actions

    public void actionPerformed(ActionEvent e){
	String s = e.getActionCommand();
	System.out.println(s);

    }
    public static void main(String[] args){
        TicTacToe b = new TicTacToe();
       	b.setVisible(true);
	//	System.out.println(b.check());
    }
	

}
