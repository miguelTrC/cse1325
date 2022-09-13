import java.util.Stack 
import java.util.Collections
public class Deck{
	Stack<String> cardLetter = new Stack<String>();
		
	int count = 0; 
	while(count < MAX){
		cardLetter.add(count + "A");
		cardLetter.add(count + "T");
		cardLetter.add(count + "U");
	}
	
	
	
	
	
	
}



/* 
deck field is a java.util.Stack 
Similiar to ArrayList, includes a 
push method - Adds its parameters at the top of the stack
pop - removes and returns the top element from the stack 
empty - returns true if the stack has no elements or false if it does 
size - returns amount of elements currently on the stack 

The constructor should instance one of every possible card (0U to 9A, 30 cards
in al), pushing each onto the deck field. 2 nested loops here 

more methods 
shuffle - mix up the order of the cards in the deck. 
(hint use java.util.Collections.shuffle) 

deal - verifies that the deck is not empty, if it is, throw a 
DeckEmpty exception (Which you must declare - 
I extend 'IndexOutOfBoundsException', but may extend to whataver makes sense) 
 if not empty, pop a Card from the 'deck' and return it. 
 
isEmpty - returns true if deck empty, false if not 





*/
