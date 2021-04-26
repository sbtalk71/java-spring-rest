package threads;

public class Worker implements Runnable {

	@Override
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println(Thread.currentThread()+"-->"+i);
			Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
