public class ElectricVehicle extends Vehicle{ 
	static double centsPerKwhOfElectricity; 
	double whPerMile; 
	double kwhInBaterry; 
	
	ElectricVehicle(int year, String brand, String model, double whPerMile, 
	double kwhInBaterry){
	//still missing bodyStyle enum 
	
	
	
	
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
