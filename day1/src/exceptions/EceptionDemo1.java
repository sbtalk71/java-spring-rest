package exceptions;

import java.io.FileInputStream;

public class EceptionDemo1 {

	public static void main(String[] args) {

		try {

			//new FileInputStream("");
			
			int a = 10;
			int b = 10;
			double d = a / b;
			int[] nums = new int[4];
			System.out.println(nums[3]);

			String[] names = new String[5];

			//names[1].length();

			System.out.println("No Exception here...");

		} catch (ArithmeticException e) {

			System.out.println(e);
			
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Array Index not present");
		} catch (Exception e) {

			System.out.println();
			
		}finally {
			System.out.println("Finally executes..");
		}

		System.out.println("Execution resumed...");
	}

}
