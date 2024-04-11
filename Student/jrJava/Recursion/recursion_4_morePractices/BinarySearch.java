package jrJava.recursion_4_morePractices;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aaa= {2,3,5,9,11,15,23,44,45,47,50,52,52,53,59,60,70,74,78,79};
		
		System.out.println(search(aaa, 52));
	}

	public static int search(int[] data, int searchKey) {
		int low = 0;
		int high = data.length-1;
		int mid;
			
		while(low<=high) {
			mid = (low+high)/2;
			if(searchKey == data[mid]) return mid;
			else if(searchKey > data[mid])low=mid+1;
			else high=mid-1;
		}	
		return -1;
	
	}
	
}
