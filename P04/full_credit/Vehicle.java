/*
	Comments
	Create Year, brand, model, BodyStyle
	int, 	string	, string,	BodyStyle(class)
*/

private class Vehicle{ 
	int year; 
	String brand; 
	String model; 
	BodyStyle bodyStyle = BodyStyle.SUV; 
	
	public Vehicle(int year, String brand, String model, BodyStyle bodyStyle){
		this.year = year; 
		this.brand = brand; 
		this.model = model; 
		this.bodyStyle = bodyStyle;
	}

}
