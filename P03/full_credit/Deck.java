import java.util.Stack;
import java.util.Collections;
public class Deck{
	
		public String toString(){
		
			Stack<String> cardLetter = new Stack<String>();
				
			int count = 0; 
			while(count < 10){
				cardLetter.add(count + "A");
				cardLetter.add(count + "T");
				cardLetter.add(count + "U");
				count++;
			}
			Collections.shuffle(cardLetter);
		 		return cardLetter + " "; 
	
								 }
	
		
			}
	

