package emporium; 

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import product.MixIn;
import product.MixInAmount;
import product.MixInFlavor;
import product.IceCreamFlavor;
import product.Item;

import Container;
import Serving;
import Order;



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
		
		size = Integer.parseInt(br.readLine());
		while(size-- >0) iceCreamFlavors.add(new IceCreamFlavor(br));
		
		size = Integer.parseInt(br.readLine());
		while(size-- >0) scoops.add(new Scoop(br));
		
		size = Integer.parseInt(br.readLine());
		while(size-- >0) containers.add(new Container(br));
	}
	
	
	public void save(BufferedWriter bw)throws IOException{
		bw.write("" + mixInFlavors.size() + '\n');
		for(MixInFlavor mif : mixInFlavors) mif.save(bw);
		
		bw.write("" + iceCreamFlavors.size() + '\n');
		for(IceCreamFlavors icf : iceCreamFlavors) icf.save(bw);
		
		bw.write("" + scoops.size() + '\n');
		for(Scoop s : scoops) s.save(bw);
		
		bw.write("" + containers.size() + '\n');
		for(Container c : containers) c.save(bw);
		
	}
	
	
	
	
}


