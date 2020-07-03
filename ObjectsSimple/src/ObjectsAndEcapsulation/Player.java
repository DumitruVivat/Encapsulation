package ObjectsAndEcapsulation;

import java.util.Random;

class Player {
	
	


    private static String playerName = "";
	
	
	private String  name ;
	private int     score;
	private int     hp;
	private boolean alive;


	
	
	// 1) CONVETION!
	// 2) ENCAPSULATION 
	Player (String name) {
		setName(name);
		setHp(100);  // health
		setScore(0); // points
		setAlive(true);
	}
	// getters (no private, return the same data type what he use)
	String getName() {
		
		return name;
	}
	// setter (no private, no return, get the same argument)
	void setName(String name) {
		// HW4*
		// String.contains() - not duplicate + suffix random		
		
        if(name.trim().equals("") || name.trim().length() >= 3 != name.trim().length() <= 15 ) {
        	
			Random r = new Random();
			int number = r.nextInt(10000);
			
			this.name = "player_" + String.format("%05d", number);
			
		
		} else {
			this.name = name;
			if(playerName.contains(this.name)) {
			Random suffix = new Random();
			int number = suffix.nextInt(1000);
			
			this.name = name + "_" + String.format("%04d", number);
			}
			playerName = this.name;
		} 
       
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		if(hp >= 0 && hp <= 100)
		    this.hp = hp;
		if(hp == 0)
			setAlive(false);
	}
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		if(score >= 0 && score <= 10_000) 
		this.score = score;
	}
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	
}