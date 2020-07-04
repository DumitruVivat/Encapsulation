package ObjectsAndEncapsulation;

public class EncapsulationSimpleApp {

	public static void main(String[] args) {
		
		Player myCharacter = new Player("kaiba");
		Player enemyCharacter  = new Player("       ");
		Player secondenemychar = new Player("kaiba");
		
		System.out.println(myCharacter.getName());
		System.out.println(myCharacter.getHp());
		System.out.println(myCharacter.getScore());
		System.out.println(myCharacter.isAlive());
		
		
		System.out.println("------------------------------");
		
		System.out.println(enemyCharacter.getName());
		System.out.println(enemyCharacter.getHp());
		System.out.println(enemyCharacter.getScore());
		System.out.println(enemyCharacter.isAlive());
		
		System.out.println("------------------------------");
		System.out.println(secondenemychar.getName());
		System.out.println(secondenemychar .getHp());
		System.out.println(secondenemychar.getScore());
		System.out.println(secondenemychar.isAlive());
		
		
	}

}


