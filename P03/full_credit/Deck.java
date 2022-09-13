import java.util.Stack;
import java.util.Collections;
public class Deck{
	Stack<String> cardLetter = new Stack<String>();
		
	int count = 0; 
	while(count < MAX){
		cardLetter.add(count + "A");
		cardLetter.add(count + "T");
		cardLetter.add(count + "U");
		count++;
	}
	
	
	
}

