package jrJava.sorting_insertion;

public class Practice5Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = Utility.createArray(1000);
		
		Utility.print(data);
		long startTime = System.currentTimeMillis();
		
		sort(data);
		
		long endTime = System.currentTimeMillis();
		System.out.println((endTime-startTime) + "  milliseconds");
		Utility.print(data);
	}
	
	
	
	public static void sort(int[] data) { 
		int i;
		int j;
		int temp;
		
		for(i = 1; i<data.length; i++) {
			temp = data[i];
			for(j= i-1; j>0; j--) {
				if(data[j]> temp) {
					data[j+1] = data [j];
				}
				else {
					break;
				}
			}
			data[j+1] = temp;
		}
	}

}
