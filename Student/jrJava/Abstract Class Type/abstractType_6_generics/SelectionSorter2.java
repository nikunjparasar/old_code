package jrJava.abstractType_6_generics;

public class SelectionSorter2<T extends Comparable<T>> {

	
	
	
	public void sort(T[] values) {
		
		
		int minIndex, j, i;
		T temp;
		
		
		
		for(i = 0; i< values.length-1; i++) {
			
			minIndex = i;
			for(j=i+1; j<values.length; j++) {
				if(values[j].compareTo(values[minIndex]) < 0) minIndex = j;
			}
			temp = values[i];
			values[i] = values[minIndex];
			values[minIndex] = temp;
		}
		
		
		
	}
	
	
}








