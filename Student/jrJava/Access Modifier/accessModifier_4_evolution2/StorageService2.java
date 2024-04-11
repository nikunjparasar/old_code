package jrJava.accessModifier_4_evolution2;

public class StorageService2 {
	

	private int[] data = new int[100];
	
	public void addData(int index, int aData) {
		data[index - 1] = aData;
	}
		
	public int getData(int index){
		return data[index - 1];
	}
	
	int sum() {
		int sum = 0;
		for(int i = 0; i < data.length; i++) sum += data[i];
		return sum;
	
	}
}
