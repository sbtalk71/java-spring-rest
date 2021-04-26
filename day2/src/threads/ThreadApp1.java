package threads;

public class ThreadApp1 {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("Main Thread starts...");
		DemoThread t1= new DemoThread();
		DemoThread t2= new DemoThread();
		DemoThread t3= new DemoThread();
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		//t1.start();
		
		System.out.println("Main Thread Exits..");

	}

}
