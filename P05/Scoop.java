/*
	prv IceCreamFlavor flavor by constructor 
	
	prv and arraylist of MixIn choices.
	add to the arrayList creating a addMixIn
	
	toString 
	returns flavor 
	
	or if it has mix ins 
	returns flavor + mixIn0, + mixIn1 ... 
	
	public Scoop constructor 
	
	pbl addMixIn

*/

public class Scoop{
	private IceCreamFlavor flavor; 
	private ArrayList<MixIn> mixins; 
	
	public Scoop(IceCreamFlavor flavor){
		this.flavor = flavor; 
		this.mixins = new ArrayList<>();
	}
/*	
	public addMixIn(){
		mixins.add
	}
	*/
}
