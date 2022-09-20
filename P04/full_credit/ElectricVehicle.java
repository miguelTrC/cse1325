public class ElectricVehicle extends Vehicle{ 
	static double centsPerKwhOfElectricity; 
	double whPerMile; 
	double kwhInBattery; 
	
	ElectricVehicle(int year, String brand, String model, BodyStyle bodyStyle, 
	double whPerMile, double kwhInBattery){
	
	this.year = year; 
	this.brand = brand; 
	this.model = model; 
	this.bodyStyle = bodyStyle; 
	this.whPerMile = whPerMile; 
	this.kwhInBattery = kwhInBattery;
	
	}
	
	
	// not 100% if this is the correct method, or if they should be double
	
	public double range(){
		double range = kwhInBattery / (whPerMile / 1000); 
		return (range); 
	}
		
	public double fuelConsumed(double miles){
		double fuelConsumed = miles * (whPerMile / 1000);
		if (fuelConsumed > kwhInBattery){
			System.out.println("Error: More battery consumed than available ");
			fuelConsumed = 0.0; 
		}
		return (fuelConsumed); 
		
	}
	//Unsure if I should re-use miles as a return, maybe doesn't matter? 
	//printf(dolllarsToTravel(valueHere))
	public double dollarsToTravel(double miles){
		double dollarsToTravel = fuelConsumed(miles) * (centsPerKwhOfElectricity / 100);
		return (dollarsToTravel); 
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


I think that I need to make these Methods (functions), and then run them in 
the Vehicle file?


*/
