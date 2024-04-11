package jrJava.accessModifier_4_evolution1;

public class Client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StorageService2 storage = new StorageService2();
		
		//storage.data1 = 5;
		//storage.data2 = 6;
		//storage.data3 = 7;
		
		//System.out.println(storage.data2);
		
		storage.addData(1, 5);
		storage.addData(2, 6);
		storage.addData(3, 7);
		
		System.out.println(storage.getData(2));
		
		System.out.println(storage.sum());
				
	}

}

