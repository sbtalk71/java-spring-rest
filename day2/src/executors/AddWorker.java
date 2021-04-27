package executors;

import java.util.concurrent.Callable;

public class AddWorker implements Callable<Integer> {

	private int a;
	private int b;

	public AddWorker(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public Integer call() throws Exception {
		try {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + " is adding " + a + " and " + b);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return a + b;
	}

}
