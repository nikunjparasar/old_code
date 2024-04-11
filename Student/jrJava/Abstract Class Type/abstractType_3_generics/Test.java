package jrJava.abstractType_3_generics;

public class Test {

	public static void main(String[] args) {
		
		Storage<String> s = new Storage<String>();
		
		//s.setData(45); 
		s.setData("abc");
		
		//Integer num = s.getData();
		String data = s.getData();
		
		Storage<Integer> s2 = new Storage<Integer>();
		
		//s2.setData("aaa");
		s2.setData(45);
		
		//String data2 = s2.getData();
		Integer num = s2.getData();
	}

}



