package product;

public class MixIn{
	private MixInFlavor flavor;
	private MixInAmount amount;
	
	MixIn(MixInFlavor flavor, MixInAmount amount){
		this.flavor = flavor; 
		this.amount = amount; 
	}
	
	public Double price(int amountOfFlavors){
		switch(amount) {
			case Light:
				return (amountOfFlavors * 0.8);
				break;
			case Normal: 
				return (amountOfFlavors * 1.0);
				break; 
			case Extra: 
				return (amountOfFlavors * 1.2);
				break; 
			case Drenched: 
				return (amountOfFlavors * 2.0);
				break; 
			default: 
				System.out.println("No MixInAmount");
		
		}
		
	}
	
	
	@Override 
	public String toString(){
		return(flavor.toString() + (!amount.equals(MixInAmount.Normal)
			? " (" + amount + ")" : ""));
	}
}
