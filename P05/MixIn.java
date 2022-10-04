public class MixIn{
	private MixInFlavor flavor = new MixInFlavor();
	private MixInAmount amount = MixInAmount.NORMAL;
	
	MixIn(MixInFlavor flavor, MixInAmount amount){
		this.flavor = flavor; 
		this.amount = amount; 
	}
	
	public String toString(){
		return(flavor + " (" + amount + " )");
	}
}
