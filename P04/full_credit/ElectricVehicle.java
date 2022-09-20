public class ElectricVehicle extends Vehicle{ 
	static double centsPerKwhOfElectricity; 
	double whPerMile; 
	double kwhInBattery; 
	
	ElectricVehicle(int year, String brand, String model, BodyStyle bodyStyle, 
	double whPerMile, double kwhInBattery){
	
	super(year, brand, model, bodyStyle);
	
	this.whPerMile = whPerMile; 
	this.kwhInBattery = kwhInBattery;
	
	}
	
	
	
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

	public double dollarsToTravel(double miles){
		double dollarsToTravel = fuelConsumed(miles) * (centsPerKwhOfElectricity / 100);
		return (dollarsToTravel); 
	}

}



