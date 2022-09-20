public class GasVehicle extends Vehicle{ 
	static double dollarsPerGallonOfGas; 
	double milesPerGallon; 
	double gallonsInTank; 
	
	GasVehicle(int year, String brand, String model, BodyStyle bodyStyle, 
	double milesPerGallon, double gallonsInTank){
	
	super(year, brand, model, bodyStyle);

	this.milesPerGallon = milesPerGallon; 
	this.gallonsInTank = gallonsInTank; 
	
	}	
	
	public double range(){
		double range = gallonsInTank * milesPerGallon; 
		return (range);
	}
	
	public double fuelConsumed(double miles){
		double fuelConsumed = miles / milesPerGallon;
		if (fuelConsumed > gallonsInTank){
			System.out.println("Error: More fuel consumed than in tank ");
			fuelConsumed = 0.0; 
			return (fuelConsumed);
			}
		
		return (fuelConsumed); 
		}
	
	
	public double dollarsToTravel(double miles){
		double dollarsToTravel = fuelConsumed(miles) * dollarsPerGallonOfGas;
		return (dollarsToTravel);
	}
	
	
	}
	
	
	

