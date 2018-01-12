import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class TicTacToe extends JFrame implements ActionListener{
    private Container pane;
    private JButton c;
    char[][] fullboard;
    private Rectangle currentCell = null;


    //check winner 1-9,1-9
    public String checkWinner(char[][] checkThis){
	for(int w = 0; w < 9; w += 3){
	}
	return "p1";
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
    public void mouseClicked(MouseEvent e){
	int w = getWidth();
	int h = getHeight();
	currentCell = null;
	for (int col = 0; col < 9 && currentCell == null; col++){
	    for (int row = 0; row < 9; row++){
		int x = (w/9) * col;
		int y = (h/9) * row;
		Rectangle cell = new Rectangle(x,y,w/9,h/9);
		if (cell.contains(e.getPoint())){
		    System.out.println("in");
		    currentCell = cell;
		    repaint();
		    break;
		}
	    }
	}
    }
    //paint
    public void paintComponent(Graphics g){
	//	super.paintComponent(g);
	int w = getWidth();
	int h = getHeight();
	Graphics2D g2d = (Graphics2D) g;

	if(currentCell != null){
	    g2d.setColor(Color.black);
	    g2d.fill(currentCell);
	}
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
