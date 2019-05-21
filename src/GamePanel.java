import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;



public class GamePanel extends JPanel{

	final int MENU = 0;
	final int GAME = 1;
	final int END = 2;
	int currentState = MENU;
	
	Font titleFont;
	Font messageFont;
	
	GamePanel(){
		
		titleFont = new Font("Arial", Font.PLAIN, 36);
		messageFont = new Font("Arial", Font.PLAIN, 20);
		
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
	
void updateGameStatus() {
	
	
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
	
}

void drawEndState(Graphics g) {
	
	g.setFont(titleFont);
	g.setColor(Color.BLACK);
	g.drawString("Game Over", 100, 700);
	
	g.setColor(Color.RED);
	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	
}


}

