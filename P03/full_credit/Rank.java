import java.util.Random; 
public class Rank{ 
	
	int rank; 
	static final int MIN = 0;
	static final int MAX = 9; 	
	
	Random rand;
	
	Rank(){
	rank = rand.nextInt((MAX - MIN) + 1) + MIN; 
	}
	
	public String toString(){ 
		return rank + "";
	}
	
	
}
