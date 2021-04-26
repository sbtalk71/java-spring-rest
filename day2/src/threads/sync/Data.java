package threads.sync;

public class Data {

	public synchronized void printMessage(String message) {
		try {
			System.out.print("[" + message); // [Hello]
			Thread.sleep(5000);
			System.out.println("]");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class DataWorker implements Runnable {
	
	private Data data;
	private String message;

	public DataWorker(Data data, String message) {
		this.data = data;
		this.message=message;
	}


	@Override
	public void run() {
		data.printMessage(message);
	}

}

class AppMain{
	public static void main(String[] args) throws InterruptedException{
		Data data= new Data();
		
		Thread t1= new Thread(new DataWorker(data, "hello"));
		Thread t2= new Thread(new DataWorker(data, "good"));
		Thread t3= new Thread(new DataWorker(data, "world"));
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
	}
}
