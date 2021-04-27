package executors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class AddreMain {

	public static void main(String[] args) throws InterruptedException,ExecutionException{
		int sum=0;
		ThreadPoolExecutor es=(ThreadPoolExecutor)Executors.newFixedThreadPool(5);
		//ExecutorService es = Executors.newFixedThreadPool(5);
		
		List<AddWorker> threadsList = new ArrayList<>();
		for(int i=1;i<11;i++) {
			threadsList.add(new AddWorker(i, i+2));
		}
			
		List<Future<Integer>> result = es.invokeAll(threadsList);
		
		do {
			for(int i=0;i<result.size();i++) {
				System.out.println("Status : "+result.get(i).isDone());
			}
		}while(es.getCompletedTaskCount()<result.size());
		
		for(Future<Integer> x: result) {
			sum=sum+x.get();
		}
		
		System.out.println(sum);

		es.shutdown();
	}

}
