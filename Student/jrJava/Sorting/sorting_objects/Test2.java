package jrJava.sorting_objects;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		Ball[] balls = Utility.loadBallsFromFile("jrJava/sorting_objects/balls.txt");
//		Utility.print(balls);
//		sort(balls, 0 , balls.length - 1);
//		Utility.print(balls);;
		
//		String[] phrases = {"baaa", "bab", "aaba", "a ba", "aaaa", "abab"};
//		sort(phrases);
//		Utility.print(phrases);
//	
	
		Integer[] nums = {23, 45, 11, 9, 17, 21, 88, 55, 41};
		sort(nums);
		Utility.print(nums);
		
		
	}

	
	
	public static void sort(Comparable[] values) 
	{
		int i;
		Comparable temp;
		boolean sorted = false;
		while(!sorted) 
			
		{
			
			sorted = true;
			for(i=0;i<values.length-1;i++) 
			{
				if(values[i].compareTo(values[i+1]) > 0) 
				{
					temp = values[i];
					values[i] = values[i+1];
					values[i+1] = temp;
					sorted = false; 
				}
			}
		}
	}
	
	
	
	
	
//	
//	public static void sort(Comparable[] data, int low, int high) {
//		
//		
//		if(low>=high) return;
//		
//		Comparable pivot = data[(low+high)/2]; 
//		int i = low, j= high; 
//		Comparable temp;
//		
//				
//		while(i<=j) {
//			while(data[i].compareTo(pivot) < 0) i++;
//			while(data[j].compareTo(pivot) > 0) j--;
//			
//			if(i<=j) {
//				temp = (int) data[j];
//				data[j] = data[i];
//				data[i] = temp;
//				i++;
//				j--;
//			}
//		}	
//		
//		
//		sort(data, low, j);
//		sort(data, i, high);
//	}
//	

	

}
