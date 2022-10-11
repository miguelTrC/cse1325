package product;

import java.util.ArrayList;

public class Scoop{
	private IceCreamFlavor flavor; 
	private ArrayList<MixIn> mixins; 
	
	public Scoop(IceCreamFlavor flavor){
		this.flavor = flavor; 
		this.mixins = new ArrayList<>();
	}
	//MixIn mixins?
	public void addMixIn(MixIn mixin){
		mixins.add(mixin);
	}
	
	
	// ToString method from Professor Rice
	@Override 
	public String toString(){
		StringBuilder result = new StringBuilder(flavor.toString());
		if (mixins.size() > 0) {
			String separator = " with "; 
			for (MixIn m : mixins){
				result.append(separator + m.toString());
				separator = ", ";
				}
		}
		return result.toString();
		
	}
	
}
