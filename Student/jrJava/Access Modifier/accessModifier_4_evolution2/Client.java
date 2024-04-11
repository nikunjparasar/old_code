package jrJava.accessModifier_4_evolution2;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StorageService storage = new StorageService();
		
		storage.data1 = 5;
		storage.data2 = 6;
		storage.data3 = 7;
		
		System.out.println(storage.data2);
		System.out.println(storage.sum());
				
	}

}

