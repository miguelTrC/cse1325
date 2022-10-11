public class MixIn{
	private MixInFlavor flavor;
	private MixInAmount amount;
	
	MixIn(MixInFlavor flavor, MixInAmount amount){
		this.flavor = flavor; 
		this.amount = amount; 
	}
	
	public String toString(){
		return(flavor.toString() + (!amount.equals(MixInAmount.Normal
			? " (" + amount + ")" : "")));
	}
}
