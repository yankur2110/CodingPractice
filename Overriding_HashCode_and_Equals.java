package java_practice;

import java.util.HashMap;
import java.util.Map;

class ParentDemo {
	String name;
	String email;
	public ParentDemo(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getEmail() {
		return email;
	}
	protected void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Parent [name=" + name + ", email=" + email + "]";
	}
	
	@Override
	public int hashCode() {
		
		return email.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		ParentDemo comparingWith = (ParentDemo)obj;
		
		return this.email.equals(comparingWith.email);
	}
}


public class Overriding_HashCode_and_Equals{
	
	public static void main(String[] args){
		ParentDemo p1 = new ParentDemo("Ankur", "yankur2110@gmail.com");
		ParentDemo p2 = new ParentDemo("Raman", "yankur2110@gmail.com");
		ParentDemo p3 = new ParentDemo("Junior_ankur","junior_ankur2110@gmail.com");
		
		Map<ParentDemo,String> hashmap = new HashMap<>();
		hashmap.put(p1, p1.getEmail());
		hashmap.put(p2, p2.getEmail());
		hashmap.put(p3, p3.getEmail());
		
		System.out.println("size of hashmap is "+hashmap.size());
		System.out.println(hashmap);
		
	}
}
