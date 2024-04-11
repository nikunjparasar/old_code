package jrJava.sorting_recursive;

import jrJava.sorting_selection.Utility;

public class QuickSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = Utility.createArray(1000);
		
		Utility.print(data);
		long startTime = System.currentTimeMillis();
		
		sort(data, 0 , data.length-1);
		
		long endTime = System.currentTimeMillis();
		System.out.println((endTime-startTime) + "  milliseconds");
		Utility.print(data);
		
		
		
	}
	
	public static void sort(int[] data, int low, int high) {
		
		//terminal condition
		if(low>=high) return;
		
		int pivot = data[(low+high)/2]; //any number will work here. performance differing is based on quality of number picked which is random
		int i = low, j= high, temp;
		
		//partition		
		while(i<=j) {
			while(data[i]<pivot) i++;
			while(data[j]>pivot) j--;
			
			if(i<=j) {
				temp = data[j];
				data[j] = data[i];
				data[i] = temp;
				i++;
				j--;
			}
		}	
		
		//task management
		sort(data, low, j);
		sort(data, i, high);
	}
	
	
}


