package jrJava.recursion_4_morePractices;

public class SequentialSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] aaa = {31, 49, 12, 11, 96, 33, 51, 80, 14, 9, 67, 91, 80, 77};
		System.out.println(search(aaa, 91));
	}



	public static int search(int[] data, int searchKey) {
		for(int i=0; i<data.length; i++ ) {
			if(searchKey == data[i]) return i;
		}
		return -1;
	}
	
}