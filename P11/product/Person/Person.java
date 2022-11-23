package person; 

import java.io.BufferedReader; 
import java.io.BufferedWriter;
import java.io.IOException;

public class Person{
	protected String name; 
	protected String phone; 
	
	public Person(String name, String phone){
		this.name = name;
		this.phone = phone;
	}
	
	public Person(BufferedReader br) throws IOException{
		this.name = br.readline();
		this.phone = br.readline();
	}
	
	public void save(BufferedWriter bw) throws IOException{
		bw.write(name + '\n');
		bw.write(phone + '\n');
	}
	
	@Override 
	public String toString(){
		return (name + phone);
	}
}
