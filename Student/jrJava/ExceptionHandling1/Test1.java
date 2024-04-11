package jrJava.ExceptionHandling1;

public class Test1 {

	public static void main(String[] args){
		int[] a = {4, 5, 1, 8, 3};
		
		methodA(a, 6);
		
		System.out.println("my job is done");
		
	}
	
	
	public static void methodA(int[] values, int index) {
		
		
		if(index < 0||index>values.length-1) {
			System.out.println("bad index");
			return;
		}
		
		System.out.println(values[index]);

		
//		try {
//			System.out.println(values[index]);
//		}
//		catch(Exception E) {
//			System.out.println("I am in catch block");
//		}
		
	}
	

}
