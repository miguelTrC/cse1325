public class ElectricVehicle extends Vehicle{ 
	static double centsPerKwhOfElectricity; 
	double whPerMile; 
	double kwhInBaterry; 
	
	ElectricVehicle(int year, String brand, String model, BodyStyle bodyStyle, 
	double whPerMile, double kwhInBaterry){
	
	this.year = year; 
	this.brand = brand; 
	this.model = model; 
	this.bodyStyle = bodyStyle; 
	this.whPerMile = whPerMile; 
	this.kwhInBatterry = kwhInBatterry;
	
	}
	
	
	// not 100% if this is the correct method, or if they should be double
	
	public double range(){
		double range = kwhInBaterry / (whPerMile / 1000); 
		return range; 
	}
		
	public double fuelConsumed(double miles){
		miles = miles * (whPerMile / 1000);
		
		
	}

}


/*
range() 
	kwhInBattery / (whPerMile / 1000)
	returns a double 
	
fuelConsumed(double miles)
	miles * (whPerMile / 1000)
	if fuelConsumed > kwhInBattery, throw an error msg/exception
	
dollarsToTravel(double miles) 
	fuelConsumed(miles) * (centsPerKwhOfElectricity / 100)



*/
