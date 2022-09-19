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
