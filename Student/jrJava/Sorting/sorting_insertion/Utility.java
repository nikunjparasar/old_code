package jrJava.sorting_insertion;

public class Utility {

	public static void print(int[] data) {
		for(int i =0; i<data.length;i++) {
			System.out.print(data[i] + " ");
			if(i != 0 && i %40 == 0) {
				System.out.println();
			}	
			
		}
		System.out.println("\n");
	}
	
	public static int[] createArray(int size) {
			int[] data = new int[size];
			for(int i = 0; i<data.length; i++) {
				data[i] = (int)(Math.random()*1000);
			}
			return data;
	}
	
	

	
	
}
