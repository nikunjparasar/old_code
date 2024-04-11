package jrJava.using2Darray;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] a = new int[4][];
		
		//String[][] e = new String[4][];
		print(a);
	}

	public static void print(int[][] data)
	{
		int i, j;
		if(data == null) return;
		
		for(i= 0; i <data.length; i++) {
			System.out.println("");
			
			if(data[i] == null) {
				System.out.println("null");
				continue;
			}
			for(j = 0; j <data[i].length ; j++) {
				System.out.print(data[i][j] + " ");
				
			}
		}
	}

}
