
public class OverloadDemo {

	
	  public int add(int a, int b) {
	  
	  System.out.println("add (int, int)"); return a + b; }
	 

	
	  public float add(int a, float b) {
	  
	  System.out.println("add (int, float)"); return a + b; }
	 
	
	
	  public float add(float a, int b) {
	  
	  System.out.println("add (float, int)"); return a + b; }
	 


	public double add(double a, double b) {

		System.out.println("add (double, double)");
		return a + b;
	}

	public static void main(String[] args) {
		
		OverloadDemo o= new OverloadDemo();
		o.add(1, 2);
		o.add(1, 2.0f);
		o.add(1.0f, 2);
		o.add(1.0, 2.0);
		
	}

}
