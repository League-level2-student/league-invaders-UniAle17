import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Projectile extends GameObject{

	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	
	
	void loadImage(String imageFile) {
	    if (needImage) {
	        try {
	            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
		    gotImage = true;
	        } catch (Exception e) {
	            
	        }
	        needImage = false;
	    }
	}
	
	
	
	Projectile(int x, int y, int width, int height) {
		super(x, y, width, height);
		
		speed=10;
		
		if (needImage) {
		    loadImage ("bullet.png");
		}
		
		
		// TODO Auto-generated constructor stub
	}

	void update() {
	 
	y-=speed;	
		
	super.update();
	}
	
	void draw(Graphics g) {
		
		g.setColor(Color.RED);
        g.fillRect(x, y, width, height);
		
	}
	
}
