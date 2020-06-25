package java_practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo1 implements Serializable{
	private static final long serialVersionUID = 1L;
	
	String name;
	int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Demo1(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
}

public class SerializationDemo {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		//Serialization
		FileOutputStream fos = new FileOutputStream("myfile.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Demo1 object = new Demo1("ankur",593);
		oos.writeObject(object);
		oos.close();
		System.out.println("successfully serialized the object");
		
		//Deserialization
		FileInputStream fis = new FileInputStream("myfile.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Demo1 object2  = (Demo1)ois.readObject();
		ois.close();
		System.out.println("id is: " +object2.id+" name is: "+object2.name);
		
		
		
	}

}
