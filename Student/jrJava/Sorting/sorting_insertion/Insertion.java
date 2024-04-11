package jrJava.sorting_insertion;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] data = {5, 8, 11, 15, 19, 9};
	
	Utility.print(data);
	
	insert(data);
	
	Utility.print(data);
		
	}
	
	
	public static void insert(int[] data){
		int temp;
		int i; //new data index
		int j; 	
		i = data.length-1;
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
