package java_practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TaskForCachedPool implements Runnable{
	@Override
	public void run(){
		System.out.println("ThreadName is "+Thread.currentThread().getName());
	}
}

public class CachedThreadPool_ExecutorService {

	public static void main(String[] args){
		//here we don't specify the number of threads to be created as parameter.
		ExecutorService executorService = Executors.newCachedThreadPool();
		for(int i=0;i<1000;i++){
			executorService.execute(new TaskForCachedPool());
		}
		System.out.println("I am main thread"+ Thread.currentThread().getName());
		
	}
}
