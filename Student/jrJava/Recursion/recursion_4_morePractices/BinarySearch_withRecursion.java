package jrJava.recursion_4_morePractices;

public class BinarySearch_withRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aaa= {2,3,5,9,11,15,23,44,45,47,50,52,52,53,59,60,70,74,78,79};
		
		System.out.println(search(aaa, 53, 0, aaa.length-1));
	}

	public static int search(int[] data, int searchKey, int low, int high) {
		if(low>high) return -1;
		
		int mid = (low+high)/2;
		if(searchKey == data[mid]) return mid;
		else if(searchKey > data[mid])return search(data, searchKey, mid+1, high);
		else return search(data, searchKey, low, mid-1);
		
	
	}
	
}
