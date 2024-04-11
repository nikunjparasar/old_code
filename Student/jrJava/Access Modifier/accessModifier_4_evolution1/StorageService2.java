package jrJava.accessModifier_4_evolution1;

public class StorageService2 {
	
	private int data1;
	private int data2;
	private int data3;

	public void addData(int index, int aData) {
		if(index == 1) data1 = aData;
		else if (index == 2) data2 = aData;
		else if (index == 3) data3 = aData;
	}
		
	public int getData(int index){
		if(index == 1) return data1;
		else if (index == 2) return data2;
		else if (index == 3) return data3;
		else return 0;
	}
	
	int sum() {
		return data1 + data2 +data3;
	}
}
