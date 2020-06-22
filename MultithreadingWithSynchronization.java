package java_practice;

class C{
    int count;
    public synchronized void increment(){ //method cannot be shared
        count++;
    }
}

public class MultithreadingWithSynchronization {
    
    public static void main(String args[]) throws InterruptedException{
        
        C object = new C();
        
        Thread t1 = new Thread(()->{ //t1 dealing with object.
            
            for(int i=0;i<1000;i++)
            object.increment();
        });
        
        Thread t2 = new Thread(()->{ //t2 is also dealing with object.
            
            for(int i=0;i<1000;i++)
            object.increment();
        });
        
        
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        
        System.out.println("count is:"+object.count);
    }
}