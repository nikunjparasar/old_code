package jrJava.abstractType_5_generics;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StatDataStorage<Integer> ds = new StatDataStorage<Integer>();
		Integer[] data = {12, 5, 1 , 6, 11, 36, 25};
		
		ds.setData(data);
		
		System.out.println(ds.getData(2));
		System.out.println(ds.min());
		System.out.println(ds.getAverage());
		
		//StatDataStorage<String> = new StatDataStorage<String>(); //String is not a subtype of number
		
	}

}
