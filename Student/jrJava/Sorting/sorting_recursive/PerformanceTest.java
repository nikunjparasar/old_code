package jrJava.sorting_recursive;

import jrJava.sorting_selection.SelectionSorter;

public class PerformanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data1 = Utility.createArray(10000);
		int[] data2 = Utility.copy(data1);
		
		long start1 = System.currentTimeMillis();
		MergeSorting.sort(data1);
		long end1 = System.currentTimeMillis();
		
		System.out.println(end1 -start1);
		
		long start2 = System.currentTimeMillis();
		SelectionSorter.sort(data1);
		long end2 = System.currentTimeMillis();
		
		System.out.println(end2 -start2);
	}

}
