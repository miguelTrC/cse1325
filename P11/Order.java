import java.util.ArrayList; 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Order{

	private ArrayList<Serving> servings;  
	
	public Order(BufferedReader br)throws IOException{
		this.servings = new ArrayList<>(); 
		int numServings = Integer.parseInt(br.readLine());
		while(numServings-- > 0) servings.add(new Serving(br));
	}
	
	public void save(BufferedWriter bw)throws IOException{
		bw.write("" + servings.size() + '\n');
		for(Serving s: servings)s.save(bw);
	}
	
	public void addServing(Serving serving){
		servings.add(serving);
	}
	
	public double price(){
		return (servings.price() + toppings); 
	}
	
	
}
