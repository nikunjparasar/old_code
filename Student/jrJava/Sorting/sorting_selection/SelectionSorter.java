package jrJava.sorting_selection;

public class SelectionSorter {

	
	public static void main(String[] args) 
	{
		int[] data = Utility.createArray(1000);
		
		Utility.print(data);
		long startTime = System.currentTimeMillis();
		
		sort(data);
		
		long endTime = System.currentTimeMillis();
		System.out.println((endTime-startTime) + "  milliseconds");
		Utility.print(data);
	}
	
	//performance analysis:
	//1. {17, 11, 8, 6, 5, 2} how many comparisons does it have to do? 5 + 4 + 3 + 2 + 1 = 15
	//2. {2, 5, 6, 8, 11, 17} how many comparisons does it have to do? 5 + 4 + 3 + 2 + 1 = 15
	//all scenarios have the same amount of comparisons required.
	//there is no worst or best case scenario.
	// if the size of the array is n, how many comparisons? (n-1) + (n-2) + ... + 2 + 1
	// n*(n-1)/2 =~ n^2/2 -->O(n^2)
	
	
	
	
	public static void sort(int[] values) {
		//we shrink the window size by one index each time: 
		//Window range = [0, len-1] ->[1, len-1]->...-> [len-2, len-1]
		//in each window we select the minimum index(index where the minimum value is stored) 
		//we swap the value at minIndex with the value at the beginning of the window. 
		//then we shrink the window by one index to exclude the first element of the window 
		
		
		/*
		//Window [0, length-1]
		int minIndex = 0;
		for(int j=0+1; j<values.length; j++) {
			if(values[j] < values[minIndex]) minIndex = j;
		}
		int temp = values[0];
		values[0] = values[minIndex];
		values[minIndex] = temp;
		
		//Window [1, length-1]
		minIndex = 1;
		for(int j=1+1; j<values.length; j++) {
			if(values[j] < values[minIndex]) minIndex = j;
		}
		temp = values[1];
		values[1] = values[minIndex];
		values[minIndex] = temp;
		
		//Window [2, length-1]
		minIndex = 2;
		for(int j=2+1; j<values.length; j++) {
			if(values[j] < values[minIndex]) minIndex = j;
		}
		temp = values[2];
		values[2] = values[minIndex];
		values[minIndex] = temp;
		
		
		//....
		
		//Window [length-2, length-1]
		minIndex = values.length-2;
		for(int j=(values.length-2)+1; j<values.length; j++) {
			if(values[j] < values[minIndex]) minIndex = j;
		}
		temp = values[values.length-2];
		values[values.length-2] = values[minIndex];
		values[minIndex] = temp;
	*/
		
		int minIndex, temp, j, i;
		
		//'i' will indicate the beginning of the shrinking window. So, the current window will be [i, len-1]
		
		
		for(i = 0; i< values.length-1; i++) {
			
			minIndex = i;
			for(j=i+1; j<values.length; j++) {
				if(values[j] < values[minIndex]) minIndex = j;
			}
			temp = values[i];
			values[i] = values[minIndex];
			values[minIndex] = temp;
		}
		
		
		
	}
	
	
}








