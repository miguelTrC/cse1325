public class GasVehicle extends Vehicle{ 
	static double dollarsPerGallonOfGas; 
	double milesPerGallon; 
	double gallonsInTank; 
	// BodyStyle??? 
	
	GasVehicle(int year, String brand, String model, double milesPerGallon, 
	double gallonsInTank){
	// BodyStyle???
	this.year = year; 
	this.brand = brand; 
	this.model = model; 
	this.milesPerGallon = milesPerGallon; 
	this.gallonsInTank = gallonsInTank; 
	
	}	
	
	}
	
	
	
	
/* 
Need a range() 
gallonsInTank * milesPerGallon

	Have a System.out.print, its range? 
	
	
fuelConsumed(double miles )
	miles / milesPerGallon 
	if fuelConsumed > gallonsInTank
		throw exceptions (error message? along with an exit)
		
dollarsToTravel(double miles )
	fuelConsumed(miles) * dollarsPerGallonOfGas


*/ 
