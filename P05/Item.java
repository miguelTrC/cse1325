public class Item{
	
	private String name; 
	private String description; 
	private int cost; 
	private int price; 
	
	public Item(String name, String description, int cost, int price){
		this.name = name; 
		this.description = description; 
		this.cost = cost; 
		this.price = price; 
		}
	
	public String toString(){
		return (name + " "); 
	} 
	
}
