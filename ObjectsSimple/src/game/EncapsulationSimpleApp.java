package game;

public class EncapsulationSimpleApp {

	public static void main(String[] args) {
		
		Medic goodMedic       = new Medic("Kaiba");
		Medic badMedic        = new Medic("Obito");
		Sniper accurateSniper  = new Sniper("Clint");
		Sniper missSniper     = new Sniper("Clint");
		
		accurateSniper.shoot(badMedic);
		accurateSniper.shoot(missSniper);
		
		goodMedic.heal(badMedic);
		goodMedic.heal(missSniper);
		
		badMedic.printInfo();
		goodMedic.printInfo();
		accurateSniper.printInfo();
		missSniper.printInfo();
	}

}
