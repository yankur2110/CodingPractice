package java_practice;

//there is always a "main" threading running, In this case we are creating 2 more threads which will run parallelly with "main" thread.

class A extends Thread{
	
	public void show() throws InterruptedException{
		for(int i=0;i<5;i++){
			System.out.println("hi");
			Thread.sleep(1000); //this might give InterruptedException.
		}
	}
	
	public void run(){
		try {					//handling the exception.
			show();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

class B extends Thread{
	
	public void show() throws InterruptedException{
		for(int i=0;i<5;i++){
			System.out.println("hello");
			Thread.sleep(1000); //this might give InterruptedException.
		}
	}
	
	public void run(){
		try {					//handling the exception.
			show();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class SimpleMultithreading {
      
	public static void main (String[] args) {
		A a = new A();
		a.start();				//start is a method defined in Thread/runnable class to start the thread.
		
		B b = new B();
		b.start();
		
	}

	
}