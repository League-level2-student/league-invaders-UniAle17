

import javax.swing.JFrame;

public class LeagueInvaders {
	public static final int WIDTH = 500;
	public static final int HEIGHT = 800;
	
	JFrame frame;
	
	GamePanel GP;
	
	
	LeagueInvaders(){
		
		frame = new JFrame();
		GP = new GamePanel();
		
	}
	
	void setup() {
		
		frame.add(GP);
		
		frame.setSize(WIDTH, HEIGHT);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		
		frame.addKeyListener(GP);
		
	}
	
	public static void main(String[] args) {
		
		LeagueInvaders LI = new LeagueInvaders();
		
		LI.setup();
		
	}

}
