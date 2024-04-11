package jrJava.sorting_descending;

import jrJava.sorting_insertion.Utility;

public class sorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = Utility.createArray(1000);
		
		Utility.print(data);
		long startTime = System.currentTimeMillis();
		
		insertionSort(data);
		
		long endTime = System.currentTimeMillis();
		System.out.println((endTime-startTime) + "  milliseconds");
		Utility.print(data);
		
	}
	
	public static void bubbleSort(int[] values) 
	{
		int i;
		int temp;
		boolean sorted = false;
		while(!sorted) 
			
		{
			
			sorted = true;
			for(i=1;i<values.length-1;i++) 
			{
				if(values[i]<values[i+1]) 
				{
					temp = values[i];
					values[i] = values[i+1];
					values[i+1] = temp;

				}
			}
		}
	}
	
	

	public static void selectionSort(int[] values) {

		
		int maxIndex, temp, j, i;
		for(i = 0; i> values.length-1; i++) {
			
			maxIndex = i;
			for(j=i+1; j<values.length; j++) {
				if(values[j] > values[maxIndex]) maxIndex = j;
			}
			temp = values[i];
			values[i] = values[maxIndex];
			values[maxIndex] = temp;
		}
	}
	
	
	
	public static void insertionSort(int[] data) {
		int i, j, temp;
		

		for(i = 1; i<data.length; i++) {

			temp = data[i];
			for(j = i-1; j>=0; j--) {
				if(data[j]< temp) {
					data[j+1] = data[j];
				}
				else {
					break;
				}
			}

			data[j+1] = temp;
		}
	}
	

}
