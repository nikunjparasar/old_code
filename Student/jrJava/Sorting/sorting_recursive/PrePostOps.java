package jrJava.sorting_recursive;

public class PrePostOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		System.out.println(x++);
		//10
		
		x = 10;
		System.out.println(++x);
		//11
		
		x = 10; 
		x= ++x + x++;
		System.out.println(x);
		//22
		
		
		x = 10;
		x = x++ + x++ + x++;
		System.out.println(x);
		//33
	
		
		x = 10;
		x = ++x + ++x + ++x;
		System.out.println(x);
		//36
		
		
	}

}
