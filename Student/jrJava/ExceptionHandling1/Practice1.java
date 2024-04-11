package jrJava.ExceptionHandling1;

public class Practice1 {

	public static void main(String[] args){
		System.out.println("point 1");
		
		String text = "hello";
		int[] a = {3, 5, 1, 7}; 
		String quantity = "3a5";
		
		methodA(text, a, quantity);
		
		
		System.out.println("point 2");
		
		

	}
	
	///\/\/\/\/\/\/\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/////////////////////////////do not do//////////////////////////////\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\//\/\\\/\/\/\/\/\//\/\\/

	public static void methodA(String word, int[] values, String dataString){
		System.out.println("point 3");
		try {
			int length = word.length();
			System.out.println(length);
			System.out.println(values[3]);
			int number = Integer.parseInt(dataString);
			System.out.println(number);
		}

		catch(NullPointerException npe){
			System.out.println("Null pointer problem.");
		}
		catch(IndexOutOfBoundsException | NumberFormatException ioobe_nfe){
			System.out.println("number format or Index problem.");
			throw ioobe_nfe; 
		}
		catch(Exception e){
			System.out.println("Just a problem.");
		}
		
		
		System.out.println("point 4");
	}
}
