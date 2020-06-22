package java_practice;


public class ThreadUsingAnonymousClass {
      
	public static void main (String[] args) throws InterruptedException {
		
		Thread demo_thread_using_anonymous_object = new Thread(new Runnable(){ //Anonymous Class
			public void run(){
				while(true){
					System.out.println("I am running");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		demo_thread_using_anonymous_object.start();
		
		while(true){
			System.out.println("I am main thread");
			Thread.sleep(2000);
		}
		
	}

	
}