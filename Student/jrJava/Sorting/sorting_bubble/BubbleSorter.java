package jrJava.sorting_bubble;

public class BubbleSorter {

	
	public static void main(String[] args) 
	{
		int[] data = Utility.createArray(1000);
		
		//Utility.print(data);
		long startTime = System.currentTimeMillis();
		
		sort(data);
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		//Utility.print(data);
		

		
		
	}
	//1. (2, 5, 6, 8, 11, 17} ---> it will have to scan once. (confirmation scan)
	//2. {17, 2, 5, 6, 8, 11} ---> it will scan twice. (one scan to sort everything, and one confirmation scan)
	//3. {5, 6, 8, 11, 17, 2} ---> it will have to scan 6 times. (5 times to sort, and one confirmation scan) --- this is the worst possible scenario
	//4. {17, 11, 8, 6, 5, 2} ---> it will have to scan 6 times. (5 times to sort, and one confirmation scan) --- this is the worst possible scenario
	//5. if the length of the array is 100, then how many comparisons, does it have to do?
	// best case scenario --> ~ 100 times. Worst case scenario --> ~100* ~100 --->~10000
	//6. if the array length is n, how many comparisons does it have to do?
	//Best case scenario --> ~n -->O(n) Worst case scenario --> ~n*~n -->O(n^2)
	
	
	
	public static void sort(int[] values) 
	{
		int i;//indicates the moving window of size 2
		int temp;//for swapping
		boolean sorted = false;
		while(!sorted) 
			//we scan the whole array. 
			//While we scan, we compare the two consecutive elements, values[i] and values[i+1].
			//Be careful, the range of 'i' will be [0, length-2], not [0, length-1] because of values[i+1].
			//While comparing them, if the two are in incorrect order, we swap them.
		{
			//if it realizes that it didn't have to do any swapping, then it will know the whole array
			//is in sorted order. However, if it remembers that it has to do even one swap,
			//it will repeat the scanning.
			sorted = true;
			for(i=0;i<values.length-1;i++) 
			{
				if(values[i]>values[i+1]) 
				{
					temp = values[i];
					values[i] = values[i+1];
					values[i+1] = temp;
					sorted = false; // if any swap happens, this code will also get executed.
									//it will know the assumption was wrong.
				}
			}
		}
	}
}








