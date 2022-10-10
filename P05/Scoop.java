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
	public String toString(){
		StringBuilder result = new StringBuilder(flavor.toString());
		if (mixins.size() > 0) {
			String seperator = " with "; 
			for (MixIn m : mixins){
				result.append(seperator + m.toString());
				sepator = ", ";
				}
		}
		return result.toString();
		
	}
	
}
