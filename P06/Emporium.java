import java.util.ArrayList;

public class Emporium {
// ArrayLIst of mixInFlavor(s) iceCreamFlavor(s) scoop(s)
// this.mixins = new ArrayList<>(); 
	private ArrayList<MixInFlavor> mixInFlavors = new ArrayList<>(); 
	private ArrayList<IceCreamFlavor> iceCreamFlavor = new ArrayList<>(); 
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
	
	
}

/*

Gives list elements of arrayList?

Objects[]
ArrayListName.toArray()

*/

