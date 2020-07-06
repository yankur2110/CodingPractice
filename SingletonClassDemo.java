package java_practice;

class Singleton{
	private static Singleton obj;
	
	private Singleton(){
	//Single class cannot be instantiated with new keyword.	
	}
	
	public static Singleton getInstance(){
		if(obj==null){
			obj = new Singleton();
			return obj;
		}else{
			return obj;
		}
	}
	
}

public class SingletonClassDemo {
	
	public static void main(String[] args){
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		if(s1==s2)
			System.out.println("yes s1 and s2 are referencing the same memory");
		if(s2==s3)
			System.out.println("we all are same");
		
	}

}
