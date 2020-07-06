package java_practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Singleton1 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static Singleton1 singleton;
	
	private Singleton1(){
		
	}
	
	public static Singleton1 getInstance(){
		if(singleton==null){
			synchronized(Singleton1.class){
				singleton = new Singleton1();
				return singleton;
			}
		}
		return singleton;
	}
	
	
	Object readResolve() { //preventing from new object to be created while readObject.
        return singleton; 
  }
	
}

public class PreventSingletonFromDeserialization {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		FileOutputStream fos = new FileOutputStream("object.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Singleton1 singletonObject = Singleton1.getInstance();
		oos.writeObject(singletonObject); //serializing the object
		oos.close();
		
		//Now let's deserialize it
		FileInputStream fis = new FileInputStream("object.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Singleton1 singletonObjectFromSerializedObjectFile = (Singleton1)ois.readObject();
		
		System.out.println("hashcode of object before serialization: "+singletonObject.hashCode());
		System.out.println("hashcode of object obtained after serialization: "+singletonObjectFromSerializedObjectFile.hashCode());
		ois.close();
		
		
	}

}
