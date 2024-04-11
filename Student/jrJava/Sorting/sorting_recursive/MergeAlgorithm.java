package jrJava.sorting_recursive;

import java.util.ArrayList;

public class MergeAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {9, 11, 17, 25, 31, 45, 61, 75};
		int[] b = {7, 8, 15, 16, 25, 30};
		
		int[] merged = merge(a, b);
		Utility.print(merged);
		

	}

	public static int[] merge(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int i = 0, j= 0, k=0;
		while(i<a.length  && j<b.length) {
			if(a[i]<b[j])	c[k++] =a[i++];
			else c[k++] = b[j++];
		}
		while(i<a.length) c[k++] =a[i++];
		while(j<b.length) c[k++] = b[j++];
		return c;           
	          
		
		
	}
	
}
