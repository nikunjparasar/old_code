package jrJava.sorting_recursive;

import jrJava.sorting_selection.Utility;

public class MergeSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = Utility.createArray(1000);
		
		Utility.print(data);
		long startTime = System.currentTimeMillis();
		
		sort(data);
		
		long endTime = System.currentTimeMillis();
		System.out.println((endTime-startTime) + "  milliseconds");
		Utility.print(data);
		
	}
	
	
	public static void sort(int[] data) {
		sort(data, 0, data.length-1, new int[data.length]);
	}

	public static void sort(int[] data, int low, int high, int[] temp) {
		if(low>=high) return;
		
		int mid = (low +high)/2;
		
		sort(data, low, mid, temp);
		sort(data, mid+1, high, temp);
	
		
		
		for(int i = low; i<=high; i++) temp[i] = data[i];
	
		
		int i = low, j= mid+1, k=low;
		
		
		while(i<=mid  && j<=high) {
			if(temp[i]<temp[j])	data[k++] =temp[i++];
			else data[k++] = temp[j++];
		}
		while(i<=mid) data[k++] =temp[i++];
		//while(j<=high) data[k++] = temp[j++]; //we don't need this. Array already has this portion.
		        
	          
		
	}
	
}
