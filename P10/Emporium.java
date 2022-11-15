package emporium; 

import java.util.ArrayList;

import product.MixIn;
import product.MixInAmount;
import product.MixInFlavor;
import product.IceCreamFlavor;
import product.Item;
import product.Scoop;

public class Emporium {

	private ArrayList<MixInFlavor> mixInFlavors = new ArrayList<>(); 
	private ArrayList<IceCreamFlavor> iceCreamFlavors = new ArrayList<>(); 
	private ArrayList<Scoop> scoops = new ArrayList<>(); 
	private ArrayList<Container> containers = new ArrayList<>();
	
	public void addMixInFlavor(MixInFlavor flavor){
		mixInFlavors.add(flavor);
	}
	
	public void addIceCreamFlavor(IceCreamFlavor flavor){
		iceCreamFlavors.add(flavor);
	}
	
	public void addScoop(Scoop scoop){
		scoops.add(scoop);
	}
	
	public void addContainer(Container container){
		containers.add(container);
	}
	
	
//Listing elements in ArrayList 
	public Object[] mixInFlavors(){
		//list elements of arrayList
		return this.mixInFlavors.toArray();
	}
	
	public Object[] iceCreamFlavors(){
		 return this.iceCreamFlavors.toArray();
	}
	
	public Object[] scoops(){
		 return this.scoops.toArray(); 
	}
	
	public Object[] containers(){
		return this.containers.toArray();
	}
	
	
	public Emporium(BufferedReader br)throws IOException{
		int size = Integer.parseInt(br.readLine());
		while(size-- >0) mixInFlavors.add(new MixInFlavor(br));
		
		size = 
	}
	
	
}


