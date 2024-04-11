package jrJava.sorting_insertion;

public class InsertionSorter {

	
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
	//1. {17, 11, 8, 6, 5, 2} how many comparisons does it have to do? 1+2+3+4+5 = 15 (worst case scenario)
	//2. {2, 5, 6, 8, 11, 17} how many comparisons does it have to do? 1+1+1+1+1 = 5  (best case scenario)
	//3. If the size of array is n?
	//			best case: n-1 times ---> =~ O(n)
	//			worst case: 1+2+...+(n-1) = (n-1)n/2  ---> =~ O(n^2)
	
	
	public static void sort(int[] data) {
		int i, j, temp;
		
		//i indicates the last index of the window
		// window: [0, i]
		//we will increase the window by increasing i
		// i = 1, i = 2, .... i = length-1;
		// we will make all data in the window in sorted order
		for(i = 1; i<data.length; i++) {
			//as window size increases, it will bring new data into the window
			// the last element in the window is the new data and is probably in the wrong spot
			//We use the insertion algorithm to determine where the data should be placed.
			temp = data[i];
			for(j = i-1; j>=0; j--) {
				if(data[j]> temp) {
					data[j+1] = data[j];
				}
				else {
					break;
				}
			}
			//insertion point = j+1
			data[j+1] = temp;
		}
	}
	
}
	

	









