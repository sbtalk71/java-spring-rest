package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
		//ExecutorService es=Executors.newFixedThreadPool(100);
		//ExecutorService es=Executors.newCachedThreadPool();
		ExecutorService es=Executors.newWorkStealingPool();
		for(int i=0;i<100;i++) {
			es.submit(new Worker());
		}

		es.shutdown();
	}

}
