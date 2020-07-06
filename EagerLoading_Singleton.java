package java_practice;

class SingletonRough{
	
	/* Instance is created at the time of class loading itself, not like lazy loading where instance is created
	 * when we call getInstance method.
	 */
	private static SingletonRough singletonRough = new SingletonRough(); 
	
	private SingletonRough(){	
	}
	
	public static SingletonRough getInstance(){
		return singletonRough;
	}
}

public class EagerLoading_Singleton{
	
	public static void main(String[] args){
		
		SingletonRough s1 = SingletonRough.getInstance();
		SingletonRough s2 = SingletonRough.getInstance();
		if(s1==s2){
			System.out.println("we all are same references with different names");
		}
		
		
		
	}
}