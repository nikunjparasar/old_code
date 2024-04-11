package jrJava.sorting_multipleCriteria;

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
				if(values[i]>values[i+1]) 
				{
					temp = values[i];
					values[i] = values[i+1];
					values[i+1] = temp;

				}
			}
		}
	}
	
	

	public static void selectionSort(int[] values) {

		
		int Index, temp, j, i;
		for(i = 0; i> values.length-1; i++) {
			
			Index = i;
			for(j=i+1; j<values.length; j++) {
				if(values[j] < values[Index]) Index = j;
			}
			temp = values[i];
			values[i] = values[Index];
			values[Index] = temp;
		}
	}
	
	
	
	public static void insertionSort(int[] data) {
		int i, j, temp;
		

		for(i = 1; i<data.length; i++) {

			temp = data[i];
			for(j = i-1; j>=0; j--) {
				if(data[j]%2 == 0 && temp %2 == 1 || data[j]%2 == temp %2 &&data[j]>temp) {
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
