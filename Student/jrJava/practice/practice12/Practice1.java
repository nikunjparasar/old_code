package jrJava.practice12;

public class Practice1 {

	public static void main(String[] args) {
		
		//System.out.println(add(1, 2)); 
		//System.out.println(add(1, 2) + add(3, 4)); 
		System.out.println(add(add(1, 2), 3)); 
	}

	
	
	public static int add(int data1, int data2){
		return data1 + data2;
	}
	
}
 