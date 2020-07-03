package kitchen;

class Cup {
	
// In clasa data este folosit procesul de incapsulare , deoarece datele sunt private.
	
 private String liquidName; //Name
 private int liquidVolume;  //volume/mll
 
 

Cup( String liquidName, int liquidVolume ){
	//set the limits.
	setLiquidName(liquidName);
	setLiquidVolume(liquidVolume);
 }

public String getLiquidName() {
	return liquidName;
}


public void setLiquidName(String liquidName) {
	// limits
	if(liquidName.trim().equals("Water") || liquidName.trim().equals("Milk") || liquidName.trim().equals("Tea"))
	this.liquidName = liquidName;
}


public int getLiquidVolume() {
	return liquidVolume;
}


public void setLiquidVolume(int liquidVolume) {
	//limits
	if(liquidVolume >= 0 && liquidVolume <= 600)
	this.liquidVolume = liquidVolume;
}
 
}