import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {

	Rocketship rob;
	
	ArrayList <Projectile> projectileObjects = new ArrayList <Projectile>();
	
	ArrayList <Alien> alienObjects = new ArrayList <Alien>();
	
	Random ran = new Random();
	
	ObjectManager(Rocketship rock){
		
		rob = rock;
		
	}
	
	void addProjectile(Projectile pro){
		
		projectileObjects.add(pro);
		
	}
		
	void addAlien() {
		
		alienObjects.add(new Alien(ran.nextInt(LeagueInvaders.WIDTH),0,50,50));
		
	}
	
	void update() {
		
		for (int i = 0; i < alienObjects.size(); i++) {
			
			Alien aliens = alienObjects.get(i);
			aliens.update();
			
			if(aliens.y>LeagueInvaders.HEIGHT) {
				aliens.isActive= false;
					
			}
				}
		
			
			for (int i = 0; i < projectileObjects.size(); i++) {
				
				Projectile projectiles = projectileObjects.get(i);
				projectiles.update();
				
				if(projectiles.y>LeagueInvaders.HEIGHT) {
					
					projectiles.isActive= false;				
				
			}
				
			}
			
			
		
		
	}
	
	void draw(Graphics g) {
		
		rob.draw(g);

		for (int i = 0; i < alienObjects.size(); i++) {
			
			Alien alienss = alienObjects.get(i);
			alienss.drraw(g);
			
			
		}
	
		for (int i = 0; i < projectileObjects.size(); i++) {
			
			Projectile projectiless = projectileObjects.get(i);
			projectiless.draw(g);
			
		}
		
	}	
	
	void purgeObjects(){
		
		
		for (int i = 0; i < alienObjects.size(); i++) {
			
			Alien aliensss = alienObjects.get(i);
			
			if(aliensss.isActive==false) {
				alienObjects.remove(aliensss);
			}
			
		}
		
		for (int i = 0; i < projectileObjects.size(); i++) {
			
			Projectile projectilesss = projectileObjects.get(i);
			
			if(projectilesss.isActive==false) {
				
				projectileObjects.remove(projectilesss);
				
			}
			
		}
		
		
		}
	
	
}