package game;

import java.util.Random;

class Player {
	// privete variable is avalible in the class where is declare.
    private static String playerName = ""; 
	private String  name ;
	private int     score;
	private int     hp;
	private boolean alive;
    
	Player () { // default constructor
		
	}
	Player (String name) {
		setName(name);
		setHp(100);  // health
		setScore(0); // points
		setAlive(true);
	}
	String getName() {
		return name;
	}
	void setName(String name) {	
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
	public void printInfo(String nameClass) {
		
		System.out.println("######################"+ nameClass +"######################");
		System.out.printf( "%18s %3dHP %5dPOINTS    %s\n", name, hp, score, alive?"ok":"X"); //HW1: alive -> ok, dead -> X;
		System.out.println("###################################################");
	}
}
////////////// Descendants////////
class Medic extends Player {
	Medic (String name) {
		super(name);
	}
	//overload -> polymorphism ( when we use 2 methods with the same name in the class)
	// self heal
	public void heal() {
		setHp(100);
	}
	//heal somebody else 
	public void heal(Player other) {
		other.setHp(100);
		setScore(getScore() +50);
	}
	//override -> polymorphism 
   public void printInfo() { //HW2: -> super logic
		super.printInfo(" Medic ");
	}
}
class Sniper extends Player {
	Sniper (String name) {
		super(name);
	}
	public void shoot(Player other) {
		other.setHp(0);
		setScore(getScore() + 10);
	}
	public void printInfo() { 
		super.printInfo(" Sniper ");
	}
	
}