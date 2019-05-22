import java.awt.Color;
import javax.swing.Timer;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;


public class GamePanel extends JPanel implements ActionListener, KeyListener {

	final int MENU = 0;
	final int GAME = 1;
	final int END = 2;
	int currentState = MENU;
	
	Font titleFont;
	Font messageFont;
	
	Timer frameDraw;
	
	Rocketship robby;
	
	GamePanel(){
		robby= new Rocketship(250, 700, 50 ,50);
		
		titleFont = new Font("Arial", Font.PLAIN, 36);
		messageFont = new Font("Arial", Font.PLAIN, 20);
		
		frameDraw = new Timer(1000/60, this);
		frameDraw.start();
	
		
	}
	
	
	@Override
public void paintComponent(Graphics g){
		
		if(currentState == MENU){
		    drawMenuState(g);
		    }
		
		else if(currentState == GAME){
		    drawGameState(g);
		   	}
		
		else if(currentState == END){
		    drawEndState(g);
		}



	}
	
void updateMenuState(){
	
	
}
	
void updateGameState() {
	
	
}

void updateEndState() {
	
	
}

void drawMenuState(Graphics g) {
	g.setColor(Color.BLUE);
	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	
	g.setFont(titleFont);
	g.setColor(Color.YELLOW);
	g.drawString("League Invaders", 115, 100);
	
	g.setFont(messageFont);
	g.setColor(Color.YELLOW);
	g.drawString("Press ENTER to start", 150, 300);
	
	
	g.setFont(messageFont);
	g.setColor(Color.YELLOW);
	g.drawString("Press SPACE for instructions",120, 500);
		
	
}

void drawGameState(Graphics g) {
	
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	
	robby.draw(g);
	
}

void drawEndState(Graphics g) {
	
	g.setColor(Color.RED);
	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	
	g.setFont(titleFont);
	g.setColor(Color.YELLOW);
	g.drawString("Game Over", 150, 100);
	
	g.setFont(messageFont);
	g.setColor(Color.YELLOW);
	g.drawString("You killed enemies",150, 300);
	
	g.setFont(messageFont);
	g.setColor(Color.YELLOW);
	g.drawString("Press ENTER to restart", 130, 500);
	
	
	
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	System.out.println("action");
	
	if(currentState == MENU){
	    updateMenuState();
	}
	
	else if(currentState == GAME){
	    updateGameState();
	} 
	
	else if(currentState == END){
	    updateEndState();
	}
	robby.update();
	repaint();
	
}


@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
	if (e.getKeyCode()==KeyEvent.VK_ENTER) {
	    if (currentState == END) {
	        currentState = MENU;
	    } else {
	        currentState++;
	    }
	}   
	
	if (e.getKeyCode()==KeyEvent.VK_UP) {
	    System.out.println("UP");
	    robby.up = true;

	    
	}
	
	if (e.getKeyCode()==KeyEvent.VK_DOWN) {
	    System.out.println("DOWN");
	    robby.down = true;
	}
	
	if (e.getKeyCode()==KeyEvent.VK_LEFT) {
	    System.out.println("LEFT");
	    robby.left = true;
	}
	
	if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
	    System.out.println("RIGHT");
	    robby.right = true;
	}
	
	
}


@Override
public void keyReleased(KeyEvent e) {

	// TODO Auto-generated method stub
	if (e.getKeyCode()==KeyEvent.VK_UP) {
	    System.out.println("UP");
	    robby.up = false;
	}
	
	    if (e.getKeyCode()==KeyEvent.VK_DOWN) {
		    System.out.println("DOWN");
		    robby.down = false;
		}  

	    if (e.getKeyCode()==KeyEvent.VK_LEFT) {
		    System.out.println("LEFT");
		    robby.left = false;
		}
	    
	    if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
		    System.out.println("RIGHT");
		    robby.right = false;
		} 
	    
	}
}




