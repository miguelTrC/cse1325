/*
	Comments
	Create Year, brand, model, BodyStyle
	int, 	string	, string,	BodyStyle(class)
*/

public class Vehicle{ 
	private int year; 
	private String brand; 
	private String model; 
	private BodyStyle bodyStyle = BodyStyle.SUV; 
	
 	public Vehicle(int year, String brand, String model, BodyStyle bodyStyle){
		this.year = year; 
		this.brand = brand; 
		this.model = model; 
		this.bodyStyle = bodyStyle;
	}
	
	/* public String toString() {
		
		
		return xx + "xx";
	} */ 
}
