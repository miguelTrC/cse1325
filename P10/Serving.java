/*
Similiar to Scoop.java
*/
import java.util.ArrayList; 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Serving{

	private Container container; 
	private ArrayList<Scoop> scoops; 
	private ArrayList<MixIn> toppings; 
	
	public Serving(Container container){
		this.container = container; 
		this.scoops = new ArrayList<>();
		this.toppings = new ArrayList<>(); 
	}
	
	public Serving(BufferedReader br)throw IOException{
		this.container = new Container(br); 
		this.scoops = new ArrayList<>(); 
		this.toppings = new ArrayList<>();
		int numScoops = Integer.parseInt(br.readLine());
		int numToppings = Integer.parseInt(br.readLine());
		while(numScoops-- > 0) scoops.add(new Scoop(br));
		while(numToppings-- > 0) toppings.add(new MixIn(br));
	}
	
	
}
