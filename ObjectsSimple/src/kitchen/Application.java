package kitchen;

public class Application {

	public static void main(String[] args) {
		
		Cup cupA = new Cup("Milk", 300);
		Cup cupB = new Cup("Water", 500);
		
		//arithmetical operation
		cupA.setLiquidVolume(cupA.getLiquidVolume() - 50);
		cupB.setLiquidVolume(cupB.getLiquidVolume() + 50);

		//print result
		System.out.println(cupA.getLiquidName() + " " + cupA.getLiquidVolume() + " mll");
		System.out.println(cupB.getLiquidName() + " " + cupB.getLiquidVolume() + " mll");
		
		
		
	}

}
