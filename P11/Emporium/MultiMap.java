package Emporium;
import java.util.HashMap;

public class MultiMap{
	private HashMap< String, String > map = new HashMap<>;
		
	public putKey(String key, String value){
		map.put(key, value);
	}
	
	public getKey(String key){
		System.out.println(map.get(key));
	}
}
