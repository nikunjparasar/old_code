package jrJava.abstractType_3_generics;

public class Test1_2 {

	public static void main(String[] args) {
		
		Storage1 s = new Storage1();
		s.setData("aaa");
		
		//Integer data = (Integer) s.getData();
		String data = s.getData();
		
		//s.setData(45); 
		
		Storage2 s2 = new Storage2();
		s2.setData(45); 
		Integer data2 = s2.getData();
		
	}

}
