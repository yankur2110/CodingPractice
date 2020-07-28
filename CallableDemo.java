package java_practice;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class DemoTask implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		Thread.sleep(3000); 
		return new Random().nextInt();
	}
	
}
	
public class CallableDemo {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException{
		ExecutorService executorService  = Executors.newFixedThreadPool(10);
		
		//submit the task for execution
		Future<Integer> future = executorService.submit(new DemoTask());
		
		//store the value when returned.
		Integer result = future.get();
		
		System.out.println("returned value from callable is "+result);
	}

}
