/*
	Comments
	Create Year, brand, model, BodyStyle
	int, 	string	, string,	BodyStyle(class)
*/

private class Vehicle{ 
	int year; 
	String brand; 
	String model; 
	BodyStyle body = BodyStyle; 
	public Vehicle(int year, String brand, String model){
	// BodyStyle? 
		this.year = year; 
		this.brand = brand; 
		this.model = model; 
	}

}
