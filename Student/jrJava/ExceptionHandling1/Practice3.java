package jrJava.ExceptionHandling1;

public class Practice3 {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int sum = 0;
		int i = 0;
		try {
			while(true) {
				sum += a[i++];
				
			}
		}
		catch(Exception e) {}

		System.out.println("sum = "+ sum);
	}

}
