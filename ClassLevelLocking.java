package java_practice;

class Demo implements Runnable{
	
	@Override
	public void run() {
		
		Display();
	}

	public void Display() {
		
		synchronized(Demo.class){
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
	}
	
}

public class ClassLevelLocking {

	public static void main(String args[]) throws InterruptedException{
		Demo demoObject1 = new Demo();
		Demo demoObject2 = new Demo();
		Thread t1 = new Thread(demoObject1,"thread1"); 
		Thread t2 = new Thread(demoObject2,"thread2"); 
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}
	 
	
}
