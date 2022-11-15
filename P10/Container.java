import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException; 

public class Container{
	
	protected String name; 
	protected String description; 
	protected int maxScoops; 
	
	public Container(String name, String description, int maxScoops){
		
		this.name = name; 
		this.description = description; 
		this.maxScoops = maxScoops; 
		}
	
	public Container(BufferedReader br) throws IOException{
		
		this.name = br.readLine();
		this.description = br.readLine(); 
		this.maxScoops = Integer.parseInt(br.readLine());
	}
	
}
