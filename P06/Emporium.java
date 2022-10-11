import java.util.ArrayList;
// import java.util.List ? 

public class Emporium {

	private ArrayList<MixInFlavor> mixInFlavors = new ArrayList<>(); 
	private ArrayList<IceCreamFlavor> iceCreamFlavors = new ArrayList<>(); 
	private ArrayList<Scoop> scoops = new ArrayList<>(); 
	
	public void addMixInFlavor(MixInFlavor flavor){
		mixInFlavors.add(flavor);
	}
	
	public void addIceCreamFlavor(IceCreamFlavor flavor){
		iceCreamFlavors.add(flavor);
	}
	
	public void addScoop(Scoop scoop){
		scoops.add(scoop);
	}
	
	
//Listing elements in ArrayList 
	public void mixInFlavors(){
		//list elements of arrayList
		Object[] objects = mixInFlavors.toArray();
	}
	
	public void iceCreamFlavors(){
		Object[] objects = iceCreamFlavors.toArray();
	}
	
	public void scoops(){
		Object[] objects = scoops.toArray(); 
	}
}


