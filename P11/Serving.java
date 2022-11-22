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
	
	public Serving(BufferedReader br)throws IOException{
		this.container = new Container(br); 
		this.scoops = new ArrayList<>(); 
		this.toppings = new ArrayList<>();
		int numScoops = Integer.parseInt(br.readLine());
		int numToppings = Integer.parseInt(br.readLine());
		while(numScoops-- > 0) scoops.add(new Scoop(br));
		while(numToppings-- > 0) toppings.add(new MixIn(br));
	}
	
	public void save(BufferedWriter bw)throws IOException{
		container.save(bw);
		bw.write("" + scoops.size() + '\n');
		bw.write("" + toppings.size() + '\n');
		for(Scoop s: scoops)s.save(bw);
		for(MixIn m: toppings)m.save(bw);
	}
	
	public void addScoop(Scoop scoop){
		scoops.add(scoop);
	}
	
	public void addTopping(MixIn topping){
		toppings.add(topping);
	}
	
	public double price(){
		return (scoops.price() + toppings.price(toppings.amount));
	}
	
	public String toString(){
		StringBuilder result = new StringBuilder(container.toString());
		if(scoops.size() > 0){
			String seperator = " with ";
			for(Scoop s: scoops){
				result.append(seperator + s.toString());
				seperator = ", ";
			}
		}
		if(toppings.size() > 0){
			String seperator = " with ";
			for(MixIn m: toppings){
				result.append(seperator + s.toString());
				seperator = ", ";
			}
		}
		return result.toString();
	}
	
	
}
